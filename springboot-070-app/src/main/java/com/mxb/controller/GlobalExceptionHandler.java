package com.mxb.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

@ControllerAdvice
class GlobalExceptionHandler {

    public GlobalExceptionHandler() {
        System.out.println(getClass());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String defaultErrorHandler(HttpServletRequest req, Exception e) throws IOException {
        try (StringWriter stringWriter = new StringWriter()) {
            e.printStackTrace(new PrintWriter(stringWriter));
            return String.format("Request:\n\n%s\n\nException:\n\n%s\n\n", req, stringWriter).replaceAll("\n", "<br/>");
        }
    }

}