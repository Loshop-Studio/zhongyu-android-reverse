package p090e0;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: e0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7803a {
    /* renamed from: a */
    public static final int m12170a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                return bitmap.getWidth() * bitmap.getHeight() * m12171b(bitmap.getConfig());
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    /* renamed from: b */
    public static final int m12171b(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
    }

    /* renamed from: c */
    public static final Bitmap.Config m12172c(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    /* renamed from: d */
    public static final boolean m12173d(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    /* renamed from: e */
    public static final Bitmap.Config m12174e(Bitmap.Config config) {
        return (config == null || m12173d(config)) ? Bitmap.Config.ARGB_8888 : config;
    }
}
