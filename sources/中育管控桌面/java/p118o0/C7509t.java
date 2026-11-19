package p118o0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p016b1.AbstractC4409k;

/* renamed from: o0.t */
/* loaded from: classes3.dex */
public final class C7509t {

    /* renamed from: e */
    public static final boolean f9688e;

    /* renamed from: f */
    public static final boolean f9689f;

    /* renamed from: g */
    public static final File f9690g;

    /* renamed from: h */
    public static volatile C7509t f9691h;

    /* renamed from: b */
    public int f9693b;

    /* renamed from: c */
    public boolean f9694c = true;

    /* renamed from: d */
    public final AtomicBoolean f9695d = new AtomicBoolean(false);

    /* renamed from: a */
    public final int f9692a = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;

    static {
        int i6 = Build.VERSION.SDK_INT;
        f9688e = i6 < 29;
        f9689f = i6 >= 28;
        f9690g = new File("/proc/self/fd");
    }

    /* renamed from: b */
    public static C7509t m8633b() {
        if (f9691h == null) {
            synchronized (C7509t.class) {
                try {
                    if (f9691h == null) {
                        f9691h = new C7509t();
                    }
                } finally {
                }
            }
        }
        return f9691h;
    }

    /* renamed from: e */
    public static boolean m8634e() {
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
    public final boolean m8635a() {
        return f9688e && !this.f9695d.get();
    }

    /* renamed from: c */
    public final int m8636c() {
        if (m8634e()) {
            return 500;
        }
        return this.f9692a;
    }

    /* renamed from: d */
    public final synchronized boolean m8637d() {
        try {
            boolean z6 = true;
            int i6 = this.f9693b + 1;
            this.f9693b = i6;
            if (i6 >= 50) {
                this.f9693b = 0;
                int length = f9690g.list().length;
                long jM8636c = m8636c();
                if (length >= jM8636c) {
                    z6 = false;
                }
                this.f9694c = z6;
                if (!z6 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jM8636c);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9694c;
    }

    /* renamed from: f */
    public boolean m8638f(int i6, int i7, boolean z6, boolean z7) {
        if (!z6) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!f9689f) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (m8635a()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z7) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i6 < 0 || i7 < 0) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (m8637d()) {
            return true;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }

    /* renamed from: g */
    public boolean m8639g(int i6, int i7, BitmapFactory.Options options, boolean z6, boolean z7) {
        boolean zM8638f = m8638f(i6, i7, z6, z7);
        if (zM8638f) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zM8638f;
    }

    /* renamed from: h */
    public void m8640h() {
        AbstractC4409k.m1440a();
        this.f9695d.set(true);
    }
}
