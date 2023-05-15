class Solution {
    public boolean isPalindrome(String s) {
       

        if(s.isEmpty()){
            return true;
        }

        int start = 0;
        int last = s.length() - 1;
        while(start <= last){
            char firstch = s.charAt(start);
            char lastch = s.charAt(last);

            if(!Character.isLetterOrDigit(firstch)){
                start++;
            }
            else if(!Character.isLetterOrDigit(lastch)){
                last--;
            }
            else{
                if(Character.toLowerCase(firstch) != Character.toLowerCase(lastch)){
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
