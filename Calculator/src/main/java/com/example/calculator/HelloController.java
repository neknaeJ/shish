package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label Total;
    @FXML
    private TextField first;
    @FXML
    private TextField second;
    @FXML
    private Label aboutText;

    @FXML
    protected void Total() {
        Total.setText("");

    }

    @FXML
    protected void plus() {
        String a, b, f;
        float c, d;
        float e;
        a = first.getText();
        b = second.getText();

        c = Float.parseFloat(a);
        d = Float.parseFloat(b);

        e = c + d;
        f = Float.toString(e);

        Total.setText(f);
    }

    @FXML
    protected void minus() {
        String a, b, f;
        float c, d;
        float e;
        a = first.getText();
        b = second.getText();

        c = Float.parseFloat(a);
        d = Float.parseFloat(b);

        e = c - d;
        f = Float.toString(e);

        Total.setText(f);
    }

    @FXML
    protected void delen() {
        String a, b, f;
        float c, d;
        float e;
        a = first.getText();
        b = second.getText();

        c = Float.parseFloat(a);
        d = Float.parseFloat(b);

        e = c / d;
        f = Float.toString(e);

        Total.setText(f);
    }

    @FXML
    protected void umnoz() {
        String a, b, f;
        int c, d, e;
        a = first.getText();
        b = second.getText();

        c = Integer.parseInt(a);
        d = Integer.parseInt(b);

        e = c * d;
        f = Integer.toString(e);

        Total.setText(f);
    }

    @FXML
    protected void onHelloButtonClick() {
        System.exit(0);
    }

    @FXML
    protected void about() {
        aboutText.setText("Калькулятор!!!");
    }
}