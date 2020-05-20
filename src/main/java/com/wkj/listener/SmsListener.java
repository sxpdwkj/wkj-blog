package com.wkj.listener;

import com.aliyuncs.exceptions.ClientException;

import com.wkj.config.SmsProperties;
import com.wkj.util.SmsUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Map;

/**
 * @author : xsh
 * @create : 2020-03-21 - 16:38
 * @describe:
 */
@Component
public class SmsListener {

    @Autowired
    private SmsUtils smsUtils;
    @Autowired
    private SmsProperties smsProperties;

/*    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "sms.queue",durable = "true"),
            exchange = @Exchange(value = "sms.exchange",ignoreDeclarationExceptions = "true",type = ExchangeTypes.TOPIC),
            key = "verifycode.sms"
    ))*/
    public void sendSms(Map<String,String> msg) throws ClientException {
        if(CollectionUtils.isEmpty(msg)){
            return;
        }
        String phone = msg.get("phone");
        String code = msg.get("code");
        if(StringUtils.isNoneBlank(phone) && StringUtils.isNoneBlank(code)){
            this.smsUtils.sendSms(phone,code,this.smsProperties.getSignName(),this.smsProperties.getVerifyCodeTemplate());
        }
    }
}
