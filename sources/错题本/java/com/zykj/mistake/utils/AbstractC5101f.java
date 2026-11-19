package com.zykj.mistake.utils;

import android.os.Environment;
import android.support.v4.media.AbstractC0037f;
import java.io.File;
import kotlin.jvm.internal.AbstractC5830k;
import p073h4.AbstractC5626b;

/* renamed from: com.zykj.mistake.utils.f */
/* loaded from: classes3.dex */
public abstract class AbstractC5101f {

    /* renamed from: a */
    public static final String f8039a;

    static {
        File externalFilesDir = AbstractC5626b.f8757a.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
        f8039a = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
    }

    /* renamed from: a */
    public static void m4463a(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    AbstractC5830k.m5327d(file2);
                    m4463a(file2);
                }
            }
            File[] fileArrListFiles2 = file.listFiles();
            if (fileArrListFiles2 == null || fileArrListFiles2.length != 0) {
                return;
            }
            file.delete();
        }
    }

    /* renamed from: b */
    public static String m4464b(String relativePath) {
        AbstractC5830k.m5330g(relativePath, "relativePath");
        return AbstractC0037f.m75D(f8039a, "/", relativePath);
    }
}
