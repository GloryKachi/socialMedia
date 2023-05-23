package semicolon.africa.socialMedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import semicolon.africa.socialMedia.controllers.PostController;
import semicolon.africa.socialMedia.dtos.requests.CreatePostRequest;

import javax.swing.*;
@SpringBootApplication
public class Main {
    //private static Scanner keyboardInput = new Scanner(System.in);
//    private static PostController postController = new PostController();
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
//        displayMainMenu();
    }
//    private static void displayMainMenu(){
//        String mainMenu = """
//               press 1 for create post
//               press 2 for view post
//               press 3 to exit
//               """;
//        String userInput = input(mainMenu);
//        switch (Integer.parseInt(String.valueOf(userInput.charAt(0)))){
//            case 1 -> createPost();
//            case 2 -> viewPost();
//            case 3 -> exitFromApp();
//        }
//    }
//
//    private static void createPost(){
//        String title = input("Enter post title");
//        String body = input("Enter post body");
//        CreatePostRequest createPostRequest = new CreatePostRequest();
//        createPostRequest.setTitle(title);
//        createPostRequest.setBody(body);
//        print(postController.createPost(createPostRequest));
//        displayMainMenu();
//    }
//    private static void viewPost(){
//        String userInput = input("Enter post id");
//        print(postController
//                .viewPost(Integer.parseInt(String.valueOf(userInput))).toString());
//                displayMainMenu();
//    }
//    private static void exitFromApp(){
//        print("Thank you for using our App");
//        System.exit(0);
//    }
//    private static String input(String prompt){
//       return JOptionPane.showInputDialog(prompt);
//    }
//    private static void print(String prompt){
//        JOptionPane.showMessageDialog(null,prompt);
//    }
}
