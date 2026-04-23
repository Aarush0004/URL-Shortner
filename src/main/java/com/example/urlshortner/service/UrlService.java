package com.example.urlshortner.service;

import com.example.urlshortner.model.UrlMapping;
import com.example.urlshortner.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UrlService {

    @Autowired
    private UrlRepository repository;

    public String shortenUrl(String originalUrl) {

        if (originalUrl == null || originalUrl.trim().isEmpty()) {
            throw new IllegalArgumentException("URL cannot be empty");
        }

        if (!originalUrl.startsWith("http://") && !originalUrl.startsWith("https://")) {
            throw new IllegalArgumentException("URL must start with http:// or https://");
        }

        String shortCode = generateShortCode();

        UrlMapping mapping = new UrlMapping();
        mapping.setOriginalUrl(originalUrl);
        mapping.setShortCode(shortCode);

        repository.save(mapping);

        return shortCode;
    }

    public Optional<String> getOriginalUrl(String code) {
        return repository.findByShortCode(code)
                .map(UrlMapping::getOriginalUrl);
    }

    private String generateShortCode() {
        return UUID.randomUUID().toString().substring(0, 6);
    }
}
