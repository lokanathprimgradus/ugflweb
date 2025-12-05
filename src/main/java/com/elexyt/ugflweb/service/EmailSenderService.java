package com.elexyt.ugflweb.service;



import com.elexyt.ugflweb.utility.Mail;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender emailSender;

    @Autowired
    private SpringTemplateEngine templateEngine;




    public void sendEmail(Mail mail) throws MessagingException, IOException {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,
                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                StandardCharsets.UTF_8.name());
        //helper.addAttachment("template-cover.png", new ClassPathResource("javabydeveloper-email.PNG"));

        Context context = new Context();
      
        context.setVariables(mail.getProps());
    
        String html = templateEngine.process("mailtemplate", context);

        helper.setTo(mail.getMailTo());
        helper.setText(html, true);
        helper.setSubject(mail.getSubject());
        helper.setFrom(mail.getFrom());

        emailSender.send(message);
    }
    
    
    

//    public void sendOnBoardEmail(Mail mail) throws MessagingException, IOException {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//        //helper.addAttachment("template-cover.png", new ClassPathResource("javabydeveloper-email.PNG"));
//
//        Context context = new Context();
//
//        context.setVariables(mail.getProps());
//
//        String html = templateEngine.process("onBoardMailtemplate", context);
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }
//
//
//    public void sendDailyStatusMail(Mail mail) throws MessagingException, IOException {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//        //helper.addAttachment("template-cover.png", new ClassPathResource("javabydeveloper-email.PNG"));
//
//        Context context = new Context();
//
//        context.setVariables(mail.getProps());
//
//        String html = templateEngine.process("DaliyStatusTemplate", context);
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }
//
//
//
//    public void sendOfferLetter(Mail mail, String path) throws MessagingException, IOException {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//        helper.addAttachment("offer.pdf", new File(path));
//
//        Context context = new Context();
//
//        context.setVariables(mail.getProps());
//
//        String html = templateEngine.process("OfferTemplate", context);
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }
//

    public String sendOtp(Mail mail) {
        try {
            MimeMessage message = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(
                    message,
                    MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                    StandardCharsets.UTF_8.name()
            );

            Context context = new Context();
            context.setVariables(mail.getProps());
            String html = templateEngine.process("mailtemplateotp", context);

            helper.setTo(mail.getMailTo());
            helper.setText(html, true);
            helper.setSubject(mail.getSubject());
            helper.setFrom(mail.getFrom());

            emailSender.send(message);

            return "00";
        } catch (Exception e) {
            e.printStackTrace();
            return "99";
        }
    }


//    public void sendLeaveMail(Mail mail) throws MessagingException, IOException {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//
//        Context context = new Context();
//
//        context.setVariables(mail.getProps());
//
//        String html = templateEngine.process("LeaveApplyTemplate", context);
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }
//
//
//    public void sendDailyTaskStatusMail(Mail mail) throws MessagingException, IOException {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//        //helper.addAttachment("template-cover.png", new ClassPathResource("javabydeveloper-email.PNG"));
//
//        Context context = new Context();
//
//        context.setVariables(mail.getProps());
//
//        String html = templateEngine.process("DailyTaskStatusTemplate", context);
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }
//
//
//
//    public void sendAlertMail(Mail mail) throws MessagingException, IOException {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//
//        Context context = new Context();
//
//        context.setVariables(mail.getProps());
//
//        String html = templateEngine.process("AlertTemplate", context);
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }
//
//    public void sendAlertMailforStatutory(Mail mail) throws MessagingException, IOException {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//
//        Context context = new Context();
//
//        context.setVariables(mail.getProps());
//
//        String html = templateEngine.process("StatutoryAlertTemplate", context);
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }

//    public void sendOfferAcceptedEmailToAdmin(Mail mail) throws  MessagingException, IOException  {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//
//        Context context = new Context();
//        context.setVariables(mail.getProps());
//
//        String html = "";
//        try {
//          html  = templateEngine.process("OfferAcceptedTemp", context);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }
//
//    public void sendFinalSubmissionEmailToAdmin(Mail mail) throws  MessagingException, IOException  {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//
//        Context context = new Context();
//
//        context.setVariables(mail.getProps());
//
//        String html = templateEngine.process("FinalSubmissionTemplate", context);
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }
//
//    public void approvalOfLeaveRequestMail(Mail mail) throws MessagingException {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//
//        Context context = new Context();
//
//        context.setVariables(mail.getProps());
//
//        String html = templateEngine.process("LeaveApprovalTemplate", context);
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }
//
//    public void sendPassOutMail(Mail mail) throws MessagingException {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//
//        Context context = new Context();
//
//        context.setVariables(mail.getProps());
//
//        String html = templateEngine.process("PassOutTemplate", context);
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }
//
//
//    public void sendDailyWorkLogMail(Mail mail) throws MessagingException, IOException {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//        //helper.addAttachment("template-cover.png", new ClassPathResource("javabydeveloper-email.PNG"));
//
//        Context context = new Context();
//
//        context.setVariables(mail.getProps());
//
//        String html = templateEngine.process("DailyWorkLogTemplate", context);
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }
//
//    public void sendDailyUserPendingTaskDetailsEmail(Mail mail) throws MessagingException {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//        Context context = new Context();
//
//        context.setVariables(mail.getProps());
//
//        String html = templateEngine.process("DailyUserPendingTaskTemplate", context);
//
//        helper.setTo(mail.getMailTo());
//        helper.setText(html, true);
//        helper.setSubject(mail.getSubject());
//        helper.setFrom(mail.getFrom());
//
//        emailSender.send(message);
//    }
}
