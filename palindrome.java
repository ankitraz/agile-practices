import java.util.Scanner;

class palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no: ");
        String num;
        num = input.next();
        for ( int i = 0; i <= num.length(); i++) {
            if (num.charAt(i) != num.charAt(num.length()-i)) {
                System.out.println("Not a palindrome");
                break;
            }    
        }
        input.close();
    }
}