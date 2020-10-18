package com.chryl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Chr.yl on 2020/10/12.
 *
 * @author Chr.yl
 */
public class DecimalUtil {

    /**
     * 保留两位小数,不四舍五入
     *
     * @param num
     * @return
     */
    public static String getTwoDecimal(String num) {
        DecimalFormat decimalFormat = new DecimalFormat("######0.00");
//        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);//四舍五入
        decimalFormat.setRoundingMode(RoundingMode.DOWN);//舍去
        String format = decimalFormat.format(new BigDecimal(num));
        return format;
    }

    /**
     * 保留两位小数,四舍五入
     *
     * @param num
     * @return
     */
    public static String getTwoDecimal(double num) {
        DecimalFormat decimalFormat = new DecimalFormat("######0.00");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);//四舍五入
//        decimalFormat.setRoundingMode(RoundingMode.DOWN);//舍去
        String format = decimalFormat.format(num);
        return format;
    }

    /**
     * 千分位展示
     *
     * @param num
     * @return
     */
    public static String convertMoneyFormat(String num) {
        DecimalFormat decimalFormat = new DecimalFormat("###,##0.00");
        String format = decimalFormat.format(new BigDecimal(num));
        return format;
    }


    /**
     * 判断为数字
     *
     * @param num
     * @return
     */
    public static boolean isNum(String num) {
        return num.matches("^[0-9]+(.[0-9]+)?$");
    }

    public static void main(String[] args) {
//        System.out.println(getTwoDecimal("8.555"));
        System.out.println(isNum("8.555"));
    }

}
