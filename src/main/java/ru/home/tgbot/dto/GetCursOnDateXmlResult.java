package ru.home.tgbot.dto;
/*
класс для записи курсов валют, полученных в классе  ValuteCursOnDate
 */

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetCursOnDateXmlResult")
@Data
public class GetCursOnDateXmlResult {

    @XmlElementWrapper(name = "ValuteData", namespace = "")
    @XmlElement(name = "ValuteCursOnDate", namespace = "")
    private List<ValuteCursOnDate> valueData = new ArrayList<>();


}