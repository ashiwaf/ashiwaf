package com.hello;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class CalculatorDtoJsonToXml {
    private Integer val1;
    private Integer val2;
    private Integer result;
}
