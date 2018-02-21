public class StringRecursiveReversal {

   // int value = Integer.MAX_VALUE;
    //long biggervalue = value + 1;
    
     String reverse = "";
     
    public String reverseString(String str){
         
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)	
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
    
    public static void main(String a[]){
        StringRecursiveReversal srr = new StringRecursiveReversal();
       String sar = srr.reverseString("My dad is my Hero");
       System.out.println("My string is" +sar);
        System.out.println("Result: "+srr.reverseString(" "));
    }
     

}