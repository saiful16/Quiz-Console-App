public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService(){
        questions[0] = new Question(1, "What", "java", "cpp", "python", "JS", "java");
        questions[1] = new Question(1, "What", "java", "cpp", "python", "JS", "java");
        questions[2] = new Question(1, "What", "java", "cpp", "python", "JS", "java");
        questions[3] = new Question(1, "What", "java", "cpp", "python", "JS", "java");
        questions[4] = new Question(1, "What", "java", "cpp", "python", "JS", "java");
    }

    public void displayQuestion(){
        for(Question que : questions){
            System.out.println(que.toString());
        }
    }
}
