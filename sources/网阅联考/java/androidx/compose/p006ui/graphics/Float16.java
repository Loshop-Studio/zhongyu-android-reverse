package androidx.compose.p006ui.graphics;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Regex;

@Metadata(m5174d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0081@\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001RB\u0014\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u0014\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0007B\u0012\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\nJ\u0016\u0010\u0015\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\nJ\u001e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\nJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010(J\r\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b.\u0010(J\u0016\u0010/\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\nJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\f¢\u0006\u0004\bB\u0010\u000eJ\r\u0010C\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\t¢\u0006\u0004\bJ\u0010\nJ\u000f\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010@J\u0016\u0010M\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010\nJ\u001b\u0010O\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010QR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0088\u0001\bø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, m5175d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "value", "", "constructor-impl", "(F)S", "", "(D)S", "halfValue", "", "(S)S", "exponent", "", "getExponent-impl", "(S)I", "getHalfValue", "()S", "sign", "getSign-slo4al4", "significand", "getSignificand-impl", "absoluteValue", "absoluteValue-slo4al4", "ceil", "ceil-slo4al4", "compareTo", "other", "compareTo-41bOqos", "(SS)I", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floor", "floor-slo4al4", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(S)Z", "isInfinite", "isInfinite-impl", "isNaN", "isNaN-impl", "isNormalized", "isNormalized-impl", "round", "round-slo4al4", "toBits", "toBits-impl", "toByte", "", "toByte-impl", "(S)B", "toDouble", "toDouble-impl", "(S)D", "toFloat", "toFloat-impl", "(S)F", "toHexString", "", "toHexString-impl", "(S)Ljava/lang/String;", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toRawBits", "toRawBits-impl", "toShort", "toShort-impl", "toString", "toString-impl", "trunc", "trunc-slo4al4", "withSign", "withSign-qCeQghg", "(SS)S", "Companion", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class Float16 implements Comparable<Float16> {
    private static final int FP16_COMBINED = 32767;
    private static final int FP16_EXPONENT_BIAS = 15;
    private static final int FP16_EXPONENT_MASK = 31;
    private static final int FP16_EXPONENT_MAX = 31744;
    private static final int FP16_EXPONENT_SHIFT = 10;
    private static final int FP16_SIGNIFICAND_MASK = 1023;
    private static final int FP16_SIGN_MASK = 32768;
    private static final int FP16_SIGN_SHIFT = 15;
    private static final float FP32_DENORMAL_FLOAT;
    private static final int FP32_DENORMAL_MAGIC = 1056964608;
    private static final int FP32_EXPONENT_BIAS = 127;
    private static final int FP32_EXPONENT_MASK = 255;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_QNAN_MASK = 4194304;
    private static final int FP32_SIGNIFICAND_MASK = 8388607;
    private static final int FP32_SIGN_SHIFT = 31;
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final short Epsilon = m9282constructorimpl((short) 5120);
    private static final short LowestValue = m9282constructorimpl((short) -1025);
    private static final short MaxValue = m9282constructorimpl((short) 31743);
    private static final short MinNormal = m9282constructorimpl((short) 1024);
    private static final short MinValue = m9282constructorimpl((short) 1);
    private static final short NaN = m9282constructorimpl((short) 32256);
    private static final short NegativeInfinity = m9282constructorimpl((short) -1024);
    private static final short NegativeZero = m9282constructorimpl(ShortCompanionObject.MIN_VALUE);
    private static final short PositiveInfinity = m9282constructorimpl((short) 31744);
    private static final short PositiveZero = m9282constructorimpl((short) 0);
    private static final short One = m9281constructorimpl(1.0f);
    private static final short NegativeOne = m9281constructorimpl(-1.0f);

    @Metadata(m5174d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0012H\u0002J\u0010\u00104\u001a\u00020\t2\u0006\u00105\u001a\u000202H\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u000e\u0010\u001c\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001e\u0010\u0006R\u000e\u0010\u001f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u001c\u0010\"\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u001c\u0010$\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u001c\u0010&\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0006R\u0019\u0010(\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010)\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b*\u0010\u0006R\u0019\u0010+\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010,\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0006R\u001c\u0010.\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0006R\u000e\u00100\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, m5175d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "()V", "Epsilon", "Landroidx/compose/ui/graphics/Float16;", "getEpsilon-slo4al4", "()S", ExifInterface.LATITUDE_SOUTH, "FP16_COMBINED", "", "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "FP32_DENORMAL_FLOAT", "", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "LowestValue", "getLowestValue-slo4al4", "MaxExponent", "MaxValue", "getMaxValue-slo4al4", "MinExponent", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeOne", "NegativeZero", "getNegativeZero-slo4al4", "One", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "Size", "floatToHalf", "", "f", "toCompareValue", "value", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short floatToHalf(float f4) {
            int i4;
            int i5;
            int iFloatToRawIntBits = Float.floatToRawIntBits(f4);
            int i6 = iFloatToRawIntBits >>> 31;
            int i7 = (iFloatToRawIntBits >>> 23) & 255;
            int i8 = iFloatToRawIntBits & Float16.FP32_SIGNIFICAND_MASK;
            int i9 = 31;
            int i10 = 0;
            if (i7 == 255) {
                if (i8 != 0) {
                    i5 = 512;
                    i10 = i5;
                }
                i4 = (i6 << 15) | (i9 << 10) | i10;
            } else {
                int i11 = (i7 - 127) + 15;
                if (i11 >= 31) {
                    i9 = 49;
                } else if (i11 > 0) {
                    i10 = i8 >> 13;
                    if ((i8 & 4096) != 0) {
                        i4 = (((i11 << 10) | i10) + 1) | (i6 << 15);
                    } else {
                        i9 = i11;
                    }
                } else if (i11 >= -10) {
                    int i12 = (i8 | 8388608) >> (1 - i11);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i5 = i12 >> 13;
                    i9 = 0;
                    i10 = i5;
                } else {
                    i9 = 0;
                }
                i4 = (i6 << 15) | (i9 << 10) | i10;
            }
            return (short) i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int toCompareValue(short value) {
            return (value & ShortCompanionObject.MIN_VALUE) != 0 ? 32768 - (value & UShort.MAX_VALUE) : value & UShort.MAX_VALUE;
        }

        /* renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m9309getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m9310getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m9311getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m9312getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m9313getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m9314getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m9315getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m9316getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m9317getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m9318getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }
    }

    static {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        FP32_DENORMAL_FLOAT = Float.intBitsToFloat(FP32_DENORMAL_MAGIC);
    }

    private /* synthetic */ Float16(short s3) {
        this.halfValue = s3;
    }

    /* renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m9276absoluteValueslo4al4(short s3) {
        return m9282constructorimpl((short) (s3 & ShortCompanionObject.MAX_VALUE));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m9277boximpl(short s3) {
        return new Float16(s3);
    }

    /* renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m9278ceilslo4al4(short s3) {
        int i4 = s3 & UShort.MAX_VALUE;
        int i5 = i4 & FP16_COMBINED;
        if (i5 < 15360) {
            i4 = ((-((~(i4 >> 15)) & (i5 == 0 ? 0 : 1))) & 15360) | (32768 & i4);
        } else if (i5 < 25600) {
            int i6 = (1 << (25 - (i5 >> 10))) - 1;
            i4 = (i4 + (i6 & ((i4 >> 15) - 1))) & (~i6);
        }
        return m9282constructorimpl((short) i4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m9282constructorimpl(short s3) {
        return s3;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9283equalsimpl(short s3, Object obj) {
        return (obj instanceof Float16) && s3 == ((Float16) obj).m9308unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9284equalsimpl0(short s3, short s4) {
        return s3 == s4;
    }

    /* renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m9285floorslo4al4(short s3) {
        int i4 = s3 & UShort.MAX_VALUE;
        int i5 = i4 & FP16_COMBINED;
        if (i5 < 15360) {
            i4 = ((i4 <= 32768 ? 0 : 65535) & 15360) | (i4 & 32768);
        } else if (i5 < 25600) {
            int i6 = (1 << (25 - (i5 >> 10))) - 1;
            i4 = (i4 + ((-(i4 >> 15)) & i6)) & (~i6);
        }
        return m9282constructorimpl((short) i4);
    }

    /* renamed from: getExponent-impl, reason: not valid java name */
    public static final int m9286getExponentimpl(short s3) {
        return ((s3 >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m9287getSignslo4al4(short s3) {
        return m9292isNaNimpl(s3) ? NaN : m9279compareTo41bOqos(s3, NegativeZero) < 0 ? NegativeOne : m9279compareTo41bOqos(s3, PositiveZero) > 0 ? One : s3;
    }

    /* renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m9288getSignificandimpl(short s3) {
        return s3 & 1023;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9289hashCodeimpl(short s3) {
        return s3;
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m9290isFiniteimpl(short s3) {
        return (s3 & ShortCompanionObject.MAX_VALUE) != FP16_EXPONENT_MAX;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m9291isInfiniteimpl(short s3) {
        return (s3 & ShortCompanionObject.MAX_VALUE) == FP16_EXPONENT_MAX;
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m9292isNaNimpl(short s3) {
        return (s3 & ShortCompanionObject.MAX_VALUE) > FP16_EXPONENT_MAX;
    }

    /* renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m9293isNormalizedimpl(short s3) {
        int i4 = s3 & FP16_EXPONENT_MAX;
        return (i4 == 0 || i4 == FP16_EXPONENT_MAX) ? false : true;
    }

    /* renamed from: round-slo4al4, reason: not valid java name */
    public static final short m9294roundslo4al4(short s3) {
        int i4 = s3 & UShort.MAX_VALUE;
        int i5 = i4 & FP16_COMBINED;
        if (i5 < 15360) {
            i4 = (i4 & 32768) | ((i5 < 14336 ? 0 : 65535) & 15360);
        } else if (i5 < 25600) {
            int i6 = 25 - (i5 >> 10);
            i4 = (i4 + (1 << (i6 - 1))) & (~((1 << i6) - 1));
        }
        return m9282constructorimpl((short) i4);
    }

    /* renamed from: toBits-impl, reason: not valid java name */
    public static final int m9295toBitsimpl(short s3) {
        return m9292isNaNimpl(s3) ? NaN : s3 & UShort.MAX_VALUE;
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    public static final byte m9296toByteimpl(short s3) {
        return (byte) m9298toFloatimpl(s3);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m9297toDoubleimpl(short s3) {
        return m9298toFloatimpl(s3);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m9298toFloatimpl(short s3) {
        int i4;
        int i5;
        int i6;
        int i7 = s3 & UShort.MAX_VALUE;
        int i8 = 32768 & i7;
        int i9 = (i7 >>> 10) & 31;
        int i10 = i7 & FP16_SIGNIFICAND_MASK;
        if (i9 != 0) {
            int i11 = i10 << 13;
            if (i9 == 31) {
                i4 = 255;
                if (i11 != 0) {
                    i11 |= 4194304;
                }
            } else {
                i4 = (i9 - 15) + 127;
            }
            int i12 = i4;
            i5 = i11;
            i6 = i12;
        } else {
            if (i10 != 0) {
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                float fIntBitsToFloat = Float.intBitsToFloat(i10 + FP32_DENORMAL_MAGIC) - FP32_DENORMAL_FLOAT;
                return i8 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i6 = 0;
            i5 = 0;
        }
        int i13 = (i6 << 23) | (i8 << 16) | i5;
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(i13);
    }

    /* renamed from: toHexString-impl, reason: not valid java name */
    public static final String m9299toHexStringimpl(short s3) {
        StringBuilder sb = new StringBuilder();
        int i4 = s3 & UShort.MAX_VALUE;
        int i5 = i4 >>> 15;
        int i6 = (i4 >>> 10) & 31;
        int i7 = i4 & FP16_SIGNIFICAND_MASK;
        if (i6 != 31) {
            if (i5 == 1) {
                sb.append('-');
            }
            if (i6 != 0) {
                sb.append("0x1.");
                String string = Integer.toString(i7, CharsKt__CharJVMKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(string, ""));
                sb.append('p');
                sb.append(String.valueOf(i6 - 15));
            } else if (i7 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                String string2 = Integer.toString(i7, CharsKt__CharJVMKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(string2, ""));
                sb.append("p-14");
            }
        } else if (i7 == 0) {
            if (i5 != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        String string3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "o.toString()");
        return string3;
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m9300toIntimpl(short s3) {
        return (int) m9298toFloatimpl(s3);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m9301toLongimpl(short s3) {
        return (long) m9298toFloatimpl(s3);
    }

    /* renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m9302toRawBitsimpl(short s3) {
        return s3 & UShort.MAX_VALUE;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    public static final short m9303toShortimpl(short s3) {
        return (short) m9298toFloatimpl(s3);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9304toStringimpl(short s3) {
        return String.valueOf(m9298toFloatimpl(s3));
    }

    /* renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m9305truncslo4al4(short s3) {
        int i4;
        int i5 = s3 & UShort.MAX_VALUE;
        int i6 = i5 & FP16_COMBINED;
        if (i6 >= 15360) {
            i4 = i6 < 25600 ? ~((1 << (25 - (i6 >> 10))) - 1) : 32768;
            return m9282constructorimpl((short) i5);
        }
        i5 &= i4;
        return m9282constructorimpl((short) i5);
    }

    /* renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m9306withSignqCeQghg(short s3, short s4) {
        return m9282constructorimpl((short) ((s3 & ShortCompanionObject.MAX_VALUE) | (s4 & ShortCompanionObject.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m9307compareTo41bOqos(float16.m9308unboximpl());
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m9307compareTo41bOqos(short s3) {
        return m9279compareTo41bOqos(this.halfValue, s3);
    }

    public boolean equals(Object obj) {
        return m9283equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m9289hashCodeimpl(this.halfValue);
    }

    public String toString() {
        return m9304toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m9308unboximpl() {
        return this.halfValue;
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m9279compareTo41bOqos(short s3, short s4) {
        if (m9292isNaNimpl(s3)) {
            return !m9292isNaNimpl(s4) ? 1 : 0;
        }
        if (m9292isNaNimpl(s4)) {
            return -1;
        }
        Companion companion = INSTANCE;
        return Intrinsics.compare(companion.toCompareValue(s3), companion.toCompareValue(s4));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m9281constructorimpl(float f4) {
        return m9282constructorimpl(INSTANCE.floatToHalf(f4));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m9280constructorimpl(double d4) {
        return m9281constructorimpl((float) d4);
    }
}
