package androidx.compose.p011ui.unit;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.compose.p011ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010 J\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010!J\u001a\u0010\"\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010 J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0005R\u0017\u0010\u0010\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m5110d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "packedValue", "", "constructor-impl", "(J)J", "isEm", "", "isEm-impl", "(J)Z", "isSp", "isSp-impl", "rawType", "getRawType$annotations", "()V", "getRawType-impl", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "value", "", "getValue-impl", "(J)F", "compareTo", "", "other", "compareTo--R2X_6o", "(JJ)I", "div", "", "div-kPz2Gy4", "(JD)J", "(JF)J", "(JI)J", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "times", "times-kPz2Gy4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-XSAIIZE", "Companion", "ui-unit_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,366:1\n22#2:367\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n236#1:367\n*E\n"})
/* loaded from: classes2.dex */
public final class TextUnit {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    @Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m5110d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "()V", "TextUnitTypes", "", "Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit_release", "()[Landroidx/compose/ui/unit/TextUnitType;", "[Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "Landroidx/compose/ui/unit/TextUnit;", "getUnspecified-XSAIIZE$annotations", "getUnspecified-XSAIIZE", "()J", "J", "ui-unit_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m13509getUnspecifiedXSAIIZE$annotations() {
        }

        @NotNull
        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m13510getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        private Companion() {
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m13524boximpl(companion.m13533getUnspecifiedUIouoOA()), TextUnitType.m13524boximpl(companion.m13532getSpUIouoOA()), TextUnitType.m13524boximpl(companion.m13531getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j7) {
        this.packedValue = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m13489boximpl(long j7) {
        return new TextUnit(j7);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m13490compareToR2X_6o(long j7, long j8) {
        TextUnitKt.m13513checkArithmeticNB67dxo(j7, j8);
        return Float.compare(m13499getValueimpl(j7), m13499getValueimpl(j8));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m13491constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m13493divkPz2Gy4(long j7, float f) {
        TextUnitKt.m13512checkArithmeticR2X_6o(j7);
        return TextUnitKt.pack(m13497getRawTypeimpl(j7), m13499getValueimpl(j7) / f);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13495equalsimpl(long j7, Object obj) {
        return (obj instanceof TextUnit) && j7 == ((TextUnit) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13496equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    @PublishedApi
    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m13497getRawTypeimpl(long j7) {
        return j7 & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m13498getTypeUIouoOA(long j7) {
        return TextUnitTypes[(int) (m13497getRawTypeimpl(j7) >>> 32)].getType();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m13499getValueimpl(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13500hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m13501isEmimpl(long j7) {
        return m13497getRawTypeimpl(j7) == 8589934592L;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m13502isSpimpl(long j7) {
        return m13497getRawTypeimpl(j7) == 4294967296L;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m13504timeskPz2Gy4(long j7, float f) {
        TextUnitKt.m13512checkArithmeticR2X_6o(j7);
        return TextUnitKt.pack(m13497getRawTypeimpl(j7), m13499getValueimpl(j7) * f);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13506toStringimpl(long j7) {
        long jM13498getTypeUIouoOA = m13498getTypeUIouoOA(j7);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13533getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13532getSpUIouoOA())) {
            return m13499getValueimpl(j7) + ".sp";
        }
        if (!TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13531getEmUIouoOA())) {
            return "Invalid";
        }
        return m13499getValueimpl(j7) + ".em";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m13507unaryMinusXSAIIZE(long j7) {
        TextUnitKt.m13512checkArithmeticR2X_6o(j7);
        return TextUnitKt.pack(m13497getRawTypeimpl(j7), -m13499getValueimpl(j7));
    }

    public boolean equals(Object obj) {
        return m13495equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m13500hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m13506toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m13492divkPz2Gy4(long j7, double d9) {
        TextUnitKt.m13512checkArithmeticR2X_6o(j7);
        return TextUnitKt.pack(m13497getRawTypeimpl(j7), (float) (m13499getValueimpl(j7) / d9));
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m13503timeskPz2Gy4(long j7, double d9) {
        TextUnitKt.m13512checkArithmeticR2X_6o(j7);
        return TextUnitKt.pack(m13497getRawTypeimpl(j7), (float) (m13499getValueimpl(j7) * d9));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m13494divkPz2Gy4(long j7, int i) {
        TextUnitKt.m13512checkArithmeticR2X_6o(j7);
        return TextUnitKt.pack(m13497getRawTypeimpl(j7), m13499getValueimpl(j7) / i);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m13505timeskPz2Gy4(long j7, int i) {
        TextUnitKt.m13512checkArithmeticR2X_6o(j7);
        return TextUnitKt.pack(m13497getRawTypeimpl(j7), m13499getValueimpl(j7) * i);
    }
}
