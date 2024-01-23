package com.rocker;

import com.fizzed.rocker.runtime.RockerRuntime;
import com.fizzed.rocker.runtime.StringBuilderOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootApplication
public class RockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RockerApplication.class, args);
    }

}
