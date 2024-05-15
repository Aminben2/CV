package com.example.CV.runner;

import com.example.CV.dto.ResumeDetailsDTO;
import com.example.CV.service.PdfService;
import com.example.CV.service.ResumeService;
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
        if (args.length == 0) {
            System.out.println("Usage: java -jar your-application.jar <email> <outputPath>");
            return;
        }
        String email = args[0];
        String outputPath = args[1];

        ResumeDetailsDTO data = resumeService.findResumeDetailsByEmail(email);
        if (data != null) {
            System.out.println("Resume found, generating PDF...");
            pdfService.generatePdf(data, outputPath);
            System.out.println("PDF generated successfully at " + outputPath);
        } else {
            System.out.println("Resume not found for email: " + email);
        }
    }
}
