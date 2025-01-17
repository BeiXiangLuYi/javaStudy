package JanStudy;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class test1 {
    public static void main(String[] args) throws ParseException {
        String start ="2023年11月11日 0:0:0";
        String end ="2023年11月11日 0:10:0";
        String xj = "2023年11月11日 0:01:18";
        String xp = "2023年11月11日 0:10:51";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        if (sdf.parse(xj).getTime()>sdf.parse(start).getTime()&&sdf.parse(xj).getTime()<sdf.parse(end).getTime()){
            System.out.println("小贾抢到了");
        }
        if (sdf.parse(xp).getTime()>sdf.parse(start).getTime()&&sdf.parse(xp).getTime()<sdf.parse(end).getTime()){
            System.out.println("小皮抢到了");
        }
    }
}
