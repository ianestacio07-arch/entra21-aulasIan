let aceite =
document.getElementById("aceite");

let btnEnviar =
document.getElementById("btnEnviar");

aceite.addEventListener(
"change", function(){

    if(aceite.checked == true){

        btnEnviar.disabled = false;

    }else{

        btnEnviar.disabled = true;

    }

});