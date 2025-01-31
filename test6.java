package JanStudy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022,2,3);
        Scanner sc =new Scanner(System.in);
        //请输入要查询的月份
        System.out.println("请输入要查询的月份");
        String month = sc.next()+"-01";
        LocalDate localDate = LocalDate.parse(month);
        //拿到查询月份的最后一天
        LocalDate lastDate = localDate.plusMonths(1).minusDays(1);
        System.out.println(lastDate);
        //取出从起始日期到查询月份的每一天
        List<Day> allDate=new ArrayList<>();
        while (!startDate.isAfter(lastDate)){
            Day day=new Day(startDate);
            allDate.add(day);
            startDate=startDate.plusDays(1);
        }
        for (int i = 0; i < allDate.size(); i+=3) {
            allDate.get(i).setSituation(true);
        }
        System.out.println(allDate);
    }
}
