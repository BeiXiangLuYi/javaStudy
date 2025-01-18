package JanStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
//统计80名学生对景区的投票情况
public class test3 {
    public static void main(String[] args) {
        ArrayList<String> students=new ArrayList<>();
        String[] selects={"A","B","C","D"};
        Random r=new Random();
        for(int i=0;i<80;i++){
            students.add(selects[r.nextInt(4)]);
        }
        System.out.println(students);
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:students){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        for(String key:map.keySet()){
            System.out.println(key+"-->"+map.get(key));
        }
    }
}
