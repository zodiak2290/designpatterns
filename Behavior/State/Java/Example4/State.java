abstract class State {
    // 6. Default behavior
    public void on(FSM fsm) {
        System.out.println("error");
    }

    public void off(FSM fsm) {
        System.out.println("error");
    }

    public void ack(FSM fsm) {
        System.out.println("error");
    }
}