package androidx.compose.p012ui.unit;

import androidx.compose.p012ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010 J\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010!J\u001a\u0010\"\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010 J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0005R\u0017\u0010\u0010\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m13413d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "packedValue", "", "constructor-impl", "(J)J", "isEm", "", "isEm-impl", "(J)Z", "isSp", "isSp-impl", "rawType", "getRawType$annotations", "()V", "getRawType-impl", "type", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "value", "", "getValue-impl", "(J)F", "compareTo", "", "other", "compareTo--R2X_6o", "(JJ)I", "div", "", "div-kPz2Gy4", "(JD)J", "(JF)J", "(JI)J", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "times", "times-kPz2Gy4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-XSAIIZE", "Companion", "ui-unit_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,366:1\n22#2:367\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n236#1:367\n*E\n"})
/* loaded from: classes2.dex */
public final class TextUnit {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    @Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m13413d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "()V", "TextUnitTypes", "", "Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit_release", "()[Landroidx/compose/ui/unit/TextUnitType;", "[Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "Landroidx/compose/ui/unit/TextUnit;", "getUnspecified-XSAIIZE$annotations", "getUnspecified-XSAIIZE", "()J", "J", "ui-unit_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m24198getUnspecifiedXSAIIZE$annotations() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m24199getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        private Companion() {
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m24213boximpl(companion.m24222getUnspecifiedUIouoOA()), TextUnitType.m24213boximpl(companion.m24221getSpUIouoOA()), TextUnitType.m24213boximpl(companion.m24220getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j9) {
        this.packedValue = j9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m24178boximpl(long j9) {
        return new TextUnit(j9);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m24179compareToR2X_6o(long j9, long j10) {
        TextUnitKt.m24202checkArithmeticNB67dxo(j9, j10);
        return Float.compare(m24188getValueimpl(j9), m24188getValueimpl(j10));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m24180constructorimpl(long j9) {
        return j9;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m24182divkPz2Gy4(long j9, float f10) {
        TextUnitKt.m24201checkArithmeticR2X_6o(j9);
        return TextUnitKt.pack(m24186getRawTypeimpl(j9), m24188getValueimpl(j9) / f10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24184equalsimpl(long j9, Object obj) {
        return (obj instanceof TextUnit) && j9 == ((TextUnit) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24185equalsimpl0(long j9, long j10) {
        return j9 == j10;
    }

    @PublishedApi
    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m24186getRawTypeimpl(long j9) {
        return j9 & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m24187getTypeUIouoOA(long j9) {
        return TextUnitTypes[(int) (m24186getRawTypeimpl(j9) >>> 32)].getType();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m24188getValueimpl(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24189hashCodeimpl(long j9) {
        return Long.hashCode(j9);
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m24190isEmimpl(long j9) {
        return m24186getRawTypeimpl(j9) == 8589934592L;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m24191isSpimpl(long j9) {
        return m24186getRawTypeimpl(j9) == 4294967296L;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m24193timeskPz2Gy4(long j9, float f10) {
        TextUnitKt.m24201checkArithmeticR2X_6o(j9);
        return TextUnitKt.pack(m24186getRawTypeimpl(j9), m24188getValueimpl(j9) * f10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24195toStringimpl(long j9) {
        long jM24187getTypeUIouoOA = m24187getTypeUIouoOA(j9);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24222getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24221getSpUIouoOA())) {
            return m24188getValueimpl(j9) + ".sp";
        }
        if (!TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24220getEmUIouoOA())) {
            return "Invalid";
        }
        return m24188getValueimpl(j9) + ".em";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m24196unaryMinusXSAIIZE(long j9) {
        TextUnitKt.m24201checkArithmeticR2X_6o(j9);
        return TextUnitKt.pack(m24186getRawTypeimpl(j9), -m24188getValueimpl(j9));
    }

    public boolean equals(Object obj) {
        return m24184equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m24189hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m24195toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m24181divkPz2Gy4(long j9, double d10) {
        TextUnitKt.m24201checkArithmeticR2X_6o(j9);
        return TextUnitKt.pack(m24186getRawTypeimpl(j9), (float) (m24188getValueimpl(j9) / d10));
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m24192timeskPz2Gy4(long j9, double d10) {
        TextUnitKt.m24201checkArithmeticR2X_6o(j9);
        return TextUnitKt.pack(m24186getRawTypeimpl(j9), (float) (m24188getValueimpl(j9) * d10));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m24183divkPz2Gy4(long j9, int i9) {
        TextUnitKt.m24201checkArithmeticR2X_6o(j9);
        return TextUnitKt.pack(m24186getRawTypeimpl(j9), m24188getValueimpl(j9) / i9);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m24194timeskPz2Gy4(long j9, int i9) {
        TextUnitKt.m24201checkArithmeticR2X_6o(j9);
        return TextUnitKt.pack(m24186getRawTypeimpl(j9), m24188getValueimpl(j9) * i9);
    }
}
