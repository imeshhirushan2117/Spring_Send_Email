package lk.emailSend.sendEmail.controller;

import lk.emailSend.sendEmail.dto.MailSendDTO;
import lk.emailSend.sendEmail.service.MailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Imesh Hirushan
 * Project Name : sendEmail
 * Package Name : lk.emailSend.sendEmail.controller
 * Date : Mar 28, 2024
 * Time : 2:23 PM
 */
@RestController
@RequestMapping("/api/mailSender")
public class MailSendController {

    final MailSendService mailSendService;

    @Autowired
    public MailSendController(MailSendService mailSendService) {
        this.mailSendService = mailSendService;
    }

    @PostMapping("/send")
    public ResponseEntity<Object> sendMail(@RequestBody MailSendDTO mailSendDTO){
        try {
            String send = mailSendService.sendMail(mailSendDTO);
            return new ResponseEntity<>(send, HttpStatus.CREATED);
        }catch (Exception e){
            System.out.println("e ===== " + e.getMessage());
            return new ResponseEntity<>("Mail Send Un Success Full !", HttpStatus.FORBIDDEN);
        }
    }

}
