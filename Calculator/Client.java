import PowerApp.PowerCalculator;
import PowerApp.PowerCalculatorHelper;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextExtPackage.*;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // Initialize the ORB
            ORB orb = ORB.init(args, null);

            // Get the Naming service reference
            org.omg.CORBA.Object ncObjRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(ncObjRef);

            // Resolve the object reference from the Naming service
            String name = "PowerCalculator";
            PowerCalculator powerCalculator = PowerCalculatorHelper.narrow(ncRef.resolve_str(name));

            // Input the base and exponent from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter base: ");
            float base = scanner.nextFloat();
            System.out.print("Enter exponent: ");
            float exponent = scanner.nextFloat();

            // Call the power method on the server
            float result = powerCalculator.power(base, exponent);
            System.out.println("Result: " + base + "^" + exponent + " = " + result);

        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
    }
}
