package com.example.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Request {

    private String sign;

    private String[] spuIds;

    private String language;

}
