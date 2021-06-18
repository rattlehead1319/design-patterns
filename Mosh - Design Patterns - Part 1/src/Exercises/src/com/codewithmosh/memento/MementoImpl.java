package Exercises.src.com.codewithmosh.memento;

public class MementoImpl {

    public static void main (String[] args) throws Exception {
        Document d1 = new Document();
        d1.setContent("FirstContent");
        d1.setFontName("FirstFont");
        d1.setFontSize(1);

        CareTaker ct = new CareTaker();
        ct.push(d1.createState());

        d1.setContent("SecondContent");
        ct.push(d1.createState());

        d1.setFontName("ThirdFont");
        ct.push(d1.createState());

        d1.setFontSize(4);
        //ct.push(d1.createState());

        System.out.println(d1.toString());
        d1.restoreState(ct.pop());

        System.out.println(d1.toString());
        d1.restoreState(ct.pop());

        System.out.println(d1.toString());
        d1.restoreState(ct.pop());

        System.out.println(d1.toString());
    }
}
