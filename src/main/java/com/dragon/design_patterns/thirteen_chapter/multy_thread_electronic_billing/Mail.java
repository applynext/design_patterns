package com.dragon.design_patterns.thirteen_chapter.multy_thread_electronic_billing;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mail implements Cloneable{
    //收件人
    private String receiver;
    //邮件名称
    private  String subject;
    //称谓
    private String appellation;
    //邮件内容
    private String context;
    //邮件尾部的版权信息
    private  String tail;

    public Mail(com.dragon.design_patterns.thirteen_chapter.multy_thread_electronic_billing.AdvTemplate advTemplate) {
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }

    @Override
    protected Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
