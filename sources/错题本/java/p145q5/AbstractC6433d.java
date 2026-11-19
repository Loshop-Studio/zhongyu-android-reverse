package p145q5;

import io.reactivex.BackpressureStrategy;

/* renamed from: q5.d */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC6433d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f10559a;

    static {
        int[] iArr = new int[BackpressureStrategy.values().length];
        f10559a = iArr;
        try {
            iArr[BackpressureStrategy.DROP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10559a[BackpressureStrategy.LATEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10559a[BackpressureStrategy.MISSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10559a[BackpressureStrategy.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
