package com.example.examspring.controller;

import com.example.examspring.properties.CommonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {
    @Autowired
    protected CommonProperties commonProperties;
}
