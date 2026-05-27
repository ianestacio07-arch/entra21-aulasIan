let form =
document.getElementById("form");

let email =
document.getElementById("email");

let erroEmail =
document.getElementById("erroEmail");

form.addEventListener(
"submit", function(evento){

    evento.preventDefault();

    if(
        email.value.includes("@")
        &&
        email.value.includes(".")
    ){

        email.classList.add(
        "input-valido"
        );

        email.classList.remove(
        "input-invalido"
        );

        erroEmail.innerText = "";

    }else{

        email.classList.add(
        "input-invalido"
        );

        email.classList.remove(
        "input-valido"
        );

        erroEmail.innerText =
        "E-mail inválido";

    }

});