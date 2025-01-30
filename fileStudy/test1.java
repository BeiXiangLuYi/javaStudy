package JanStudy.fileStudy;
//猴子吃桃
public class test1 {
    public static void main(String[] args) {
        int n=1;
        System.out.println("第一天的桃子数为:"+f(n));
    }
    public static int f(int n){
        if(n==10){
            return 1;
        }else{
            return 2*(f(n+1)+1);
        }
    }
}
//f(n)=f(n+1)*2+1;