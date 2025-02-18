package com.example.spring_boot_react_demo;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class FFmpegService {

    // Hàm gọi FFmpeg để trích xuất audio từ video
    public String extractAudio(String videoPath) {
        String audioPath = videoPath.replace(".mp4", ".mp3");  // Đặt tên file âm thanh đầu ra
        String command = "ffmpeg -i " + videoPath + " -vn -acodec mp3 " + audioPath;

        try {
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
            return "Audio extraction completed, output saved to: " + audioPath;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "Error during audio extraction";
        }
    }
}
