package com.example;

public class LogFile {
    private String fileName = "logfile.log";
    private String filePath = "/var/log/";

    public LogFile() {
        System.out.println("default constructor");
    }

    public LogFile(String fileName, String filePath) {
        System.out.println("parameterized constructor");
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public void writeLog(String line) {
        System.out.println(filePath + fileName + " - " + line);
    }
}
