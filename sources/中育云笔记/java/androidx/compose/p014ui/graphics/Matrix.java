package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.geometry.MutableRect;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10812s;

/* loaded from: classes2.dex */
public final class Matrix {
    public static final Companion Companion = new Companion(null);
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    private final float[] values;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m31106boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m31107constructorimpl(float[] fArr) {
        return fArr;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m31108constructorimpl$default(float[] fArr, int i10, AbstractC9972n abstractC9972n) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m31107constructorimpl(fArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31109equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && AbstractC9979u.m20289b(fArr, ((Matrix) obj).m31131unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31110equalsimpl0(float[] fArr, float[] fArr2) {
        return AbstractC9979u.m20289b(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m31111getimpl(float[] fArr, int i10, int i11) {
        return fArr[(i10 * 4) + i11];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31112hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl, reason: not valid java name */
    public static final void m31113invertimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (((((f26 * f37) - (f27 * f36)) + (f28 * f35)) + (f29 * f34)) - (f30 * f33)) + (f31 * f32);
        if (f38 == 0.0f) {
            return;
        }
        float f39 = 1.0f / f38;
        fArr[0] = (((f15 * f37) - (f16 * f36)) + (f17 * f35)) * f39;
        fArr[1] = ((((-f11) * f37) + (f12 * f36)) - (f13 * f35)) * f39;
        fArr[2] = (((f23 * f31) - (f24 * f30)) + (f25 * f29)) * f39;
        fArr[3] = ((((-f19) * f31) + (f20 * f30)) - (f21 * f29)) * f39;
        float f40 = -f14;
        fArr[4] = (((f40 * f37) + (f16 * f34)) - (f17 * f33)) * f39;
        fArr[5] = (((f37 * f10) - (f12 * f34)) + (f13 * f33)) * f39;
        float f41 = -f22;
        fArr[6] = (((f41 * f31) + (f24 * f28)) - (f25 * f27)) * f39;
        fArr[7] = (((f31 * f18) - (f20 * f28)) + (f21 * f27)) * f39;
        fArr[8] = (((f14 * f36) - (f15 * f34)) + (f17 * f32)) * f39;
        fArr[9] = ((((-f10) * f36) + (f34 * f11)) - (f13 * f32)) * f39;
        fArr[10] = (((f22 * f30) - (f23 * f28)) + (f25 * f26)) * f39;
        fArr[11] = ((((-f18) * f30) + (f28 * f19)) - (f21 * f26)) * f39;
        fArr[12] = (((f40 * f35) + (f15 * f33)) - (f16 * f32)) * f39;
        fArr[13] = (((f10 * f35) - (f11 * f33)) + (f12 * f32)) * f39;
        fArr[14] = (((f41 * f29) + (f23 * f27)) - (f24 * f26)) * f39;
        fArr[15] = (((f18 * f29) - (f19 * f27)) + (f20 * f26)) * f39;
    }

    /* renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m31114mapMKHz9U(float[] fArr, long j10) {
        if (fArr.length < 16) {
            return j10;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float f19 = 1 / (((f12 * fIntBitsToFloat) + (f15 * fIntBitsToFloat2)) + f18);
        if ((Float.floatToRawIntBits(f19) & Integer.MAX_VALUE) >= 2139095040) {
            f19 = 0.0f;
        }
        float f20 = ((f10 * fIntBitsToFloat) + (f13 * fIntBitsToFloat2) + f16) * f19;
        float f21 = f19 * ((f11 * fIntBitsToFloat) + (f14 * fIntBitsToFloat2) + f17);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f20) << 32) | (Float.floatToRawIntBits(f21) & 4294967295L));
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final Rect m31115mapimpl(float[] fArr, Rect rect) {
        if (fArr.length < 16) {
            return rect;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float left = rect.getLeft();
        float top2 = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        float f19 = f12 * left;
        float f20 = f15 * top2;
        float f21 = 1.0f / ((f19 + f20) + f18);
        if ((Float.floatToRawIntBits(f21) & Integer.MAX_VALUE) >= 2139095040) {
            f21 = 0.0f;
        }
        float f22 = f10 * left;
        float f23 = f13 * top2;
        float f24 = f21 * (f22 + f23 + f16);
        float f25 = left * f11;
        float f26 = top2 * f14;
        float f27 = f21 * (f25 + f26 + f17);
        float f28 = f15 * bottom;
        float f29 = 1.0f / ((f19 + f28) + f18);
        if ((Float.floatToRawIntBits(f29) & Integer.MAX_VALUE) >= 2139095040) {
            f29 = 0.0f;
        }
        float f30 = f13 * bottom;
        float f31 = (f22 + f30 + f16) * f29;
        float f32 = f14 * bottom;
        float f33 = f29 * (f25 + f32 + f17);
        float f34 = f12 * right;
        float f35 = 1.0f / ((f20 + f34) + f18);
        if ((Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) >= 2139095040) {
            f35 = 0.0f;
        }
        float f36 = f10 * right;
        float f37 = f35 * (f36 + f23 + f16);
        float f38 = right * f11;
        float f39 = f35 * (f26 + f38 + f17);
        float f40 = 1.0f / ((f34 + f28) + f18);
        float f41 = (Float.floatToRawIntBits(f40) & Integer.MAX_VALUE) < 2139095040 ? f40 : 0.0f;
        float f42 = (f36 + f30 + f16) * f41;
        float f43 = f41 * (f38 + f32 + f17);
        return new Rect(Math.min(f24, Math.min(f31, Math.min(f37, f42))), Math.min(f27, Math.min(f33, Math.min(f39, f43))), Math.max(f24, Math.max(f31, Math.max(f37, f42))), Math.max(f27, Math.max(f33, Math.max(f39, f43))));
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m31117resetimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl, reason: not valid java name */
    public static final void m31118resetToPivotedTransformimpl(float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20) {
        double d10 = f15 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f21 = -fSin;
        float f22 = (f13 * fCos) - (f14 * fSin);
        float f23 = (f13 * fSin) + (f14 * fCos);
        double d11 = f16 * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d11);
        float fCos2 = (float) Math.cos(d11);
        float f24 = -fSin2;
        float f25 = fSin * fSin2;
        float f26 = fSin * fCos2;
        float f27 = fCos * fSin2;
        float f28 = fCos * fCos2;
        float f29 = (f12 * fCos2) + (f23 * fSin2);
        float f30 = ((-f12) * fSin2) + (f23 * fCos2);
        double d12 = f17 * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d12);
        float fCos3 = (float) Math.cos(d12);
        float f31 = -fSin3;
        float f32 = (f31 * fCos2) + (fCos3 * f25);
        float f33 = fCos * fCos3;
        float f34 = (f31 * f24) + (fCos3 * f26);
        float f35 = ((fCos2 * fCos3) + (f25 * fSin3)) * f18;
        float f36 = fSin3 * fCos * f18;
        float f37 = ((fCos3 * f24) + (fSin3 * f26)) * f18;
        float f38 = f32 * f19;
        float f39 = f33 * f19;
        float f40 = f34 * f19;
        float f41 = f27 * f20;
        float f42 = f21 * f20;
        float f43 = f28 * f20;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f35;
        fArr[1] = f36;
        fArr[2] = f37;
        fArr[3] = 0.0f;
        fArr[4] = f38;
        fArr[5] = f39;
        fArr[6] = f40;
        fArr[7] = 0.0f;
        fArr[8] = f41;
        fArr[9] = f42;
        fArr[10] = f43;
        fArr[11] = 0.0f;
        float f44 = -f10;
        fArr[12] = ((f35 * f44) - (f38 * f11)) + f29 + f10;
        fArr[13] = ((f36 * f44) - (f39 * f11)) + f22 + f11;
        fArr[14] = ((f44 * f37) - (f11 * f40)) + f30;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl$default, reason: not valid java name */
    public static /* synthetic */ void m31119resetToPivotedTransformimpl$default(float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        if ((i10 & 16) != 0) {
            f14 = 0.0f;
        }
        if ((i10 & 32) != 0) {
            f15 = 0.0f;
        }
        if ((i10 & 64) != 0) {
            f16 = 0.0f;
        }
        if ((i10 & 128) != 0) {
            f17 = 0.0f;
        }
        if ((i10 & 256) != 0) {
            f18 = 1.0f;
        }
        if ((i10 & 512) != 0) {
            f19 = 1.0f;
        }
        if ((i10 & 1024) != 0) {
            f20 = 1.0f;
        }
        m31118resetToPivotedTransformimpl(fArr, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20);
    }

    /* renamed from: rotateX-impl, reason: not valid java name */
    public static final void m31120rotateXimpl(float[] fArr, float f10) {
        if (fArr.length < 16) {
            return;
        }
        double d10 = f10 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[13];
        float f18 = fArr[14];
        fArr[1] = (f11 * fCos) - (f12 * fSin);
        fArr[2] = (f11 * fSin) + (f12 * fCos);
        fArr[5] = (f13 * fCos) - (f14 * fSin);
        fArr[6] = (f13 * fSin) + (f14 * fCos);
        fArr[9] = (f15 * fCos) - (f16 * fSin);
        fArr[10] = (f15 * fSin) + (f16 * fCos);
        fArr[13] = (f17 * fCos) - (f18 * fSin);
        fArr[14] = (f17 * fSin) + (f18 * fCos);
    }

    /* renamed from: rotateY-impl, reason: not valid java name */
    public static final void m31121rotateYimpl(float[] fArr, float f10) {
        if (fArr.length < 16) {
            return;
        }
        double d10 = f10 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f11 = fArr[0];
        float f12 = fArr[2];
        float f13 = fArr[4];
        float f14 = fArr[6];
        float f15 = fArr[8];
        float f16 = fArr[10];
        float f17 = fArr[12];
        float f18 = fArr[14];
        fArr[0] = (f11 * fCos) + (f12 * fSin);
        fArr[2] = ((-f11) * fSin) + (f12 * fCos);
        fArr[4] = (f13 * fCos) + (f14 * fSin);
        fArr[6] = ((-f13) * fSin) + (f14 * fCos);
        fArr[8] = (f15 * fCos) + (f16 * fSin);
        fArr[10] = ((-f15) * fSin) + (f16 * fCos);
        fArr[12] = (f17 * fCos) + (f18 * fSin);
        fArr[14] = ((-f17) * fSin) + (f18 * fCos);
    }

    /* renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m31122rotateZimpl(float[] fArr, float f10) {
        if (fArr.length < 16) {
            return;
        }
        double d10 = f10 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = -fSin;
        float f14 = fArr[1];
        float f15 = fArr[5];
        float f16 = fArr[2];
        float f17 = fArr[6];
        float f18 = fArr[3];
        float f19 = fArr[7];
        fArr[0] = (fCos * f11) + (fSin * f12);
        fArr[1] = (fCos * f14) + (fSin * f15);
        fArr[2] = (fCos * f16) + (fSin * f17);
        fArr[3] = (fCos * f18) + (fSin * f19);
        fArr[4] = (f11 * f13) + (f12 * fCos);
        fArr[5] = (f14 * f13) + (f15 * fCos);
        fArr[6] = (f16 * f13) + (f17 * fCos);
        fArr[7] = (f13 * f18) + (fCos * f19);
    }

    /* renamed from: scale-impl, reason: not valid java name */
    public static final void m31123scaleimpl(float[] fArr, float f10, float f11, float f12) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    /* renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m31124scaleimpl$default(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 1.0f;
        }
        m31123scaleimpl(fArr, f10, f11, f12);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m31125setimpl(float[] fArr, int i10, int i11, float f10) {
        fArr[(i10 * 4) + i11] = f10;
    }

    /* renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m31126setFrom58bKbWc(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
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
        }
    }

    /* renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m31127timesAssign58bKbWc(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[4];
            float f14 = fArr[2];
            float f15 = fArr2[8];
            float f16 = fArr[3];
            float f17 = fArr2[12];
            float f18 = (f10 * f11) + (f12 * f13) + (f14 * f15) + (f16 * f17);
            float f19 = fArr2[1];
            float f20 = fArr2[5];
            float f21 = fArr2[9];
            float f22 = fArr2[13];
            float f23 = (f10 * f19) + (f12 * f20) + (f14 * f21) + (f16 * f22);
            float f24 = fArr2[2];
            float f25 = fArr2[6];
            float f26 = fArr2[10];
            float f27 = fArr2[14];
            float f28 = (f10 * f24) + (f12 * f25) + (f14 * f26) + (f16 * f27);
            float f29 = fArr2[3];
            float f30 = fArr2[7];
            float f31 = fArr2[11];
            float f32 = fArr2[15];
            float f33 = (f10 * f29) + (f12 * f30) + (f14 * f31) + (f16 * f32);
            float f34 = fArr[4];
            float f35 = fArr[5];
            float f36 = fArr[6];
            float f37 = fArr[7];
            float f38 = (f34 * f11) + (f35 * f13) + (f36 * f15) + (f37 * f17);
            float f39 = (f34 * f19) + (f35 * f20) + (f36 * f21) + (f37 * f22);
            float f40 = (f34 * f24) + (f35 * f25) + (f36 * f26) + (f37 * f27);
            float f41 = (f34 * f29) + (f35 * f30) + (f36 * f31) + (f37 * f32);
            float f42 = fArr[8];
            float f43 = fArr[9];
            float f44 = fArr[10];
            float f45 = fArr[11];
            float f46 = (f42 * f11) + (f43 * f13) + (f44 * f15) + (f45 * f17);
            float f47 = (f42 * f19) + (f43 * f20) + (f44 * f21) + (f45 * f22);
            float f48 = (f42 * f24) + (f43 * f25) + (f44 * f26) + (f45 * f27);
            float f49 = (f42 * f29) + (f43 * f30) + (f44 * f31) + (f45 * f32);
            float f50 = fArr[12];
            float f51 = fArr[13];
            float f52 = (f11 * f50) + (f13 * f51);
            float f53 = fArr[14];
            float f54 = f52 + (f15 * f53);
            float f55 = fArr[15];
            fArr[0] = f18;
            fArr[1] = f23;
            fArr[2] = f28;
            fArr[3] = f33;
            fArr[4] = f38;
            fArr[5] = f39;
            fArr[6] = f40;
            fArr[7] = f41;
            fArr[8] = f46;
            fArr[9] = f47;
            fArr[10] = f48;
            fArr[11] = f49;
            fArr[12] = f54 + (f17 * f55);
            fArr[13] = (f19 * f50) + (f20 * f51) + (f21 * f53) + (f22 * f55);
            fArr[14] = (f24 * f50) + (f25 * f51) + (f26 * f53) + (f27 * f55);
            fArr[15] = (f50 * f29) + (f51 * f30) + (f53 * f31) + (f55 * f32);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31128toStringimpl(float[] fArr) {
        return AbstractC10812s.m23221n("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: translate-impl, reason: not valid java name */
    public static final void m31129translateimpl(float[] fArr, float f10, float f11, float f12) {
        if (fArr.length < 16) {
            return;
        }
        float f13 = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
        float f14 = (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12) + fArr[13];
        float f15 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
        float f16 = (fArr[3] * f10) + (fArr[7] * f11) + (fArr[11] * f12) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    /* renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m31130translateimpl$default(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        m31129translateimpl(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return m31109equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m31112hashCodeimpl(this.values);
    }

    public String toString() {
        return m31128toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m31131unboximpl() {
        return this.values;
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final void m31116mapimpl(float[] fArr, MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float left = mutableRect.getLeft();
        float top2 = mutableRect.getTop();
        float right = mutableRect.getRight();
        float bottom = mutableRect.getBottom();
        float f19 = f12 * left;
        float f20 = f15 * top2;
        float f21 = 1.0f / ((f19 + f20) + f18);
        if ((Float.floatToRawIntBits(f21) & Integer.MAX_VALUE) >= 2139095040) {
            f21 = 0.0f;
        }
        float f22 = f10 * left;
        float f23 = f13 * top2;
        float f24 = f21 * (f22 + f23 + f16);
        float f25 = left * f11;
        float f26 = top2 * f14;
        float f27 = f21 * (f25 + f26 + f17);
        float f28 = f15 * bottom;
        float f29 = 1.0f / ((f19 + f28) + f18);
        if ((Float.floatToRawIntBits(f29) & Integer.MAX_VALUE) >= 2139095040) {
            f29 = 0.0f;
        }
        float f30 = f13 * bottom;
        float f31 = (f22 + f30 + f16) * f29;
        float f32 = f14 * bottom;
        float f33 = f29 * (f25 + f32 + f17);
        float f34 = f12 * right;
        float f35 = 1.0f / ((f20 + f34) + f18);
        if ((Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) >= 2139095040) {
            f35 = 0.0f;
        }
        float f36 = f10 * right;
        float f37 = f35 * (f36 + f23 + f16);
        float f38 = right * f11;
        float f39 = f35 * (f26 + f38 + f17);
        float f40 = 1.0f / ((f34 + f28) + f18);
        float f41 = (Float.floatToRawIntBits(f40) & Integer.MAX_VALUE) < 2139095040 ? f40 : 0.0f;
        float f42 = (f36 + f30 + f16) * f41;
        float f43 = f41 * (f38 + f32 + f17);
        mutableRect.setLeft(Math.min(f24, Math.min(f31, Math.min(f37, f42))));
        mutableRect.setTop(Math.min(f27, Math.min(f33, Math.min(f39, f43))));
        mutableRect.setRight(Math.max(f24, Math.max(f31, Math.max(f37, f42))));
        mutableRect.setBottom(Math.max(f27, Math.max(f33, Math.max(f39, f43))));
    }
}
