import java.io.IOException;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Host IP address or name : ");
        String host = in.nextLine();
        PingTime p = new PingTime(host);
        if(p.verifyHost(host)) {
            p.pingTimeList();
            p.calculateMedianTime();
        }
        else
            System.out.println("Invalid Host ip.");

    }
}
/*
OUTPUT:

Enter Host IP address or name :
google.com
Host google.com is correct
[18.6, 19.0, 19.2, 20.1, 20.2]
Median Time : 19.2

Enter Host IP address or name :
172.217.163.78
Host 172.217.163.78 is valid
[18.5, 19.1, 20.5, 22.3, 23.0]
Median Time : 20.5

 */