package com.zykj.utlils;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class FileUtils {
    public static String byteToMB(long j) {
        if (j >= 1073741824) {
            return String.format("%.1f GB", Float.valueOf(j / 1073741824));
        }
        if (j >= 1048576) {
            float f = j / 1048576;
            return String.format(f > 100.0f ? "%.0f MB" : "%.1f MB", Float.valueOf(f));
        }
        if (j <= 1024) {
            return String.format("%d B", Long.valueOf(j));
        }
        float f2 = j / 1024;
        return String.format(f2 > 100.0f ? "%.0f KB" : "%.1f KB", Float.valueOf(f2));
    }

    public static String kbToMB(float f) {
        float f2 = 1048576L;
        if (f >= f2) {
            return String.format("%.1f GB", Float.valueOf(f / f2));
        }
        float f3 = 1024L;
        if (f < f3) {
            return String.format(f > 100.0f ? "%.0f KB" : "%.1f KB", Float.valueOf(f));
        }
        float f4 = f / f3;
        return String.format(f4 > 100.0f ? "%.0f MB" : "%.1f MB", Float.valueOf(f4));
    }

    public static boolean saveFile(String str, String str2, String str3) throws Throwable {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str3)) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    File file = new File(str);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(str, str2);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    } else {
                        file2.delete();
                    }
                    fileOutputStream = new FileOutputStream(file2);
                } catch (IOException unused) {
                    return false;
                }
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(str3.getBytes());
            fileOutputStream.close();
        } catch (Exception e2) {
            fileOutputStream2 = fileOutputStream;
            e = e2;
            e.printStackTrace();
            if (fileOutputStream2 == null) {
                return false;
            }
            fileOutputStream2.close();
            return false;
        } catch (Throwable th2) {
            fileOutputStream2 = fileOutputStream;
            th = th2;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
        return false;
    }

    public static String readFile(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, str2));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        stringBuffer.append(line);
                        stringBuffer.append("\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                        fileInputStream.close();
                    }
                } catch (Throwable th) {
                    fileInputStream.close();
                    bufferedReader.close();
                    throw th;
                }
            }
            fileInputStream.close();
            bufferedReader.close();
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return stringBuffer.toString();
    }

    public static String readFile(String str) {
        return readFile(str, "UTF-8");
    }

    public static Intent getPptFileIntent(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435456);
        intent.setDataAndType(Uri.fromFile(new File(str)), "application/vnd.ms-powerpoint");
        return intent;
    }

    public static Intent getExcelFileIntent(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435456);
        intent.setDataAndType(Uri.fromFile(new File(str)), "application/vnd.ms-excel");
        return intent;
    }

    public static Intent getWordFileIntent(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435456);
        intent.setDataAndType(Uri.fromFile(new File(str)), "application/msword");
        return intent;
    }
}
