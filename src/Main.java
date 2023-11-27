public class Main {
    public static void main(String[] args) {

    }

    public static boolean isIp(String ip) {
        boolean ret = true;

        String[] ipSplit = ip.split("\\.");
        if(ipSplit.length != 4) {
            ret = false;
        }
        else {
            for(String oct : ipSplit) {
                if(isNumber(oct)) {
                    if()
                }
            }
        }

    }

    public static boolean isNumber(String s) {
        try {
            int x = Integer.parseInt(s);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}