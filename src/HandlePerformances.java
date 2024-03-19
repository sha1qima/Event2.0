import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HandlePerformances {
    
    Scanner reader = new Scanner(System.in);

    Queue<Performance> performances = new LinkedList<>();

    public void handlePerformances(){
        int choice = 0;
        do{
            System.out.println("\n" + "Here are the performance operations available to you: " + "\n");
            System.out.println("Type 1 to add performances:" + "\n");
            System.out.println("Type 2 to display the list of performances: " + "\n");
            System.out.println("Type 3 to start the performances: " + "\n");
            System.out.println("Type 4 to QUIT:" + "\n");
            choice=reader.nextInt();
            reader.nextLine();
            switch(choice){
                case 1:
                    System.out.println("How many performances would you like to add?");
                    int num = reader.nextInt();
                    reader.nextLine();
                    addPerformances(num);
                case 2:
                    displayPerformances();
                    break;
                case 3:
                    startPerformance();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }while(choice != 4);
    }

    public void addPerformances(int num){
        
        for(int i=0; i<num; i++){
            System.out.println("Enter the performance ID:");
            String ID = reader.nextLine();
                
            System.out.println("Enter the performance name:");
            String name = reader.nextLine();
                
            System.out.println("Enter the performance lead name:");
            String leadName = reader.nextLine();

            Performance per = new Performance(ID, name, leadName);
            
            this.performances.offer(per);

        }
    }

    public void displayPerformances(){
        System.out.println("Here is the list of performances" + "\n" + performances);
    }

    public void startPerformance(){
        System.out.println("The next performance starting is: " + performances.poll());
    }
}

