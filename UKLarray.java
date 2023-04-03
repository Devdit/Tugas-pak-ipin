import javax.swing.JOptionPane;

public class UKLarray{
    public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("Masukkan nama atau NISN atau Kelas anda:");
    String nama[][] = {
    {"Adit", "123456", "XRPL4"}, 
    {"Bima", "654321", "XRPL2"},
    {"Ilham", "098765", "XRPL7"},
    {"Jose", "013576", "XRPL5"},
    {"Najwan", "275741", "XRPL2"},
    {"Naufal", "980632", "XRPL5"} };
    int terdaftar = 0;
    for(int j = 0; j < 3; j++){
        for(int i = 0; i< 6; i++){
            if(input.equalsIgnoreCase(nama[i][j])){
                JOptionPane.showMessageDialog(null,"\nNama: "+ nama[i][0]+"\nKelas: "+nama[i][2]+"\nNISN: " +nama[i][1]);
                terdaftar = 1;
            }
        }
    
    }
        if(terdaftar == 0){
            JOptionPane.showMessageDialog(null,"Data tidak terdaftar");
    }

}
}
// Testing update github