package kotlin.jvm.internal;

import kotlin.reflect.KVariance;

/* renamed from: kotlin.jvm.internal.q */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5836q {

    /* renamed from: a */
    public static final /* synthetic */ int[] f9225a;

    static {
        int[] iArr = new int[KVariance.values().length];
        try {
            iArr[KVariance.INVARIANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KVariance.f9228IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KVariance.OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f9225a = iArr;
    }
}
