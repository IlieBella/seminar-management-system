package seminar.view;

import seminar.controller.EvaluationController;
import seminar.model.Evaluator;
import seminar.model.Submission;

import javax.swing.*;
import java.awt.*;

public class EvaluationUI extends JFrame {

    private EvaluationController controller = new EvaluationController();

    public EvaluationUI(Evaluator evaluator) {
        setTitle("Evaluator Panel - " + evaluator.getName());
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JComboBox<String> submissionBox = new JComboBox<>();
        for (Submission s : controller.getAssignedSubmissions()) {
            submissionBox.addItem(s.getStudentName() + " - " + s.getTitle());
        }

        JTextField pc = new JTextField();
        JTextField m = new JTextField();
        JTextField r = new JTextField();
        JTextField p = new JTextField();
        JTextArea comments = new JTextArea(3, 20);

        JButton submitBtn = new JButton("Submit Evaluation");

        submitBtn.addActionListener(e -> {
            controller.submitEvaluation(
                    Integer.parseInt(pc.getText()),
                    Integer.parseInt(m.getText()),
                    Integer.parseInt(r.getText()),
                    Integer.parseInt(p.getText()),
                    comments.getText()
            );
            JOptionPane.showMessageDialog(this, "Evaluation submitted successfully!");
        });

        setLayout(new GridLayout(7, 2));
        add(new JLabel("Submission:")); add(submissionBox);
        add(new JLabel("Problem Clarity:")); add(pc);
        add(new JLabel("Methodology:")); add(m);
        add(new JLabel("Results:")); add(r);
        add(new JLabel("Presentation:")); add(p);
        add(new JLabel("Comments:")); add(new JScrollPane(comments));
        add(new JLabel()); add(submitBtn);

        setVisible(true);
    }
}

