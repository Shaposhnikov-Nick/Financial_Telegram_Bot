package ru.home.tgbot.dto;

/*
Data Transfer Object класс для создания объектов запросов
 */

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;



@XmlRootElement(name = "GetCursOnDateXML", namespace = "http://web.cbr.ru/")
@Data //Геттеры и сеттеры
public class GetCursOnDateXml {

    //Указание на то, в каком теге XML должно быть данное поле
    @XmlElement(name = "On_date", required = true, namespace = "http://web.cbr.ru/")
    protected XMLGregorianCalendar onDate;
}
