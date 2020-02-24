import java.io.*;
import java.util.*;

public class PingTime {
    String ip;
    String pingStatement = " ";
    int packetLimit = 5;
    ArrayList<Double> list;

    public PingTime(String hostIP) throws IOException {
        this.ip = hostIP;
    }

    public boolean verifyHost(String ip) throws IOException {
        Process process = Runtime.getRuntime().exec("ping -c 1 -w 5 " + ip);
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String a = inputStream.readLine();
        String b = inputStream.readLine();
        if (a == null || b == null|| a.contains("service not known"))
            return false;

       else if (b.substring(0, 2).equals("64"))
            return true;
     else
         return  false;

        }

//64 bytes from maa03s28-in-f4.1e100.net (172.217.31.196): icmp_seq=4 ttl=55 time=28.4 ms


    public void pingTimeList() throws IOException {

        System.out.println("Host " + ip + " is valid");
        list = new ArrayList<Double>();
        Process process = Runtime.getRuntime().exec("ping -c 5 " + ip);
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));
        pingStatement = inputStream.readLine();
        for (int i = 1; i <= packetLimit; i++) {
            pingStatement = inputStream.readLine();
            // System.out.println(i + " " + pingStatement);
            int indexOfTime = pingStatement.indexOf("time");
            int indexOfMs = pingStatement.indexOf("ms");
            String time = pingStatement.substring(indexOfTime + 5, indexOfMs);
            //System.out.println(time);
            list.add(Double.parseDouble(time));
        }

    }

    public void calculateMedianTime() {

        Collections.sort(list);   //Sorting the list in ascending order.
        System.out.println(list);
        System.out.println("Median Time : "+ list.get(2));       // Median element is the middle element in the list.

    }
}