function validarFormulario() {
	indice = document.getElementById("tipoDominio").selectedIndex;

	if (indice != null && indice == 0) {
		// anteriores LLLNNN
		var dominio = document.getElementById("numeroDominio").value;

		var L0 = dominio.charAt(0);
		var L1 = dominio.charAt(1);
		var L2 = dominio.charAt(2);
		var L3 = dominio.charAt(3);
		var L4 = dominio.charAt(4);
		var L5 = dominio.charAt(5);
		
		if (dominio.length == 6 && isNaN(L0) && isNaN(L1) && isNaN(L2) && !isNaN(L3) && !isNaN(L4)
				&& !isNaN(L5)) {
			alert("El formato es correcto");
			return true;
		} else {
			alert("El formato es incorrecto, vuelva a intentar");
			return false;
		}
	}
	if (indice != null && indice == 1) {
		// nuevo LLNNNLL
		var dominio = document.getElementById("numeroDominio").value;

		var L0 = dominio.charAt(0);
		var L1 = dominio.charAt(1);
		var L2 = dominio.charAt(2);
		var L3 = dominio.charAt(3);
		var L4 = dominio.charAt(4);
		var L5 = dominio.charAt(5);
		var L6 = dominio.charAt(6);

		if (dominio.lenth == 7 && isNaN(L0) && isNaN(L1) && isNaN(L2) && !isNaN(L3) && !isNaN(L4)
				&& isNaN(L5) && isNaN(L6)) {
			alert("El formato es correcto");
			return true;
		} else {
			alert("El formato es incorrecto, vuelva a intentar");
			return false;
		}
	}
	if (indice != null && indice == 2) {
		// maquinaria LLLNN
		var dominio = document.getElementById("numeroDominio").value;

		var L0 = dominio.charAt(0);
		var L1 = dominio.charAt(1);
		var L2 = dominio.charAt(2);
		var L3 = dominio.charAt(3);
		var L4 = dominio.charAt(4);
		var L5 = dominio.charAt(5);

		if (dominio.length==5 && isNaN(L0) && isNaN(L1) && isNaN(L2) && !isNaN(L3) && !isNaN(L4)) {
			alert("El formato es correcto");
			return true;
		} else {
			alert("El formato es incorrecto, vuelva a intentar");
			return false;
		}
	}

}

