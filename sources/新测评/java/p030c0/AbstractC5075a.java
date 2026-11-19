package p030c0;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: c0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5075a {
    /* renamed from: a */
    public static final int m2662a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                return bitmap.getWidth() * bitmap.getHeight() * m2663b(bitmap.getConfig());
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    /* renamed from: b */
    public static final int m2663b(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
    }

    /* renamed from: c */
    public static final Bitmap.Config m2664c(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    /* renamed from: d */
    public static final boolean m2665d(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    /* renamed from: e */
    public static final Bitmap.Config m2666e(Bitmap.Config config) {
        return (config == null || m2665d(config)) ? Bitmap.Config.ARGB_8888 : config;
    }
}
