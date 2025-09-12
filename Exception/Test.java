// 


class Test
{
     public static void main(String args[]) {

        System.out.println("Main method started");

        int a = 10, b = 0, c;
        try{                                                                                
                           
             c=a/b;                    // java.lang.ArithmeticException: jevha program madhye exception yet tevhch program terminate hoto  
             System.out.println(c);
        }
        catch(ArithmeticException e)     //e kahi pn ghevu shkto
        {
            System.out.println("Can't divide by zero");
        }

        System.out.println("Main method started");
    }
}