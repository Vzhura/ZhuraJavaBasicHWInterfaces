public class Interfaces {
    // Інтерфейс Smartphones
    interface Smartphones {
        void call();

        void sms();

        void internet();
    }
    //Інтерфейс LinuxOS
    interface LinuxOS {
        void runLinuxApps();
    }
    //Інтерфейс iOS
    interface iOS {
        void runiOSApps();
    }
    // Клас Androids, який імплементує Smartphones і LinuxOS
   static class Androids implements Smartphones, LinuxOS {
        @Override
        public void call() {
            System.out.println("Calling from Android");
        }

        @Override
        public void sms() {
            System.out.println("Sending SMS from Android");
        }

        @Override
        public void internet() {
            System.out.println("Browsing the internet on Android");
        }
        @Override
        public void runLinuxApps() {
            System.out.println("Running Linux apps on Android");
        }
    }
    // Клас iPhones, який імплементує Smartphones і iOS
    static class iPhones implements Smartphones, iOS {
        @Override
        public void call() {
            System.out.println("Calling from iPhone");
        }
        @Override
        public void sms() {
            System.out.println("Sending SMS from iPhone");
        }
        @Override
        public void internet() {
            System.out.println("Browsing the internet on iPhone");
        }
        @Override
        public void runiOSApps() {
            System.out.println("Running iOS apps on iPhone");
        }
    }
}

