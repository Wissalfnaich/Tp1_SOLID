package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        IDataReader fileReader = new FileDataReader("path/to/input.txt");
        IDataWriter fileWriter = new FileDataWriter("path/to/output.txt");
        EncodingModule encoder = new EncodingModule(fileReader, fileWriter);
        encoder.encode();
    }
}