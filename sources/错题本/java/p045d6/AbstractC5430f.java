package p045d6;

import kotlin.LazyThreadSafetyMode;

/* renamed from: d6.f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5430f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f8392a;

    static {
        int[] iArr = new int[LazyThreadSafetyMode.values().length];
        try {
            iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f8392a = iArr;
    }
}
