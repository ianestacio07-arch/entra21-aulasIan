const form = document.getElementById('meuForm');

form.addEventListener('submit', function(event) {
    event.preventDefault();
    
    let login = form.login.volue;
    let senha = form.senha.volue;

    
    console.log(login, senha) 

    form.reset()
})
