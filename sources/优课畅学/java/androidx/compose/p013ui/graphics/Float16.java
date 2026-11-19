package androidx.compose.p013ui.graphics;

import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.text.Regex;
import p113g8.AbstractC8656a;

/* loaded from: classes2.dex */
public final class Float16 implements Comparable<Float16> {
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = m24384constructorimpl((short) 5120);
    private static final short LowestValue = m24384constructorimpl((short) -1025);
    private static final short MaxValue = m24384constructorimpl((short) 31743);
    private static final short MinNormal = m24384constructorimpl((short) 1024);
    private static final short MinValue = m24384constructorimpl((short) 1);
    private static final short NaN = m24384constructorimpl((short) 32256);
    private static final short NegativeInfinity = m24384constructorimpl((short) -1024);
    private static final short NegativeZero = m24384constructorimpl(Short.MIN_VALUE);
    private static final short PositiveInfinity = m24384constructorimpl((short) 31744);
    private static final short PositiveZero = m24384constructorimpl((short) 0);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m24411getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m24412getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m24413getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m24414getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m24415getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m24416getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m24417getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m24418getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m24419getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m24420getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Float16(short s10) {
        this.halfValue = s10;
    }

    /* renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m24378absoluteValueslo4al4(short s10) {
        return m24384constructorimpl((short) (s10 & Short.MAX_VALUE));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m24379boximpl(short s10) {
        return new Float16(s10);
    }

    /* renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m24380ceilslo4al4(short s10) {
        int i10 = 65535 & s10;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = ((-((~(i10 >> 15)) & (i11 == 0 ? 0 : 1))) & 15360) | (s10 & Short.MIN_VALUE);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + (((i10 >> 15) - 1) & i12)) & (~i12);
        }
        return m24384constructorimpl((short) i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m24384constructorimpl(short s10) {
        return s10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24385equalsimpl(short s10, Object obj) {
        return (obj instanceof Float16) && s10 == ((Float16) obj).m24410unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24386equalsimpl0(short s10, short s11) {
        return s10 == s11;
    }

    /* renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m24387floorslo4al4(short s10) {
        int i10 = s10 & ISelectionInterface.HELD_NOTHING;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = (s10 & Short.MIN_VALUE) | ((i10 <= 32768 ? 0 : 65535) & 15360);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + ((-(i10 >> 15)) & i12)) & (~i12);
        }
        return m24384constructorimpl((short) i10);
    }

    /* renamed from: getExponent-impl, reason: not valid java name */
    public static final int m24388getExponentimpl(short s10) {
        return ((s10 >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m24389getSignslo4al4(short s10) {
        int i10 = s10 & Short.MAX_VALUE;
        if (!((i10 > 31744) | (i10 == 0))) {
            i10 = (s10 & Short.MIN_VALUE) | 15360;
        }
        return m24384constructorimpl((short) i10);
    }

    /* renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m24390getSignificandimpl(short s10) {
        return s10 & 1023;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24391hashCodeimpl(short s10) {
        return Short.hashCode(s10);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m24392isFiniteimpl(short s10) {
        return (s10 & Short.MAX_VALUE) != 31744;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m24393isInfiniteimpl(short s10) {
        return (s10 & Short.MAX_VALUE) == 31744;
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m24394isNaNimpl(short s10) {
        return (s10 & Short.MAX_VALUE) > 31744;
    }

    /* renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m24395isNormalizedimpl(short s10) {
        int i10 = s10 & 31744;
        return (i10 != 0) & (i10 != 31744);
    }

    /* renamed from: round-slo4al4, reason: not valid java name */
    public static final short m24396roundslo4al4(short s10) {
        int i10 = s10 & ISelectionInterface.HELD_NOTHING;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = (s10 & Short.MIN_VALUE) | ((i11 < 14336 ? 0 : 65535) & 15360);
        } else if (i11 < 25600) {
            int i12 = i11 >> 10;
            i10 = (i10 + (1 << (24 - i12))) & (~((1 << (25 - i12)) - 1));
        }
        return m24384constructorimpl((short) i10);
    }

    /* renamed from: toBits-impl, reason: not valid java name */
    public static final int m24397toBitsimpl(short s10) {
        if (m24394isNaNimpl(s10)) {
            return 32256;
        }
        return s10 & ISelectionInterface.HELD_NOTHING;
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    public static final byte m24398toByteimpl(short s10) {
        return (byte) m24400toFloatimpl(s10);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m24399toDoubleimpl(short s10) {
        return m24400toFloatimpl(s10);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m24400toFloatimpl(short s10) {
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
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* renamed from: toHexString-impl, reason: not valid java name */
    public static final String m24401toHexStringimpl(short s10) {
        StringBuilder sb = new StringBuilder();
        int i10 = 65535 & s10;
        int i11 = i10 >>> 15;
        int i12 = (i10 >>> 10) & 31;
        int i13 = s10 & 1023;
        if (i12 != 31) {
            if (i11 == 1) {
                sb.append('-');
            }
            if (i12 != 0) {
                sb.append("0x1.");
                String string = Integer.toString(i13, AbstractC8656a.m13939a(16));
                AbstractC9133u.m16132f(string, "toString(...)");
                sb.append(new Regex("0{2,}$").m16184k(string, ""));
                sb.append('p');
                sb.append(String.valueOf(i12 - 15));
            } else if (i13 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                String string2 = Integer.toString(i13, AbstractC8656a.m13939a(16));
                AbstractC9133u.m16132f(string2, "toString(...)");
                sb.append(new Regex("0{2,}$").m16184k(string2, ""));
                sb.append("p-14");
            }
        } else if (i13 == 0) {
            if (i11 != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m24402toIntimpl(short s10) {
        return (int) m24400toFloatimpl(s10);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m24403toLongimpl(short s10) {
        return (long) m24400toFloatimpl(s10);
    }

    /* renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m24404toRawBitsimpl(short s10) {
        return s10 & ISelectionInterface.HELD_NOTHING;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    public static final short m24405toShortimpl(short s10) {
        return (short) m24400toFloatimpl(s10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24406toStringimpl(short s10) {
        return String.valueOf(m24400toFloatimpl(s10));
    }

    /* renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m24407truncslo4al4(short s10) {
        int i10 = 65535 & s10;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = Short.MIN_VALUE & s10;
        } else if (i11 < 25600) {
            i10 &= ~((1 << (25 - (i11 >> 10))) - 1);
        }
        return m24384constructorimpl((short) i10);
    }

    /* renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m24408withSignqCeQghg(short s10, short s11) {
        return m24384constructorimpl((short) ((s10 & Short.MAX_VALUE) | (s11 & Short.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m24409compareTo41bOqos(float16.m24410unboximpl());
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m24409compareTo41bOqos(short s10) {
        return m24381compareTo41bOqos(this.halfValue, s10);
    }

    public boolean equals(Object obj) {
        return m24385equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m24391hashCodeimpl(this.halfValue);
    }

    public String toString() {
        return m24406toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m24410unboximpl() {
        return this.halfValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m24381compareTo41bOqos(short s10, short s11) {
        if (m24394isNaNimpl(s10)) {
            return !m24394isNaNimpl(s11) ? 1 : 0;
        }
        if (m24394isNaNimpl(s11)) {
            return -1;
        }
        return AbstractC9133u.m16135i((s10 & Short.MIN_VALUE) != 0 ? 32768 - (s10 & ISelectionInterface.HELD_NOTHING) : s10 & ISelectionInterface.HELD_NOTHING, (s11 & Short.MIN_VALUE) != 0 ? 32768 - (s11 & ISelectionInterface.HELD_NOTHING) : s11 & ISelectionInterface.HELD_NOTHING);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m24382constructorimpl(double d10) {
        return m24383constructorimpl((float) d10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m24383constructorimpl(float f10) {
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
                    return m24384constructorimpl((short) i10);
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
        return m24384constructorimpl((short) i10);
    }
}
