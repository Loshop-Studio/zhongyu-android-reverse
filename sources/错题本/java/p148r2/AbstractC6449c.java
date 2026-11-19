package p148r2;

import android.widget.ImageView;

/* renamed from: r2.c */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC6449c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f10587a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        f10587a = iArr;
        try {
            iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10587a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10587a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10587a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f10587a[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
