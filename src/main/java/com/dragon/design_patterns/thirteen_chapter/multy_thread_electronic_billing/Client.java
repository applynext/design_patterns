package com.dragon.design_patterns.thirteen_chapter.multy_thread_electronic_billing;

import java.util.Random;

public class Client {
    //发送账单的数量
    private static int MAX_COUNT = 6;
    public static void main(String[] args) {
        //模拟发送邮件i
        int i = 0;
        //把模板定义出来
        com.dragon.design_patterns.thirteen_chapter.multy_thread_electronic_billing.Mail mail = new com.dragon.design_patterns.thirteen_chapter.multy_thread_electronic_billing.Mail(new com.dragon.design_patterns.thirteen_chapter.multy_thread_electronic_billing.AdvTemplate());
        mail.setAppellation("XX银行版权所有");
        while(i < MAX_COUNT) {
            //以下是每封邮件不同的地方
            com.dragon.design_patterns.thirteen_chapter.multy_thread_electronic_billing.Mail cloneMail = (com.dragon.design_patterns.thirteen_chapter.multy_thread_electronic_billing.Mail) mail.clone();
            cloneMail.setAppellation(getRandString(5) + "先生(女士)");
            cloneMail.setReceiver(getRandString(8) + "@" + getRandString(5) + ".com");
            //发送邮件
            sendMail(cloneMail);
            i++;
        }
    }
    //获取随机字符串
    public static String getRandString(int maxLength) {
        String source = "asdfghjklzxcvbnmqwertyuiop";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
    public static void sendMail(com.dragon.design_patterns.thirteen_chapter.multy_thread_electronic_billing.Mail mail) {
        System.out.println("标题：" + mail.getSubject()
                + "\t收件人：" + mail.getReceiver()
                + "\t发送成功。。。");
    }
}
