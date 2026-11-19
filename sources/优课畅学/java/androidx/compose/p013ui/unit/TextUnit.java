package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class TextUnit {
    public static final Companion Companion = new Companion(null);
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m27103getUnspecifiedXSAIIZE$annotations() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m27104getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        private Companion() {
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m27118boximpl(companion.m27127getUnspecifiedUIouoOA()), TextUnitType.m27118boximpl(companion.m27126getSpUIouoOA()), TextUnitType.m27118boximpl(companion.m27125getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m27083boximpl(long j10) {
        return new TextUnit(j10);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m27084compareToR2X_6o(long j10, long j11) {
        TextUnitKt.m27107checkArithmeticNB67dxo(j10, j11);
        return Float.compare(m27093getValueimpl(j10), m27093getValueimpl(j11));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m27085constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m27087divkPz2Gy4(long j10, float f10) {
        TextUnitKt.m27106checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m27091getRawTypeimpl(j10), m27093getValueimpl(j10) / f10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27089equalsimpl(long j10, Object obj) {
        return (obj instanceof TextUnit) && j10 == ((TextUnit) obj).m27102unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27090equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m27091getRawTypeimpl(long j10) {
        return j10 & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m27092getTypeUIouoOA(long j10) {
        return TextUnitTypes[(int) (m27091getRawTypeimpl(j10) >>> 32)].m27124unboximpl();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m27093getValueimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27094hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m27095isEmimpl(long j10) {
        return m27091getRawTypeimpl(j10) == IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m27096isSpimpl(long j10) {
        return m27091getRawTypeimpl(j10) == IjkMediaMeta.AV_CH_WIDE_RIGHT;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m27098timeskPz2Gy4(long j10, float f10) {
        TextUnitKt.m27106checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m27091getRawTypeimpl(j10), m27093getValueimpl(j10) * f10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27100toStringimpl(long j10) {
        long jM27092getTypeUIouoOA = m27092getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27127getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27126getSpUIouoOA())) {
            return m27093getValueimpl(j10) + ".sp";
        }
        if (!TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27125getEmUIouoOA())) {
            return "Invalid";
        }
        return m27093getValueimpl(j10) + ".em";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m27101unaryMinusXSAIIZE(long j10) {
        TextUnitKt.m27106checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m27091getRawTypeimpl(j10), -m27093getValueimpl(j10));
    }

    public boolean equals(Object obj) {
        return m27089equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m27094hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m27100toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m27102unboximpl() {
        return this.packedValue;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m27086divkPz2Gy4(long j10, double d10) {
        TextUnitKt.m27106checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m27091getRawTypeimpl(j10), (float) (m27093getValueimpl(j10) / d10));
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m27097timeskPz2Gy4(long j10, double d10) {
        TextUnitKt.m27106checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m27091getRawTypeimpl(j10), (float) (m27093getValueimpl(j10) * d10));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m27088divkPz2Gy4(long j10, int i10) {
        TextUnitKt.m27106checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m27091getRawTypeimpl(j10), m27093getValueimpl(j10) / i10);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m27099timeskPz2Gy4(long j10, int i10) {
        TextUnitKt.m27106checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m27091getRawTypeimpl(j10), m27093getValueimpl(j10) * i10);
    }
}
