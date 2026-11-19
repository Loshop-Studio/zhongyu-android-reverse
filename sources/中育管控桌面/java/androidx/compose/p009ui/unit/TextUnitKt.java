package androidx.compose.p009ui.unit;

import androidx.compose.p009ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000F\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\u001a \u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0015\u001a\"\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a*\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a*\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001d\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\fH\u0001¢\u0006\u0002\u00107\u001a%\u00108\u001a\u00020\u0006*\u00020\u00062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060:H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u001f\u0010=\u001a\u00020\u0006*\u00020\u00072\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u001f\u0010=\u001a\u00020\u0006*\u00020\f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010#\u001a\u001f\u0010=\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010A\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\r\u001a\u0004\b\n\u0010\u000e\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0010\u001a\u0004\b\n\u0010\u0011\"\u001f\u0010\u0012\u001a\u00020\u0013*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001f\u0010\u0018\u001a\u00020\u0013*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u000b\"\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000e\"\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, m7880d2 = {"UNIT_MASK", "", "UNIT_TYPE_EM", "UNIT_TYPE_SP", "UNIT_TYPE_UNSPECIFIED", "em", "Landroidx/compose/ui/unit/TextUnit;", "", "getEm$annotations", "(D)V", "getEm", "(D)J", "", "(F)V", "(F)J", "", "(I)V", "(I)J", "isSpecified", "", "isSpecified--R2X_6o$annotations", "(J)V", "isSpecified--R2X_6o", "(J)Z", "isUnspecified", "isUnspecified--R2X_6o$annotations", "isUnspecified--R2X_6o", "sp", "getSp$annotations", "getSp", "TextUnit", "value", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/unit/TextUnitType;", "TextUnit-anM5pPY", "(FJ)J", "checkArithmetic", "", "a", "checkArithmetic--R2X_6o", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", "lerp", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "pack", "unitType", "v", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "times", "other", "times-mpE4wyQ", "(DJ)J", "(IJ)J", "ui-unit_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,366:1\n247#1:367\n242#1,6:368\n247#1:374\n247#1:380\n247#1:391\n37#2,5:375\n37#2,5:381\n37#2,5:386\n37#2,5:392\n37#2,5:397\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n242#1:367\n253#1:368,6\n327#1:374\n332#1:380\n340#1:391\n327#1:375,5\n332#1:381,5\n335#1:386,5\n340#1:392,5\n343#1:397,5\n*E\n"})
/* loaded from: classes2.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m16690TextUnitanM5pPY(float f6, long j6) {
        return pack(j6, f6);
    }

    @PublishedApi
    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m16691checkArithmeticR2X_6o(long j6) {
        if (TextUnit.m16676getRawTypeimpl(j6) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    @PublishedApi
    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m16692checkArithmeticNB67dxo(long j6, long j7) {
        if (!((TextUnit.m16676getRawTypeimpl(j6) == 0 || TextUnit.m16676getRawTypeimpl(j7) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m16706equalsimpl0(TextUnit.m16677getTypeUIouoOA(j6), TextUnit.m16677getTypeUIouoOA(j7))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m16708toStringimpl(TextUnit.m16677getTypeUIouoOA(j6))) + " and " + ((Object) TextUnitType.m16708toStringimpl(TextUnit.m16677getTypeUIouoOA(j7))));
    }

    @PublishedApi
    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m16693checkArithmeticvU0ePk(long j6, long j7, long j8) {
        boolean z6 = false;
        if (!((TextUnit.m16676getRawTypeimpl(j6) == 0 || TextUnit.m16676getRawTypeimpl(j7) == 0 || TextUnit.m16676getRawTypeimpl(j8) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m16706equalsimpl0(TextUnit.m16677getTypeUIouoOA(j6), TextUnit.m16677getTypeUIouoOA(j7)) && TextUnitType.m16706equalsimpl0(TextUnit.m16677getTypeUIouoOA(j7), TextUnit.m16677getTypeUIouoOA(j8))) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m16708toStringimpl(TextUnit.m16677getTypeUIouoOA(j6))) + " and " + ((Object) TextUnitType.m16708toStringimpl(TextUnit.m16677getTypeUIouoOA(j7))));
    }

    public static final long getEm(float f6) {
        return pack(UNIT_TYPE_EM, f6);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d6) {
    }

    public static final long getSp(float f6) {
        return pack(UNIT_TYPE_SP, f6);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d6) {
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m16694isSpecifiedR2X_6o(long j6) {
        return !(TextUnit.m16676getRawTypeimpl(j6) == 0);
    }

    @Stable
    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m16695isSpecifiedR2X_6o$annotations(long j6) {
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m16696isUnspecifiedR2X_6o(long j6) {
        return TextUnit.m16676getRawTypeimpl(j6) == 0;
    }

    @Stable
    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m16697isUnspecifiedR2X_6o$annotations(long j6) {
    }

    @Stable
    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m16698lerpC3pnCVY(long j6, long j7, float f6) {
        m16692checkArithmeticNB67dxo(j6, j7);
        return pack(TextUnit.m16676getRawTypeimpl(j6), MathHelpersKt.lerp(TextUnit.m16678getValueimpl(j6), TextUnit.m16678getValueimpl(j7), f6));
    }

    @PublishedApi
    public static final long pack(long j6, float f6) {
        return TextUnit.m16670constructorimpl(j6 | (Float.floatToRawIntBits(f6) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m16699takeOrElseeAf_CNQ(long j6, Function0<TextUnit> function0) {
        return !((TextUnit.m16676getRawTypeimpl(j6) > 0L ? 1 : (TextUnit.m16676getRawTypeimpl(j6) == 0L ? 0 : -1)) == 0) ? j6 : function0.invoke().getPackedValue();
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m16701timesmpE4wyQ(float f6, long j6) {
        m16691checkArithmeticR2X_6o(j6);
        return pack(TextUnit.m16676getRawTypeimpl(j6), f6 * TextUnit.m16678getValueimpl(j6));
    }

    public static final long getEm(double d6) {
        return pack(UNIT_TYPE_EM, (float) d6);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f6) {
    }

    public static final long getSp(double d6) {
        return pack(UNIT_TYPE_SP, (float) d6);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f6) {
    }

    public static final long getEm(int i6) {
        return pack(UNIT_TYPE_EM, i6);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i6) {
    }

    public static final long getSp(int i6) {
        return pack(UNIT_TYPE_SP, i6);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i6) {
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m16700timesmpE4wyQ(double d6, long j6) {
        m16691checkArithmeticR2X_6o(j6);
        return pack(TextUnit.m16676getRawTypeimpl(j6), ((float) d6) * TextUnit.m16678getValueimpl(j6));
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m16702timesmpE4wyQ(int i6, long j6) {
        m16691checkArithmeticR2X_6o(j6);
        return pack(TextUnit.m16676getRawTypeimpl(j6), i6 * TextUnit.m16678getValueimpl(j6));
    }
}
