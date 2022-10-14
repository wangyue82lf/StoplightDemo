package com.example.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Data
public class Response extends BaseResponse {

    private String itemId;

    private Integer maxUnit;

    private Map<String, String> variant;

    private List<Variant> variants;

}
