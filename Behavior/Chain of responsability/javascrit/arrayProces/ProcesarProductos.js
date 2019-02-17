class ProcesarProductos {
    calc(products) {

    	
        let validar = new ValidarProductos();
        let envolver = new EnvolverProductos();
        let enviar = new EnviarProductos();

        validar.setNext(envolver);
        envolver.setNext(enviar);
        return validar.continue(products);
    };
}



let carrito = new ShoppingCart();

carrito.addProduct(  {  name: 'laptop', precio: 16000 , proceso: 'Iniciando'} );
carrito.addProduct(  {  name: 'tenis', precio: 3000 , proceso: 'Iniciando' } );
carrito.addProduct(  {  name: 'libro', precio: 160 , proceso: 'Iniciando' } );
console.log( carrito.getProducts() );
let proceso = new ProcesarProductos( )
let productos =  proceso.calc( carrito.getProducts() );
console.log( productos )