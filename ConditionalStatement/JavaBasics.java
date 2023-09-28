import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {
        int age =  20;

        if(age >= 18){
            System.out.println("Adult : Drive : Voter");
        }
        else if (age > 13 && age < 18){
            System.out.println("Teenager");

        }
        else{
            System.out.println("Not adult");
        }
    }
}