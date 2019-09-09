import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class jsonDemo {
     public static  void main(String[] args){
          Diaosi wangxiaoer = new Diaosi();
          wangxiaoer.setName("王小二");
          wangxiaoer.setCar(null);
          List<String> major = new ArrayList<String>();
          major.add("meifa");
          major.add("meirong");
          GsonBuilder gsonBuilder = new GsonBuilder();
          gsonBuilder.setPrettyPrinting();
          gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {
               public String translateName(Field field) {
                    if (field.getName().equals("name")){
                         return "NAME";
                    }
                    return field.getName();
               }
          });
          Gson gson = gsonBuilder.create();
          System.out.println(gson.toJson(wangxiaoer));
          System.out.println(wangxiaoer.getMajor());

     }

     private static void JSONObject() {

     }
}
