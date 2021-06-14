import java.util.*;

public class AIplayer {
    /*
     *
     */ 
     
    public ArrayList<String> hand = new ArrayList<>();
    
    public int ID;
    
    public ArrayList<Integer> points = new ArrayList<>();
    public Integer score = 0;
    //public static boolean[][] opponent = new boolean[4][13];

    public AIplayer(int i) {
        this.ID = i;
    }    
    /*
    public String call() {
        for(int i = 0; i < 4; i++) {
            for (int x = 0; x < 13; x++) {
                //if()
            }
        }
    } 
    */
    public static int getFish(int ID, ArrayList<String> hand) {
        
        //for(int i =0; i<4; i++) {
        //    for(int x = 0; x < 13; x++) {
        //        if(ID == i)
        //            break;
        //        if(opponent[i][x]) {
        //            opponent[i][x] = false;
        //            return (x+1)*10 + i;
        //        }
        //    }
        //}
        Random rand = new Random();
        int opp;
        do {
            opp = rand.nextInt(4);
        }while(opp == ID);
        rand.nextInt(4);
        Scanner scan = new Scanner(hand.get(0));
        return scan.nextInt()*10 + opp;
    }

}