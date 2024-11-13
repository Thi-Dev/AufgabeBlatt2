
import java.util.*;

public class ControlFLowTestDrive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your Name ? ");                      // Name of the user
        String userName = scanner.nextLine();                           // userName in a variable
        System.out.println("Hello and  welcome "+ userName);
        System.out.println ("-----------------------------");
        System.out.println("Where do you live ?");                        // Asking the Address of the user
        String userAdresse = scanner.nextLine();                        // making in a variable his input
        System.out.println("In " + userAdresse + " should be very beautifull");
        System.out.println ("-----------------------------");
        System.out.println("how often would you repeat the greeting ? ");       // Asking the user for a Loop
        int greetingRepeat = scanner.nextInt();                                 // the repetition is in a variable

        for (int i = 0; i <= greetingRepeat ; i++){                             // making a condition to repeat the greeting
            if(userName.isEmpty()){
                System.out.println("Error, you should put your name");
            } else {
                System.out.println("Hello and  welcome "+ userName);
            }
        }

        System.out.println ("-----------------------------");



<<<<<<< HEAD

=======
        /* introducing a student */

        Student students = new Student();
        students.name = "Bob";
        students.studiengang = "Computer Sciences";
        students.matrikelNummer = 45786486;

        students.greetingStudent();
>>>>>>> 4e33b40d49eb305f86951f79c17ae1cf6acfa13d


    }
}
