
function votoExcelente(){
    document.getElementById("idVotoExcelente");
    document.getElementById("contador1").innerHTML = contador1 += 1;
}

function votoBom(){
	/*document.getElementById("idVotoBom");*/
	document.getElementById("contador2").innerHTML = contador2 += 1;	
}

function votoRegular(){
	document.getElementById("idVotoRegular");
	document.getElementById("contador3").innerHTML = contador3 += 1;	
}

function votoRuim(){
	document.getElementById("idVotoRuim");
	document.getElementById("contador4").innerHTML = contador4 += 1;
}

function votoPessimo(){
    document.getElementById("idVotoPessimo");
	document.getElementById("contador5").innerHTML = contador5 += 1;	
}




function botao1(){
    document.getElementById('contador1').innerHTML = contador1 = -1;  
}

function botao2(){
	document.getElementById('contador2').innerHTML = contador2 = -1;	
}

function botao3(){
	document.getElementById('contador3').innerHTML = contador3 = -1;	
}

function botao4(){
	document.getElementById('contador4').innerHTML = contador4 = -1;	
}

function botao5(){
	document.getElementById('contador5').innerHTML = contador5 = -1;	
}