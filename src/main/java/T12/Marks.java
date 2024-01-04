package T12;

public abstract class Marks {
    abstract float getPercentage();

}


class A extends Marks{
    int mathMark;
    int languageMark;
    int biologyMark;
    int chemMark;

    public A(int mathMark, int languageMark, int biologyMark, int chemMark) {
        this.mathMark = mathMark;
        this.languageMark = languageMark;
        this.biologyMark = biologyMark;
        this.chemMark = chemMark;
    }

    @Override
    float getPercentage() {
        return ((float) (mathMark + languageMark + biologyMark + chemMark) / 400)  * 100;
    }
}

class B extends Marks{
    int mathMark;
    int languageMark;
    int biologyMark;

    public B(int mathMark, int languageMark, int biologyMark) {
        this.mathMark = mathMark;
        this.languageMark = languageMark;
        this.biologyMark = biologyMark;
    }

    @Override
    float getPercentage() {
        return ((float) (mathMark + languageMark + biologyMark) / 300)  * 100;
    }
}

class TestMarks{

    public static void main(String[] args) {
        Marks[] marks = {new A(50,70,100,30), new B(30,60,80)};
        for (Marks m: marks) {
            System.out.println("Average percentage of marks: " + m.getPercentage());
        }
    }

}

