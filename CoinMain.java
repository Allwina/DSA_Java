public class CoinMain{
    public static void main(String args[]){
        Coin c=new Coin(Coin.HEADS);
        System.out.println("Initial: "+c.getFaceUp());
        for(int i=0;i<10;i++){
            c.flip();
            System.out.println("After Flip "+c.getFaceUp());
        }
    }
}