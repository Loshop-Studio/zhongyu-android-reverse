package androidx.compose.p013ui.graphics;

import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import com.tencent.smtt.sdk.TbsListener;

/* loaded from: classes2.dex */
public final class Float16Kt {
    private static final int Fp16Combined = 32767;
    private static final int Fp16ExponentBias = 15;
    private static final int Fp16ExponentMask = 31;
    private static final int Fp16ExponentMax = 31744;
    private static final int Fp16ExponentShift = 10;
    private static final int Fp16One = 15360;
    private static final int Fp16SignMask = 32768;
    private static final int Fp16SignShift = 15;
    private static final int Fp16SignificandMask = 1023;
    private static final int Fp16TheNaN = 32256;
    private static final int Fp32ExponentBias = 127;
    private static final int Fp32ExponentMask = 255;
    private static final int Fp32ExponentShift = 23;
    private static final int Fp32QNaNMask = 4194304;
    private static final int Fp32SignShift = 31;
    private static final int Fp32SignificandMask = 8388607;
    private static final int Fp32DenormalMagic = 1056964608;
    private static final float Fp32DenormalFloat = Float.intBitsToFloat(Fp32DenormalMagic);

    public static final short floatToHalf(float f10) {
        int i10;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = Fp32SignificandMask & iFloatToRawIntBits;
        int i14 = 31;
        int i15 = 0;
        if (i12 != 255) {
            int i16 = i12 - 112;
            if (i16 >= 31) {
                i14 = 49;
            } else if (i16 > 0) {
                i15 = i13 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                    return (short) i10;
                }
                i14 = i16;
            } else if (i16 >= -10) {
                int i17 = (8388608 | i13) >> (1 - i16);
                if ((i17 & 4096) != 0) {
                    i17 += 8192;
                }
                i14 = 0;
                i15 = i17 >> 13;
            } else {
                i14 = 0;
            }
        } else if (i13 != 0) {
            i15 = 512;
        }
        i10 = (i11 << 15) | (i14 << 10) | i15;
        return (short) i10;
    }

    public static final float halfToFloat(short s10) {
        int i10;
        int i11;
        int i12;
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + Fp32DenormalMagic) - Fp32DenormalFloat;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m24421maxAoSsdG0(short s10, short s11) {
        return (Float16.m24394isNaNimpl(s10) || Float16.m24394isNaNimpl(s11)) ? Float16.Companion.m24416getNaNslo4al4() : Float16.m24381compareTo41bOqos(s10, s11) >= 0 ? s10 : s11;
    }

    /* renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m24422minAoSsdG0(short s10, short s11) {
        return (Float16.m24394isNaNimpl(s10) || Float16.m24394isNaNimpl(s11)) ? Float16.Companion.m24416getNaNslo4al4() : Float16.m24381compareTo41bOqos(s10, s11) <= 0 ? s10 : s11;
    }

    private static final int toCompareValue(short s10) {
        return (s10 & Short.MIN_VALUE) != 0 ? 32768 - (s10 & ISelectionInterface.HELD_NOTHING) : s10 & ISelectionInterface.HELD_NOTHING;
    }
}
