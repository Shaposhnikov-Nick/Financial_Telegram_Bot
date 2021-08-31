package ru.home.tgbot.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetCursOnDateXmlResponse", namespace = "web.cbr.ru")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class GetCursOnDateXmlResponse {

    @XmlElement(name = "GetCursOnDateXmlResult", namespace = "web.cbr.ru")
    private GetCursOnDateXmlResult getCursOnDateXmlResult;
}
