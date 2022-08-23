import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("a");
        list.add(2);
        list.add(3);
        list.add("c");

        List<Object> filteredList = list.stream().filter(x -> !x.getClass().getName().equals("java.lang.String")).collect(Collectors.toList());
        filteredList.forEach(System.out::println);

        List<Object> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add("g");

        List<Object> squared = list2.stream().map(x -> {
            if(x.getClass().getName().equals("java.lang.Integer")){
                return (int)x *(int)x;
            }else{
                return x + " can't be squared";
            }
        }).collect(Collectors.toList());
        System.out.println(squared);

        List<OffsetTime> usTimeZones = new ArrayList<>();

        usTimeZones.add(0, OffsetTime.now(ZoneId.of("GMT-10")));
        usTimeZones.add(1, OffsetTime.now(ZoneId.of("GMT-8")));
        usTimeZones.add(2, OffsetTime.now(ZoneId.of("GMT-7")));
        usTimeZones.add(3, OffsetTime.now(ZoneId.of("GMT-7")));
        usTimeZones.add(4, OffsetTime.now(ZoneId.of("GMT-6")));
        usTimeZones.add(5, OffsetTime.now(ZoneId.of("GMT-5")));
        usTimeZones.add(6, OffsetTime.now(ZoneId.of("GMT-4")));

        usTimeZones.forEach(System.out::println);






    }
}
