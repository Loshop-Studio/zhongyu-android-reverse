package androidx.compose.p006ui.unit;

import androidx.compose.p006ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000F\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0015\u001a%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a-\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a-\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a \u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0002\u00107\u001a+\u00108\u001a\u00020\u0006*\u00020\u00062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060:H\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\"\u0010=\u001a\u00020\u0006*\u00020\u00072\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\"\u0010=\u001a\u00020\u0006*\u00020\f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010#\u001a\"\u0010=\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010A\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"!\u0010\u0005\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"!\u0010\u0005\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\r\u001a\u0004\b\n\u0010\u000e\"!\u0010\u0005\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0010\u001a\u0004\b\n\u0010\u0011\"\"\u0010\u0012\u001a\u00020\u0013*\u00020\u00068Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"!\u0010\u0018\u001a\u00020\u0013*\u00020\u00068FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"!\u0010\u001b\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u000b\"!\u0010\u001b\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000e\"!\u0010\u001b\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006B"}, m5175d2 = {"UNIT_MASK", "", "UNIT_TYPE_EM", "UNIT_TYPE_SP", "UNIT_TYPE_UNSPECIFIED", "em", "Landroidx/compose/ui/unit/TextUnit;", "", "getEm$annotations", "(D)V", "getEm", "(D)J", "", "(F)V", "(F)J", "", "(I)V", "(I)J", "isSpecified", "", "isSpecified--R2X_6o$annotations", "(J)V", "isSpecified--R2X_6o", "(J)Z", "isUnspecified", "isUnspecified--R2X_6o$annotations", "isUnspecified--R2X_6o", "sp", "getSp$annotations", "getSp", "TextUnit", "value", "type", "Landroidx/compose/ui/unit/TextUnitType;", "TextUnit-anM5pPY", "(FJ)J", "checkArithmetic", "", C3335ai.f1705at, "checkArithmetic--R2X_6o", "b", "checkArithmetic-NB67dxo", "(JJ)V", C3335ai.f1663aD, "checkArithmetic-vU-0ePk", "(JJJ)V", "lerp", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "pack", "unitType", C3335ai.f1662aC, "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "times", "other", "times-mpE4wyQ", "(DJ)J", "(IJ)J", "ui-unit_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,388:1\n250#1:389\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n264#1:389\n*E\n"})
/* loaded from: classes.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m11718TextUnitanM5pPY(float f4, long j4) {
        return pack(j4, f4);
    }

    @PublishedApi
    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m11719checkArithmeticR2X_6o(long j4) {
        if (!(!m11724isUnspecifiedR2X_6o(j4))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    @PublishedApi
    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m11720checkArithmeticNB67dxo(long j4, long j5) {
        if (!((m11724isUnspecifiedR2X_6o(j4) || m11724isUnspecifiedR2X_6o(j5)) ? false : true)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (TextUnitType.m11734equalsimpl0(TextUnit.m11705getTypeUIouoOA(j4), TextUnit.m11705getTypeUIouoOA(j5))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m11736toStringimpl(TextUnit.m11705getTypeUIouoOA(j4))) + " and " + ((Object) TextUnitType.m11736toStringimpl(TextUnit.m11705getTypeUIouoOA(j5)))).toString());
    }

    @PublishedApi
    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m11721checkArithmeticvU0ePk(long j4, long j5, long j6) {
        if (!((m11724isUnspecifiedR2X_6o(j4) || m11724isUnspecifiedR2X_6o(j5) || m11724isUnspecifiedR2X_6o(j6)) ? false : true)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (TextUnitType.m11734equalsimpl0(TextUnit.m11705getTypeUIouoOA(j4), TextUnit.m11705getTypeUIouoOA(j5)) && TextUnitType.m11734equalsimpl0(TextUnit.m11705getTypeUIouoOA(j5), TextUnit.m11705getTypeUIouoOA(j6))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m11736toStringimpl(TextUnit.m11705getTypeUIouoOA(j4))) + " and " + ((Object) TextUnitType.m11736toStringimpl(TextUnit.m11705getTypeUIouoOA(j5)))).toString());
    }

    public static final long getEm(float f4) {
        return pack(UNIT_TYPE_EM, f4);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d4) {
    }

    public static final long getSp(float f4) {
        return pack(UNIT_TYPE_SP, f4);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d4) {
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m11722isSpecifiedR2X_6o(long j4) {
        return !m11724isUnspecifiedR2X_6o(j4);
    }

    @Stable
    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m11723isSpecifiedR2X_6o$annotations(long j4) {
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m11724isUnspecifiedR2X_6o(long j4) {
        return TextUnit.m11704getRawTypeimpl(j4) == 0;
    }

    @Stable
    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m11725isUnspecifiedR2X_6o$annotations(long j4) {
    }

    @Stable
    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m11726lerpC3pnCVY(long j4, long j5, float f4) {
        m11720checkArithmeticNB67dxo(j4, j5);
        return pack(TextUnit.m11704getRawTypeimpl(j4), MathHelpersKt.lerp(TextUnit.m11706getValueimpl(j4), TextUnit.m11706getValueimpl(j5), f4));
    }

    @PublishedApi
    public static final long pack(long j4, float f4) {
        return TextUnit.m11698constructorimpl(j4 | (Float.floatToIntBits(f4) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m11727takeOrElseeAf_CNQ(long j4, Function0<TextUnit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return m11724isUnspecifiedR2X_6o(j4) ^ true ? j4 : block.invoke().getPackedValue();
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m11729timesmpE4wyQ(float f4, long j4) {
        m11719checkArithmeticR2X_6o(j4);
        return pack(TextUnit.m11704getRawTypeimpl(j4), f4 * TextUnit.m11706getValueimpl(j4));
    }

    public static final long getEm(double d4) {
        return pack(UNIT_TYPE_EM, (float) d4);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f4) {
    }

    public static final long getSp(double d4) {
        return pack(UNIT_TYPE_SP, (float) d4);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f4) {
    }

    public static final long getEm(int i4) {
        return pack(UNIT_TYPE_EM, i4);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i4) {
    }

    public static final long getSp(int i4) {
        return pack(UNIT_TYPE_SP, i4);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i4) {
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m11728timesmpE4wyQ(double d4, long j4) {
        m11719checkArithmeticR2X_6o(j4);
        return pack(TextUnit.m11704getRawTypeimpl(j4), ((float) d4) * TextUnit.m11706getValueimpl(j4));
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m11730timesmpE4wyQ(int i4, long j4) {
        m11719checkArithmeticR2X_6o(j4);
        return pack(TextUnit.m11704getRawTypeimpl(j4), i4 * TextUnit.m11706getValueimpl(j4));
    }
}
