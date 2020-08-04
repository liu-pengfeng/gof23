package src.main.java.pattern_structure.proxy_dynamic;

public class Client {

    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }

}