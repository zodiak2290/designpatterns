class InterpreterExample {
   public static void main(String[] args) {
       System.out.println("'42 2 1 - +' equals " + new Parser("42 2 1 - +").evaluate());

       System.out.println("'43 2 5 - +' equals " + new Parser("43 2 5 - +").evaluate());
   }
}