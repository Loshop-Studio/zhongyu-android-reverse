package com.tencent.smtt.utils;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: com.tencent.smtt.utils.y */
/* loaded from: classes4.dex */
public class C6868y {

    /* renamed from: e */
    private static C6868y f7026e;

    /* renamed from: b */
    private Context f7028b;

    /* renamed from: c */
    private File f7029c = null;

    /* renamed from: a */
    public boolean f7027a = false;

    /* renamed from: d */
    private boolean f7030d = false;

    /* renamed from: f */
    private File f7031f = null;

    private C6868y(Context context) {
        this.f7028b = null;
        this.f7028b = context.getApplicationContext();
        m6400b();
    }

    /* renamed from: a */
    public static synchronized C6868y m6396a() {
        return f7026e;
    }

    /* renamed from: d */
    private File m6398d() {
        try {
            if (this.f7029c == null) {
                File file = new File(this.f7028b.getDir("tbs", 0), "core_private");
                this.f7029c = file;
                if (!file.isDirectory()) {
                    return null;
                }
            }
            File file2 = new File(this.f7029c, "debug.conf");
            if (!file2.exists()) {
                file2.createNewFile();
            }
            return file2;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004a -> B:45:0x0056). Please report as a decompilation issue!!! */
    /* renamed from: b */
    public synchronized void m6400b() {
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                if (this.f7031f == null) {
                    this.f7031f = m6398d();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Throwable th) {
            th = th;
        }
        if (this.f7031f == null) {
            return;
        }
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(this.f7031f));
        try {
            Properties properties = new Properties();
            properties.load(bufferedInputStream2);
            String property = properties.getProperty("setting_forceUseSystemWebview", "");
            if (!"".equals(property)) {
                this.f7027a = Boolean.parseBoolean(property);
            }
            bufferedInputStream2.close();
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = bufferedInputStream2;
            try {
                th.printStackTrace();
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } finally {
            }
        }
    }

    /* renamed from: c */
    public void m6401c() throws IOException {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        File fileM6398d;
        try {
            fileM6398d = m6398d();
        } catch (Throwable th2) {
            bufferedInputStream = null;
            th = th2;
            bufferedOutputStream = null;
        }
        if (fileM6398d == null) {
            try {
                throw null;
            } catch (Exception e10) {
                e10.printStackTrace();
                try {
                    throw null;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
        }
        bufferedInputStream = new BufferedInputStream(new FileInputStream(fileM6398d));
        try {
            Properties properties = new Properties();
            properties.load(bufferedInputStream);
            properties.setProperty("setting_forceUseSystemWebview", Boolean.toString(this.f7027a));
            properties.setProperty("result_systemWebviewForceUsed", Boolean.toString(this.f7030d));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileM6398d));
            try {
                properties.store(bufferedOutputStream, (String) null);
                try {
                    bufferedInputStream.close();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    th.printStackTrace();
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                    bufferedOutputStream.close();
                } catch (Throwable th4) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                    try {
                        bufferedOutputStream.close();
                        throw th4;
                    } catch (Exception e15) {
                        e15.printStackTrace();
                        throw th4;
                    }
                }
            }
        } catch (Throwable th5) {
            bufferedOutputStream = null;
            th = th5;
        }
        try {
            bufferedOutputStream.close();
        } catch (Exception e16) {
            e16.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C6868y m6397a(Context context) {
        try {
            if (f7026e == null) {
                f7026e = new C6868y(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7026e;
    }

    /* renamed from: a */
    public void m6399a(boolean z10) throws IOException {
        this.f7030d = z10;
        m6401c();
    }
}
