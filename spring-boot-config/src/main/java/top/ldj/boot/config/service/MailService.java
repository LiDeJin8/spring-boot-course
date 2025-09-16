package top.ldj.boot.config.service;

import org.springframework.web.multipart.MultipartFile;
import top.ldj.boot.config.enums.ResultStatus;
import top.ldj.boot.config.model.Mail;

/**
 * @Author: lenovo
 * @Date: 2025/9/16
 * @Version: 1.0
 */





public interface MailService {
    /*
    *
    * */
    ResultStatus sendSimpleMail(Mail mail);

    /*
     * 发送HTML邮件
     *
     * @ param mail 邮件·
     * */
    ResultStatus sendHtmlMail(Mail mail);
    /*
     * 发送附件邮件
     *
     * @ param mail 邮件
     * */
    ResultStatus sendAttachmentsMail(Mail mail, MultipartFile[] files);
}
