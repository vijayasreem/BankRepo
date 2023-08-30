package com.sacral.controller;

import com.sacral.model.Document;
import com.sacral.service.DocumentUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/document")
public class DocumentUploadController {

    @Autowired
    DocumentUploadService documentUploadService;

    @PostMapping("/upload")
    public Optional<Document> uploadDocuments(@RequestBody Document document) {
        documentUploadService.validateDocuments(document);
        documentUploadService.storeDocumentsSecurely(document);
        documentUploadService.provideFeedback(document);
        return documentUploadService.findByIdentification(document.getIdentification());
    }

}