const arena = document.getElementById("arena");

let tropas = [];

const deckJogador = [
{
  nome:"Paladino",
  emoji:"🛡️",
  custo:3,
  vida:95,
  dano:14,
  velocidade:1.4,
  alcance:40,
  cor:"#4fa3ff"
},

{
  nome:"Ninja",
  emoji:"🥷",
  custo:4,
  vida:70,
  dano:22,
  velocidade:2,
  alcance:36,
  cor:"#232323"
},

{
  nome:"Feiticeira",
  emoji:"🔮",
  custo:5,
  vida:90,
  dano:21,
  velocidade:1.2,
  alcance:110,
  cor:"#8e44ad",
  area:65
}
];

function criarTropa(carta,x,y){

  const el = document.createElement("div");

  el.className = "tropa";

  el.style.background = carta.cor;

  el.innerHTML = carta.emoji;

  arena.appendChild(el);

  tropas.push({
    x,
    y,
    el,
    vida:carta.vida,
    dano:carta.dano,
    velocidade:carta.velocidade,
    alcance:carta.alcance,
    area:carta.area || 0
  });

}

arena.addEventListener("click",(e)=>{

  const rect = arena.getBoundingClientRect();

  const x = e.clientX - rect.left;
  const y = e.clientY - rect.top;

  criarTropa(deckJogador[0],x,y);

});

function loop(){

  tropas.forEach((tropa)=>{

    tropa.y -= tropa.velocidade;

    tropa.el.style.left = tropa.x + "px";
    tropa.el.style.top = tropa.y + "px";

  });

  requestAnimationFrame(loop);

}

loop();

function reiniciar(){
  location.reload();
}