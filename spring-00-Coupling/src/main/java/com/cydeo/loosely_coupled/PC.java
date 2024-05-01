package com.cydeo.loosely_coupled;


import com.cydeo.loosely_coupled.casefactory.DellCase;
import com.cydeo.loosely_coupled.monitorfactory.Monitor;
import com.cydeo.loosely_coupled.motherboardfactory.Motherboard;


public class PC {

    private DellCase theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(DellCase theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt();
    }
}
