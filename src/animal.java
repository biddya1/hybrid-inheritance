
class animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

interface CanFly {
    void fly();
}

interface CanSwim {
    void swim();
}


class Duck extends animal implements CanFly, CanSwim {
    public void fly() {
        System.out.println("Duck can fly.");
    }

    public void swim() {
        System.out.println("Duck can swim.");
    }

    void sound() {
        System.out.println("Duck makes quack sound.");
    }
}

