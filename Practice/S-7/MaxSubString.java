import java.util.HashMap;
import java.util.Scanner;

public class MaxSubString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Stirng: ");
        String s = sc.nextLine();
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        HashMap<Character,Integer> hashMp = new HashMap<>();
        int l =0,max=0;
        for (int i = 0; i < s.length(); i++) {
            hashMp.put(s.charAt(i),hashMp.getOrDefault(s.charAt(i), 0)+1);
            while (hashMp.size()>k) {
                if(hashMp.get(s.charAt(l))-1==0){
                    hashMp.remove(s.charAt(l));
                    l++;
                    continue;                 
                }
                hashMp.put(s.charAt(l),hashMp.get(s.charAt(l))-1);
                l++;
            }
            if (max< i-l+1) {
                max = i-l+1;
            }
        }
        System.out.println(max);
        sc.close();
    }
}