package CardApp1;

public class Game {
    Player p;
    Card c;

    Game(){
        p = new Player();
        c = new Card();
    }

    void start(){
        p.turn(c);
        System.out.println(c.result1 + "の" + c.result2);
    }

    void judge(){
        if(c.num >= 10){
            System.out.println("勝ち");
        }
        else{
            System.out.println("負け");
        }
    }
}
