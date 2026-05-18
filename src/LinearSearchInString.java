// write a java program to print the particular character from string

public class LinearSearchInString {
    public static void main(String[] args) {
        String s = "Abhishek";
        char target = 'k';
        int ans = linearSearch(s,target);
        System.out.println(ans);

    }
    public static int linearSearch(String s , char target){
        if(s.isEmpty()){
            return - 1;
        }

        for(int i = 0; i<s.length(); i++){
            if(target == s.charAt(i)){
                return i;
            }
        }
        return -1;
    }

}
