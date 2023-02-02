package africa.semicolon.gossip;

import africa.semicolon.gossip.controllers.PostController;
import africa.semicolon.gossip.dtos.requests.CreatePostRequests;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.swing.*;

@SpringBootApplication
@EnableMongoRepositories
public class Main {

    private final PostController postController = new PostController();

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
//        displayMainMenu();
    }

    private void displayMainMenu() {
        String mainMenu = """
                press 1 for create post
                press 2 for view post
                press 3 for exit the application
                """;
        String userInput = input(mainMenu);
        switch (Integer.parseInt(String.valueOf(userInput.charAt(0)))){
        case 1 -> createPost();
        case 2 -> viewPost();
        case 3 -> exitFromApp();
        }
    }

    private void createPost() {
        String title = input("Enter post Title");
        String body = input("Enter post body");
        CreatePostRequests request = new CreatePostRequests();
        request.setTitle(title);
        request.setBody(body);
        print(postController.createPost(request));
        displayMainMenu();
    }

    private void viewPost() {
        String userInput = input("enter post id");
        print(postController
                .viewPost(String.valueOf(Integer.parseInt(String.valueOf(userInput))))
                .toString());
        displayMainMenu();
    }

    private static void print(String prompt) {
         JOptionPane.showMessageDialog(null, prompt);
    }

    private static void exitFromApp() {
        print("Thank you for using our application");
        System.exit(0);
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
}