import java.util.HashMap;

public class SubStringWithTwoOccurences {
    public static int maximumLengthSubstring(String s) {
        int out = 0;
        for(int i=0; i<s.length(); i++){
            HashMap<Character, Integer> temp = new HashMap<>();
            int j = 0;
            for(j=i; j<s.length(); j++){
                char ch = s.charAt(j);
                if(temp.containsKey(ch) && temp.get(ch)>=2){
                    if(j-i > out){
                        out = j-i;
                    }
                    break;
                }else if(temp.containsKey(ch)){
                    temp.put(ch, temp.get(ch)+1);
                }else{
                    temp.put(ch,1);
                }
            }
            if(j == s.length() && j-i>out){
                out = j-i;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(maximumLengthSubstring("bcbbbcba"));
    }
}
