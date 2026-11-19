package p140q;

import coil3.size.Precision;
import coil3.size.Scale;

/* renamed from: q.c */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6399c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f10498a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f10499b;

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
        f10498a = iArr;
        int[] iArr2 = new int[Precision.values().length];
        try {
            iArr2[Precision.EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[Precision.INEXACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f10499b = iArr2;
    }
}
