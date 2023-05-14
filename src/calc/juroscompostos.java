package calc;

import javax.swing.*;

public class juroscompostos {
    public double capital;
    public double montante;
    public double juros;
    public double taxa;
    public double tempo;

    public void saberCapM(){
        this.montante = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do montante:"));
        this.taxa = Double.parseDouble(JOptionPane.showInputDialog("Insira da taxa de juros"));
        this.tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de aplicação"));
        double resp = montante/Math.pow((1+taxa),tempo);
        JOptionPane.showMessageDialog(null,"R$"+resp);
    }
    public void saberCapJ(){
        this.juros = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do juros:"));
        this.taxa = Double.parseDouble(JOptionPane.showInputDialog("Insira da taxa de juros"));
        this.tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de aplicação"));
        double resp = juros/(Math.pow((1+taxa),tempo)-1);
        JOptionPane.showMessageDialog(null,"R$"+resp);
    }
    public void saberMont(){
        this.capital = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do capital:"));
        this.taxa = Double.parseDouble(JOptionPane.showInputDialog("Insira da taxa de juros"));
        this.tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de aplicação"));
        double resp = capital*Math.pow(1+taxa,tempo);
        JOptionPane.showMessageDialog(null,"R$"+resp);
    }
    public void saberJur(){
            this.capital = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do capital:"));
            this.taxa = Double.parseDouble(JOptionPane.showInputDialog("Insira a taxa de juros"));
            this.tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de aplicação"));
            double resp = capital*(Math.pow((1+taxa),tempo)-1);
            JOptionPane.showMessageDialog(null,"R$"+resp);
        }

    public void saberTaxM(){
        this.montante = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do montante:"));
        this.capital= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do capital:"));
        this.tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de aplicação"));
        double resp = Math.pow(montante/capital,1/tempo)-1;
        JOptionPane.showMessageDialog(null,resp+"%");
    }
    public void saberTaxaJ(){
        this.juros = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do montante:"));
        this.capital = Double.parseDouble(JOptionPane.showInputDialog("Insira a taxa de juros"));
        this.tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de aplicação"));
        double resp = Math.pow((juros/capital)+1,(1/tempo))-1;
        JOptionPane.showMessageDialog(null,resp+"%");
    }
}
