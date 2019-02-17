
var CaffeineBeverage = (function () {

    // final boilWater()
    var boilWater = function () {
        console.log("Boiling water");
    };
    
    // final pourInCup()
    var pourInCup = function () {
        console.log("Pouring into cup");
    };
    
    return {
    
        prepareRecipe: function () {
            boilWater();
            this.brew();
            pourInCup();
            this.addCondiments();
        }
    
    };

})();

var Tea = function () {

    this.brew = function () {
        console.log("Steeping the tee");
    };
    
    this.addCondiments = function () {
        console.log("Adding Lemon");
    };

};

Tea.prototype = CaffeineBeverage;
Tea.prototype.constructor = Tea;

var Coffee = function () {

    this.brew = function () {
        console.log("Dripping Coffee through filter");
    };
    
    this.addCondiments = function () {
        console.log("Adding Sugar and Milk");
    };

};

Coffee.prototype = CaffeineBeverage;
Coffee.prototype.constructor = Coffee;

var Application = function () {
    
    this.run = function () {
        
        var tea = new Tea();
        tea.prepareRecipe();
        
        var coffee = new Coffee();
        coffee.prepareRecipe();
        
    };
    
};

var application = new Application();
application.run();
