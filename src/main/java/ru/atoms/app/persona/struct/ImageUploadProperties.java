/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.atoms.app.persona.struct;

import java.util.Map;

/**
 *
 * @author kochetov
 */
public class ImageUploadProperties {
    private Map<String, ImageResize> imageResizes;
    private Map<String, ImageFormat> allowImageFormat;  
    private Map<Integer, String> uploadFileTypes;
    private String uploadPath;
    private String templateStoreFilePath;

    public Map<Integer, String> getUploadFileTypes() {
        return uploadFileTypes;
    }

    public void setUploadFileTypes(Map<Integer, String> uploadFileTypes) {
        this.uploadFileTypes = uploadFileTypes;
    }

    public String getTemplateStoreFilePath() {
        return templateStoreFilePath;
    }

    public void setTemplateStoreFilePath(String templateStoreFilePath) {
        this.templateStoreFilePath = templateStoreFilePath;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public Map<String, ImageFormat> getAllowImageFormat() {
        return allowImageFormat;
    }
    
    public void setAllowImageFormat(Map<String, ImageFormat> allowImageFormat) {
        this.allowImageFormat = allowImageFormat;
    }

    public Map<String, ImageResize> getImageResizes() {
        return imageResizes;
    }

    public void setImageResizes(Map<String, ImageResize> imageResizes) {
        this.imageResizes = imageResizes;
    }
    
}
