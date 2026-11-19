package com.shuyu.gsyvideoplayer.utils;

import android.graphics.Bitmap;
import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* loaded from: classes5.dex */
public class FileUtils {
    public static final String NAME = "GSYVideo";
    public static final String NAME_TEST = "GSYVideoTest";

    public static void deleteFiles(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (!file2.isDirectory() && file2.exists()) {
                    try {
                        file2.delete();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }
    }

    public static String getAppPath(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStoragePublicDirectory("Download").getAbsolutePath());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String getPath() {
        String appPath = getAppPath(NAME);
        File file = new File(appPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return appPath;
    }

    public static String getTestPath() {
        String appPath = getAppPath(NAME_TEST);
        File file = new File(appPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return appPath;
    }

    public static void saveBitmap(Bitmap bitmap, File file) {
        if (bitmap != null) {
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(file));
                bitmap.recycle();
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
        }
    }
}
