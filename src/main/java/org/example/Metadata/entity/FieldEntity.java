package org.example.Metadata.entity;

public class FieldEntity<T> extends MetaDataEntity<T>{
    private String dataType;
    private String notNul;
    private String key;

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getNotNul() {
        return notNul;
    }

    public void setNotNul(String notNul) {
        this.notNul = notNul;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
