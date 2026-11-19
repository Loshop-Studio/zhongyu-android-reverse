package com.tencent.liteav.basic.p048c;

/* renamed from: com.tencent.liteav.basic.c.i */
/* loaded from: classes4.dex */
public class C6568i {

    /* renamed from: a */
    public static final float[] f5279a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: b */
    public static final float[] f5280b = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: c */
    public static final float[] f5281c = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: d */
    public static final float[] f5282d = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: e */
    public static final float[] f5283e = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: com.tencent.liteav.basic.c.i$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5284a;

        static {
            int[] iArr = new int[EnumC6567h.values().length];
            f5284a = iArr;
            try {
                iArr[EnumC6567h.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5284a[EnumC6567h.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5284a[EnumC6567h.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5284a[EnumC6567h.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    private static float m4865a(float f10) {
        return f10 == 0.0f ? 1.0f : 0.0f;
    }

    /* renamed from: a */
    public static float[] m4866a(EnumC6567h enumC6567h, boolean z10, boolean z11) {
        int i10 = AnonymousClass1.f5284a[enumC6567h.ordinal()];
        float[] fArr = i10 != 1 ? i10 != 2 ? i10 != 3 ? (float[]) f5279a.clone() : (float[]) f5282d.clone() : (float[]) f5281c.clone() : (float[]) f5280b.clone();
        if (z10) {
            fArr = new float[]{m4865a(fArr[0]), fArr[1], m4865a(fArr[2]), fArr[3], m4865a(fArr[4]), fArr[5], m4865a(fArr[6]), fArr[7]};
        }
        return z11 ? new float[]{fArr[0], m4865a(fArr[1]), fArr[2], m4865a(fArr[3]), fArr[4], m4865a(fArr[5]), fArr[6], m4865a(fArr[7])} : fArr;
    }
}
