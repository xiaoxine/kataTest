package com.model.BuilderPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-03  14:13
 * @Description: 使用纯文本编写文档，并以String返回结果
 * @Version: 1.0
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    public void makeTitle(String title) {
        buffer.append("======================\n");
        buffer.append("<"+title+">\n");
        buffer.append("\n");
    }

    public void makeString(String str) {
        buffer.append("~"+str+"\n");
        buffer.append("\n");

    }

    public void makeItems(String[] items) {
        for(int i = 0; i <items.length; i++){
            buffer.append("`"+items[i]+"\n");
        }
        buffer.append("\n");
    }

    public void close() {
        buffer.append("======================\n");
    }
    public String getResult(){
        return buffer.toString();
    }
}
