package com.patterns;
import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager{

  private static final ConfigurationManager instance = new ConfigurationManager();

  private Map<String, String> settings = new HashMap<>();

  private ConfigurationManager(){
    settings.put("theme", "dark");
    settings.put("port", "8080");

  }

  public static ConfigurationManager getInstance(){
    return instance;
  }

  public String getSetting(String key){
    return settings.get(key);
  }

  public void setSetting(String key, String value){
    settings.put(key, value);
  }
}
