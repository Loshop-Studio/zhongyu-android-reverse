package p298q0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p109d1.AbstractC8910k;

/* renamed from: q0.s */
/* loaded from: classes3.dex */
public final class C10710s {

    /* renamed from: e */
    public static final boolean f25771e;

    /* renamed from: f */
    public static final boolean f25772f;

    /* renamed from: g */
    public static final File f25773g;

    /* renamed from: h */
    public static volatile C10710s f25774h;

    /* renamed from: b */
    public int f25776b;

    /* renamed from: c */
    public boolean f25777c = true;

    /* renamed from: d */
    public final AtomicBoolean f25778d = new AtomicBoolean(false);

    /* renamed from: a */
    public final int f25775a = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f25771e = i10 < 29;
        f25772f = i10 >= 28;
        f25773g = new File("/proc/self/fd");
    }

    /* renamed from: b */
    public static C10710s m22673b() {
        if (f25774h == null) {
            synchronized (C10710s.class) {
                try {
                    if (f25774h == null) {
                        f25774h = new C10710s();
                    }
                } finally {
                }
            }
        }
        return f25774h;
    }

    /* renamed from: e */
    public static boolean m22674e() {
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
    public final boolean m22675a() {
        return f25771e && !this.f25778d.get();
    }

    /* renamed from: c */
    public final int m22676c() {
        if (m22674e()) {
            return 500;
        }
        return this.f25775a;
    }

    /* renamed from: d */
    public final synchronized boolean m22677d() {
        try {
            boolean z10 = true;
            int i10 = this.f25776b + 1;
            this.f25776b = i10;
            if (i10 >= 50) {
                this.f25776b = 0;
                int length = f25773g.list().length;
                long jM22676c = m22676c();
                if (length >= jM22676c) {
                    z10 = false;
                }
                this.f25777c = z10;
                if (!z10 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jM22676c);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f25777c;
    }

    /* renamed from: f */
    public boolean m22678f(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!f25772f) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (m22675a()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z11) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (m22677d()) {
            return true;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }

    /* renamed from: g */
    public boolean m22679g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zM22678f = m22678f(i10, i11, z10, z11);
        if (zM22678f) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zM22678f;
    }

    /* renamed from: h */
    public void m22680h() {
        AbstractC8910k.m17470a();
        this.f25778d.set(true);
    }
}
