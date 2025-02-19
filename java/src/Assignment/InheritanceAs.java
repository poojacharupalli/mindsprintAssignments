package Assignment;

class Product {
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Product ID: " + id + ", Name: " + name);
    }
}
class A extends Product {
    int count;
    String category;

    public A(int id, String name, int count, String category) {
        super(id, name);
        this.count = count;
        this.category = category;
    }

    public void displayAll() {
        super.display();
        System.out.println("Count: " + count + ", Category: " + category);
    }
}

class SubA extends A {
    int price;

    public SubA(int id, String name, int count, String category, int price) {
        super(id, name, count, category);
        this.price = price;
    }

    public void calculateAndDisplay() {
        int totalPrice = count * price;
        System.out.println("Total Price: " + totalPrice);
        super.display();
        System.out.println("Category: " + category); 
    }
}

class B extends Product {
    int count;
    String category;

    public B(int id, String name, int count, String category) {
        super(id, name);
        this.count = count;
        this.category = category;
    }

    public void displayAll() {
        super.display();
        System.out.println("Count: " + count + ", Category: " + category);
    }
}

class SubB extends B {
    int price;

    public SubB(int id, String name, int count, String category, int price) {
        super(id, name, count, category);
        this.price = price;
    }

    public void calculateAndDisplay() {
        int totalPrice = count * price;
        System.out.println("Total Price: " + totalPrice);
        super.display(); 
        System.out.println("Category: " + category); 
    }
}

class C extends Product {
    int count;
    String category;

    public C(int id, String name, int count, String category) {
        super(id, name);
        this.count = count;
        this.category = category;
    }

    public void displayAll() {
        super.display();
        System.out.println("Count: " + count + ", Category: " + category);
    }
}

public class InheritanceAs {
    public static void main(String[] args) {
        SubA subA = new SubA(78, "Amul", 50, "butter", 30);
        System.out.println("SubA Details:");
        subA.calculateAndDisplay();

        SubB subB = new SubB(78, "Amul", 90, "Milk", 10);
        System.out.println("\nSubB Details:");
        subB.calculateAndDisplay();

        C c = new C(78, "Amul", 56, "choco");
        System.out.println("\nC Details:");
        c.displayAll();
    }
}

