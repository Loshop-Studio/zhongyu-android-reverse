package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.huawei.hms.base.log.e */
/* loaded from: classes5.dex */
public class C7254e {

    /* renamed from: b */
    public String f11428b;

    /* renamed from: c */
    public String f11429c;

    /* renamed from: d */
    public int f11430d;

    /* renamed from: g */
    public String f11433g;

    /* renamed from: h */
    public int f11434h;

    /* renamed from: i */
    public int f11435i;

    /* renamed from: j */
    public int f11436j;

    /* renamed from: a */
    public final StringBuilder f11427a = new StringBuilder();

    /* renamed from: e */
    public long f11431e = 0;

    /* renamed from: f */
    public long f11432f = 0;

    public C7254e(int i10, String str, int i11, String str2) {
        this.f11429c = "HMS";
        this.f11436j = i10;
        this.f11428b = str;
        this.f11430d = i11;
        if (str2 != null) {
            this.f11429c = str2;
        }
        m8410d();
    }

    /* renamed from: a */
    public static String m8404a(int i10) {
        return i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? String.valueOf(i10) : ExifInterface.LONGITUDE_EAST : ExifInterface.LONGITUDE_WEST : "I" : "D";
    }

    /* renamed from: b */
    public final StringBuilder m8408b(StringBuilder sb2) {
        sb2.append(' ');
        sb2.append(this.f11427a.toString());
        return sb2;
    }

    /* renamed from: c */
    public String m8409c() {
        StringBuilder sb2 = new StringBuilder();
        m8411e(sb2);
        return sb2.toString();
    }

    /* renamed from: d */
    public final C7254e m8410d() {
        this.f11431e = System.currentTimeMillis();
        Thread threadCurrentThread = Thread.currentThread();
        this.f11432f = threadCurrentThread.getId();
        this.f11434h = Process.myPid();
        StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
        int length = stackTrace.length;
        int i10 = this.f11436j;
        if (length > i10) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            this.f11433g = stackTraceElement.getFileName();
            this.f11435i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    /* renamed from: e */
    public final StringBuilder m8411e(StringBuilder sb2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb2.append('[');
        sb2.append(simpleDateFormat.format(Long.valueOf(this.f11431e)));
        String strM8404a = m8404a(this.f11430d);
        sb2.append(' ');
        sb2.append(strM8404a);
        sb2.append('/');
        sb2.append(this.f11429c);
        sb2.append('/');
        sb2.append(this.f11428b);
        sb2.append(' ');
        sb2.append(this.f11434h);
        sb2.append(':');
        sb2.append(this.f11432f);
        sb2.append(' ');
        sb2.append(this.f11433g);
        sb2.append(':');
        sb2.append(this.f11435i);
        sb2.append(']');
        return sb2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        m8411e(sb2);
        m8408b(sb2);
        return sb2.toString();
    }

    /* renamed from: a */
    public <T> C7254e m8405a(T t10) {
        this.f11427a.append(t10);
        return this;
    }

    /* renamed from: a */
    public C7254e m8406a(Throwable th) {
        m8405a((C7254e) '\n').m8405a((C7254e) Log.getStackTraceString(th));
        return this;
    }

    /* renamed from: a */
    public String m8407a() {
        StringBuilder sb2 = new StringBuilder();
        m8408b(sb2);
        return sb2.toString();
    }
}
