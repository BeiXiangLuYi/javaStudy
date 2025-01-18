package JanStudy;

import java.util.*;

public class Room {
    private List<Card> Cards = new ArrayList<>();

    public Room() {
        int size = 0;
        String[] names = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"红桃", "方片", "梅花", "黑桃"};
        for (String name : names) {
            size++;
            for (String color : colors) {
                Card card = new Card(name, color, size);
                Cards.add(card);
            }
        }
        Cards.add(new Card("小王", "&", ++size));
        Cards.add(new Card("大王", "$", ++size));
        System.out.println("牌库初始化完毕");
        System.out.println(Cards);
    }

    public void start() {
        System.out.println("游戏开始");
        System.out.println("洗牌");
        Collections.shuffle(Cards);
        System.out.println(Cards);
        ArrayList<Card> farmer1 = new ArrayList<>();
        ArrayList<Card> farmer2 = new ArrayList<>();
        ArrayList<Card> landlord = new ArrayList<>();
        System.out.println("发牌");
        System.out.println(Cards.size());
        for (int i = 0; i < Cards.size(); i++) {
            if (i < 51 && i % 3 == 0) {
                farmer1.add(Cards.get(i));
            }
            if (i < 51 && i % 3 == 1) {
                farmer2.add(Cards.get(i));
            }
            if (i < 51 && i % 3 == 2) {
                landlord.add(Cards.get(i));
            }
            if (i > 50) {
                landlord.add(Cards.get(i));
                System.out.println("地主牌" + Cards.get(i));
            }
        }
        System.out.println("排序");
        farmer1.sort(Comparator.comparing(Card::getSize));
        farmer2.sort(Comparator.comparing(Card::getSize));
        landlord.sort(Comparator.comparing(Card::getSize));
        System.out.println("农民1" + farmer1);
        System.out.println("农民2" + farmer2);
        System.out.println("地主" + landlord);
    }
}