package com.example.CV.service;

import com.example.CV.dto.ResumeDTO;
import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
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

        // Generate HTML content using Thymeleaf
        String htmlContent = templateEngine.process("cv", context);

        // Convert HTML to PDF using iText
        try (OutputStream os = new FileOutputStream(outputPath)) {
            // Set base URI for resolving relative paths
            ClassPathResource resource = new ClassPathResource("static/");
            String baseUri = resource.getURL().toString();

            // Specify the URI resolver to handle relative paths
            HtmlConverter.convertToPdf(htmlContent, os, new ConverterProperties().setBaseUri(baseUri));
        }
    }
}