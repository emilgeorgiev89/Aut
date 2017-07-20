package bg.credissimo.tests;
import bg.credissimo.utills.RandomParameters;
import org.apache.xpath.operations.Plus;

public class testingClass {



    public static void main(String [] args) {
        RandomParameters random = new RandomParameters();
        System.out.println(random.randomAmount("Salary"));
        System.out.println(random.randomPeriod("Salary"));
    }

}
