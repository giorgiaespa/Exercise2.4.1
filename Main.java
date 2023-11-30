import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        whichOp(Operazioni.ADDIZIONE, BigDecimal.valueOf(3.17), BigDecimal.valueOf(6.22));
        System.out.println("-------------------");
        whichOp(Operazioni.SOTTRAZIONE, BigDecimal.valueOf(4.18), BigDecimal.valueOf(7.26));
        System.out.println("-------------------");
        whichOp(Operazioni.MOLTPIPLICAZIONE, BigDecimal.valueOf(22.6), BigDecimal.valueOf(9.5));
        System.out.println("-------------------");
        whichOp(Operazioni.DIVISIONE, BigDecimal.valueOf(24.2), BigDecimal.valueOf(6.22));
        System.out.println("-------------------");
        whichOp(Operazioni.MIN, BigDecimal.valueOf(3.17), BigDecimal.valueOf(6.22));
        System.out.println("-------------------");
        whichOp(Operazioni.MAX, BigDecimal.valueOf(3.17), BigDecimal.valueOf(6.22));
        System.out.println("-------------------");
    }

    public static BigDecimal sum(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }

    public static BigDecimal sub(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }

    public static BigDecimal mul(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }

    public static BigDecimal div(BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2, 2, RoundingMode.HALF_DOWN);

    }

    public static BigDecimal min(BigDecimal num1, BigDecimal num2) {
        return num1.min(num2);
    }

    public static BigDecimal max(BigDecimal num1, BigDecimal num2) {
        return num1.max(num2);
    }

    public static void whichOp(Operazioni operazioni, BigDecimal num1, BigDecimal num2) {

        System.out.println("L'operazione utilizzata è: " + operazioni);
        System.out.println("Il primo BigDecimal è: " + num1);
        System.out.println("Il secondo BigDecimal è: " + num2);

        switch (operazioni) {
            case ADDIZIONE:
                System.out.println("Risultato: " + sum(num1, num2));
                break;
            case SOTTRAZIONE:
                System.out.println("Risultato: " + sub(num1, num2));
                break;
            case MOLTPIPLICAZIONE:
                System.out.println("Risultato: " + mul(num1, num2));
                break;
            case DIVISIONE:
                System.out.println("Risultato: " + div(num1, num2));
                break;
            case MIN:
                System.out.println("Risultato: " + min(num1, num2));
                break;
            case MAX:
                System.out.println("Risultato: " + max(num1, num2));
                break;
        }
    }


}