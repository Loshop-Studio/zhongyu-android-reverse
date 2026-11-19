package androidx.compose.p009ui.graphics;

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

@Metadata(m7879d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0081@\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001RB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007B\u000f\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\nJ\u0013\u0010\u0015\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\nJ\u0013\u0010\u0017\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\nJ\u001b\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\nJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010(J\r\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b.\u0010(J\u0013\u0010/\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\nJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\f¢\u0006\u0004\bB\u0010\u000eJ\r\u0010C\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\t¢\u0006\u0004\bJ\u0010\nJ\u000f\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010@J\u0013\u0010M\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010\nJ\u0018\u0010O\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\bP\u0010QR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0088\u0001\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, m7880d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "value", "", "constructor-impl", "(F)S", "", "(D)S", "halfValue", "", "(S)S", "exponent", "", "getExponent-impl", "(S)I", "getHalfValue", "()S", "sign", "getSign-slo4al4", "significand", "getSignificand-impl", "absoluteValue", "absoluteValue-slo4al4", "ceil", "ceil-slo4al4", "compareTo", "other", "compareTo-41bOqos", "(SS)I", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floor", "floor-slo4al4", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(S)Z", "isInfinite", "isInfinite-impl", "isNaN", "isNaN-impl", "isNormalized", "isNormalized-impl", "round", "round-slo4al4", "toBits", "toBits-impl", "toByte", "", "toByte-impl", "(S)B", "toDouble", "toDouble-impl", "(S)D", "toFloat", "toFloat-impl", "(S)F", "toHexString", "", "toHexString-impl", "(S)Ljava/lang/String;", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toRawBits", "toRawBits-impl", "toShort", "toShort-impl", "toString", "toString-impl", "trunc", "trunc-slo4al4", "withSign", "withSign-qCeQghg", "(SS)S", "Companion", "ui-graphics_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
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
    private static final short Epsilon = m14007constructorimpl((short) 5120);
    private static final short LowestValue = m14007constructorimpl((short) -1025);
    private static final short MaxValue = m14007constructorimpl((short) 31743);
    private static final short MinNormal = m14007constructorimpl((short) 1024);
    private static final short MinValue = m14007constructorimpl((short) 1);
    private static final short NaN = m14007constructorimpl((short) 32256);
    private static final short NegativeInfinity = m14007constructorimpl((short) -1024);
    private static final short NegativeZero = m14007constructorimpl(ShortCompanionObject.MIN_VALUE);
    private static final short PositiveInfinity = m14007constructorimpl((short) 31744);
    private static final short PositiveZero = m14007constructorimpl((short) 0);

    @Metadata(m7879d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006R\u0019\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0014\u0010\u0006R\u0019\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0016\u0010\u0006R\u0019\u0010\u0017\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u0019\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001a\u0010\u0006R\u0019\u0010\u001b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001c\u0010\u0006R\u000e\u0010\u001d\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m7880d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "()V", "Epsilon", "Landroidx/compose/ui/graphics/Float16;", "getEpsilon-slo4al4", "()S", ExifInterface.LATITUDE_SOUTH, "LowestValue", "getLowestValue-slo4al4", "MaxExponent", "", "MaxValue", "getMaxValue-slo4al4", "MinExponent", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeZero", "getNegativeZero-slo4al4", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "Size", "ui-graphics_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m14034getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m14035getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m14036getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m14037getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m14038getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m14039getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m14040getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m14041getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m14042getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m14043getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Float16(short s6) {
        this.halfValue = s6;
    }

    /* renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m14001absoluteValueslo4al4(short s6) {
        return m14007constructorimpl((short) (s6 & ShortCompanionObject.MAX_VALUE));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m14002boximpl(short s6) {
        return new Float16(s6);
    }

    /* renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m14003ceilslo4al4(short s6) {
        int i6 = 65535 & s6;
        int i7 = s6 & ShortCompanionObject.MAX_VALUE;
        if (i7 < 15360) {
            i6 = ((-((~(i6 >> 15)) & (i7 == 0 ? 0 : 1))) & 15360) | (s6 & ShortCompanionObject.MIN_VALUE);
        } else if (i7 < 25600) {
            int i8 = (1 << (25 - (i7 >> 10))) - 1;
            i6 = (i6 + (((i6 >> 15) - 1) & i8)) & (~i8);
        }
        return m14007constructorimpl((short) i6);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m14007constructorimpl(short s6) {
        return s6;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m14008equalsimpl(short s6, Object obj) {
        return (obj instanceof Float16) && s6 == ((Float16) obj).m14033unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m14009equalsimpl0(short s6, short s7) {
        return s6 == s7;
    }

    /* renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m14010floorslo4al4(short s6) {
        int i6 = s6 & UShort.MAX_VALUE;
        int i7 = s6 & ShortCompanionObject.MAX_VALUE;
        if (i7 < 15360) {
            i6 = (s6 & ShortCompanionObject.MIN_VALUE) | ((i6 <= 32768 ? 0 : 65535) & 15360);
        } else if (i7 < 25600) {
            int i8 = (1 << (25 - (i7 >> 10))) - 1;
            i6 = (i6 + ((-(i6 >> 15)) & i8)) & (~i8);
        }
        return m14007constructorimpl((short) i6);
    }

    /* renamed from: getExponent-impl, reason: not valid java name */
    public static final int m14011getExponentimpl(short s6) {
        return ((s6 >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m14012getSignslo4al4(short s6) {
        int i6 = s6 & ShortCompanionObject.MAX_VALUE;
        if (!((i6 > 31744) | (i6 == 0))) {
            i6 = (s6 & ShortCompanionObject.MIN_VALUE) | 15360;
        }
        return m14007constructorimpl((short) i6);
    }

    /* renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m14013getSignificandimpl(short s6) {
        return s6 & 1023;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m14014hashCodeimpl(short s6) {
        return Short.hashCode(s6);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m14015isFiniteimpl(short s6) {
        return (s6 & ShortCompanionObject.MAX_VALUE) != 31744;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m14016isInfiniteimpl(short s6) {
        return (s6 & ShortCompanionObject.MAX_VALUE) == 31744;
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m14017isNaNimpl(short s6) {
        return (s6 & ShortCompanionObject.MAX_VALUE) > 31744;
    }

    /* renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m14018isNormalizedimpl(short s6) {
        int i6 = s6 & 31744;
        return (i6 != 0) & (i6 != 31744);
    }

    /* renamed from: round-slo4al4, reason: not valid java name */
    public static final short m14019roundslo4al4(short s6) {
        int i6 = s6 & UShort.MAX_VALUE;
        int i7 = s6 & ShortCompanionObject.MAX_VALUE;
        if (i7 < 15360) {
            i6 = (s6 & ShortCompanionObject.MIN_VALUE) | ((i7 < 14336 ? 0 : 65535) & 15360);
        } else if (i7 < 25600) {
            int i8 = i7 >> 10;
            i6 = (i6 + (1 << (24 - i8))) & (~((1 << (25 - i8)) - 1));
        }
        return m14007constructorimpl((short) i6);
    }

    /* renamed from: toBits-impl, reason: not valid java name */
    public static final int m14020toBitsimpl(short s6) {
        if (m14017isNaNimpl(s6)) {
            return 32256;
        }
        return s6 & UShort.MAX_VALUE;
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    public static final byte m14021toByteimpl(short s6) {
        return (byte) m14023toFloatimpl(s6);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m14022toDoubleimpl(short s6) {
        return m14023toFloatimpl(s6);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m14023toFloatimpl(short s6) {
        int i6;
        int i7;
        int i8;
        int i9 = Short.MIN_VALUE & s6;
        int i10 = ((65535 & s6) >>> 10) & 31;
        int i11 = s6 & 1023;
        if (i10 != 0) {
            int i12 = i11 << 13;
            if (i10 == 31) {
                i6 = 255;
                if (i12 != 0) {
                    i12 |= 4194304;
                }
            } else {
                i6 = i10 + 112;
            }
            int i13 = i6;
            i7 = i12;
            i8 = i13;
        } else {
            if (i11 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i11 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i9 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i8 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i8 << 23) | (i9 << 16) | i7);
    }

    /* renamed from: toHexString-impl, reason: not valid java name */
    public static final String m14024toHexStringimpl(short s6) {
        StringBuilder sb = new StringBuilder();
        int i6 = 65535 & s6;
        int i7 = i6 >>> 15;
        int i8 = (i6 >>> 10) & 31;
        int i9 = s6 & 1023;
        if (i8 != 31) {
            if (i7 == 1) {
                sb.append('-');
            }
            if (i8 != 0) {
                sb.append("0x1.");
                String string = Integer.toString(i9, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb.append(new Regex("0{2,}$").replaceFirst(string, ""));
                sb.append('p');
                sb.append(String.valueOf(i8 - 15));
            } else if (i9 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                String string2 = Integer.toString(i9, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                sb.append(new Regex("0{2,}$").replaceFirst(string2, ""));
                sb.append("p-14");
            }
        } else if (i9 == 0) {
            if (i7 != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m14025toIntimpl(short s6) {
        return (int) m14023toFloatimpl(s6);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m14026toLongimpl(short s6) {
        return (long) m14023toFloatimpl(s6);
    }

    /* renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m14027toRawBitsimpl(short s6) {
        return s6 & UShort.MAX_VALUE;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    public static final short m14028toShortimpl(short s6) {
        return (short) m14023toFloatimpl(s6);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m14029toStringimpl(short s6) {
        return String.valueOf(m14023toFloatimpl(s6));
    }

    /* renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m14030truncslo4al4(short s6) {
        int i6 = 65535 & s6;
        int i7 = s6 & ShortCompanionObject.MAX_VALUE;
        if (i7 < 15360) {
            i6 = Short.MIN_VALUE & s6;
        } else if (i7 < 25600) {
            i6 &= ~((1 << (25 - (i7 >> 10))) - 1);
        }
        return m14007constructorimpl((short) i6);
    }

    /* renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m14031withSignqCeQghg(short s6, short s7) {
        return m14007constructorimpl((short) ((s6 & ShortCompanionObject.MAX_VALUE) | (s7 & ShortCompanionObject.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m14032compareTo41bOqos(float16.m14033unboximpl());
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m14032compareTo41bOqos(short s6) {
        return m14004compareTo41bOqos(this.halfValue, s6);
    }

    public boolean equals(Object obj) {
        return m14008equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m14014hashCodeimpl(this.halfValue);
    }

    public String toString() {
        return m14029toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m14033unboximpl() {
        return this.halfValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m14004compareTo41bOqos(short s6, short s7) {
        if (m14017isNaNimpl(s6)) {
            return !m14017isNaNimpl(s7) ? 1 : 0;
        }
        if (m14017isNaNimpl(s7)) {
            return -1;
        }
        return Intrinsics.compare((s6 & ShortCompanionObject.MIN_VALUE) != 0 ? 32768 - (s6 & UShort.MAX_VALUE) : s6 & UShort.MAX_VALUE, (s7 & ShortCompanionObject.MIN_VALUE) != 0 ? 32768 - (s7 & UShort.MAX_VALUE) : s7 & UShort.MAX_VALUE);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m14005constructorimpl(double d6) {
        return m14006constructorimpl((float) d6);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m14006constructorimpl(float f6) {
        int i6;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f6);
        int i7 = iFloatToRawIntBits >>> 31;
        int i8 = (iFloatToRawIntBits >>> 23) & 255;
        int i9 = 8388607 & iFloatToRawIntBits;
        int i10 = 31;
        int i11 = 0;
        if (i8 != 255) {
            int i12 = i8 - 112;
            if (i12 >= 31) {
                i10 = 49;
            } else if (i12 > 0) {
                i11 = i9 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i6 = (((i12 << 10) | i11) + 1) | (i7 << 15);
                    return m14007constructorimpl((short) i6);
                }
                i10 = i12;
            } else if (i12 >= -10) {
                int i13 = (8388608 | i9) >> (1 - i12);
                if ((i13 & 4096) != 0) {
                    i13 += 8192;
                }
                i10 = 0;
                i11 = i13 >> 13;
            } else {
                i10 = 0;
            }
        } else if (i9 != 0) {
            i11 = 512;
        }
        i6 = (i7 << 15) | (i10 << 10) | i11;
        return m14007constructorimpl((short) i6);
    }
}
