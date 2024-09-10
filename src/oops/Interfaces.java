package oops;

interface Whatsappcalls {
    int a = 10;
    void calls();
    void mute();
    void disconnect();
}

class Audiocalls implements Whatsappcalls {
    public void calls() {
        System.out.println("whatsapp audio call");
    }

    public void mute() {
        System.out.println("whatsapp call muted");
    }

    public void disconnect() {
        System.out.println("whatsapp call disconnected");
    }
}

class Videocalls implements Whatsappcalls {
    public void calls() {
        System.out.println("videocalls");
    }

    public void mute() {
        System.out.println("videocalls muted");
    }

    public void disconnect() {
        System.out.println("videocalls disconnected");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Audiocalls a = new Audiocalls();
        a.calls();
        a.disconnect();
        a.mute();

        Videocalls b = new Videocalls();
        b.calls();
        b.disconnect();
        b.mute();

        Whatsappcalls ob = new Audiocalls();
        ob.calls();
        ob.mute();
        ob.disconnect();

        System.out.println(Whatsappcalls.a);
        //System.out.println(Whatsappcalls.a = 20); // This line would cause a compilation error because 'a' is final.
    }
}