package com.blankj.utilcode.util;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.blankj.utilcode.util.k */
/* loaded from: classes3.dex */
public abstract class AbstractC5371k {

    /* renamed from: a */
    public static final String f2726a = System.getProperty("line.separator");

    /* renamed from: a */
    public static boolean m2519a(File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !m2520b(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m2520b(File file) {
        if (file != null) {
            return file.exists() ? file.isDirectory() : file.mkdirs();
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m2521c(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!m2520b(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m2522d(File file) {
        if (file == null) {
            return false;
        }
        return file.isDirectory() ? m2523e(file) : m2524f(file);
    }

    /* renamed from: e */
    public static boolean m2523e(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !m2523e(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: f */
    public static boolean m2524f(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile() && file.delete();
        }
        return true;
    }

    /* renamed from: g */
    public static File m2525g(String str) {
        if (AbstractC5372k0.m2533D(str)) {
            return null;
        }
        return new File(str);
    }

    /* renamed from: h */
    public static String m2526h(String str) {
        if (AbstractC5372k0.m2533D(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf == -1 || str.lastIndexOf(File.separator) >= iLastIndexOf) ? "" : str.substring(iLastIndexOf + 1);
    }

    /* renamed from: i */
    public static boolean m2527i(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        return m2528j(file.getAbsolutePath());
    }

    /* renamed from: j */
    public static boolean m2528j(String str) {
        File fileM2525g = m2525g(str);
        if (fileM2525g == null) {
            return false;
        }
        if (fileM2525g.exists()) {
            return true;
        }
        return m2529k(str);
    }

    /* renamed from: k */
    public static boolean m2529k(String str) throws IOException {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = AbstractC5366h0.m2478a().getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r");
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    return false;
                }
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (FileNotFoundException unused2) {
            }
        }
        return false;
    }
}
