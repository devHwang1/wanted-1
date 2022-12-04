package com.example.dday.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor @NoArgsConstructor
public class ProductLikeDTO {
    private List<ProductVO> products;
    private int productLikeCount;
}
