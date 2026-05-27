const form = document.getElementById('meuForm');

const inputSenha = document.getElementById('senha');

const inputConfirmarSenha = document.getElementById('confirmarSenha');

const botao = document.getElementById('botao');

form.addEventListener('submit', function(event) {

    event.preventDefault();

    alert('Formulário enviado com sucesso!');

});

inputConfirmarSenha.addEventListener('keyup', function() {

    let senha = inputSenha.value;

    let confirmaSenha = inputConfirmarSenha.value;

    if (senha === confirmaSenha && senha !== '') {

        botao.disabled = false;

        inputConfirmarSenha.classList.add('senha-ok');

        inputConfirmarSenha.classList.remove('senha-erro');

    } else {

        botao.disabled = true;

        inputConfirmarSenha.classList.add('senha-erro');

        inputConfirmarSenha.classList.remove('senha-ok');

    }

});