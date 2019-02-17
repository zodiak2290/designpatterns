class EnviarProductos {
    continue(products) {
        console.log("Enviando Productos");
        products.map( ( product ) => {
            product.proceso = 'Enviando';
        });
        console.log( products );
        return products;
    };
}