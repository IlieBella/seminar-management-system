package seminar.view;

import seminar.model.Evaluator;

import javax.swing.*;
import java.awt.*;

public class LoginUI extends JFrame {

    public LoginUI() {
        setTitle("Evaluator Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton loginBtn = new JButton("Login as Evaluator");
        loginBtn.addActionListener(e -> {
            Evaluator evaluator = new Evaluator("E01", "Dr. Ahmad");
            new EvaluationUI(evaluator);
            dispose();
        });

        add(loginBtn, BorderLayout.CENTER);
        setVisible(true);
    }
}

