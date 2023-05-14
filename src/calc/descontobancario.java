package calc;

import javax.swing.*;

public class descontobancario {
    public double descontoBancario;
    public double valorNominal;
    public double taxaDesconto;
    public double periodoVencimento;
    public double valorLiquido = valorNominal-descontoBancario;


    public void saberVencimento(){
        this.descontoBancario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Desconto Bancário:"));
        this.valorNominal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Nominal:"));
        this.taxaDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da taxa de desconto"));
        double resp = descontoBancario/(valorNominal*taxaDesconto);
        JOptionPane.showMessageDialog(null,"Período antes do vencimento:"+resp);

    }
    public void saberTaxa(){
        this.descontoBancario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Desconto Bancário:"));
        this.valorNominal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Nominal:"));
        this.periodoVencimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o periodo de vencimento"));
        double resp = descontoBancario/(valorNominal*periodoVencimento);
        JOptionPane.showMessageDialog(null,"Taxa de Desconto:"+resp+"%");

    }
    public void saberValorNominal(){
        this.valorLiquido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Líquido:"));
        this.taxaDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da taxa de desconto:"));
        this.periodoVencimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o periodo de vencimento"));
        double resp = valorLiquido/1-(taxaDesconto*periodoVencimento);
        JOptionPane.showMessageDialog(null,"Valor Nominal:"+resp);

    }
    public void descobrirDesconto(){
        this.valorLiquido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Líquido"));
        this.valorNominal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Nominal"));
        double resp = valorNominal-valorLiquido;
        JOptionPane.showMessageDialog(null,"Desconto Bancário:"+resp);
    }
    public void calcularDesconto(){
        this.valorNominal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Nominal"));
        this.taxaDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de desconto"));
        this.periodoVencimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o período de vencimento"));
        double resp = valorNominal*taxaDesconto*periodoVencimento;
        JOptionPane.showMessageDialog(null,"Desconto Bancário:"+resp);
    }
}
