import java.util.HashMap;
import java.util.Map;
//Данные хранятся 10 секунд
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> timerMap = new Timer(new HashMap<Integer, String>());

        timerMap.put(1,"First record");
        timerMap.put(2,"Second record");
        for (int i = 0; i < 12; i++){
            System.out.println(timerMap.get(1));
            System.out.println(timerMap.get(2));
            System.out.println();
            ((Timer) timerMap).timeTick();
        }

        System.out.println(timerMap.get(1));
        System.out.println(timerMap.get(2));
    }
}