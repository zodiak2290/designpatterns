class FSM {
    // 2. States array
    private State[] states  = {new A(), new B(), new C()};

    // 3. Current state
    private int currentState = 0;

    // 4. Delegation and pass the this pointer
    public void on()  {
        states[currentState].on(this);
    }

    public void off() {
        states[currentState].off(this);
    }

    public void ack() {
        states[currentState].ack(this);
    }

    public void changeState(int index) {
        currentState = index;
    }

    public void getCurrennt(){
        System.out.println( states[currentState].getClass() );
    }
}