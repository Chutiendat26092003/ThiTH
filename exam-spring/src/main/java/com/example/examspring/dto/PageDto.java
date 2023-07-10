package com.example.examspring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Data
@NoArgsConstructor
@SuperBuilder
public class PageDto {
    private Integer pageSize;
    private Integer pageNumber;
}
