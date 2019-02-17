class State {
    // 5. Default behavior can go in the base class
    public void push(Button b) {
        b.setCurrent(OFF.instance());
        System.out.println("   turning OFF");
    }
}