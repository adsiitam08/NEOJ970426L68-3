/**
 *
 * @author jpnegrete
 */
public class Solution {
    public boolean problema(String s){
        String subs;
        String concat;
        for(int i = 1; i<s.length(); i++){
            subs = s.substring(0, i);
            concat = subs;
            while(concat.length()<=s.length()){
                System.out.println(subs);
                if(concat.equals(s))
                    return true;
                concat = concat + subs;
            }
        }
        return false;
    }
    
    public boolean gus(String str){
        String s = str + str;
        return s.substring(1, s.length() - 1).contains(str);
    }
    
    public static void main(String[] args){
        Solution sol = new Solution();
        
        System.out.println(sol.gus("abab"));
        System.out.println(sol.gus("abba"));
        System.out.println(sol.gus("gugus"));
        System.out.println(sol.gus("gusugs"));
        System.out.println(sol.gus("gusgus"));
        System.out.println(sol.gus("gustavogustavogustavo"));
        System.out.println(sol.gus("pruebapruebas"));
        System.out.println(sol.gus("ahhhhhhhhhhhhhhhha"));
        System.out.println(sol.gus("hhhhhhh"));
        System.out.println(sol.gus("a___a"));
        System.out.println(sol.gus("a_aaa_a"));
        System.out.println(sol.gus("holaalo"));
        System.out.println(sol.gus("hholahola"));
        System.out.println(sol.gus("12341234"));
        System.out.println(sol.gus("12_21_12"));
        System.out.println(sol.gus("prueba"));
        System.out.println(sol.gus("okokok"));
        System.out.println(sol.gus("nelnol"));
        System.out.println(sol.gus("simonsimon"));
        System.out.println(sol.gus("okasdokas"));
        
    }
}
