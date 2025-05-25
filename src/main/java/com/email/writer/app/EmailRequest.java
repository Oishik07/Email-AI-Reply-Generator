package com.email.writer.app;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@RequestMapping("/api/email")
public class EmailRequest {

    private String emailContent;
    private String tone;
}
