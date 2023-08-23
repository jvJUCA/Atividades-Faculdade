
import javax.swing.JOptionPane;

public class Aluno {

    private String nome;
    private String RA;
    private String curso;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, String RA, String curso) {
        this.nome = nome;
        this.RA = RA;
        this.curso = curso;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getRA() {
        return RA;
    }

    public String getCurso() {
        return curso;
    }

    public void menu() {
        String inputValue = JOptionPane.showInputDialog("Nome");
        setNome(inputValue);

        String inputValue2 = JOptionPane.showInputDialog("RA");
        setRA(inputValue2);

        String inputValue3 = JOptionPane.showInputDialog("Curso");
        setCurso(inputValue3);
        
        JOptionPane.showMessageDialog(null, "<Strong>Suas informações:\n\nNome: " + getNome() + "\nRA: "+ getRA() + "\nCurso: "+ getCurso());

    }
}
