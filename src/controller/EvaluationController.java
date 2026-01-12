package seminar.controller;

import seminar.database.Database;
import seminar.model.Evaluation;
import seminar.model.Submission;

import java.util.List;

public class EvaluationController {

    public List<Submission> getAssignedSubmissions() {
        return Database.getSubmissions();
    }

    public void submitEvaluation(int pc, int m, int r, int p, String comments) {
        Evaluation evaluation = new Evaluation(pc, m, r, p, comments);
        evaluation.calculateTotal();
        Database.saveEvaluation(evaluation);
    }
}

