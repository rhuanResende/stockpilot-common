package com.desenvolvimento.logica.stockpilot.stockpilot_common.service;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {

    private final MessageSource messageSource;

    public MessageService(
            MessageSource messageSource
    ) {
        this.messageSource = messageSource;
    }

    public String get(String key) {
        return messageSource.getMessage(
                key,
                null,
                Locale.getDefault()
        );
    }

    public String get(
            String key,
            Object... params
    ) {
        return messageSource.getMessage(
                key,
                params,
                Locale.getDefault()
        );
    }
}
