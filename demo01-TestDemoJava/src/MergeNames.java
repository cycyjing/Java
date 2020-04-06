import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        // way 1
//        List<String> list = new ArrayList(Arrays.asList(names1));
//        list.addAll(Arrays.asList(names2));
//        List<String> noDupList = new ArrayList<>();
//        list.stream().forEach(
//                str -> {
//                    if (!noDupList.contains(str)) {
//                        noDupList.add(str);
//                    }
//                }
//        );
//        String[] str = new String[noDupList.size()];
//        noDupList.toArray(str);

        // way 2
//        Stream<String> n1 = Stream.of(names1);
//        Stream<String> n2 = Stream.of(names2);
//        Stream<String> names = Stream.concat(n1, n2);
//        String[] both = names.toArray(String[]::new);
//        List<String> noDupList = new ArrayList<>();
//        Arrays.asList(both).stream().forEach(
//                str -> {
//                    if (!noDupList.contains(str)) {
//                        noDupList.add(str);
//                    }
//                }
//        );
//        String[] str = new String[noDupList.size()];
//        noDupList.toArray(str);

        // way 3
        String[] both = new String[names1.length + names2.length];
        for (int i = 0; i < names1.length; i++) {
            both[i] = names1[i];
        }
        for (int i = 0; i < names2.length; i++) {
            both[names1.length + i] = names2[i];
        }
        List<String> noDupList = new ArrayList<>();
        Arrays.asList(both).stream().forEach(
                str -> {
                    if (!noDupList.contains(str)) {
                        noDupList.add(str);
                    }
                }
        );
        String[] str = new String[noDupList.size()];
        noDupList.toArray(str);

        return str;
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}