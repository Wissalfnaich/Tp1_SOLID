package com.directi.training.dip.exercise;
import java.io.*;
public class FileDataReader implements IDataReader {
    private String filePath;

    public FileDataReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }
}

public class FileDataWriter implements IDataWriter {
    private String filePath;

    public FileDataWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(data);
        writer.close();
    }
}
