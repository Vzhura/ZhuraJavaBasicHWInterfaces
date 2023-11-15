public class Main {
    public static void main(String[] args) {
        // Створення екземпляра Android
        Interfaces.Androids androidPhone = new Interfaces.Androids();
        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.runLinuxApps();

        System.out.println();

        // Створення екземпляра iPhone
        Interfaces.iPhones iPhone = new Interfaces.iPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.runiOSApps();
    }
}
