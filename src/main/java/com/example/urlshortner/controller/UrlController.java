package com.example.urlshortner.controller;

import com.example.urlshortner.service.UrlService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UrlController {

    private final UrlService service;

    @Value("${BASE_URL}")
    private String baseUrl;

    public UrlController(UrlService service) {
        this.service = service;
    }

    @PostMapping("/shorten")
    public ResponseEntity<String> shortenUrl(@RequestParam("url") String originalUrl) {

        try {
            String shortCode = service.shortenUrl(originalUrl);
            String shortUrl = baseUrl + "/r/" + shortCode;
            return ResponseEntity.ok(shortUrl);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @GetMapping("/r/{code}")
    public ResponseEntity<Void> redirect(@PathVariable String code) {

        return service.getOriginalUrl(code)
                .map(url -> ResponseEntity.status(302)
                        .header("Location", url)
                        .<Void>build())
                .orElse(ResponseEntity.<Void>notFound().build());
    }
}


