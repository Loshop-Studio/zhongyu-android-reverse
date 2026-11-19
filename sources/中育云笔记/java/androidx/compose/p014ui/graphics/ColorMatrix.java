package androidx.compose.p014ui.graphics;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public final class ColorMatrix {
    private final float[] values;

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m30933boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m30934constructorimpl(float[] fArr) {
        return fArr;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m30935constructorimpl$default(float[] fArr, int i10, AbstractC9972n abstractC9972n) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m30934constructorimpl(fArr);
    }

    /* renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m30936convertRgbToYuvimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m30937convertYuvToRgbimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30938equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && AbstractC9979u.m20289b(fArr, ((ColorMatrix) obj).m30953unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30939equalsimpl0(float[] fArr, float[] fArr2) {
        return AbstractC9979u.m20289b(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m30940getimpl(float[] fArr, int i10, int i11) {
        return fArr[(i10 * 5) + i11];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30941hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m30942resetimpl(float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
    }

    /* renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m30943rotateInternalimpl(float[] fArr, float f10, InterfaceC9544p interfaceC9544p) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f11 = f10 * 0.0027777778f;
        float fFloor = (0.25f + f11) - ((float) Math.floor(r8 + 0.5f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f12 = 1.0f - fAbs;
        float fFloor2 = f11 - ((float) Math.floor(0.5f + f11));
        float fAbs2 = Math.abs(fFloor2) * 2.0f;
        float f13 = 1.0f - fAbs2;
        interfaceC9544p.invoke(Float.valueOf(((fFloor * 8.0f) * f12) / (1.25f - (fAbs * f12))), Float.valueOf(((fFloor2 * 8.0f) * f13) / (1.25f - (fAbs2 * f13))));
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m30944setimpl(float[] fArr, int i10, int i11, float f10) {
        fArr[(i10 * 5) + i11] = f10;
    }

    /* renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m30945setjHGOpc(float[] fArr, float[] fArr2) {
        if (fArr.length >= 20 && fArr2.length >= 20) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
            fArr[8] = fArr2[8];
            fArr[9] = fArr2[9];
            fArr[10] = fArr2[10];
            fArr[11] = fArr2[11];
            fArr[12] = fArr2[12];
            fArr[13] = fArr2[13];
            fArr[14] = fArr2[14];
            fArr[15] = fArr2[15];
            fArr[16] = fArr2[16];
            fArr[17] = fArr2[17];
            fArr[18] = fArr2[18];
            fArr[19] = fArr2[19];
        }
    }

    /* renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m30946setToRotateBlueimpl(float[] fArr, float f10) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f11 = f10 * 0.0027777778f;
        float fFloor = (0.25f + f11) - ((float) Math.floor(r3 + 0.5f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f12 = 1.0f - fAbs;
        float f13 = ((fFloor * 8.0f) * f12) / (1.25f - (fAbs * f12));
        float fFloor2 = f11 - ((float) Math.floor(0.5f + f11));
        float fAbs2 = Math.abs(fFloor2) * 2.0f;
        float f14 = 1.0f - fAbs2;
        float f15 = ((fFloor2 * 8.0f) * f14) / (1.25f - (fAbs2 * f14));
        fArr[0] = f13;
        fArr[1] = f15;
        fArr[5] = -f15;
        fArr[6] = f13;
    }

    /* renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m30947setToRotateGreenimpl(float[] fArr, float f10) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f11 = f10 * 0.0027777778f;
        float fFloor = (0.25f + f11) - ((float) Math.floor(r3 + 0.5f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f12 = 1.0f - fAbs;
        float f13 = ((fFloor * 8.0f) * f12) / (1.25f - (fAbs * f12));
        float fFloor2 = f11 - ((float) Math.floor(0.5f + f11));
        float fAbs2 = Math.abs(fFloor2) * 2.0f;
        float f14 = 1.0f - fAbs2;
        float f15 = ((fFloor2 * 8.0f) * f14) / (1.25f - (fAbs2 * f14));
        fArr[0] = f13;
        fArr[2] = -f15;
        fArr[10] = f15;
        fArr[12] = f13;
    }

    /* renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m30948setToRotateRedimpl(float[] fArr, float f10) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f11 = f10 * 0.0027777778f;
        float fFloor = (0.25f + f11) - ((float) Math.floor(r2 + 0.5f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f12 = 1.0f - fAbs;
        float f13 = ((fFloor * 8.0f) * f12) / (1.25f - (fAbs * f12));
        float fFloor2 = f11 - ((float) Math.floor(0.5f + f11));
        float fAbs2 = Math.abs(fFloor2) * 2.0f;
        float f14 = 1.0f - fAbs2;
        float f15 = ((fFloor2 * 8.0f) * f14) / (1.25f - (fAbs2 * f14));
        fArr[6] = f13;
        fArr[7] = f15;
        fArr[11] = -f15;
        fArr[12] = f13;
    }

    /* renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m30949setToSaturationimpl(float[] fArr, float f10) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f11 = 1 - f10;
        float f12 = 0.213f * f11;
        float f13 = 0.715f * f11;
        float f14 = f11 * 0.072f;
        fArr[0] = f12 + f10;
        fArr[1] = f13;
        fArr[2] = f14;
        fArr[5] = f12;
        fArr[6] = f13 + f10;
        fArr[7] = f14;
        fArr[10] = f12;
        fArr[11] = f13;
        fArr[12] = f14 + f10;
    }

    /* renamed from: setToScale-impl, reason: not valid java name */
    public static final void m30950setToScaleimpl(float[] fArr, float f10, float f11, float f12, float f13) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = f10;
        fArr[6] = f11;
        fArr[12] = f12;
        fArr[18] = f13;
    }

    /* renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m30951timesAssignjHGOpc(float[] fArr, float[] fArr2) {
        if (fArr.length < 20) {
            return;
        }
        float f10 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr[1];
        float f13 = fArr2[5];
        float f14 = fArr[2];
        float f15 = fArr2[10];
        float f16 = fArr[3];
        float f17 = fArr2[15];
        float f18 = (f10 * f11) + (f12 * f13) + (f14 * f15) + (f16 * f17);
        float f19 = fArr2[1];
        float f20 = fArr2[6];
        float f21 = fArr2[11];
        float f22 = fArr2[16];
        float f23 = (f10 * f19) + (f12 * f20) + (f14 * f21) + (f16 * f22);
        float f24 = fArr2[2];
        float f25 = fArr2[7];
        float f26 = fArr2[12];
        float f27 = fArr2[17];
        float f28 = (f10 * f24) + (f12 * f25) + (f14 * f26) + (f16 * f27);
        float f29 = fArr2[3];
        float f30 = fArr2[8];
        float f31 = fArr2[13];
        float f32 = fArr2[18];
        float f33 = (f10 * f29) + (f12 * f30) + (f14 * f31) + (f16 * f32);
        float f34 = fArr2[4];
        float f35 = fArr2[9];
        float f36 = fArr2[14];
        float f37 = fArr2[19];
        float f38 = (f10 * f34) + (f12 * f35) + (f14 * f36) + (f16 * f37) + fArr[4];
        float f39 = fArr[5];
        float f40 = fArr[6];
        float f41 = fArr[7];
        float f42 = fArr[8];
        float f43 = (f39 * f11) + (f40 * f13) + (f41 * f15) + (f42 * f17);
        float f44 = (f39 * f19) + (f40 * f20) + (f41 * f21) + (f42 * f22);
        float f45 = (f39 * f24) + (f40 * f25) + (f41 * f26) + (f42 * f27);
        float f46 = (f39 * f29) + (f40 * f30) + (f41 * f31) + (f42 * f32);
        float f47 = (f39 * f34) + (f40 * f35) + (f41 * f36) + (f42 * f37) + fArr[9];
        float f48 = fArr[10];
        float f49 = fArr[11];
        float f50 = fArr[12];
        float f51 = fArr[13];
        float f52 = (f48 * f11) + (f49 * f13) + (f50 * f15) + (f51 * f17);
        float f53 = (f48 * f19) + (f49 * f20) + (f50 * f21) + (f51 * f22);
        float f54 = (f48 * f24) + (f49 * f25) + (f50 * f26) + (f51 * f27);
        float f55 = (f48 * f29) + (f49 * f30) + (f50 * f31) + (f51 * f32);
        float f56 = (f48 * f34) + (f49 * f35) + (f50 * f36) + (f51 * f37) + fArr[14];
        float f57 = fArr[15];
        float f58 = fArr[16];
        float f59 = (f11 * f57) + (f13 * f58);
        float f60 = fArr[17];
        float f61 = f59 + (f15 * f60);
        float f62 = fArr[18];
        float f63 = (f19 * f57) + (f20 * f58) + (f21 * f60) + (f22 * f62);
        float f64 = (f24 * f57) + (f25 * f58) + (f26 * f60) + (f27 * f62);
        float f65 = (f29 * f57) + (f30 * f58) + (f31 * f60) + (f32 * f62);
        float f66 = (f57 * f34) + (f58 * f35) + (f60 * f36) + (f62 * f37) + fArr[19];
        fArr[0] = f18;
        fArr[1] = f23;
        fArr[2] = f28;
        fArr[3] = f33;
        fArr[4] = f38;
        fArr[5] = f43;
        fArr[6] = f44;
        fArr[7] = f45;
        fArr[8] = f46;
        fArr[9] = f47;
        fArr[10] = f52;
        fArr[11] = f53;
        fArr[12] = f54;
        fArr[13] = f55;
        fArr[14] = f56;
        fArr[15] = f61 + (f17 * f62);
        fArr[16] = f63;
        fArr[17] = f64;
        fArr[18] = f65;
        fArr[19] = f66;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30952toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m30938equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m30941hashCodeimpl(this.values);
    }

    public String toString() {
        return m30952toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m30953unboximpl() {
        return this.values;
    }
}
