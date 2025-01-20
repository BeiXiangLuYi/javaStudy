package JanStudy;

import java.time.LocalDate;
import java.util.*;

public class test5 {
    public static void main(String[] args) {
        String userStrs="10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";
        //#分隔数据
        String[] strings = userStrs.split("#");
        //创建一个List集合
        List<User> userList=new ArrayList<>();
        for (String string : strings) {
            //:分隔数据
            String[] s = string.split(":");
            //创建对象封装数据
            User u=new User();
            u.setId(Long.parseLong(s[0]));
            u.setName(s[1]);
            u.setGender(s[2]);
            u.setBirthday(LocalDate.parse(s[3]));
            userList.add(u);
        }
        System.out.println(userList);
        //统计每个名字出现的字数并存储到Map集合中
        Map<String,Integer> names=new HashMap<>();
        for (User user : userList) {
            String name = user.getName();
            if(names.containsKey(name)){
                names.put(name,names.get(name)+1);
            }
            else{
                names.put(name,1);
            }
        }
        Set<Map.Entry<String, Integer>> entries = names.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String k=entry.getKey();
            Integer v=entry.getValue();
            System.out.println(k+":"+v+"次");
        }
    }
}
