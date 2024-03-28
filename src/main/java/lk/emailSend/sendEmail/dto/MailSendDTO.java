package lk.emailSend.sendEmail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By Imesh Hirushan
 * Project Name : sendEmail
 * Package Name : lk.emailSend.sendEmail.dto
 * Date : Mar 28, 2024
 * Time : 2:24 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailSendDTO {
    private String toMail;
    private String subject;
    private String massage;
}
