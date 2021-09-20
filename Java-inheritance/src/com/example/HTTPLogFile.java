package com.example;

public class HTTPLogFile extends LogFile {
    private String siteName;

    public HTTPLogFile(String siteName) {
        super(siteName + ".log","/var/log/");
    }
}
