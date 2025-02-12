package com.github.msx80.omicron.api;
public interface Game {

    SysConfig sysConfig();
    
    void init() throws Exception;
    
    boolean loop() throws Exception;
    
}
