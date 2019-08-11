package com.demo.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeerDTO {

    private Integer id;
    private String name;
    private String description;
    private Float alcoholPercentage;
    private String breweryLocation;
    private String imageLocation;

}
