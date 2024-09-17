package com.maozi.base.validator.image;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.multipart.MultipartFile;

public class ImageFileValidator implements ConstraintValidator<ImageFile, MultipartFile> {

    @Override
    public void initialize(ImageFile constraintAnnotation) {}

    @Override
    public boolean isValid(MultipartFile file, ConstraintValidatorContext context) {

        if(Objects.isNull(file) || file.isEmpty()) {
            return true;
        }

        String contentType = file.getContentType();
        return StringUtils.isNotEmpty(contentType) && contentType.startsWith("image");

    }

}