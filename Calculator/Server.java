import PowerApp.PowerCalculator;
import PowerApp.PowerCalculatorHelper;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Initialize the ORB
            ORB orb = ORB.init(args, null);

            // Create the implementation object
            PowerCalculatorImpl powerCalculator = new PowerCalculatorImpl();

            // Get reference to rootPOA and activate the POAManager
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("RootPOA");
            org.omg.PortableServer.POA rootpoa = org.omg.PortableServer.POAHelper.narrow(objRef);
            rootpoa.the_POAManager().activate();

            // Register the service with the ORB
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(powerCalculator);
            PowerCalculator href = PowerCalculatorHelper.narrow(ref);

            // Get the Naming service
            org.omg.CORBA.Object ncObjRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(ncObjRef);

            // Bind the object reference in the naming context
            NameComponent path[] = ncRef.to_name("PowerCalculator");
            ncRef.rebind(path, href);

            System.out.println("PowerCalculator Server is running...");

            // Wait for invocations from clients
            orb.run();

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
    }
}
