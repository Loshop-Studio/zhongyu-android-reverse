package androidx.compose.p011ui.graphics;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0081@\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001RB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007B\u000f\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\nJ\u0013\u0010\u0015\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\nJ\u0013\u0010\u0017\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\nJ\u001b\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\nJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010(J\r\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b.\u0010(J\u0013\u0010/\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\nJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\f¢\u0006\u0004\bB\u0010\u000eJ\r\u0010C\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\t¢\u0006\u0004\bJ\u0010\nJ\u000f\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010@J\u0013\u0010M\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010\nJ\u0018\u0010O\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\bP\u0010QR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0088\u0001\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, m5110d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "value", "", "constructor-impl", "(F)S", "", "(D)S", "halfValue", "", "(S)S", "exponent", "", "getExponent-impl", "(S)I", "getHalfValue", "()S", "sign", "getSign-slo4al4", "significand", "getSignificand-impl", "absoluteValue", "absoluteValue-slo4al4", "ceil", "ceil-slo4al4", "compareTo", "other", "compareTo-41bOqos", "(SS)I", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floor", "floor-slo4al4", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(S)Z", "isInfinite", "isInfinite-impl", "isNaN", "isNaN-impl", "isNormalized", "isNormalized-impl", "round", "round-slo4al4", "toBits", "toBits-impl", "toByte", "", "toByte-impl", "(S)B", "toDouble", "toDouble-impl", "(S)D", "toFloat", "toFloat-impl", "(S)F", "toHexString", "", "toHexString-impl", "(S)Ljava/lang/String;", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toRawBits", "toRawBits-impl", "toShort", "toShort-impl", "toString", "toString-impl", "trunc", "trunc-slo4al4", "withSign", "withSign-qCeQghg", "(SS)S", "Companion", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n+ 2 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,642:1\n535#2,38:643\n578#2,12:681\n590#2,17:694\n522#2,4:711\n22#3:693\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n*L\n95#1:643,38\n138#1:681,12\n138#1:694,17\n198#1:711,4\n138#1:693\n*E\n"})
/* loaded from: classes.dex */
public final class Float16 implements Comparable<Float16> {
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final short Epsilon = m10790constructorimpl((short) 5120);
    private static final short LowestValue = m10790constructorimpl((short) -1025);
    private static final short MaxValue = m10790constructorimpl((short) 31743);
    private static final short MinNormal = m10790constructorimpl((short) 1024);
    private static final short MinValue = m10790constructorimpl((short) 1);
    private static final short NaN = m10790constructorimpl((short) 32256);
    private static final short NegativeInfinity = m10790constructorimpl((short) -1024);
    private static final short NegativeZero = m10790constructorimpl(Short.MIN_VALUE);
    private static final short PositiveInfinity = m10790constructorimpl((short) 31744);
    private static final short PositiveZero = m10790constructorimpl((short) 0);

    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006R\u0019\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0014\u0010\u0006R\u0019\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0016\u0010\u0006R\u0019\u0010\u0017\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u0019\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001a\u0010\u0006R\u0019\u0010\u001b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001c\u0010\u0006R\u000e\u0010\u001d\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "()V", "Epsilon", "Landroidx/compose/ui/graphics/Float16;", "getEpsilon-slo4al4", "()S", ExifInterface.LATITUDE_SOUTH, "LowestValue", "getLowestValue-slo4al4", "MaxExponent", "", "MaxValue", "getMaxValue-slo4al4", "MinExponent", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeZero", "getNegativeZero-slo4al4", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "Size", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m10817getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m10818getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m10819getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m10820getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m10821getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m10822getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m10823getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m10824getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m10825getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m10826getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Float16(short s8) {
        this.halfValue = s8;
    }

    /* renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m10784absoluteValueslo4al4(short s8) {
        return m10790constructorimpl((short) (s8 & Short.MAX_VALUE));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m10785boximpl(short s8) {
        return new Float16(s8);
    }

    /* renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m10786ceilslo4al4(short s8) {
        int i = 65535 & s8;
        int i8 = s8 & Short.MAX_VALUE;
        if (i8 < 15360) {
            i = ((-((~(i >> 15)) & (i8 == 0 ? 0 : 1))) & 15360) | (s8 & Short.MIN_VALUE);
        } else if (i8 < 25600) {
            int i9 = (1 << (25 - (i8 >> 10))) - 1;
            i = (i + (((i >> 15) - 1) & i9)) & (~i9);
        }
        return m10790constructorimpl((short) i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m10790constructorimpl(short s8) {
        return s8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10791equalsimpl(short s8, Object obj) {
        return (obj instanceof Float16) && s8 == ((Float16) obj).m10816unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10792equalsimpl0(short s8, short s9) {
        return s8 == s9;
    }

    /* renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m10793floorslo4al4(short s8) {
        int i = s8 & 65535;
        int i8 = s8 & Short.MAX_VALUE;
        if (i8 < 15360) {
            i = (s8 & Short.MIN_VALUE) | ((i <= 32768 ? 0 : 65535) & 15360);
        } else if (i8 < 25600) {
            int i9 = (1 << (25 - (i8 >> 10))) - 1;
            i = (i + ((-(i >> 15)) & i9)) & (~i9);
        }
        return m10790constructorimpl((short) i);
    }

    /* renamed from: getExponent-impl, reason: not valid java name */
    public static final int m10794getExponentimpl(short s8) {
        return ((s8 >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m10795getSignslo4al4(short s8) {
        int i = s8 & Short.MAX_VALUE;
        if (!((i > 31744) | (i == 0))) {
            i = (s8 & Short.MIN_VALUE) | 15360;
        }
        return m10790constructorimpl((short) i);
    }

    /* renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m10796getSignificandimpl(short s8) {
        return s8 & 1023;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10797hashCodeimpl(short s8) {
        return Short.hashCode(s8);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m10798isFiniteimpl(short s8) {
        return (s8 & Short.MAX_VALUE) != 31744;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m10799isInfiniteimpl(short s8) {
        return (s8 & Short.MAX_VALUE) == 31744;
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m10800isNaNimpl(short s8) {
        return (s8 & Short.MAX_VALUE) > 31744;
    }

    /* renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m10801isNormalizedimpl(short s8) {
        int i = s8 & 31744;
        return (i != 0) & (i != 31744);
    }

    /* renamed from: round-slo4al4, reason: not valid java name */
    public static final short m10802roundslo4al4(short s8) {
        int i = s8 & 65535;
        int i8 = s8 & Short.MAX_VALUE;
        if (i8 < 15360) {
            i = (s8 & Short.MIN_VALUE) | ((i8 < 14336 ? 0 : 65535) & 15360);
        } else if (i8 < 25600) {
            int i9 = i8 >> 10;
            i = (i + (1 << (24 - i9))) & (~((1 << (25 - i9)) - 1));
        }
        return m10790constructorimpl((short) i);
    }

    /* renamed from: toBits-impl, reason: not valid java name */
    public static final int m10803toBitsimpl(short s8) {
        if (m10800isNaNimpl(s8)) {
            return 32256;
        }
        return s8 & 65535;
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    public static final byte m10804toByteimpl(short s8) {
        return (byte) m10806toFloatimpl(s8);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m10805toDoubleimpl(short s8) {
        return m10806toFloatimpl(s8);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m10806toFloatimpl(short s8) {
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
                float fIntBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i10 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    @NotNull
    /* renamed from: toHexString-impl, reason: not valid java name */
    public static final String m10807toHexStringimpl(short s8) {
        StringBuilder sb = new StringBuilder();
        int i = 65535 & s8;
        int i8 = i >>> 15;
        int i9 = (i >>> 10) & 31;
        int i10 = s8 & 1023;
        if (i9 != 31) {
            if (i8 == 1) {
                sb.append('-');
            }
            if (i9 != 0) {
                sb.append("0x1.");
                AbstractC6768a.m6440d(16);
                String string = Integer.toString(i10, 16);
                AbstractC5830k.m5329f(string, "toString(...)");
                sb.append(new Regex("0{2,}$").replaceFirst(string, ""));
                sb.append('p');
                sb.append(String.valueOf(i9 - 15));
            } else if (i10 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                AbstractC6768a.m6440d(16);
                String string2 = Integer.toString(i10, 16);
                AbstractC5830k.m5329f(string2, "toString(...)");
                sb.append(new Regex("0{2,}$").replaceFirst(string2, ""));
                sb.append("p-14");
            }
        } else if (i10 == 0) {
            if (i8 != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m10808toIntimpl(short s8) {
        return (int) m10806toFloatimpl(s8);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m10809toLongimpl(short s8) {
        return (long) m10806toFloatimpl(s8);
    }

    /* renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m10810toRawBitsimpl(short s8) {
        return s8 & 65535;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    public static final short m10811toShortimpl(short s8) {
        return (short) m10806toFloatimpl(s8);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10812toStringimpl(short s8) {
        return String.valueOf(m10806toFloatimpl(s8));
    }

    /* renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m10813truncslo4al4(short s8) {
        int i = 65535 & s8;
        int i8 = s8 & Short.MAX_VALUE;
        if (i8 < 15360) {
            i = Short.MIN_VALUE & s8;
        } else if (i8 < 25600) {
            i &= ~((1 << (25 - (i8 >> 10))) - 1);
        }
        return m10790constructorimpl((short) i);
    }

    /* renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m10814withSignqCeQghg(short s8, short s9) {
        return m10790constructorimpl((short) ((s8 & Short.MAX_VALUE) | (s9 & Short.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m10815compareTo41bOqos(float16.m10816unboximpl());
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m10815compareTo41bOqos(short s8) {
        return m10787compareTo41bOqos(this.halfValue, s8);
    }

    public boolean equals(Object obj) {
        return m10791equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m10797hashCodeimpl(this.halfValue);
    }

    @NotNull
    public String toString() {
        return m10812toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m10816unboximpl() {
        return this.halfValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m10787compareTo41bOqos(short s8, short s9) {
        if (m10800isNaNimpl(s8)) {
            return !m10800isNaNimpl(s9) ? 1 : 0;
        }
        if (m10800isNaNimpl(s9)) {
            return -1;
        }
        return AbstractC5830k.m5332i((s8 & Short.MIN_VALUE) != 0 ? 32768 - (s8 & 65535) : s8 & 65535, (s9 & Short.MIN_VALUE) != 0 ? 32768 - (s9 & 65535) : s9 & 65535);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m10788constructorimpl(double d9) {
        return m10789constructorimpl((float) d9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m10789constructorimpl(float f) {
        int i;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i8 = iFloatToRawIntBits >>> 31;
        int i9 = (iFloatToRawIntBits >>> 23) & 255;
        int i10 = 8388607 & iFloatToRawIntBits;
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
                    return m10790constructorimpl((short) i);
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
        return m10790constructorimpl((short) i);
    }
}
