public class Main {
    public static void main(String[] args) {
        TVset tv = new TVset();
        TVset.Remote remote = tv.new Remote();
        //TVset.Remote remote2 = new TVset().new Remote();
        remote.setTVset(tv);
        System.out.println(tv);
        remote.turnOn();
        System.out.println(tv);
        remote.setChannel(4);
        System.out.println(tv);
        remote.setChannel(2);
        System.out.println(tv);
        remote.turnOff();
        System.out.println(tv);
    }
}