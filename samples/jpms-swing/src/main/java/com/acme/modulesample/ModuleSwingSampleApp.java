package com.acme.modulesample;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public final class ModuleSwingSampleApp {

    private ModuleSwingSampleApp() {
    }

    public static void main(String[] args) {
        if (Boolean.getBoolean("sample.leyden.training")) {
            return;
        }
        SwingUtilities.invokeLater(ModuleSwingSampleApp::showWindow);
    }

    private static void showWindow() {
        var frame = new JFrame("JPMS Swing Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("JPackage Maven Plugin JPMS Swing sample"), BorderLayout.CENTER);
        frame.add(new JButton("Close"), BorderLayout.SOUTH);
        frame.setSize(460, 180);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
