package tech.lucas.sns.service;

import io.awspring.cloud.sns.core.SnsTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tech.lucas.sns.dto.MessageDTO;

@Service
public class SnsService {

    Logger log = LoggerFactory.getLogger(SnsService.class);

    private final SnsTemplate snsTemplate;

    @Value("${spring.cloud.aws.sns.topic-arn}")
    private String topicArn;

    @Autowired
    public SnsService(SnsTemplate snsTemplate) {
        this.snsTemplate = snsTemplate;
    }

    public void sendNotification(MessageDTO message) {
        log.info("Will send the message {} to topic {}", message, topicArn);
        snsTemplate.sendNotification(topicArn, message, "Test SNS");
        log.info("Message sent successfully!");
    }
}