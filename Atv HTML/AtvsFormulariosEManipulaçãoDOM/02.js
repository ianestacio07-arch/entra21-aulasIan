let form =
document.getElementById("form");

let nome =
document.getElementById("nome");

let erroNome =
document.getElementById("erroNome");

form.addEventListener(
"submit", function(evento){

    evento.preventDefault();

    if(nome.value == ""){

        nome.classList.add(
        "borda-vermelha"
        );

        erroNome.innerText =
        "Campo obrigatório";

    }else{

        nome.classList.remove(
        "borda-vermelha"
        );

        erroNome.innerText = "";

    }

});