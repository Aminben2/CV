package com.example.CV.runner;

import com.example.CV.dto.ResumeDTO;
import com.example.CV.service.PdfService;
import com.example.CV.service.ResumeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class ResumeServiceRunner implements CommandLineRunner {

    @Autowired
    private ResumeService resumeService;

    @Autowired
    private PdfService pdfService;

    @Override
    public void run(String... args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java -jar your-application.jar <email> <outputPath>");
            return;
        }
        String email = args[0];
        String outputPath = args[1];

        System.out.println("Email: " + email);
        System.out.println("Output Path: " + outputPath);

        ResumeDTO data = resumeService.findResumeDetailsByEmail(email);
        if (data != null) {
            System.out.println("Resume found, generating PDF...");
            ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());;
            String jsonData = objectMapper.writeValueAsString(data);

            System.out.println(jsonData);
//             pdfService.generatePdf(data, outputPath);
             System.out.println("PDF generated successfully at " + outputPath);
        } else {
            System.out.println("Resume not found for email: " + email);
        }
    }

}
