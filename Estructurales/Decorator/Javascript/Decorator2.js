//What we're going to decorate
function PC()
{
   this.cost = function ()
   {
    return 1000;
   };
   this.monitor = function ()
   {
    return 24 + "in";
   };
}
/*Decorator 1*/
function RAM(pc,pcs)
{
var RAMCost = 20;
   var baseCost = pc.cost();
   pc.cost = function()
   {
       return baseCost + (RAMCost * pcs);
   }
}
/*Decorator 2*/
function VideoCard(pc){
  var baseCost = pc.cost();
  pc.cost = function(){
    return  baseCost + 200;
 };
}

/*Decorator 3*/
function Harddisk(pc)
{
  var HardDiskCost = 30;
  var baseCost = pc.cost();
  pc.cost = function()
  {
    return  baseCost + HardDiskCost;
 };
}

var myPC = new PC();
RAM(myPC,4); // Add RAM
VideoCard(myPC); // Add Video Card
Harddisk(myPC); // add Hard Disk

console.log("Total Price: "+ myPC.cost() + " USD");
console.log(myPC.monitor());