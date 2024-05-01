package com.cydeo.Bean_Annotation;


import com.cydeo.Bean_Annotation.casefactory.Case;
import com.cydeo.Bean_Annotation.casefactory.DellCase;
import com.cydeo.Bean_Annotation.monitorfactory.Monitor;
import com.cydeo.Bean_Annotation.motherboardfactory.Motherboard;




public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt();
    }
}