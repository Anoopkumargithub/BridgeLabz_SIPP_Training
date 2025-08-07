package regex.Advance_Problem;

public class validateId {
    public static void main(String[] args) {
        String ip = "192.168.1.1";
        String ipPattern = 
            "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        if (ip.matches(ipPattern)) {
            System.out.println(ip + " is a valid IP address.");
        } else {
            System.out.println(ip + " is not a valid IP address.");
        }
    }
}
