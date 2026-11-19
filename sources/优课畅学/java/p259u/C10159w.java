package p259u;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p116h0.AbstractC8707k;

/* renamed from: u.w */
/* loaded from: classes3.dex */
public final class C10159w {

    /* renamed from: e */
    public static final boolean f20276e;

    /* renamed from: f */
    public static final boolean f20277f;

    /* renamed from: g */
    public static final File f20278g;

    /* renamed from: h */
    public static volatile C10159w f20279h;

    /* renamed from: b */
    public int f20281b;

    /* renamed from: c */
    public boolean f20282c = true;

    /* renamed from: d */
    public final AtomicBoolean f20283d = new AtomicBoolean(false);

    /* renamed from: a */
    public final int f20280a = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f20276e = i10 < 29;
        f20277f = i10 >= 28;
        f20278g = new File("/proc/self/fd");
    }

    /* renamed from: b */
    public static C10159w m19013b() {
        if (f20279h == null) {
            synchronized (C10159w.class) {
                try {
                    if (f20279h == null) {
                        f20279h = new C10159w();
                    }
                } finally {
                }
            }
        }
        return f20279h;
    }

    /* renamed from: e */
    public static boolean m19014e() {
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
    public final boolean m19015a() {
        return f20276e && !this.f20283d.get();
    }

    /* renamed from: c */
    public final int m19016c() {
        return m19014e() ? TbsListener.ErrorCode.INFO_CODE_MINIQB : this.f20280a;
    }

    /* renamed from: d */
    public final synchronized boolean m19017d() {
        try {
            boolean z10 = true;
            int i10 = this.f20281b + 1;
            this.f20281b = i10;
            if (i10 >= 50) {
                this.f20281b = 0;
                int length = f20278g.list().length;
                long jM19016c = m19016c();
                if (length >= jM19016c) {
                    z10 = false;
                }
                this.f20282c = z10;
                if (!z10 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jM19016c);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20282c;
    }

    /* renamed from: f */
    public boolean m19018f(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!f20277f) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (m19015a()) {
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
        if (m19017d()) {
            return true;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }

    /* renamed from: g */
    public boolean m19019g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zM19018f = m19018f(i10, i11, z10, z11);
        if (zM19018f) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zM19018f;
    }

    /* renamed from: h */
    public void m19020h() {
        AbstractC8707k.m14183a();
        this.f20283d.set(true);
    }
}
