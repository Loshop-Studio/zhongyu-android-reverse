package p180v0;

import android.graphics.Bitmap;

/* renamed from: v0.j */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6663j {

    /* renamed from: a */
    public static final /* synthetic */ int[] f11242a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f11242a = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11242a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11242a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11242a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f11242a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
