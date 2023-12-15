// Write a program to reverse a string  
// also solved on gfg
import java.util.Scanner ;
public class c_Reverse{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();


        char[] ss = s.toCharArray(); 
        int n = ss.length ;
        for(int i = 0 ; i<n/2 ; i++){
            char temp = ss[i] ;
            ss[i] = ss[n-i-1];
            ss[n-i-1] = temp ;
        }
        System.out.println("String after reversed");
                for(int i = 0 ; i<n ; i++){
                    System.out.print(ss[i]) ;
        }
        
    }
}


// Using StringBuilder (inbuilt method of StringBuilder)

/*
import  java.util.Scanner ;
public class c_Reverse{
    
    
    public static void main(String[] args){
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine() ;
        
        
        // String a  = "Praagya" ;
        
        StringBuilder sb = new StringBuilder(s);
        
        sb.reverse() ;  
        
        String reversedString = sb.toString();
        
        
        System.out.println("String after reversed");
        System.out.println(reversedString);
        
        
    }
} 
*/
