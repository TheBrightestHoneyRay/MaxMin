public class Task4 {
    public static void main(String[] args){
        Time time = new Time();
        System.out.println(time.toUniversal());
        System.out.println(time.toStandard());
        Time time2 = new Time(23, 25, 36);
        System.out.println(time2.toUniversal());
        System.out.println(time2.toStandard());
    }
}
