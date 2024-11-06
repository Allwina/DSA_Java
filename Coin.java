import java.util.Random;
public class Coin{
    public final static int HEADS =  0;
    public final static int TAILS =  1;
    private int faceUp;
    public Coin(int start){
        faceUp=start;
    }
    public void flip(){
        Random rand =new Random();
        faceUp=rand.nextInt(2);
    }
    public String getFaceUp(){
        if(faceUp == HEADS){
            return "HEADS";
        } else if(faceUp == TAILS){
            return "TAILS";
        }
        else{
            return "INVALID";
        }
    }
    public static void main(String args[]){
        Coin c=new Coin(Coin.HEADS);
        System.out.println("Initial: "+c.getFaceUp());
        for(int i=0;i<10;i++){
            c.flip();
            System.out.println("After Flip "+c.getFaceUp());
        }
    }
    
}
