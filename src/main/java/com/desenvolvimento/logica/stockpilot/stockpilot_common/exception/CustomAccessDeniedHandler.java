package com.desenvolvimento.logica.stockpilot.stockpilot_common.exception;

import com.desenvolvimento.logica.stockpilot.stockpilot_common.dto.ApiResponse;
import com.desenvolvimento.logica.stockpilot.stockpilot_common.enums.MessageCode;
import com.desenvolvimento.logica.stockpilot.stockpilot_common.service.MessageService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    private final MessageService messageService;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void handle(
            HttpServletRequest request,
            HttpServletResponse response,
            AccessDeniedException accessDeniedException
    ) throws IOException, ServletException {

        response.setStatus(HttpStatus.FORBIDDEN.value());
        response.setContentType("application/json");

        ApiResponse<Object> apiResponse = new ApiResponse<>(
                false,
                messageService.get(MessageCode.ERROR_ACCESS_DENIED.getCode()),
                null
        );

        response.getWriter().write(
                objectMapper.writeValueAsString(apiResponse)
        );
    }
}
