package p228r0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.File;

/* renamed from: r0.s */
/* loaded from: classes3.dex */
public final class C9409s {

    /* renamed from: f */
    public static final File f16398f = new File("/proc/self/fd");

    /* renamed from: g */
    public static volatile C9409s f16399g;

    /* renamed from: b */
    public final int f16401b;

    /* renamed from: c */
    public final int f16402c;

    /* renamed from: d */
    public int f16403d;

    /* renamed from: e */
    public boolean f16404e = true;

    /* renamed from: a */
    public final boolean f16400a = m15479d();

    public C9409s() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f16401b = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
            this.f16402c = 0;
        } else {
            this.f16401b = TypedValues.TransitionType.TYPE_DURATION;
            this.f16402c = 128;
        }
    }

    /* renamed from: a */
    public static C9409s m15478a() {
        if (f16399g == null) {
            synchronized (C9409s.class) {
                try {
                    if (f16399g == null) {
                        f16399g = new C9409s();
                    }
                } finally {
                }
            }
        }
        return f16399g;
    }

    /* renamed from: d */
    public static boolean m15479d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String strSubstring = str.substring(0, 7);
        strSubstring.getClass();
        switch (strSubstring) {
            case "SM-A520":
            case "SM-G930":
            case "SM-G935":
            case "SM-G960":
            case "SM-G965":
            case "SM-J720":
            case "SM-N935":
                if (Build.VERSION.SDK_INT != 26) {
                }
                break;
        }
        return true;
    }

    /* renamed from: b */
    public final synchronized boolean m15480b() {
        try {
            boolean z9 = true;
            int i9 = this.f16403d + 1;
            this.f16403d = i9;
            if (i9 >= 50) {
                this.f16403d = 0;
                int length = f16398f.list().length;
                if (length >= this.f16401b) {
                    z9 = false;
                }
                this.f16404e = z9;
                if (!z9 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f16401b);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f16404e;
    }

    /* renamed from: c */
    public boolean m15481c(int i9, int i10, boolean z9, boolean z10) {
        int i11;
        return z9 && this.f16400a && Build.VERSION.SDK_INT >= 26 && !z10 && i9 >= (i11 = this.f16402c) && i10 >= i11 && m15480b();
    }

    /* renamed from: e */
    public boolean m15482e(int i9, int i10, BitmapFactory.Options options, boolean z9, boolean z10) {
        boolean zM15481c = m15481c(i9, i10, z9, z10);
        if (zM15481c) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zM15481c;
    }
}
