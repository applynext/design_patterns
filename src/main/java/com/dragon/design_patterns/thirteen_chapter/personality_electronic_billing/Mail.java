package com.dragon.design_patterns.thirteen_chapter.personality_electronic_billing;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mail {
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

    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }
}
