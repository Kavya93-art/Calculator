public class PingPong {
    static boolean isPing = true;

    public static void main(String[] args) {
        PingPong p = new PingPong();

        Thread printPing = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    p.printPing();
                }
            }
        });

        Thread printPong = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    p.printPong();
                }
            }
        });

        printPing.start();
        printPong.start();
    }

    synchronized void printPing() {
        if (isPing) {
            System.out.println("Ping");
            isPing = false;
            notify();
        } else {
            try {
                wait();
            } catch (Exception e) {}
        }
    }

    synchronized void printPong() {
        if (!isPing) {
            System.out.println("Pong");
            isPing = true;
            notify();
        } else {
            try {
                wait();
            } catch (Exception e) {}
        }
    }
}
