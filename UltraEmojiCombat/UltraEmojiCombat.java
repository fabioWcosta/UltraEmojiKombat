package UltraEmojiCombat;

public class UltraEmojiCombat{
    public static void main(String[] args){
                  //new Lutador(no, na, id, al, pe, vi, de, em)
        //Lutador l = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);

        Lutador l[] = new Lutador [5];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 58.7f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1 );
        l[3] = new Lutador("Deadcode", "Austrália", 28, 1.93f, 81.5f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
            l[0].status(); 
            l[1].ganharLuta();
            l[1].status();
    }
}