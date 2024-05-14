package com.example.CV.runner;
import com.example.CV.dto.ResumeDetailsDTO;
import com.example.CV.entity.Resume;
import com.example.CV.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ResumeServiceRunner implements CommandLineRunner {

    @Autowired
    private ResumeService resumeService;

    @Override
    public void run(String... args) throws Exception {
        // Read email from command-line arguments or user input
        if (args.length == 0) {
            System.out.println("Usage: java -jar your-application.jar <email>");
            return;
        }
        String email = args[0];
        ResumeDetailsDTO data = resumeService.findResumeDetailsByEmail(email);
        if (data != null) {
            System.out.println("Resume found:");
            System.out.println(data);
        } else {
            System.out.println("Resume not found for email: " + email);
        }
    }
}

