public class TorresdeHanoi {
    public static void main(String[] args){
        TorresdeHanoi x = new TorresdeHanoi();
        x.torreshanoi(4,1, 2, 3);
        System.out.println("juego terminado");
    }
    public void torreshanoi(int discos,int torre1, int torre2, int torre3){
if (discos==1) {
    System.out.println("mover disco de torre " + torre1 + " a torre " + torre3);
}else {
    torreshanoi(discos-1, torre1,torre3,torre2);
    System.out.println("mover disco de torre " + torre1 + " a torre " + torre3);
    torreshanoi(discos-1, torre2,torre1,torre3);
}
    }
}
