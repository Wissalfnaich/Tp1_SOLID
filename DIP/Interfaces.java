package com.directi.training.dip.exercise;

import java.io.IOException;

public interface IDataReader {
    String read() throws IOException;
}

public interface IDataWriter {
    void write(String data) throws IOException;
}
