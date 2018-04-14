import java.util.HashSet;

public class PangramChecker {
    public boolean isPangram(String input) {
        //HashSet<Character> chars = new HashSet<Character>(input.toCharArray());
        input = input.toLowerCase();
        int length = 26;
        int[] array = new int[26];
         for (int i = 0; i < 26; i++){
             array[i] = 0;
         }

        for(int i=0;i<input.length(); i++) {
            if ((int) (input.charAt(i)) - 97 >= 0 && (int) (input.charAt(i)) - 97 < 26)
                array[(int) (input.charAt(i)) - 97] = 1;
        }

        while(length > 0)
        {
            if(array[length - 1] == 0)
            {
                return false;
            }
            length --;
        }
        return true;
    }
}
