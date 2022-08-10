package problem_solving.hiring;
import java.util.List;

public class Recruitment {

    public static void main(String[] args) {

        Job job = Job.details()
                .title("Java Developer")
                .position("Software Engineer")
                .deadline("30th August, 2022")
                .responsibilities(List.of(
                        "Design, Build and maintain reusable and reliable software",
                        "Help to maintain code quality, organization and automate"
                ));

        Requirements requirements = new Requirements()
                .experience("More Than 3 years")
                .technologies(List.of("Spring", "Spring Boot", "Hibernate", "Apache Kafka"))
                .strongKnowledgeInDataStructureAndAlgorithms(true)
                .skills(List.of(
                        "Proficient in Java, with a good knowledge of its ecosystem",
                        "Familiar with various design and architectural patterns",
                        "Database and data warehouse experience, both in RDMS and NoSQL"
                ));

        if (Candidate.interestedIn(job) && Candidate.matches(requirements))
            Candidate.sendResumeTo("join@vivasoft.com");

        Candidate candidate = Candidate.details()
                .name("Ahamed Rashid Probal")
                .yearsOfExperience("Almost 2 years")
                .skills(List.of("Java", "Spring", "Spring-Boot", "SQL", "RabbitMQ", "Docker", "ELK stack"));

        if (Job.isEligibleCandidate(candidate))
            Job.getResponseFromVivaSoft();
    }
}