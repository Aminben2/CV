package com.example.CV.service;

import com.example.CV.dto.ResumeDTO;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.FileOutputStream;
import java.io.OutputStream;

@Service
public class PdfService {

    @Autowired
    private TemplateEngine templateEngine;

    public void generatePdf(ResumeDTO resumeDetailsDTO, String outputPath) throws Exception {
        Context context = new Context();
        context.setVariable("resume", resumeDetailsDTO);

        String htmlContent = templateEngine.process("cv", context);

        try (OutputStream os = new FileOutputStream(outputPath)) {
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.useFastMode();
            builder.withHtmlContent(htmlContent, null);
            builder.toStream(os);
            builder.run();
        }
    }
}
