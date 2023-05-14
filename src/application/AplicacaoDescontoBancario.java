package application;
import calc.descontobancario;

import javax.swing.*;

public class AplicacaoDescontoBancario {
    public static void main(String[] args) {
        descontobancario y;
        y = new descontobancario();
        int escolha;
        //TUTORIAL INSIRA OS VALORES DE PORCENTAGEM EM DECIMAL OU SEJA 3% = 0.03
        //TUTORIAL TODOS OS CALCULOS DE PERÍODO SÃO FEITOS COM BASE EM MESES OU SEJA CASO LHE SEJA DADO UM PERÍODO EM DIAS OU ANOS VOCÊ TERÁ QUE CONVERTE-LO
        //MANUALMENTE 120 DIAS = 4 MESES, UM SEMESTRE = 6 MESES, UM TRIMESTRE = 3 MESES, UM BIMESTRE = 2 MESES UM ANO = 12 MESES
        //TENHA EM MENTE QUE O VALOR DO DESCONTO BANCÁRIO É RESULTADO DA DIFERENÇA ENTRE VALOR NOMINAL E VALOR LÍQUIDO, CASO O DESCONHEÇA USE A FUNÇÃO 4
        escolha = Integer.parseInt(JOptionPane.showInputDialog("1-Calcular periodo de vencimento," +
                "2-Calcular taxa," +
                "3-Calcular Valor Nominal," +
                "4-Descobrir Desconto Bancário," +
                "5-Calcular Desconto Bancário"));
        switch (escolha){
            case 1: y.saberVencimento();
            break;
            case 2: y.saberTaxa();
            break;
            case 3: y.saberValorNominal();
            break;
            case 4: y.descobrirDesconto();
            break;
            case 5: y.calcularDesconto();
            break;
            default:break;
        }
    }


}
