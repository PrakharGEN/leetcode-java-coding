import java.util.Scanner;

public class digitFrequency {
    public static int function(int n,int x){
     
        int ans=0;
        while(n>0){
            int dig = n%10;
            if(dig == x){
                ans++;
            }
            n= n/10;

        }
        return ans;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nxtInt();
        int x = scn.nxtInt();
        int f = function(n,x);
        System.ot.println(f);

    }

}
