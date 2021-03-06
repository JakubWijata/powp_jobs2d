package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ShapeFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SelectTrapezoidOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTrapezoidOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ShapeFactory.createTrapezoid().execute(driverManager.getCurrentDriver());
    }


}