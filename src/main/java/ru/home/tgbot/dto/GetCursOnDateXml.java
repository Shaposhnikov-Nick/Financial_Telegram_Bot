package ru.home.tgbot.dto;

/*
Data Transfer Object класс для создания объектов запросов
 */

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;



@XmlRootElement(name = "GetCursOnDateXml", namespace = "web.cbr.ru")
@Data
public class GetCursOnDateXml {

    //Указание на то, в каком теге XML должно быть данное поле
    @XmlElement(name = "on_Date", required = true, namespace = "web.cbr.ru")
    protected XMLGregorianCalendar onDate;
}
