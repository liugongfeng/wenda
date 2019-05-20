import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {


    public static void demoString() {
        String str = "hello world";
        System.out.println(str.indexOf('e'));
        System.out.println(str.compareToIgnoreCase("hello wOrld"));
        System.out.println(str.compareTo("hello uorld"));

        StringBuilder sb = new StringBuilder();
        sb.append("x ");
        sb.append(1.2);
        sb.append("a");
        sb.append(true);
        System.out.println(sb.toString());

    }

    public static void demoList() {
        List<String> strList = new ArrayList<>(10);
        for (int i = 0; i < 4; i++) {
            strList.add(String.valueOf(i));
        }

        System.out.println(strList);

        List<String> strList2 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            strList2.add(String.valueOf(i));
        }

        strList.addAll(strList2);
        System.out.println(strList);

        strList.remove(0);
        System.out.println(strList);

        Collections.reverse(strList);
        System.out.println(strList);

        Collections.sort(strList);
        System.out.println(strList);

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(strList);

    }

    public static void demoMapTable() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i), String.valueOf(i * i));

        }

//        System.out.println(map);
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.get("3"));
        System.out.println(map.containsKey("9"));

    }

    public static void demoSet() {
        Set<String> strSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            strSet.add(String.valueOf(i));
        }
        System.out.println(strSet);

        strSet.remove(String.valueOf(1));
        System.out.println(strSet);

        System.out.println(strSet.contains(String.valueOf(1)));

        System.out.println(strSet.isEmpty());
        System.out.println(strSet.size());

    }

    public static void demoOO() {
        Animal a = new Animal("Jim", 29);
        a.say();
        Animal human = new Human("Lei", 11, "China");
        human.say();
    }

    public static void demoFunction() {
        Random random = new Random();
        random.setSeed(1);
        System.out.println(random.nextInt(100));
        System.out.println(random.nextFloat());

        List<Integer> arr = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        Collections.shuffle(arr);
        System.out.println(arr);

        Date date = new Date();
        System.out.println(date);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(date));


    }


    public static void main(String[] args) {
        demoFunction();
//        demoString();
//        demoList();
//        demoMapTable();
//        demoSet();
//        demoOO();
    }


}
