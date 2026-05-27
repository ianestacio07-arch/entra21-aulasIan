let formulario =
document.getElementById("formulario");

formulario.addEventListener(
"submit", function(evento){

    evento.preventDefault();

    alert(
    "Formulário interceptado com sucesso!"
    );

});