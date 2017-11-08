/**
 * Created by juam_ on 08/11/2017.
 */
public class DrivePilas {

    public static void main(String[] args) {

        Pilas p = new Pilas();

        p.push(100);
        p.push(50);
        p.push(20);

        p.peek();
        p.cima();
        p.pop();
        p.peek();
        p.pop();
        p.cima();
        p.pop();
        p.peek();


    }

}
