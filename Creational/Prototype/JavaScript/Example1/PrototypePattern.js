function Juego(){ 
    this.nivel = 0 , 
    this.time = 0; 
    this.jugador ="alberto"; 
}

Juego.prototype.clone = function() {
    return new Juego(this.nivel, this.time, this.jugador);
};


var elgame = new Juego();
var elgame2 = elgame.clone();
elgame2.nivel = 10;
console.log(elgame)

//memeno pattern
function MementoGame(juego) {
    this.juego = juego;
}

﻿
var originatorGame = {
    store: function(game) {
        return new MementoGame(game);
    },
    restore: function(memento) {
        return memento.juego;
    }
};

function Caretaker() {
    this.values = [];
}

Caretaker.prototype.addMemento = function(memento) {
    this.values.push(memento);
};

Caretaker.prototype.getMemento = function(index) {
    return this.values[index];
};
var elgame = new Juego();
var  care =  new Caretaker();
care.addMemento( originatorGame.store(elgame) );

var elgame2= elgame.clone();
elgame2.nivel = 1;
care.addMemento( originatorGame.store(elgame2) );

var elgame3= elgame2.clone();
elgame3.nivel = 2;
care.addMemento( originatorGame.store(elgame3) );
originatorGame.restore( care.getMemento(0) );
