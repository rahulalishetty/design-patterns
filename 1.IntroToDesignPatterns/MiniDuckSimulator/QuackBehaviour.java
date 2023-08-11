public interface QuackBehaviour {
    public void quack();
}

class Quack implements QuackBehaviour {
    public void quack() {
        System.out.println("Quack");
    }
}

class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("<< silence >>");
    }
}

class Squeak implements QuackBehaviour {
    public void quack() {
        System.out.println("squeak");
    }
}
