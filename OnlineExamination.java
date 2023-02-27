package internship;
import java.util.Scanner;

public class OnlineExamination {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        String username, password;
        System.out.println("Enter your username: ");
        username = input.nextLine();
        System.out.println("Enter your password: ");
        password = input.nextLine();
        if (validateLogin(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
            return;
        }
        
        
        String name, new_password;
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your new password: ");
        new_password = input.nextLine();
        updateProfile(username, name, new_password);
        System.out.println("Profile and password updated successfully!");
        
        
        String[] mcq_questions = {"What is the capital of India?", "Who is the founder of Microsoft?", "What is the largest mammal on earth?"};
        String[][] mcq_options = {{"New Delhi", "Mumbai", "Kolkata", "Chennai"}, {"Bill Gates", "Steve Jobs", "Larry Page", "Sundar Pichai"}, {"Elephant", "Blue Whale", "Giraffe", "Hippopotamus"}};
        int[] mcq_answers = {0, 0, 0}; 
        int[] selected_options = new int[mcq_questions.length];
        for (int i = 0; i < mcq_questions.length; i++) {
            System.out.println(mcq_questions[i]);
            for (int j = 0; j < mcq_options[i].length; j++) {
                System.out.println((j+1) + ". " + mcq_options[i][j]);
            }
            System.out.println("Enter your answer (1-" + mcq_options[i].length + "): ");
            selected_options[i] = input.nextInt() - 1;
        }
        
        
        int exam_duration = 1; 
        long start_time = System.currentTimeMillis();
        while ((System.currentTimeMillis() - start_time) < (exam_duration * 20 * 1000)) {
            
        }
        System.out.println("Time's up!");
        submitExam(mcq_answers, selected_options);
        
        
        System.out.println("Session closed. Goodbye!");
    }
    
    
    public static boolean validateLogin(String username, String password) {
        
        return true; 
    }
    
    
    public static void updateProfile(String username, String name, String new_password) {
        
    }

    
    
    
    public static void submitExam(int[] answers, int[] selected_options) {
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == selected_options[i]) {
                score++;
            }
        }
        System.out.println("You scored " + score + " out of " + answers.length);
        
    }
}
    

