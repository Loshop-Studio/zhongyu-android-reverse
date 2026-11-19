package androidx.compose.p014ui.unit;

import androidx.compose.p014ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

@Immutable
/* loaded from: classes2.dex */
public final class TextUnit {
    public static final Companion Companion = new Companion(null);
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m33705getUnspecifiedXSAIIZE$annotations() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m33706getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        private Companion() {
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m33720boximpl(companion.m33729getUnspecifiedUIouoOA()), TextUnitType.m33720boximpl(companion.m33728getSpUIouoOA()), TextUnitType.m33720boximpl(companion.m33727getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m33685boximpl(long j10) {
        return new TextUnit(j10);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m33686compareToR2X_6o(long j10, long j11) {
        TextUnitKt.m33709checkArithmeticNB67dxo(j10, j11);
        return Float.compare(m33695getValueimpl(j10), m33695getValueimpl(j11));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m33687constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m33689divkPz2Gy4(long j10, float f10) {
        TextUnitKt.m33708checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m33693getRawTypeimpl(j10), m33695getValueimpl(j10) / f10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33691equalsimpl(long j10, Object obj) {
        return (obj instanceof TextUnit) && j10 == ((TextUnit) obj).m33704unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33692equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m33693getRawTypeimpl(long j10) {
        return j10 & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m33694getTypeUIouoOA(long j10) {
        return TextUnitTypes[(int) (m33693getRawTypeimpl(j10) >>> 32)].m33726unboximpl();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m33695getValueimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33696hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m33697isEmimpl(long j10) {
        return m33693getRawTypeimpl(j10) == IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m33698isSpimpl(long j10) {
        return m33693getRawTypeimpl(j10) == IjkMediaMeta.AV_CH_WIDE_RIGHT;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m33700timeskPz2Gy4(long j10, float f10) {
        TextUnitKt.m33708checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m33693getRawTypeimpl(j10), m33695getValueimpl(j10) * f10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33702toStringimpl(long j10) {
        long jM33694getTypeUIouoOA = m33694getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33729getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33728getSpUIouoOA())) {
            return m33695getValueimpl(j10) + ".sp";
        }
        if (!TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33727getEmUIouoOA())) {
            return "Invalid";
        }
        return m33695getValueimpl(j10) + ".em";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m33703unaryMinusXSAIIZE(long j10) {
        TextUnitKt.m33708checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m33693getRawTypeimpl(j10), -m33695getValueimpl(j10));
    }

    public boolean equals(Object obj) {
        return m33691equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m33696hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m33702toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m33704unboximpl() {
        return this.packedValue;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m33688divkPz2Gy4(long j10, double d10) {
        TextUnitKt.m33708checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m33693getRawTypeimpl(j10), (float) (m33695getValueimpl(j10) / d10));
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m33699timeskPz2Gy4(long j10, double d10) {
        TextUnitKt.m33708checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m33693getRawTypeimpl(j10), (float) (m33695getValueimpl(j10) * d10));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m33690divkPz2Gy4(long j10, int i10) {
        TextUnitKt.m33708checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m33693getRawTypeimpl(j10), m33695getValueimpl(j10) / i10);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m33701timeskPz2Gy4(long j10, int i10) {
        TextUnitKt.m33708checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m33693getRawTypeimpl(j10), m33695getValueimpl(j10) * i10);
    }
}
