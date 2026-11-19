package androidx.compose.p012ui.graphics;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

@Metadata(m13412d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0081@\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001RB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007B\u000f\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\nJ\u0013\u0010\u0015\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\nJ\u0013\u0010\u0017\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\nJ\u001b\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\nJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010(J\r\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b.\u0010(J\u0013\u0010/\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\nJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\f¢\u0006\u0004\bB\u0010\u000eJ\r\u0010C\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\t¢\u0006\u0004\bJ\u0010\nJ\u000f\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010@J\u0013\u0010M\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010\nJ\u0018\u0010O\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\bP\u0010QR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0088\u0001\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, m13413d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "value", "", "constructor-impl", "(F)S", "", "(D)S", "halfValue", "", "(S)S", "exponent", "", "getExponent-impl", "(S)I", "getHalfValue", "()S", "sign", "getSign-slo4al4", "significand", "getSignificand-impl", "absoluteValue", "absoluteValue-slo4al4", "ceil", "ceil-slo4al4", "compareTo", "other", "compareTo-41bOqos", "(SS)I", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floor", "floor-slo4al4", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(S)Z", "isInfinite", "isInfinite-impl", "isNaN", "isNaN-impl", "isNormalized", "isNormalized-impl", "round", "round-slo4al4", "toBits", "toBits-impl", "toByte", "", "toByte-impl", "(S)B", "toDouble", "toDouble-impl", "(S)D", "toFloat", "toFloat-impl", "(S)F", "toHexString", "", "toHexString-impl", "(S)Ljava/lang/String;", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toRawBits", "toRawBits-impl", "toShort", "toShort-impl", "toString", "toString-impl", "trunc", "trunc-slo4al4", "withSign", "withSign-qCeQghg", "(SS)S", "Companion", "ui-graphics_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n+ 2 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,642:1\n535#2,38:643\n578#2,12:681\n590#2,17:694\n522#2,4:711\n22#3:693\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n*L\n95#1:643,38\n138#1:681,12\n138#1:694,17\n198#1:711,4\n138#1:693\n*E\n"})
/* loaded from: classes2.dex */
public final class Float16 implements Comparable<Float16> {
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final short Epsilon = m21517constructorimpl((short) 5120);
    private static final short LowestValue = m21517constructorimpl((short) -1025);
    private static final short MaxValue = m21517constructorimpl((short) 31743);
    private static final short MinNormal = m21517constructorimpl((short) 1024);
    private static final short MinValue = m21517constructorimpl((short) 1);
    private static final short NaN = m21517constructorimpl((short) 32256);
    private static final short NegativeInfinity = m21517constructorimpl((short) -1024);
    private static final short NegativeZero = m21517constructorimpl(ShortCompanionObject.MIN_VALUE);
    private static final short PositiveInfinity = m21517constructorimpl((short) 31744);
    private static final short PositiveZero = m21517constructorimpl((short) 0);

    @Metadata(m13412d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006R\u0019\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0014\u0010\u0006R\u0019\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0016\u0010\u0006R\u0019\u0010\u0017\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u0019\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001a\u0010\u0006R\u0019\u0010\u001b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001c\u0010\u0006R\u000e\u0010\u001d\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m13413d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "()V", "Epsilon", "Landroidx/compose/ui/graphics/Float16;", "getEpsilon-slo4al4", "()S", ExifInterface.LATITUDE_SOUTH, "LowestValue", "getLowestValue-slo4al4", "MaxExponent", "", "MaxValue", "getMaxValue-slo4al4", "MinExponent", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeZero", "getNegativeZero-slo4al4", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "Size", "ui-graphics_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m21544getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m21545getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m21546getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m21547getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m21548getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m21549getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m21550getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m21551getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m21552getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m21553getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Float16(short s9) {
        this.halfValue = s9;
    }

    /* renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m21511absoluteValueslo4al4(short s9) {
        return m21517constructorimpl((short) (s9 & ShortCompanionObject.MAX_VALUE));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m21512boximpl(short s9) {
        return new Float16(s9);
    }

    /* renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m21513ceilslo4al4(short s9) {
        int i9 = 65535 & s9;
        int i10 = s9 & ShortCompanionObject.MAX_VALUE;
        if (i10 < 15360) {
            i9 = ((-((~(i9 >> 15)) & (i10 == 0 ? 0 : 1))) & 15360) | (s9 & ShortCompanionObject.MIN_VALUE);
        } else if (i10 < 25600) {
            int i11 = (1 << (25 - (i10 >> 10))) - 1;
            i9 = (i9 + (((i9 >> 15) - 1) & i11)) & (~i11);
        }
        return m21517constructorimpl((short) i9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m21517constructorimpl(short s9) {
        return s9;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m21518equalsimpl(short s9, Object obj) {
        return (obj instanceof Float16) && s9 == ((Float16) obj).m21543unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m21519equalsimpl0(short s9, short s10) {
        return s9 == s10;
    }

    /* renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m21520floorslo4al4(short s9) {
        int i9 = s9 & UShort.MAX_VALUE;
        int i10 = s9 & ShortCompanionObject.MAX_VALUE;
        if (i10 < 15360) {
            i9 = (s9 & ShortCompanionObject.MIN_VALUE) | ((i9 <= 32768 ? 0 : 65535) & 15360);
        } else if (i10 < 25600) {
            int i11 = (1 << (25 - (i10 >> 10))) - 1;
            i9 = (i9 + ((-(i9 >> 15)) & i11)) & (~i11);
        }
        return m21517constructorimpl((short) i9);
    }

    /* renamed from: getExponent-impl, reason: not valid java name */
    public static final int m21521getExponentimpl(short s9) {
        return ((s9 >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m21522getSignslo4al4(short s9) {
        int i9 = s9 & ShortCompanionObject.MAX_VALUE;
        if (!((i9 > 31744) | (i9 == 0))) {
            i9 = (s9 & ShortCompanionObject.MIN_VALUE) | 15360;
        }
        return m21517constructorimpl((short) i9);
    }

    /* renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m21523getSignificandimpl(short s9) {
        return s9 & 1023;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m21524hashCodeimpl(short s9) {
        return Short.hashCode(s9);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m21525isFiniteimpl(short s9) {
        return (s9 & ShortCompanionObject.MAX_VALUE) != 31744;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m21526isInfiniteimpl(short s9) {
        return (s9 & ShortCompanionObject.MAX_VALUE) == 31744;
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m21527isNaNimpl(short s9) {
        return (s9 & ShortCompanionObject.MAX_VALUE) > 31744;
    }

    /* renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m21528isNormalizedimpl(short s9) {
        int i9 = s9 & 31744;
        return (i9 != 0) & (i9 != 31744);
    }

    /* renamed from: round-slo4al4, reason: not valid java name */
    public static final short m21529roundslo4al4(short s9) {
        int i9 = s9 & UShort.MAX_VALUE;
        int i10 = s9 & ShortCompanionObject.MAX_VALUE;
        if (i10 < 15360) {
            i9 = (s9 & ShortCompanionObject.MIN_VALUE) | ((i10 < 14336 ? 0 : 65535) & 15360);
        } else if (i10 < 25600) {
            int i11 = i10 >> 10;
            i9 = (i9 + (1 << (24 - i11))) & (~((1 << (25 - i11)) - 1));
        }
        return m21517constructorimpl((short) i9);
    }

    /* renamed from: toBits-impl, reason: not valid java name */
    public static final int m21530toBitsimpl(short s9) {
        if (m21527isNaNimpl(s9)) {
            return 32256;
        }
        return s9 & UShort.MAX_VALUE;
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    public static final byte m21531toByteimpl(short s9) {
        return (byte) m21533toFloatimpl(s9);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m21532toDoubleimpl(short s9) {
        return m21533toFloatimpl(s9);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m21533toFloatimpl(short s9) {
        int i9;
        int i10;
        int i11;
        int i12 = Short.MIN_VALUE & s9;
        int i13 = ((65535 & s9) >>> 10) & 31;
        int i14 = s9 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i9 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i9 = i13 + 112;
            }
            int i16 = i9;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    /* renamed from: toHexString-impl, reason: not valid java name */
    public static final String m21534toHexStringimpl(short s9) {
        StringBuilder sb = new StringBuilder();
        int i9 = 65535 & s9;
        int i10 = i9 >>> 15;
        int i11 = (i9 >>> 10) & 31;
        int i12 = s9 & 1023;
        if (i11 != 31) {
            if (i10 == 1) {
                sb.append('-');
            }
            if (i11 != 0) {
                sb.append("0x1.");
                String string = Integer.toString(i12, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb.append(new Regex("0{2,}$").replaceFirst(string, ""));
                sb.append('p');
                sb.append(String.valueOf(i11 - 15));
            } else if (i12 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                String string2 = Integer.toString(i12, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                sb.append(new Regex("0{2,}$").replaceFirst(string2, ""));
                sb.append("p-14");
            }
        } else if (i12 == 0) {
            if (i10 != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m21535toIntimpl(short s9) {
        return (int) m21533toFloatimpl(s9);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m21536toLongimpl(short s9) {
        return (long) m21533toFloatimpl(s9);
    }

    /* renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m21537toRawBitsimpl(short s9) {
        return s9 & UShort.MAX_VALUE;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    public static final short m21538toShortimpl(short s9) {
        return (short) m21533toFloatimpl(s9);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m21539toStringimpl(short s9) {
        return String.valueOf(m21533toFloatimpl(s9));
    }

    /* renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m21540truncslo4al4(short s9) {
        int i9 = 65535 & s9;
        int i10 = s9 & ShortCompanionObject.MAX_VALUE;
        if (i10 < 15360) {
            i9 = Short.MIN_VALUE & s9;
        } else if (i10 < 25600) {
            i9 &= ~((1 << (25 - (i10 >> 10))) - 1);
        }
        return m21517constructorimpl((short) i9);
    }

    /* renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m21541withSignqCeQghg(short s9, short s10) {
        return m21517constructorimpl((short) ((s9 & ShortCompanionObject.MAX_VALUE) | (s10 & ShortCompanionObject.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m21542compareTo41bOqos(float16.m21543unboximpl());
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m21542compareTo41bOqos(short s9) {
        return m21514compareTo41bOqos(this.halfValue, s9);
    }

    public boolean equals(Object obj) {
        return m21518equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m21524hashCodeimpl(this.halfValue);
    }

    public String toString() {
        return m21539toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m21543unboximpl() {
        return this.halfValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m21514compareTo41bOqos(short s9, short s10) {
        if (m21527isNaNimpl(s9)) {
            return !m21527isNaNimpl(s10) ? 1 : 0;
        }
        if (m21527isNaNimpl(s10)) {
            return -1;
        }
        return Intrinsics.compare((s9 & ShortCompanionObject.MIN_VALUE) != 0 ? 32768 - (s9 & UShort.MAX_VALUE) : s9 & UShort.MAX_VALUE, (s10 & ShortCompanionObject.MIN_VALUE) != 0 ? 32768 - (s10 & UShort.MAX_VALUE) : s10 & UShort.MAX_VALUE);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m21515constructorimpl(double d10) {
        return m21516constructorimpl((float) d10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m21516constructorimpl(float f10) {
        int i9;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i10 = iFloatToRawIntBits >>> 31;
        int i11 = (iFloatToRawIntBits >>> 23) & 255;
        int i12 = 8388607 & iFloatToRawIntBits;
        int i13 = 31;
        int i14 = 0;
        if (i11 != 255) {
            int i15 = i11 - 112;
            if (i15 >= 31) {
                i13 = 49;
            } else if (i15 > 0) {
                i14 = i12 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i9 = (((i15 << 10) | i14) + 1) | (i10 << 15);
                    return m21517constructorimpl((short) i9);
                }
                i13 = i15;
            } else if (i15 >= -10) {
                int i16 = (8388608 | i12) >> (1 - i15);
                if ((i16 & 4096) != 0) {
                    i16 += 8192;
                }
                i13 = 0;
                i14 = i16 >> 13;
            } else {
                i13 = 0;
            }
        } else if (i12 != 0) {
            i14 = 512;
        }
        i9 = (i10 << 15) | (i13 << 10) | i14;
        return m21517constructorimpl((short) i9);
    }
}
