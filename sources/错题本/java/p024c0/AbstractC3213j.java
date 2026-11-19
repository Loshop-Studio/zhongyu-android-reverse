package p024c0;

import android.graphics.Bitmap;

/* renamed from: c0.j */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3213j {

    /* renamed from: a */
    public static final /* synthetic */ int[] f1766a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f1766a = iArr;
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1766a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1766a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f1766a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
