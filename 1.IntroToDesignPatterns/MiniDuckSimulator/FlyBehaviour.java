public interface FlyBehaviour {
    public void fly();
}

class FlyWithWings implements FlyBehaviour {
    public void fly() {
        System.out.println("I'm flying");
    }
}

class FlyNoWay implements FlyBehaviour {
    public void fly() {
        System.out.println("I can't fly");
    }
}

class FlyRocketPowered implements FlyBehaviour {
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
