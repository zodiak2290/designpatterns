class ValidarProductos {
    constructor() {
        this.next = null;
    }

    setNext(fn) {
        this.next = fn;
    };

    continue(products) {
        console.log("Validando Productos");
        products.map( ( product ) => {
            product.proceso = 'Validando';
        });
        console.log( products );
        return this.next.continue(products);
    };
}