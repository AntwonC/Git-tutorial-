public class program    {
    
public static int fib(int n)    {
    
    if ( n == 0 )   {
        return n; 
    }
    
    if ( n > 0 )    {
        return fib(n-2) + fib(n-1); 
    }
    
    return n; 
}


public static void main(String[] args)  {
        System.out.println("Hello World");
    }

}