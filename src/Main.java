public class Main {
    public static void main(String[] args) {
        System.out.println(isIp("192.168.1.0"));
        System.out.println(isIp("192.168.1.0.6"));
        System.out.println(isIp("10.340.2.3"));
        System.out.println(isIp("a.1.2.3"));
    }

    public static boolean isIp(String ip) {
        String[] ipSplit = ip.split("\\.");
        if(ipSplit.length != 4) return false;

        boolean ret = true;
        for(String oct : ipSplit) {
            int n;
            try {
                n = Integer.parseInt(oct);
                if(n < 0 || n > 255) ret = false;
            }
            catch(Exception e) {
                ret = false;
            }
        }
        return ret;
    }
}