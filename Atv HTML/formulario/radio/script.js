const form = document.getElementById('meuForm');

form.addEventListener('submit', function(event) {

    event.preventDefault();

    let linguagem = form.linguagem.value;

    console.log(linguagem);

});

const radios = document.querySelectorAll('input[name="linguagem"]');

radios.forEach(function(radio) {

    radio.addEventListener('change', function(event) {

        if (radio.value === 'JavaScript') {

            console.log('Você selecionou JavaScript');

        } else if (radio.value === 'Python') {

            console.log('Você selecionou Python');

        } else if (radio.value === 'Java') {

            console.log('Você selecionou Java');

        }

    });

});
