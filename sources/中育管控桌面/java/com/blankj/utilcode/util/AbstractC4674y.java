package com.blankj.utilcode.util;

import java.io.File;

/* renamed from: com.blankj.utilcode.util.y */
/* loaded from: classes3.dex */
public abstract class AbstractC4674y {

    /* renamed from: a */
    public static final char f2147a = File.separatorChar;

    /* renamed from: a */
    public static String m2439a(File file) {
        return file == null ? "" : file.getAbsolutePath();
    }

    /* renamed from: b */
    public static String m2440b() {
        return !AbstractC4663o0.m2303F() ? "" : m2439a(AbstractC4657l0.m2250a().getExternalCacheDir());
    }
}
