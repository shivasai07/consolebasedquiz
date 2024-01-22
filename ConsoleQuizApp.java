import java.util.Scanner;

class Question {
    String question;
    String[] options;
    char correctAnswer;

    public Question(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class ConsoleQuizApp {

    public static void main(String[] args) {
        // Define quiz questions
        Question[] questions = {
                new Question("What is the capital of Japan?", new String[]{"A. Beijing", "B. Tokyo", "C. Seoul", "D. Bangkok"}, 'B'),
                new Question("Which programming language is known as the 'mother of all languages'?", new String[]{"A. Java", "B. C", "C. Python", "D. Assembly"}, 'B'),
                new Question("What is the largest ocean on Earth?", new String[]{"A. Atlantic Ocean", "B. Indian Ocean", "C. Southern Ocean", "D. Pacific Ocean"}, 'D')
        };

        // Initialize variables for scoring
        int score = 0;
        int totalQuestions = questions.length;

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Display and process each question
        for (int i = 0; i < totalQuestions; i++) {
            displayQuestion(questions[i]);

            // Get user input
            System.out.print("Your answer: ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            // Check if the answer is correct
            if (userAnswer == questions[i].correctAnswer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + questions[i].correctAnswer + ".\n");
            }
        }

        // Display final score
        System.out.println("Quiz completed! Your final score: " + score + "/" + totalQuestions);

        // Close the scanner
        scanner.close();
    }

    private static void displayQuestion(Question question) {
        System.out.println(question.question);

        // Display options
        for (String option : question.options) {
            System.out.println(option);
        }
    }
}
