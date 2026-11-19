package com.zykj.paint.record;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class AudioFileUtils {
    private static final String TAG = "AudioFileUtils";
    private static String FILE_PATH = Environment.getExternalStorageDirectory().toString() + "/";
    private static String rootPath = "audiorecord";
    private static final String AUDIO_PCM_BASEPATH = "/" + rootPath + "/pcm/";
    private static final String AUDIO_WAV_BASEPATH = "/" + rootPath + "/wav/";
    private static final String AUDIO_AMR_BASEPATH = "/" + rootPath + "/amr/";
    private static final String AUDIO_TEMP_BASEPATH = "/" + rootPath + "/temp/";

    public static void clearPcmFiles() {
        deleteDir(FILE_PATH + rootPath + "/pcm/");
    }

    public static void deleteDir(String str) {
        deleteDirWithFile(new File(str));
    }

    public static void deleteDirWithFile(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isFile()) {
                    file2.delete();
                } else if (file2.isDirectory()) {
                    deleteDirWithFile(file2);
                }
            }
            file.delete();
        }
    }

    public static String getAmrFileAbsolutePath(String str) {
        if (str == null) {
            throw new NullPointerException("fileName can't be null");
        }
        if (!str.endsWith(".amr")) {
            str = str + ".amr";
        }
        String str2 = FILE_PATH + rootPath + "/amr/";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str2 + str;
    }

    public static List<File> getAmrFiles() {
        ArrayList arrayList = new ArrayList();
        File file = new File(FILE_PATH + rootPath + "/amr/");
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                arrayList.add(file2);
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public static String getPcmFileAbsolutePath(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new NullPointerException("fileName isEmpty");
        }
        if (!str.endsWith(".pcm")) {
            str = str + ".pcm";
        }
        String str2 = FILE_PATH + rootPath + "/pcm/";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str2 + str;
    }

    public static List<File> getPcmFiles() {
        ArrayList arrayList = new ArrayList();
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + AUDIO_PCM_BASEPATH);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                arrayList.add(file2);
            }
        }
        return arrayList;
    }

    public static String getTempFileAbsolutePath(String str) {
        if (str == null) {
            throw new NullPointerException("fileName can't be null");
        }
        if (!str.endsWith(".amr")) {
            str = str + ".amr";
        }
        String str2 = FILE_PATH + rootPath + "/temp/";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str2 + str;
    }

    public static String getWavFileAbsolutePath(String str, String str2) {
        if (str2 == null) {
            throw new NullPointerException("fileName can't be null");
        }
        if (!str2.endsWith(".wav")) {
            str2 = str2 + ".wav";
        }
        String str3 = FILE_PATH + str + "/";
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str3 + str2;
    }

    public static List<File> getWavFiles() {
        ArrayList arrayList = new ArrayList();
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + AUDIO_WAV_BASEPATH);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                arrayList.add(file2);
            }
        }
        return arrayList;
    }

    public static boolean isSdcardExit() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static void setFilePath(String str) {
        FILE_PATH = str;
    }

    public static void setRootPath(String str) {
        rootPath = str;
    }
}
