package JanStudy.fileStudy;

//啤酒问题
 //2元一瓶，四个盖子换一瓶，两个瓶子换一瓶，10元能喝多少瓶
public class test4 {
    public static int allNumber;
    public static int lastBottleNumber;
    public static int lastCoverNumber;

    public static void main(String[] args) {
        buy(10);
        System.out.println(allNumber);
        System.out.println(lastCoverNumber);
        System.out.println(lastBottleNumber);
    }

    public static void buy(int money) {
        int number = money / 2;
        allNumber += number;
        int bottleNumber = number + lastBottleNumber;
        int coverNumber = number + lastCoverNumber;
        int allMoney = 0;
        if (bottleNumber >= 2) {
            allMoney += (bottleNumber / 2) * 2;
        }
        lastBottleNumber = bottleNumber % 2;
        if (coverNumber >= 4) {
            allMoney += (coverNumber / 4) * 2;
        }
        lastCoverNumber = coverNumber % 4;
        if (allMoney >= 2) {
            buy(allMoney);
        }
    }
}