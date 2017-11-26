package State.A3;

public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample ok");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 设置时间
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
