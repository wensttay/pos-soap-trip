package br.edu.ifpb.ads.pos.soap.trip.passagem.controller;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 20/10/2017, 00:31:59
 */
@FacesConverter("DataToTimestampConverter")
public class DataToTimestampConverter implements Converter {

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            Date parsedDate = dateFormat.parse(value);
            Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
            return timestamp;
        } catch (ParseException ex) {
        }
        
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return dateFormat.format(value);
    }

}
