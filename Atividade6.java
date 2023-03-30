package Atividades;

import javax.swing.JOptionPane;

public class Atividade6 {
    public static void main(String[] args) {
    String[] regiao = {"SP", "RJ", "MG", "OUTRO"};
        
        int x = JOptionPane.showOptionDialog(null, "SELECIONE SUA REGIÃO",
                "Selecione sua região",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, regiao, regiao[0]);
    if (x == 0){
        JOptionPane.showMessageDialog(null, "Voce é paulista MEU");
    }if (x == 1){
        JOptionPane.showMessageDialog(null, "Voce é carioca meu CRIA");
    }if (x == 2){
        JOptionPane.showMessageDialog(null, "Voce é mineiro UAI");
    }if (x == 3){
        JOptionPane.showMessageDialog(null, "Voce é de outra regiao");
    }
    }
}
