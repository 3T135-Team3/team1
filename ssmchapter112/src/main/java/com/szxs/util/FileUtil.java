package com.szxs.util;

import java.io.File;

public class FileUtil {

    /**
     * 创建目录
     * @param path
     */
    public static void createDir(String path){
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
    }
}
