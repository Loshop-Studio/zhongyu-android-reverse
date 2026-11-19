package com.tendcloud.tenddata;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.io.File;

/* renamed from: com.tendcloud.tenddata.bz */
/* loaded from: classes5.dex */
public class C7894bz {

    /* renamed from: a */
    private static volatile C7894bz f14476a;

    /* renamed from: b */
    private PackageInfo f14477b = null;

    private C7894bz() {
    }

    /* renamed from: a */
    public static C7894bz m11353a() {
        if (f14476a == null) {
            synchronized (C7894bz.class) {
                try {
                    if (f14476a == null) {
                        f14476a = new C7894bz();
                    }
                } finally {
                }
            }
        }
        return f14476a;
    }

    /* renamed from: i */
    private synchronized boolean m11354i(Context context) {
        try {
            if (this.f14477b == null) {
                this.f14477b = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            }
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public int m11356b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            if (m11354i(context)) {
                return this.f14477b.versionCode;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public String m11357c(Context context) {
        if (context == null) {
            return "unknown";
        }
        try {
            return !m11354i(context) ? "unknown" : this.f14477b.versionName;
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: d */
    public long m11358d(Context context) {
        if (context == null) {
            return -1L;
        }
        try {
            if (m11354i(context) && C7912cq.m11595a(9)) {
                return this.f14477b.firstInstallTime;
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* renamed from: e */
    public long m11359e(Context context) {
        if (context == null) {
            return -1L;
        }
        try {
            if (m11354i(context) && C7912cq.m11595a(9)) {
                return this.f14477b.lastUpdateTime;
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* renamed from: f */
    public long m11360f(Context context) {
        if (context == null) {
            return -1L;
        }
        try {
            return new File(context.getApplicationInfo().sourceDir).length();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* renamed from: g */
    public String m11361g(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (!m11354i(context)) {
                return null;
            }
            Signature[] signatureArr = this.f14477b.signatures;
            if (signatureArr.length < 1) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(signatureArr[0].toCharsString());
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    public String m11362h(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String m11355a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName();
        } catch (Throwable unused) {
            return "";
        }
    }
}
