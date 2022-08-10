package problem_solving.hiring;

import java.util.List;

public class Job {

    private String title;
    private String position;
    private String deadline;
    private List<String> responsibilities;

    public static Job details() {
        return new Job();
    }

    public static void getResponseFromVivaSoft() {
        System.out.println("Waiting for Vivasoft response");
    }

    public Job title(String title) {
        this.title = title;
        return this;
    }

    public Job position(String position) {
        this.position = position;
        return this;
    }

    public Job deadline(String deadline) {
        this.deadline = deadline;
        return this;
    }

    public Job responsibilities(List<String> responsibilities) {
        this.responsibilities = responsibilities;
        return this;
    }

    public static boolean isEligibleCandidate(Candidate candidate) {
        return true;
    }
}
