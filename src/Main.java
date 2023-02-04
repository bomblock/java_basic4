public class Main {
    public static void main(String[] args) {

        System.out.println("1");
    //todo 아래 Runnable은 인터페이스며 run 이라는 추상메서드를 구성하고 있다.
        //todo 추상메서드 하나만 가지고 있는 식을 간단하게 문자로 변경가능하다. 이것을 람다식이라고 한다.
        new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 5; i++){
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }).start();
        System.out.println("2");
    }
}