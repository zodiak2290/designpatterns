class ShoppingCart {
    constructor() {
        this.products = [];
    }

    addProduct(p) {
        this.products.push(p);
    };

    getProducts() {
    	return this.products;
    }
}
