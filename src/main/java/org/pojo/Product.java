package org.pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    int pId;
    Integer prodId; //Wrapper
    String pName;
    double price;
    String description;
}
