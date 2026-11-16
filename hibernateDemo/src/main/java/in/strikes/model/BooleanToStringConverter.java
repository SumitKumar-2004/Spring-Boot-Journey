package in.strikes.model;

import jakarta.persistence.AttributeConverter;

public class BooleanToStringConverter implements AttributeConverter <Boolean,String>{

    @Override
    public String convertToDatabaseColumn(Boolean aBoolean) {
       if(aBoolean == null){
           return null;
       }

        if(aBoolean == true){
           return "Yes";
       }else{
           return "No";
       }
    }

    @Override
    public Boolean convertToEntityAttribute(String s) {
        if(s == null){
            return null;
        }

        if(s.equals("Yes")){
            return true;
        }else{
            return false;
        }
    }
}
