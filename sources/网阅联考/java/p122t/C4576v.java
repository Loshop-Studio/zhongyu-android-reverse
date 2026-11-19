package p122t;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.File;

/* renamed from: t.v */
/* loaded from: classes2.dex */
public final class C4576v {

    /* renamed from: f */
    public static final File f5748f = new File("/proc/self/fd");

    /* renamed from: g */
    public static volatile C4576v f5749g;

    /* renamed from: b */
    public final int f5751b;

    /* renamed from: c */
    public final int f5752c;

    /* renamed from: d */
    public int f5753d;

    /* renamed from: e */
    public boolean f5754e = true;

    /* renamed from: a */
    public final boolean f5750a = m6298d();

    public C4576v() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5751b = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
            this.f5752c = 0;
        } else {
            this.f5751b = 700;
            this.f5752c = 128;
        }
    }

    /* renamed from: a */
    public static C4576v m6297a() {
        if (f5749g == null) {
            synchronized (C4576v.class) {
                if (f5749g == null) {
                    f5749g = new C4576v();
                }
            }
        }
        return f5749g;
    }

    /* renamed from: d */
    public static boolean m6298d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String strSubstring = str.substring(0, 7);
        strSubstring.hashCode();
        switch (strSubstring) {
            case "SM-A520":
            case "SM-G930":
            case "SM-G935":
            case "SM-G960":
            case "SM-G965":
            case "SM-J720":
            case "SM-N935":
                return Build.VERSION.SDK_INT != 26;
            default:
                return true;
        }
    }

    /* renamed from: b */
    public final synchronized boolean m6299b() {
        boolean z3 = true;
        int i4 = this.f5753d + 1;
        this.f5753d = i4;
        if (i4 >= 50) {
            this.f5753d = 0;
            int length = f5748f.list().length;
            if (length >= this.f5751b) {
                z3 = false;
            }
            this.f5754e = z3;
            if (!z3 && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f5751b);
            }
        }
        return this.f5754e;
    }

    /* renamed from: c */
    public boolean m6300c(int i4, int i5, boolean z3, boolean z4) {
        int i6;
        return z3 && this.f5750a && Build.VERSION.SDK_INT >= 26 && !z4 && i4 >= (i6 = this.f5752c) && i5 >= i6 && m6299b();
    }

    /* renamed from: e */
    public boolean m6301e(int i4, int i5, BitmapFactory.Options options, boolean z3, boolean z4) {
        boolean zM6300c = m6300c(i4, i5, z3, z4);
        if (zM6300c) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zM6300c;
    }
}
