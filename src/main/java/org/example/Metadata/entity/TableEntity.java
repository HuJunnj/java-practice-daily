package org.example.Metadata.entity;

public class TableEntity<T> extends MetaDataEntity<T>{
  private String engine;
  private String charset;

    public TableEntity(String engine, String charset) {
        this.engine = engine;
        this.charset = charset;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }
}
