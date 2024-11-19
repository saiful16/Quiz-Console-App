import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String  userSelection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "size of integer", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void playQuiz() {
        int i =0;
        for (Question que : questions) {
            System.out.println("Question No: " + que.getId());
            System.out.println(que.getQuestions());
            System.out.println(que.getOpt1());
            System.out.println(que.getOpt2());
            System.out.println(que.getOpt3());
            System.out.println(que.getOpt4());

            Scanner sc = new Scanner(System.in);
            userSelection[i] = sc.nextLine();
            System.out.println("You selected :" + userSelection[i]);
            System.out.println("Correct Answer is:" + que.getAnswer());
            i++;
        }
    }

    public void printScore() {
        int score = 0;
        for(int i = 0; i < questions.length; i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String UserAnswer = userSelection[i];

            if (actualAnswer.equals(UserAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}
