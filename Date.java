import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime modifiedTime = currentTime.plusHours(4);

        System.out.println("Current time: " + currentTime.format(formatter));
        System.out.println("Modified time: " + modifiedTime.format(formatter));
    }
}
