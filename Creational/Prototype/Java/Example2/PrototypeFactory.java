public class PrototypeFactory {
    public static void main(String[] args) {

        //if (args.length > 0) {
            //for (String type : args) {
                Person prototype = Factory.getPrototype("tom");
                if (prototype != null) {
                    System.out.println(prototype);
                }
            //}
        //} else {
        //    System.out.println("Run again with arguments of command string ");
        //}
    }
}