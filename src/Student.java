public class Student extends Person {
    String studentName;
    String studiengang;
    int matrikelNummer;


    void greetingStudent(){
        System.out.println("hi , I am " + studentName + " and I study " + studiengang);
        System.out.println("This is my studentID " + matrikelNummer);
    }
}
