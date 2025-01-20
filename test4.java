package JanStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        //定义一个ArrayList集合
        List<Integer> persons = new ArrayList<>();
        Random r = new Random();
        int count = 0;
        //定义另一个ArrayList集合
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            //生成100个随机编号（不重复）
            Integer number = r.nextInt(1, 201);
            //判断重复
            if (persons.contains(number)) {
                i--;
            } else {
                persons.add(number);
                temp.add(number);
            }
        }
        System.out.println(persons);
        System.out.println(persons.size());
        //依次删去奇数位置的人
        while (persons.size() > 1) {
            for (int i = persons.size() - 1; i >= 0; i--) {
                //判断是否在奇数位
                if ((i + 1) % 2 != 0) {
                    persons.remove(i);
                }
            }
            System.out.println(persons);
            System.out.println(persons.size());
            System.out.println("第" + (count+1) + "次删减");
            count++;
        }
        //查找幸存者在最开始的位置
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).equals(persons.getFirst())) {
                System.out.println("幸存者的初始位置为：" + (i + 1));
            }
        }
    }
}
