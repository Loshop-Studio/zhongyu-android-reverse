package androidx.compose.p014ui.graphics;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.text.Regex;
import p310qd.AbstractC10788a;

/* loaded from: classes2.dex */
public final class Float16 implements Comparable<Float16> {
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = m30986constructorimpl((short) 5120);
    private static final short LowestValue = m30986constructorimpl((short) -1025);
    private static final short MaxValue = m30986constructorimpl((short) 31743);
    private static final short MinNormal = m30986constructorimpl((short) 1024);
    private static final short MinValue = m30986constructorimpl((short) 1);
    private static final short NaN = m30986constructorimpl((short) 32256);
    private static final short NegativeInfinity = m30986constructorimpl((short) -1024);
    private static final short NegativeZero = m30986constructorimpl(Short.MIN_VALUE);
    private static final short PositiveInfinity = m30986constructorimpl((short) 31744);
    private static final short PositiveZero = m30986constructorimpl((short) 0);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m31013getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m31014getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m31015getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m31016getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m31017getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m31018getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m31019getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m31020getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m31021getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m31022getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Float16(short s10) {
        this.halfValue = s10;
    }

    /* renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m30980absoluteValueslo4al4(short s10) {
        return m30986constructorimpl((short) (s10 & Short.MAX_VALUE));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m30981boximpl(short s10) {
        return new Float16(s10);
    }

    /* renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m30982ceilslo4al4(short s10) {
        int i10 = 65535 & s10;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = ((-((~(i10 >> 15)) & (i11 == 0 ? 0 : 1))) & 15360) | (s10 & Short.MIN_VALUE);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + (((i10 >> 15) - 1) & i12)) & (~i12);
        }
        return m30986constructorimpl((short) i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m30986constructorimpl(short s10) {
        return s10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30987equalsimpl(short s10, Object obj) {
        return (obj instanceof Float16) && s10 == ((Float16) obj).m31012unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30988equalsimpl0(short s10, short s11) {
        return s10 == s11;
    }

    /* renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m30989floorslo4al4(short s10) {
        int i10 = s10 & 65535;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = (s10 & Short.MIN_VALUE) | ((i10 <= 32768 ? 0 : 65535) & 15360);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + ((-(i10 >> 15)) & i12)) & (~i12);
        }
        return m30986constructorimpl((short) i10);
    }

    /* renamed from: getExponent-impl, reason: not valid java name */
    public static final int m30990getExponentimpl(short s10) {
        return ((s10 >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m30991getSignslo4al4(short s10) {
        int i10 = s10 & Short.MAX_VALUE;
        if (!((i10 > 31744) | (i10 == 0))) {
            i10 = (s10 & Short.MIN_VALUE) | 15360;
        }
        return m30986constructorimpl((short) i10);
    }

    /* renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m30992getSignificandimpl(short s10) {
        return s10 & 1023;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30993hashCodeimpl(short s10) {
        return Short.hashCode(s10);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m30994isFiniteimpl(short s10) {
        return (s10 & Short.MAX_VALUE) != 31744;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m30995isInfiniteimpl(short s10) {
        return (s10 & Short.MAX_VALUE) == 31744;
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m30996isNaNimpl(short s10) {
        return (s10 & Short.MAX_VALUE) > 31744;
    }

    /* renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m30997isNormalizedimpl(short s10) {
        int i10 = s10 & 31744;
        return (i10 != 0) & (i10 != 31744);
    }

    /* renamed from: round-slo4al4, reason: not valid java name */
    public static final short m30998roundslo4al4(short s10) {
        int i10 = s10 & 65535;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = (s10 & Short.MIN_VALUE) | ((i11 < 14336 ? 0 : 65535) & 15360);
        } else if (i11 < 25600) {
            int i12 = i11 >> 10;
            i10 = (i10 + (1 << (24 - i12))) & (~((1 << (25 - i12)) - 1));
        }
        return m30986constructorimpl((short) i10);
    }

    /* renamed from: toBits-impl, reason: not valid java name */
    public static final int m30999toBitsimpl(short s10) {
        if (m30996isNaNimpl(s10)) {
            return 32256;
        }
        return s10 & 65535;
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    public static final byte m31000toByteimpl(short s10) {
        return (byte) m31002toFloatimpl(s10);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m31001toDoubleimpl(short s10) {
        return m31002toFloatimpl(s10);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m31002toFloatimpl(short s10) {
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
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* renamed from: toHexString-impl, reason: not valid java name */
    public static final String m31003toHexStringimpl(short s10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 65535 & s10;
        int i11 = i10 >>> 15;
        int i12 = (i10 >>> 10) & 31;
        int i13 = s10 & 1023;
        if (i12 != 31) {
            if (i11 == 1) {
                sb2.append('-');
            }
            if (i12 != 0) {
                sb2.append("0x1.");
                String string = Integer.toString(i13, AbstractC10788a.m23073a(16));
                AbstractC9979u.m20293f(string, "toString(...)");
                sb2.append(new Regex("0{2,}$").m20344n(string, ""));
                sb2.append('p');
                sb2.append(String.valueOf(i12 - 15));
            } else if (i13 == 0) {
                sb2.append("0x0.0p0");
            } else {
                sb2.append("0x0.");
                String string2 = Integer.toString(i13, AbstractC10788a.m23073a(16));
                AbstractC9979u.m20293f(string2, "toString(...)");
                sb2.append(new Regex("0{2,}$").m20344n(string2, ""));
                sb2.append("p-14");
            }
        } else if (i13 == 0) {
            if (i11 != 0) {
                sb2.append('-');
            }
            sb2.append("Infinity");
        } else {
            sb2.append("NaN");
        }
        return sb2.toString();
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m31004toIntimpl(short s10) {
        return (int) m31002toFloatimpl(s10);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m31005toLongimpl(short s10) {
        return (long) m31002toFloatimpl(s10);
    }

    /* renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m31006toRawBitsimpl(short s10) {
        return s10 & 65535;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    public static final short m31007toShortimpl(short s10) {
        return (short) m31002toFloatimpl(s10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31008toStringimpl(short s10) {
        return String.valueOf(m31002toFloatimpl(s10));
    }

    /* renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m31009truncslo4al4(short s10) {
        int i10 = 65535 & s10;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = Short.MIN_VALUE & s10;
        } else if (i11 < 25600) {
            i10 &= ~((1 << (25 - (i11 >> 10))) - 1);
        }
        return m30986constructorimpl((short) i10);
    }

    /* renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m31010withSignqCeQghg(short s10, short s11) {
        return m30986constructorimpl((short) ((s10 & Short.MAX_VALUE) | (s11 & Short.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m31011compareTo41bOqos(float16.m31012unboximpl());
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m31011compareTo41bOqos(short s10) {
        return m30983compareTo41bOqos(this.halfValue, s10);
    }

    public boolean equals(Object obj) {
        return m30987equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m30993hashCodeimpl(this.halfValue);
    }

    public String toString() {
        return m31008toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m31012unboximpl() {
        return this.halfValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m30983compareTo41bOqos(short s10, short s11) {
        if (m30996isNaNimpl(s10)) {
            return !m30996isNaNimpl(s11) ? 1 : 0;
        }
        if (m30996isNaNimpl(s11)) {
            return -1;
        }
        return AbstractC9979u.m20296i((s10 & Short.MIN_VALUE) != 0 ? 32768 - (s10 & 65535) : s10 & 65535, (s11 & Short.MIN_VALUE) != 0 ? 32768 - (s11 & 65535) : s11 & 65535);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m30984constructorimpl(double d10) {
        return m30985constructorimpl((float) d10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m30985constructorimpl(float f10) {
        int i10;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = 8388607 & iFloatToRawIntBits;
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
                    return m30986constructorimpl((short) i10);
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
        return m30986constructorimpl((short) i10);
    }
}
