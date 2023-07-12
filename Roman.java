import java.util.HashMap;
import java.util.Map;

class Roman {

    public void romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum=0;

        for(int i=0;i<=s.length()-1;i++){           //go through all chars
            if(i<s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){   //only go through all except last char
                sum -=map.get(s.charAt(i));
            }else{
                sum +=map.get(s.charAt(i));
            }
        }
        System.out.println(sum);
        
}



}