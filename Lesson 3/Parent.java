/*
 * 
 * array PTBoard
 * int eduinterest
 * constructor handles data
 * 
 * if else statement
 * if eduinterest > 5
 * then parent is added to board
 */

 public class Parent extends Person {
    int trust;

    public Parent(String name, int trust) {
        super(name);
        this.trust = trust;
    }

    public void PTconference(Student student, Teacher teacher) {
        System.out.println("\n--- Parent-Teacher Conference ---");
        System.out.println("Teacher " + teacher.name + " is " + teacher.amiability);
        System.out.println("Student " + student.name + " has " + student.performance + " performance.");

        switch (student.performance) {
            case "good":
                System.out.println(name + ": I'm so proud of " + student.name + "! Thank you for your support.");
                break;
            case "average":
                System.out.println(name + ": Hmm, okay. We'll work on improving.");
                break;
            case "bad":
                if (trust >= 8) {
                    System.out.println(name + ": I don’t think that’s fair! My child is doing their best.");
                    System.out.println(name + ": Maybe you're not understanding them properly, " + teacher.name + ".");
                } else if (trust >= 4) {
                    System.out.println(name + ": That’s disappointing. I’ll talk to them.");
                } else {
                    System.out.println(name + ": What?! Unacceptable! They’re grounded for a month!");
                }
                break;
            default:
                System.out.println(name + ": I’m not sure how to react.");
        }
    }

    public static void main(String[] args) {
        // Create characters for the PT conference
        Parent mom = new Parent("Mrs. Kumar", 9);
        Student child = new Student("Vishal", "bad");
        Teacher teacher = new Teacher("Mr. Smith", "strict");

        // Run the PT conference
        mom.PTconference(child, teacher);

        // Show polygon shape classifications
        System.out.println("\n--- Shape Demo ---");

        Polygon poly = new Polygon(5);
        poly.display();

        Triangle tri = new Triangle();
        tri.display();

        Square square = new Square();
        square.display();

        Trapezoid trap = new Trapezoid();
        trap.display();
    }
}

// ---------- Supporting Classes ----------

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String performance;

    public Student(String name, String performance) {
        super(name);
        this.performance = performance;
    }
}

class Teacher extends Person {
    String amiability;

    public Teacher(String name, String amiability) {
        super(name);
        this.amiability = amiability;
    }
}

// ---------- Polygon Hierarchy ----------

class Polygon {
    int sides;

    public Polygon(int sides) {
        this.sides = sides;
    }

    public void display() {
        System.out.println("This is a polygon with " + sides + " sides.");
    }
}

class Triangle extends Polygon {
    public Triangle() {
        super(3);
    }

    public void display() {
        System.out.println("This is a triangle with 3 sides.");
    }
}

class Quadrilateral extends Polygon {
    public Quadrilateral() {
        super(4);
    }
}

class Rectangle extends Quadrilateral {
    public void display() {
        System.out.println("This is a rectangle with opposite sides equal and angles 90 degrees.");
    }
}

class Square extends Rectangle {
    public void display() {
        System.out.println("This is a square with all sides equal and angles 90 degrees.");
    }
}

class Parallelogram extends Quadrilateral {
    public void display() {
        System.out.println("This is a parallelogram with opposite sides equal and parallel.");
    }
}

class Rhombus extends Parallelogram {
    public void display() {
        System.out.println("This is a rhombus with all sides equal and opposite angles equal.");
    }
}

class Trapezoid extends Quadrilateral {
    public void display() {
        System.out.println("This is a trapezoid with at least one pair of parallel sides.");
    }
}

