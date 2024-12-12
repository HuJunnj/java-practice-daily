package org.example.Metadata.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetaDataEntity<T> {
    private String parentMetaData;
    private String name;
    private Map<String, List<T>> childMetadata;

    public String getParentMetaData() {
        return parentMetaData;
    }

    public void setParentMetaData(String parentMetaData) {
        this.parentMetaData = parentMetaData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, List<T>> getChildMetadata() {
        return childMetadata;
    }

    public void setChildMetadata(Map<String, List<T>> childMetadata) {
        this.childMetadata = childMetadata;
    }
}
