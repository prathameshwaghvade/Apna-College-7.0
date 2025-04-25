public class Interface {
    public static void main(String[] args) {

        Queen n = new Queen();
        n.moves();

        Brook b = new Brook();
        b.moves();
         
    }
    
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{

    public void moves(){
        System.out.println("up,down,left,right,diagonal");

    }
}

class Brook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}


class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}