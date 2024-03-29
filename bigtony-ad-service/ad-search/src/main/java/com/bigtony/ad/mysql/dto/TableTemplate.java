package com.bigtony.ad.mysql.dto;

import com.bigtony.ad.mysql.constant.OpType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableTemplate {
    
    private String tableName;
    private String level;
    
    private Map<OpType, List<String>> opTypeFieldSetMap = new HashMap<>();
    
    // <column index, column name>
    private Map<Integer, String> posMap = new HashMap<>();
}