package androidx.compose.p006ui.unit;

import androidx.compose.animation.AbstractC0321a;
import androidx.compose.p006ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

@Immutable
@Metadata(m5174d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010 J!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010!J\u001a\u0010\"\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ!\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010 J!\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u0000H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m5175d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "packedValue", "", "constructor-impl", "(J)J", "isEm", "", "isEm-impl", "(J)Z", "isSp", "isSp-impl", "rawType", "getRawType$annotations", "()V", "getRawType-impl", "type", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "value", "", "getValue-impl", "(J)F", "compareTo", "", "other", "compareTo--R2X_6o", "(JJ)I", "div", "", "div-kPz2Gy4", "(JD)J", "(JF)J", "(JI)J", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "times", "times-kPz2Gy4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-XSAIIZE", "Companion", "ui-unit_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class TextUnit {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    @Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m5175d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "()V", "TextUnitTypes", "", "Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit_release", "()[Landroidx/compose/ui/unit/TextUnitType;", "[Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "Landroidx/compose/ui/unit/TextUnit;", "getUnspecified-XSAIIZE$annotations", "getUnspecified-XSAIIZE", "()J", "J", "ui-unit_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m11716getUnspecifiedXSAIIZE$annotations() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m11717getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m11731boximpl(companion.m11740getUnspecifiedUIouoOA()), TextUnitType.m11731boximpl(companion.m11739getSpUIouoOA()), TextUnitType.m11731boximpl(companion.m11738getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j4) {
        this.packedValue = j4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m11696boximpl(long j4) {
        return new TextUnit(j4);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m11697compareToR2X_6o(long j4, long j5) {
        TextUnitKt.m11720checkArithmeticNB67dxo(j4, j5);
        return Float.compare(m11706getValueimpl(j4), m11706getValueimpl(j5));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m11698constructorimpl(long j4) {
        return j4;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m11700divkPz2Gy4(long j4, float f4) {
        TextUnitKt.m11719checkArithmeticR2X_6o(j4);
        return TextUnitKt.pack(m11704getRawTypeimpl(j4), m11706getValueimpl(j4) / f4);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11702equalsimpl(long j4, Object obj) {
        return (obj instanceof TextUnit) && j4 == ((TextUnit) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11703equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    @PublishedApi
    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m11704getRawTypeimpl(long j4) {
        return j4 & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m11705getTypeUIouoOA(long j4) {
        return TextUnitTypes[(int) (m11704getRawTypeimpl(j4) >>> 32)].getType();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m11706getValueimpl(long j4) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11707hashCodeimpl(long j4) {
        return AbstractC0321a.m137a(j4);
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m11708isEmimpl(long j4) {
        return m11704getRawTypeimpl(j4) == 8589934592L;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m11709isSpimpl(long j4) {
        return m11704getRawTypeimpl(j4) == 4294967296L;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m11711timeskPz2Gy4(long j4, float f4) {
        TextUnitKt.m11719checkArithmeticR2X_6o(j4);
        return TextUnitKt.pack(m11704getRawTypeimpl(j4), m11706getValueimpl(j4) * f4);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11713toStringimpl(long j4) {
        long jM11705getTypeUIouoOA = m11705getTypeUIouoOA(j4);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11740getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11739getSpUIouoOA())) {
            return m11706getValueimpl(j4) + ".sp";
        }
        if (!TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11738getEmUIouoOA())) {
            return "Invalid";
        }
        return m11706getValueimpl(j4) + ".em";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m11714unaryMinusXSAIIZE(long j4) {
        TextUnitKt.m11719checkArithmeticR2X_6o(j4);
        return TextUnitKt.pack(m11704getRawTypeimpl(j4), -m11706getValueimpl(j4));
    }

    public boolean equals(Object obj) {
        return m11702equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m11707hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m11713toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m11699divkPz2Gy4(long j4, double d4) {
        TextUnitKt.m11719checkArithmeticR2X_6o(j4);
        return TextUnitKt.pack(m11704getRawTypeimpl(j4), (float) (m11706getValueimpl(j4) / d4));
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m11710timeskPz2Gy4(long j4, double d4) {
        TextUnitKt.m11719checkArithmeticR2X_6o(j4);
        return TextUnitKt.pack(m11704getRawTypeimpl(j4), (float) (m11706getValueimpl(j4) * d4));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m11701divkPz2Gy4(long j4, int i4) {
        TextUnitKt.m11719checkArithmeticR2X_6o(j4);
        return TextUnitKt.pack(m11704getRawTypeimpl(j4), m11706getValueimpl(j4) / i4);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m11712timeskPz2Gy4(long j4, int i4) {
        TextUnitKt.m11719checkArithmeticR2X_6o(j4);
        return TextUnitKt.pack(m11704getRawTypeimpl(j4), m11706getValueimpl(j4) * i4);
    }
}
