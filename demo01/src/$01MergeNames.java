import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $01MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        // way 1
        List<String> list = new ArrayList(Arrays.asList(names1));
        list.addAll(Arrays.asList(names2));
        List<String> noDupList = new ArrayList<>();
        list.stream().forEach(
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
        System.out.println(String.join(", ", $01MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}