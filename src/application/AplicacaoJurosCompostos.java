package application;
import calc.juroscompostos;
import javax.swing.JOptionPane;
public class AplicacaoJurosCompostos {
    public static void main(String[] args) {
        juroscompostos x;
        x = new juroscompostos();
        //TUTORIAL INSIRA OS VALORES DE PORCENTAGEM EM DECIMAL OU SEJA 3% = 0.03
        //TUTORIAL TODOS OS CALCULOS DE PERÍODO SÃO FEITOS COM BASE EM MESES OU SEJA CASO LHE SEJA DADO UM PERÍODO EM DIAS OU ANOS VOCÊ TERÁ QUE CONVERTE-LO
        //MANUALMENTE 120 DIAS = 4 MESES, UM SEMESTRE = 6 MESES, UM TRIMESTRE = 3 MESES, UM BIMESTRE = 2 MESES, UM ANO = 12 MESES
        int escolha;
        escolha = Integer.parseInt(JOptionPane.showInputDialog("1-Calcular Capital através do Montante M," +
                "2-Calcular Capital através do juros," +
                "3-Calcular Montante," +
                "4-Calcular Juros," +
                "5-Calcular Taxa de Juros com Montante," +
                "6-Calcular Taxa de Juros com Juros"));
        switch (escolha) {
            case 1:x.saberCapM();
            break;
            case 2:x.saberCapJ();
            break;
            case 3:x.saberMont();
            break;
            case 4:x.saberJur();
            break;
            case 5:x.saberTaxM();
            break;
            case 6:x.saberTaxaJ();
            default:break;
        }
    }
}