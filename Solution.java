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
        
        System.out.println(sol.problema("abab")); //true
        System.out.println(sol.problema("abba")); //false
        System.out.println(sol.problema("gugus")); //false
        System.out.println(sol.problema("gusugs")); //false
        System.out.println(sol.problema("gusgus")); //true
        System.out.println(sol.problema("gustavogustavogustavo")); //true
        System.out.println(sol.problema("pruebapruebas")); //false
        System.out.println(sol.problema("ahhhhhhhhhhhhhhhha")); //false
        System.out.println(sol.problema("hhhhhhh")); //true
        System.out.println(sol.problema("a___a")); //false
        System.out.println(sol.problema("a_aaa_a")); //false
        System.out.println(sol.problema("holaalo")); //false
        System.out.println(sol.problema("hholahola")); //false
        System.out.println(sol.problema("12341234")); //true
        System.out.println(sol.problema("12_21_12")); //false
        System.out.println(sol.problema("prueba")); //false
        System.out.println(sol.problema("okokok")); //true
        System.out.println(sol.problema("nelnol")); //false
        System.out.println(sol.problema("simonsimon")); //true
        System.out.println(sol.problema("okasdokas")); //false
        
    }
}
