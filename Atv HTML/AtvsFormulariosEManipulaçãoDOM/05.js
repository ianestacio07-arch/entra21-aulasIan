let pf =
document.getElementById("pf");

let pj =
document.getElementById("pj");

let documento =
document.getElementById("documento");

pj.addEventListener(
"change", function(){

    documento.disabled = true;

    documento.classList.add(
    "fundo-cinza"
    );

    documento.placeholder =
    "CNPJ (não implementado)";

});

pf.addEventListener(
"change", function(){

    documento.disabled = false;

    documento.classList.remove(
    "fundo-cinza"
    );

    documento.placeholder = "CPF";

});