package org.example;

import java.util.*;

public class MetadataAnalyzer {
    public static void main(String[] args) {
        // 模拟上次采集的元数据
        Map<String, List<String>> lastMetadata = new HashMap<>();
        lastMetadata.put("D", Arrays.asList("aa", "bb", "cc", "dd", "ee"));

        // 模拟本次采集的元数据
        Map<String, List<String>> currentMetadata = new HashMap<>();
        currentMetadata.put("D", Arrays.asList("aa", "as", "ee", "tr"));

        // 比较字段变化
        analyzeChanges("D", lastMetadata.get("D"), currentMetadata.get("D"));
    }

    /**
     * 分析字段增删改变化
     *
     * @param tableName      表名
     * @param lastFields     上次采集的字段列表
     * @param currentFields  本次采集的字段列表
     */
    public static void analyzeChanges(String tableName, List<String> lastFields, List<String> currentFields) {
        Set<String> lastSet = new HashSet<>(lastFields);
        Set<String> currentSet = new HashSet<>(currentFields);

        // 找到新增的字段
        Set<String> addedFields = new HashSet<>(currentSet);
        addedFields.removeAll(lastSet);

        // 找到删除的字段
        Set<String> removedFields = new HashSet<>(lastSet);
        removedFields.removeAll(currentSet);

        // 找到修改的字段 (这里假设字段名不同即视为修改)
        // 如果需要更复杂的修改检测，需结合字段类型或其他元数据
        Set<String> modifiedFields = new HashSet<>();

        // 输出分析结果
        System.out.println("表 [" + tableName + "] 的字段变化分析结果：");
        if (!addedFields.isEmpty()) {
            System.out.println("新增字段: " + addedFields);
        }
        if (!removedFields.isEmpty()) {
            System.out.println("删除字段: " + removedFields);
        }
        if (!modifiedFields.isEmpty()) {
            System.out.println("修改字段: " + modifiedFields);
        }
        if (addedFields.isEmpty() && removedFields.isEmpty() && modifiedFields.isEmpty()) {
            System.out.println("无变化。");
        }
    }
}
