package seminar.database;

import seminar.model.Submission;
import seminar.model.Evaluation;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static List<Submission> submissions = new ArrayList<>();
    private static List<Evaluation> evaluations = new ArrayList<>();

    static {
        submissions.add(new Submission("Ali", "AI for Healthcare"));
        submissions.add(new Submission("Siti", "Blockchain Security"));
    }

    public static List<Submission> getSubmissions() {
        return submissions;
    }

    public static void saveEvaluation(Evaluation evaluation) {
        evaluations.add(evaluation);
    }
}

