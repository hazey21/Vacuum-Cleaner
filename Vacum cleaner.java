public class Vacuumcleaner{ 
    public static void main(String args[])
    {
        char current_location = args[0].charAt(0); 
        //state: true -> clean,false -> not clean
        boolean A_status = Boolean.parseBoolean(args[1]); 
        boolean B_status = Boolean.parseBoolean(args[2]); 
        boolean C_status = Boolean.parseBoolean(args[3]); 
        boolean D_status = Boolean.parseBoolean(args[4]); 
        System.out.println("Current Location = " + current_location + "\n" + 
                "Square A status = " + A_status + "\n" + 
                "Square B status = " + B_status + "\n" + 
                "Square C status = " + C_status + "\n" + 
                "Square D status = " + D_status + "\n");
        
                char roomLocation = environmentSimulator(current_location, A_status, B_status, C_status, D_status); 
                System.out.println("\nAction- Next Location = " + roomLocation); 
    }
    
    //-------------------------------------------------------
    // Assignment 1: Model-based Agent Function
    // Write the function here
    // ------------------------------------------------------
    private static char environmentSimulator(char current_location, boolean A_status, boolean B_status, boolean C_status, boolean D_status)
    {
        // Return current location if all room are clean. 
        if(A_status && B_status && C_status && D_status)
        {
            return current_location; 
        }

        // Switch statement to determined where the vacuuum needs to clean. 
        switch(current_location)
        {
            // All cases for room A
            case 'A': 
                if(!A_status)
                {
                    return 'A'; 
                }
                if(!B_status)
                {
                    return 'B'; 
                }
                if(!C_status)
                {
                    return 'C'; 
                }
                if(!D_status)
                {
                    return 'C'; 
                }
                break; 
            
                // All cases for room B
            case 'B': 
                if(!B_status)
                {
                    return 'B'; 
                }
                if(!A_status)
                {
                    return 'A'; 
                }
                if(!D_status)
                {
                    return 'D'; 
                }
                if (!C_status)
                {
                    return 'D'; 
                }
                break;
            
            // All cases for room C
            case 'C': 
                if(!C_status)
                {
                    return 'C'; 
                }
                if(!D_status)
                {
                    return 'D'; 
                }
                if(!A_status)
                {
                    return 'A'; 
                }
                if(!B_status)
                {
                    return 'A'; 
                }
                break; 
            
            // All cases for room D
            case 'D': 
                if(!D_status)
                {
                    return 'D'; 
                }
                if(!C_status)
                {
                    return 'C'; 
                }
                if(!B_status)
                {
                    return 'B'; 
                }
                if(!A_status)
                {
                    return 'B'; 
                }
                break; 
        }
        return current_location;            
    }          
}
