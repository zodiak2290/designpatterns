class This implements Element {
    public void accept(ReflectiveVisitor v) {
        v.visit(this);
    }

    public String thiss() {
        return "This";
    }
}