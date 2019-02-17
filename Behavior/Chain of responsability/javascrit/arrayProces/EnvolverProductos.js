class EnvolverProductos {
    constructor() {
        this.next = null;
    }

    setNext(fn) {
        this.next = fn;
    };

    continue(products) {
        products.map( ( product ) => {
            product.proceso = 'Envuelto';
        });
        console.log( products );
        console.log("Productos Envueltos");
        return this.next.continue(products);
    };
}