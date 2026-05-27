let texto =
document.getElementById("texto");

let contador =
document.getElementById("contador");

texto.addEventListener(
"keyup", function(){

    let restante =
    50 - texto.value.length;

    contador.innerText =
    "Caracteres restantes: " + restante;

    if(restante == 0){

        contador.classList.add("limite-atingido");

    }else{

        contador.classList.remove("limite-atingido");

    }

});