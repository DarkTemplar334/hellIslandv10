package gr.gcc.hellIsland.Command;


import gr.gcc.hellIsland.UI.DisplayMenu;

import java.util.Scanner;

public class UserInput {

    private String input;

    public String getInput(){
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        return input;
    }

    public String[] Tokenizer(String decision){
        String[] token = new String[2];
        if(decision.equals("help")){
            token[0] = decision;
            token[1] = null;
            return token;

        }
        else {
            String[] commandToSplit = decision.split(" ");
            if (commandToSplit.length < 2) {
                token[0] = "Wrong option, ";
                token[1] = "Chose again";
                return token;
            } else {
                token[0] = commandToSplit[0];
                token[1] = commandToSplit[1];
                return token;
            }
        }
    }













//    private Parser parser;
//
//    private String cmd;
//
//    public String returnInput(){
//        Scanner scanner = new Scanner(System.in);
//        cmd = scanner.nextLine();
//        return cmd;
//    }
//
////    public void input(){
////        Scanner scanner = new Scanner(System.in);
////        cmd = scanner.nextLine();
////
////    }

}
