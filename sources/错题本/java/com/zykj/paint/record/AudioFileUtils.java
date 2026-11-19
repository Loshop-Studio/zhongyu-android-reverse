package com.zykj.paint.record;

import android.os.Environment;
import android.support.v4.media.AbstractC0037f;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class AudioFileUtils {
    private static final String TAG = "AudioFileUtils";
    private static String FILE_PATH = Environment.getExternalStorageDirectory().toString() + "/";
    private static String rootPath = "audiorecord";
    private static final String AUDIO_PCM_BASEPATH = AbstractC0037f.m91p(new StringBuilder("/"), rootPath, "/pcm/");
    private static final String AUDIO_WAV_BASEPATH = AbstractC0037f.m91p(new StringBuilder("/"), rootPath, "/wav/");
    private static final String AUDIO_AMR_BASEPATH = AbstractC0037f.m91p(new StringBuilder("/"), rootPath, "/amr/");
    private static final String AUDIO_TEMP_BASEPATH = AbstractC0037f.m91p(new StringBuilder("/"), rootPath, "/temp/");

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
            str = str.concat(".amr");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(FILE_PATH);
        String strM91p = AbstractC0037f.m91p(sb, rootPath, "/amr/");
        File file = new File(strM91p);
        if (!file.exists()) {
            file.mkdirs();
        }
        return AbstractC0037f.m74C(strM91p, str);
    }

    public static List<File> getAmrFiles() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(FILE_PATH);
        File file = new File(AbstractC0037f.m91p(sb, rootPath, "/amr/"));
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
            str = str.concat(".pcm");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(FILE_PATH);
        String strM91p = AbstractC0037f.m91p(sb, rootPath, "/pcm/");
        File file = new File(strM91p);
        if (!file.exists()) {
            file.mkdirs();
        }
        return AbstractC0037f.m74C(strM91p, str);
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
            str = str.concat(".amr");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(FILE_PATH);
        String strM91p = AbstractC0037f.m91p(sb, rootPath, "/temp/");
        File file = new File(strM91p);
        if (!file.exists()) {
            file.mkdirs();
        }
        return AbstractC0037f.m74C(strM91p, str);
    }

    public static String getWavFileAbsolutePath(String str, String str2) {
        if (str2 == null) {
            throw new NullPointerException("fileName can't be null");
        }
        if (!str2.endsWith(".wav")) {
            str2 = str2.concat(".wav");
        }
        String strM92q = AbstractC0037f.m92q(new StringBuilder(), FILE_PATH, str, "/");
        File file = new File(strM92q);
        if (!file.exists()) {
            file.mkdirs();
        }
        return AbstractC0037f.m74C(strM92q, str2);
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
