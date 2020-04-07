public class Question2 {

    static String formatTime(int millis) {
        Integer ss = 1000;
        Integer mi = ss * 60;

        int minute = Math.round(millis / mi);
        int second = Math.round((millis - minute * mi) / ss);


        StringBuffer sb = new StringBuffer();

        if (minute > 0) {
            sb.append(minute);
        }
        if (minute == 0) {
            sb.append(0);
        }
        if (second > 0) {
            if (second < 10) {
                sb.append(":" + second + "0");
            } else {
                sb.append(":" + second);

            }
        }
        if (
                second == 0
        ) {
            sb.append(":00");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }


    // Examples
    public static void main(String[] args) {
        System.out.println("test1: " + ("0:00".equals(formatTime(0)) ? "pass" : "fail"));
        System.out.println("test2: " + ("0:00".equals(formatTime(999)) ? "pass" : "fail"));
        System.out.println("test3: " + ("0:01".equals(formatTime(1000)) ? "pass" : "fail"));
        System.out.println("test4: " + ("1:00".equals(formatTime(60000)) ? "pass" : "fail"));
        System.out.println("test5: " + ("22:10".equals(formatTime(1330001)) ? "pass" : "fail"));
        System.out.println("test6: " + ("61:00".equals(formatTime(3660000)) ? "pass" : "fail"));
        System.out.println("test7: " + ("2880:00".equals(formatTime(172800000)) ? "pass" : "fail"));
    }

}
