package com.acme.sample;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public final class SwingSampleApp {

    private SwingSampleApp() {
    }

    public static void main(String[] args) {
        if (Boolean.getBoolean("sample.leyden.training")) {
            return;
        }
        SwingUtilities.invokeLater(SwingSampleApp::showWindow);
    }

    private static void showWindow() {
        var frame = new JFrame("Swing Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("JPackage Maven Plugin Swing sample"), BorderLayout.CENTER);
        frame.add(new JButton("Close"), BorderLayout.SOUTH);
        frame.setSize(420, 180);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

