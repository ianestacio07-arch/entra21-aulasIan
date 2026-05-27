let senha =
document.getElementById("senha");

let confirmarSenha =
document.getElementById("confirmarSenha");

confirmarSenha.addEventListener(
"keyup", function(){

    if(senha.value == confirmarSenha.value){

        confirmarSenha.classList.add("senha-ok");

        confirmarSenha.classList.remove("senha-erro");

    }else{

        confirmarSenha.classList.add("senha-erro");

        confirmarSenha.classList.remove("senha-ok");

    }

});