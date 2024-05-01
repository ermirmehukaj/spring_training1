package com.cydeo.stereotype_annotation;

import com.cydeo.stereotype_annotation.casefavtory.Case;
import com.cydeo.stereotype_annotation.monitorfactory.Monitor;
import com.cydeo.stereotype_annotation.motherboardfactory.Motherboard;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
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
