import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        heat = inp.nextInt();

        if(heat>=5 && heat<=25){
            if(heat>=5 && heat<=15){
            }
            System.out.println("Sinemaya ve Pikniğe Gidebilirsiniz");
        }else if(heat<5){
            System.out.println("Kayak yapabilirsin");
        }else{
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
