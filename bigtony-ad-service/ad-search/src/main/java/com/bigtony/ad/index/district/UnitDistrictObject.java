package com.bigtony.ad.index.district;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnitDistrictObject {
    
    // key: state-city
    private Long unitId;
    private String state;
    private String city;
}
