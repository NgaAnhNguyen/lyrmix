package com.example.spring_boot_react_demo;

import org.springframework.web.multipart.MultipartFile;

public class FileTypeUtil {

    // Kiểm tra loại tệp
    public static String getFileType(MultipartFile file) {
        String contentType = file.getContentType();

        // Kiểm tra nếu là video
        if (contentType != null && contentType.startsWith("video")) {
            return "video";
        }
        // Kiểm tra nếu là audio
        else if (contentType != null && contentType.startsWith("audio")) {
            return "audio";
        }

        return "unknown"; // Không xác định được loại
    }
}
