package com.example.examspring.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration  // Ăn cấu hình config
@Data // không cần viết get set
public class CommonProperties {
    @Value("${application.common.default-page-size}")
    private Integer pageSize;
    @Value("${application.common.default-page-number}")
    private Integer pageNumber;
}

