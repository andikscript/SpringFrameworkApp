package com.andikscript.runspring.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.andikscript.runspring"
})
public class ScanConfig {
}
