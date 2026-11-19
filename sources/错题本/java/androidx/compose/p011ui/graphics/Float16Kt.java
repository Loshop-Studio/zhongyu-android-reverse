package androidx.compose.p011ui.graphics;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5109d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0080\b\u001a\u0011\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0015H\u0080\b\u001a\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\"\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010\u001e\u001a\u0011\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0015H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m5110d2 = {"Fp16Combined", "", "Fp16ExponentBias", "Fp16ExponentMask", "Fp16ExponentMax", "Fp16ExponentShift", "Fp16One", "Fp16SignMask", "Fp16SignShift", "Fp16SignificandMask", "Fp16TheNaN", "Fp32DenormalFloat", "", "Fp32DenormalMagic", "Fp32ExponentBias", "Fp32ExponentMask", "Fp32ExponentShift", "Fp32QNaNMask", "Fp32SignShift", "Fp32SignificandMask", "floatToHalf", "", "f", "halfToFloat", "h", "max", "Landroidx/compose/ui/graphics/Float16;", "x", "y", "max-AoSsdG0", "(SS)S", "min", "min-AoSsdG0", "toCompareValue", "value", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,642:1\n22#2:643\n22#2:644\n22#2:645\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n589#1:643\n606#1:644\n518#1:645\n*E\n"})
/* loaded from: classes.dex */
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

    public static final short floatToHalf(float f) {
        int i;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i8 = iFloatToRawIntBits >>> 31;
        int i9 = (iFloatToRawIntBits >>> 23) & 255;
        int i10 = Fp32SignificandMask & iFloatToRawIntBits;
        int i11 = 31;
        int i12 = 0;
        if (i9 != 255) {
            int i13 = i9 - 112;
            if (i13 >= 31) {
                i11 = 49;
            } else if (i13 > 0) {
                i12 = i10 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i = (((i13 << 10) | i12) + 1) | (i8 << 15);
                    return (short) i;
                }
                i11 = i13;
            } else if (i13 >= -10) {
                int i14 = (8388608 | i10) >> (1 - i13);
                if ((i14 & 4096) != 0) {
                    i14 += 8192;
                }
                i11 = 0;
                i12 = i14 >> 13;
            } else {
                i11 = 0;
            }
        } else if (i10 != 0) {
            i12 = 512;
        }
        i = (i8 << 15) | (i11 << 10) | i12;
        return (short) i;
    }

    public static final float halfToFloat(short s8) {
        int i;
        int i8;
        int i9;
        int i10 = Short.MIN_VALUE & s8;
        int i11 = ((65535 & s8) >>> 10) & 31;
        int i12 = s8 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i = i11 + 112;
            }
            int i14 = i;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i12 + Fp32DenormalMagic) - Fp32DenormalFloat;
                return i10 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    /* renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m10827maxAoSsdG0(short s8, short s9) {
        return (Float16.m10800isNaNimpl(s8) || Float16.m10800isNaNimpl(s9)) ? Float16.Companion.m10822getNaNslo4al4() : Float16.m10787compareTo41bOqos(s8, s9) >= 0 ? s8 : s9;
    }

    /* renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m10828minAoSsdG0(short s8, short s9) {
        return (Float16.m10800isNaNimpl(s8) || Float16.m10800isNaNimpl(s9)) ? Float16.Companion.m10822getNaNslo4al4() : Float16.m10787compareTo41bOqos(s8, s9) <= 0 ? s8 : s9;
    }

    private static final int toCompareValue(short s8) {
        return (s8 & Short.MIN_VALUE) != 0 ? 32768 - (s8 & 65535) : s8 & 65535;
    }
}
