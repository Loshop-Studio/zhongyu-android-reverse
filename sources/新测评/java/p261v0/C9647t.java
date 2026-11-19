package p261v0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p117i1.AbstractC7652k;

/* renamed from: v0.t */
/* loaded from: classes3.dex */
public final class C9647t {

    /* renamed from: e */
    public static final boolean f16831e;

    /* renamed from: f */
    public static final boolean f16832f;

    /* renamed from: g */
    public static final File f16833g;

    /* renamed from: h */
    public static volatile C9647t f16834h;

    /* renamed from: b */
    public int f16836b;

    /* renamed from: c */
    public boolean f16837c = true;

    /* renamed from: d */
    public final AtomicBoolean f16838d = new AtomicBoolean(false);

    /* renamed from: a */
    public final int f16835a = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f16831e = i10 < 29;
        f16832f = i10 >= 28;
        f16833g = new File("/proc/self/fd");
    }

    /* renamed from: b */
    public static C9647t m16016b() {
        if (f16834h == null) {
            synchronized (C9647t.class) {
                try {
                    if (f16834h == null) {
                        f16834h = new C9647t();
                    }
                } finally {
                }
            }
        }
        return f16834h;
    }

    /* renamed from: e */
    public static boolean m16017e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m16018a() {
        return f16831e && !this.f16838d.get();
    }

    /* renamed from: c */
    public final int m16019c() {
        if (m16017e()) {
            return 500;
        }
        return this.f16835a;
    }

    /* renamed from: d */
    public final synchronized boolean m16020d() {
        try {
            boolean z9 = true;
            int i10 = this.f16836b + 1;
            this.f16836b = i10;
            if (i10 >= 50) {
                this.f16836b = 0;
                int length = f16833g.list().length;
                long jM16019c = m16019c();
                if (length >= jM16019c) {
                    z9 = false;
                }
                this.f16837c = z9;
                if (!z9 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jM16019c);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f16837c;
    }

    /* renamed from: f */
    public boolean m16021f(int i10, int i11, boolean z9, boolean z10) {
        if (!z9) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!f16832f) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (m16018a()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z10) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (m16020d()) {
            return true;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }

    /* renamed from: g */
    public boolean m16022g(int i10, int i11, BitmapFactory.Options options, boolean z9, boolean z10) {
        boolean zM16021f = m16021f(i10, i11, z9, z10);
        if (zM16021f) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zM16021f;
    }

    /* renamed from: h */
    public void m16023h() {
        AbstractC7652k.m12685a();
        this.f16838d.set(true);
    }
}
