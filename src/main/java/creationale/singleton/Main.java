package creationale.singleton;

public class Main {
    public static void main(String[] args) {

        Server server1 = Server.getInstance();
        Server server2 = Server.getInstance();
        System.out.println(server1);
        System.out.println(server2);
        server1.addServer("http:/eu.com");
        System.out.println(server1);
        server2.addServer("https:/yt.be");
        System.out.println(server2);
        server2.downloadHttp();
        server2.downloadHttps();
        System.out.println(server2.downloadHttps());

    }
}
