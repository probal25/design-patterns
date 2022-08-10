package problem_solving.hiring;

import java.util.List;

public class Candidate {

    private String name;
    private String yearsOfExperience;
    private List<String> skills;

    public static Candidate details() {
        return new Candidate();
    }

    public Candidate name(String name) {
        this.name = name;
        return this;
    }

    public Candidate yearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
        return this;
    }

    public Candidate skills(List<String> skills) {
        this.skills = skills;
        return this;
    }

    public static boolean interestedIn(Job job) {
        return true;
    }

    public static boolean matches(Requirements requirements) {
        return true;
    }

    public static void sendResumeTo(String email) {
        System.out.println("Sent");
    }
}
