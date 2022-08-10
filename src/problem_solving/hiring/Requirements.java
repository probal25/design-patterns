package problem_solving.hiring;

import java.util.List;

public class Requirements {

    private String experience;
    private List<String> technologies;
    private boolean hasStrongKnowledgeInDataStructureAndAlgorithms;
    private List<String> skills;

    public Requirements experience(String experience) {
        this.experience = experience;
        return this;
    }

    public Requirements technologies(List<String> technologies) {
        this.technologies = technologies;
        return this;
    }

    public Requirements strongKnowledgeInDataStructureAndAlgorithms(boolean b) {
        this.hasStrongKnowledgeInDataStructureAndAlgorithms = b;
        return this;
    }

    public Requirements skills(List<String> skills) {
        this.skills = skills;
        return this;
    }

    @Override
    public String toString() {
        return "Requirements{" +
                "experience='" + experience + '\'' +
                ", technologies=" + technologies +
                ", hasStrongKnowledgeInDataStructureAndAlgorithms=" + hasStrongKnowledgeInDataStructureAndAlgorithms +
                ", skills=" + skills +
                '}';
    }
}
