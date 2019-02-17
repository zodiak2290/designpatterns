class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Button button  = (Button)e.getSource();
        Component[] buttons = button.getParent().getComponents();
        int i = 0;
        for ( ; i < buttons.length; i++) {
            if (button == buttons[i]) {
                break;
            }
        }
        // 4. A third party must compute the extrinsic state (x and y)
        //    (the Button label is intrinsic state)
        System.out.println("label-" + e.getActionCommand()
                + "  x-" + i/10   + "  y-" + i%10);
    }
}