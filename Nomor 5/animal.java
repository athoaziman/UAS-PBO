// superclass
class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Berjalan dengan " + legs + " kaki.");
    }

    public void eat() {
        System.out.println("Memakan..");
    }
}

// interface
interface Pet {
    String getName();
    void setName(String name);
    void play();
}

// subclass
class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Memakan serangga.");
    }
}

// Subclass that extends Animal and implements Pet
class Cat extends Animal implements Pet {
    public String name;

    public Cat() {
        super(4);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Bermain dengan mainan kkucing.");
    }

    @Override
    public void eat() {
        System.out.println("Memakan makanan kucing.");
    }
}

// Subclass that extends Animal and implements Pet
class Fish extends Animal implements Pet {
    public String name;

    public Fish() {
        super(0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Berenang di akuarium.");
    }

    @Override
    public void eat() {
        System.out.println("Memakan pelet ikan");
    }
}
