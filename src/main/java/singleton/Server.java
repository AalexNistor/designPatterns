package singleton;

import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<String> serverList = new ArrayList<>();
    private static Server instance;

    private Server() {}
    public static Server getInstance() {
        if(instance == null) {
            instance = new Server();
        }
        return instance;
    }


    public boolean addServer(String server) {
        if((server.startsWith("http") || server.startsWith("https")) && !serverList.contains(server)) {
            serverList.add(server);
            System.out.println("The server: " + server + " has been added successfully");
            return true;
        }
        System.out.println("The server was not added");
        return false;
    }

    public void downloadHttp() {
        System.out.println("Metoda de descarcare: http");
//        for (int i = 0; i < serverList.size(); i++) {
//            if (serverList.get(i).startsWith("http") && !serverList.get(i).startsWith("https")) {
//                System.out.println(serverList.get(i));
//            }
//        }
        for (String link : serverList) {
            if (link.startsWith("http:")) {
                System.out.println(link);
            }
        }
    }

    public List<String> downloadHttps() {
        return serverList.stream().filter(link -> link.startsWith("https")).toList();
    }

    @Override
    public String toString() {
        return "Server{" +
                "serverList=" + serverList +
                '}';
    }


    //    public Server(List<String> serverList) {
//        this.serverList = serverList;
//    }





}
