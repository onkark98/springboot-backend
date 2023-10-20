package com.example.springbootbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = -8758092997867719536L;
    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public ResourceNotFoundException(String message, String resourceName, Object fieldValue) {
        super(String.format("%s not found with : %s",resourceName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
}
