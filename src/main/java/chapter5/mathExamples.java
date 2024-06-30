package chapter5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MathExamples {
    public static void main( String[] args ) {
        int intNumA = 5;
        int intNumB = 3;
        double dblNumC = 5.2d;
        double dblNumD = 3.1d;
        double dblNumE = 0.1d;
        double dblNumF = 0.2d;
        double dblNumG = -9f;
        DecimalFormat dFormat = new DecimalFormat("#, ###.###");

        RoundingMode rmHalfUp = RoundingMode.HALF_UP;
        BigDecimal bdNumE = new BigDecimal (0.1).setScale(1, rmHalfUp);
        BigDecimal bdNumF = new BigDecimal (0.2).setScale(1, rmHalfUp);

        System.out.println(intNumA + " + " + intNumB + " = " + add(intNumA,intNumB));
        System.out.println(intNumA + " - " + intNumB + " = " + subtract(intNumA,intNumB));
        System.out.println(intNumA + " x " + intNumB + " = " + multiply(intNumA,intNumB));
        System.out.println(intNumA + " ÷ " + intNumB + " = " + divide(intNumA,intNumB));
        System.out.println(intNumA + " mod " + intNumB + " = " + modulo(intNumA,intNumB));
        System.out.println(intNumA + " to the power of " + intNumB + " = " + exponent(intNumA,intNumB));
        System.out.println();

        System.out.println(dblNumC + " + " + intNumB + " = " + add(dblNumC, dblNumD));
        System.out.println(dblNumE + " + " + dblNumF + " = " + add(dblNumE, dblNumF));
        System.out.println();
        System.out.println((0.1f == 0.1d));
        System.out.println();

        System.out.println(dblNumC + " - " + dblNumD + " = " + subtract(dblNumC, dblNumD));
        System.out.println(dblNumC + " x " + dblNumD + " = " + multiply(dblNumC, dblNumD));
        System.out.println (dblNumC + " ÷ "  + dblNumD + " = " + dFormat.format(divide(dblNumC,dblNumD)));
        System.out.println(dblNumC + " to the power of " + dblNumD + " = " + exponent(dblNumC, dblNumD));
        System.out.println("The square root of " + dblNumC + " = " + dFormat.format(squareRoot(dblNumC)));
        System.out.println("The cube root of " + dblNumC + " = " + dFormat.format(cubeRoot(dblNumC)));
        System.out.println();
        System.out.println("The absolute value of " + dblNumC + " = " + dFormat.format(absoluteVal(dblNumC)));
        System.out.println("The absolute value of " + dblNumG + " = " + dFormat.format(absoluteVal(dblNumG)));
        System.out.println();

        System.out.println(bdNumE + " + " + bdNumF + " = " + add(bdNumE, bdNumF));

    }

    public static int add(int intNum1, int intNum2) {
        return intNum1 + intNum2;
    }

    public static double add(double dblNum1, double dblNum2) {
        return dblNum1 + dblNum2;
    }

    public static BigDecimal add(BigDecimal bdNum1, BigDecimal bdNum2) {
        return bdNum1.add(bdNum2);
    }

    public static int subtract(int intNum1, int intNum2) {
        return intNum1 - intNum2;
    }

    public static double subtract(double dblNum1, double dblNum2) {
        return dblNum1 - dblNum2;
    }

    public static int multiply(int intNum1, int intNum2) {
        return intNum1 * intNum2;
    }

    public static double multiply(double dblNum1, double dblNum2) {
        return dblNum1 * dblNum2;
    }

    public static int divide(int intDividend, int intDivisor) {
        return intDividend / intDivisor;
    }

    public static double divide(double dblNum1, double dblNum2) {
        return dblNum1 / dblNum2;
    }

    public static int modulo(int intDividend, int intDivisor) {
        return intDividend % intDivisor;
    }

    public static int exponent(int base, int power) {
        return (int) Math.pow(base, power);
    }

    public static double exponent(double base, double power) {
        return Math.pow(base, power);
    }

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double cubeRoot(double number) {
        return Math.cbrt(number);
    }

    public static double absoluteVal(double number) {
        return Math.abs(number);
    }
}
