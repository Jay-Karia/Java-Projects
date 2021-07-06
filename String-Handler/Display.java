package main.userInterfaces;


import java.util.concurrent.CountDownLatch;

public interface Display {
    static void dis() throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(1);

        Runnable displayed = new Runnable() {
            @Override
            public void run() {



                System.out.println("""
                                        
                    --------------------------------------------------
                    --------------------------------------------------
                    String Handler (v1.0)
                    --------------------------------------------------
                    --------------------------------------------------


                    Available Operations on your String
                    
                    1) Delete a character
                    2) Find a character
                    3) Find a Index of a character
                  
                    """);
                latch.countDown();
            }
        };

        Thread dis = new Thread(displayed);

        dis.start();
        latch.await();

        CountDownLatch selectLatch = new CountDownLatch(1);

    }
}
