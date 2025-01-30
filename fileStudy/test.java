package JanStudy.fileStudy;
//递归求1-n的和
public class test {
    public static void main(String[] args) {
        int n=5;
        System.out.println("1-5的和为"+sum(n));
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        else {
            return n+sum(n-1);
        }
    }
}
