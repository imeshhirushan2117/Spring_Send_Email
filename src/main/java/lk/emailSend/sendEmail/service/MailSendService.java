package lk.emailSend.sendEmail.service;

import lk.emailSend.sendEmail.dto.MailSendDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created By Imesh Hirushan
 * Project Name : sendEmail
 * Package Name : lk.emailSend.sendEmail.service
 * Date : Mar 28, 2024
 * Time : 2:23 PM
 */
@Service
public class MailSendService {

   final JavaMailSender javaMailSender;

   @Autowired
    public MailSendService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public String  sendMail(MailSendDTO mailSendDTO) {
        SimpleMailMessage massage = new SimpleMailMessage();
        massage.setFrom("imeshhirushan2117@gmail.com");
        massage.setTo(mailSendDTO.getToMail());
        massage.setSubject(mailSendDTO.getSubject());
        massage.setText(mailSendDTO.getMassage());
        javaMailSender.send(massage);

        return "Mail Send Success Full !";
    }
}
