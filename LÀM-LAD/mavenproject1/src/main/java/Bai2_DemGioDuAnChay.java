
public class Bai2_DemGioDuAnChay implements Runnable {

    @Override
    public void run() {
        int a = 0;
        while (true) {
            try {
                a++;
 //               System.out.println(a);
                System.out.println(setInterval(a));
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                break;
            }
        }
        System.out.println(setInterval(a));
    }

    private String setInterval(int number) {
        //khai báo 3 biến hour, minute, second đại diện cho giờ phút giây
        int hour, minute, second;
        //1h = 3600s -> hour = n / 3600
        hour = number / 3600;
        //1p = 60s, vì ở trên ta đã chia 3600 để lấy giờ
        //vậy nên ta cần lấy phần dư của nó chia cho 60
        minute = number % 3600  / 60;
        //phần dư còn lại chính là số giây
        second = number % 3600 % 60;
        return hour + ":" + minute + ":" + second;
    }

    public static void main(String[] args) {
        new Bai2_DemGioDuAnChay().run();
    }
}
