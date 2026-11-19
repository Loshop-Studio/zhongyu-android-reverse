package coil3.decode;

import coil3.size.Scale;

/* renamed from: coil3.decode.h */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3267h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f1903a;

    static {
        int[] iArr = new int[Scale.values().length];
        try {
            iArr[Scale.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Scale.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f1903a = iArr;
    }
}
