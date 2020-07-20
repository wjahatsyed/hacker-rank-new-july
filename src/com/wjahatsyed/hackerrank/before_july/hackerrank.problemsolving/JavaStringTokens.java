import java.util.Scanner;

/**
 * Created by Syed Wajahat on 9/5/2019.
 */
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s=s.trim();
        String splitingRegex = "[ !,?._'@]+";
        String[] tokens = s.split(splitingRegex);
        if(tokens.length ==1 && s.length()==0){
            System.out.println(0);
        }else{
            System.out.println(tokens.length);
            for(String ss: tokens){
                System.out.println(ss);
            }
        }
    }
}
