 class kelia2 {       
       public static void main(String args[])  
       {         
            Integer age = 20;        
            switch (age)  
            {  
                case (17):            
                    System.out.println("You are under 20.");  
                    break;  
                case (20):                
                    System.out.println("You are eligible for vote.");  
                    break;  
                case (60):                
                    System.out.println("You are senior citizen.");  
                    break;  
                default:  
                    System.out.println("Please give the valid age.");  
                    break;  
            }             
        }  
}