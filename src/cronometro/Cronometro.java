package cronometro;

public class Cronometro {

    public static void main(String[] args) throws InterruptedException {
        int s = 0, m = 0, h = 0;

        while (h < 24) {

            if (m < 60) {
                 Thread.sleep(1000);
                if (s < 59) {
                    s = s + 1;
                    System.out.println(h + ":" + m + ":" + s);
                } else {
                    if (s == 59) {
                        if (m != 59) {
                            s = 0;
                            m = m + 1;
                            System.out.println(h + ":" + m + ":" + s);
                        
                        } else {
                            if (m == 59) {

                                m = 0;
                                s = 0;
                                h = h + 1;
                                System.out.println(h + ":" + m + ":" + s);
                            }

                        }
                    }
                }

            }
        }
    }
}
