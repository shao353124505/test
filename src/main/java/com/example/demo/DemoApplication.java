package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
  private static void UpdateJsonStringValue(String jsonString,String key,int value) {
    JsonObject jsonFbBoxColFolderRule = new Gson().fromJson(jsonString, JsonObject.class).getAsJsonObject();
    System.out.println(jsonFbBoxColFolderRule);
    jsonFbBoxColFolderRule.addProperty(key,value);
    jsonFbBoxColFolderRule.addProperty("allen",12);
    System.out.println(jsonFbBoxColFolderRule);
  }
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    String jsonString = "{\"fbScanningType\":\"1\",\"fbCompressedFileScanningType\":\"0\",\"fbActionType\":\"103\",\"fbNotifyType\":\"0\",\"fbBlockFileTypeEnabled\":\"0\",\"fbBlockFileExtensionEnabled\":\"0\",\"fbBlockFileNameEnabled\":\"0\",\"fbExceptionFileExtensionEnabled\":\"0\",\"fbExceptionFileNameEnabled\":\"0\",\"fbExceptionFileTypeEnabled\":\"0\"}";
UpdateJsonStringValue(jsonString,"fbActionType",6);
    // JsonArray jsonArray = gson.fromJson(jsonString, JsonElement.class).getAsJsonArray();
    // JsonObject firstObject = jsonArray.get(i).getAsJsonObject();
    // firstObject.addProperty("key1", "Test");
  }

}
