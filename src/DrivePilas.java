/**
 * Created by juam_ on 08/11/2017.
 */
public class DrivePilas {

    public static void main(String[] args) {

        Pilas p = new Pilas();

        p.push(2);
        p.push(8);
        p.push(1);

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
