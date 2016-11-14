package com.lucas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lucas.model.Patente;
import com.lucas.service.PatenteService;
import com.lucas.util.Util;

@Controller
public class PatentesController {
	PatenteService ps = new PatenteService();
	
	
	@RequestMapping(value = "/cargaFormulario", method = RequestMethod.GET)
	public ModelAndView cargarFormularioPatente() {
		ModelAndView mav = new ModelAndView("cargaPatente");
		mav.addObject("patentes", ps.getAll());
		return mav;

	}

	@RequestMapping(value = "/cargaPatente", method = RequestMethod.POST)
	public ModelAndView persistirPatente(@RequestParam("numeroDominio") String dominio,
			@RequestParam("fechaAlta") String fechaAlta, @RequestParam("estado") String estado,
			@RequestParam("tipoDominio") Integer tipoDominio) {
		Patente patente;		
		
		if (this.formatoCorrecto(dominio, tipoDominio)) {
			 patente = new Patente(dominio, fechaAlta, estado); 
			ps.save(patente);		
			ModelAndView mav = new ModelAndView("cargaPatente");
			mav.addObject("patentes", ps.getAll());
			return mav;
		}
		return new ModelAndView("cargaPatente");

	}

	private boolean formatoCorrecto(String dominio, Integer tipoDominio) {
		
		if(tipoDominio==1||tipoDominio==2||tipoDominio==3){
			if(dominio.length()!=6 && dominio.length()!=7 && dominio.length()!=5){
				return false;
			}
		}
		
		if (tipoDominio == 1) {
			// anteriores LLLNNN
			String letras = dominio.substring(0,3);
			String numeros = dominio.substring(3,6);
			
			
			if (dominio.length() == 6 && !Util.isNumeric(letras) && Util.isNumeric(numeros)) {
				return true;
			} else{
				return false;
			}

		}
		if (tipoDominio == 2) {
			// nuevo LLNNNLL
			String letrasUno = dominio.substring(0,2);
			String numeros= dominio.substring(2,5);
			String letrasDos = dominio.substring(5,7);

			if (dominio.length() == 7 && !Util.isNumeric(letrasUno) && Util.isNumeric(numeros) && !Util.isNumeric(letrasDos)){
				return true;
			} else{
				return false;
			}

		}
		if (tipoDominio == 3) {
			// maquinaria LLLNN
			String letras = dominio.substring(0,3);
			String numeros = dominio.substring(3,5);
			
			
			if (dominio.length() == 5 && !Util.isNumeric(letras) && Util.isNumeric(numeros)){
				return true;
			}else{ 
				return false;
			}
			
		}
		
		return false;
	}

}
