package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000F\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\u001a \u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0015\u001a\"\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a*\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a*\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001d\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\fH\u0001¢\u0006\u0002\u00107\u001a%\u00108\u001a\u00020\u0006*\u00020\u00062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060:H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u001f\u0010=\u001a\u00020\u0006*\u00020\u00072\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u001f\u0010=\u001a\u00020\u0006*\u00020\f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010#\u001a\u001f\u0010=\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010A\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\r\u001a\u0004\b\n\u0010\u000e\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0010\u001a\u0004\b\n\u0010\u0011\"\u001f\u0010\u0012\u001a\u00020\u0013*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001f\u0010\u0018\u001a\u00020\u0013*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u000b\"\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000e\"\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, m13558d2 = {"UNIT_MASK", "", "UNIT_TYPE_EM", "UNIT_TYPE_SP", "UNIT_TYPE_UNSPECIFIED", "em", "Landroidx/compose/ui/unit/TextUnit;", "", "getEm$annotations", "(D)V", "getEm", "(D)J", "", "(F)V", "(F)J", "", "(I)V", "(I)J", "isSpecified", "", "isSpecified--R2X_6o$annotations", "(J)V", "isSpecified--R2X_6o", "(J)Z", "isUnspecified", "isUnspecified--R2X_6o$annotations", "isUnspecified--R2X_6o", "sp", "getSp$annotations", "getSp", "TextUnit", "value", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/unit/TextUnitType;", "TextUnit-anM5pPY", "(FJ)J", "checkArithmetic", "", "a", "checkArithmetic--R2X_6o", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", "lerp", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "pack", "unitType", "v", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "times", "other", "times-mpE4wyQ", "(DJ)J", "(IJ)J", "ui-unit_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,366:1\n247#1:367\n242#1,6:368\n247#1:374\n247#1:380\n247#1:391\n37#2,5:375\n37#2,5:381\n37#2,5:386\n37#2,5:392\n37#2,5:397\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n242#1:367\n253#1:368,6\n327#1:374\n332#1:380\n340#1:391\n327#1:375,5\n332#1:381,5\n335#1:386,5\n340#1:392,5\n343#1:397,5\n*E\n"})
/* loaded from: classes2.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m23767TextUnitanM5pPY(float f10, long j10) {
        return pack(j10, f10);
    }

    @PublishedApi
    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m23768checkArithmeticR2X_6o(long j10) {
        if (TextUnit.m23753getRawTypeimpl(j10) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    @PublishedApi
    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m23769checkArithmeticNB67dxo(long j10, long j11) {
        if (!((TextUnit.m23753getRawTypeimpl(j10) == 0 || TextUnit.m23753getRawTypeimpl(j11) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m23783equalsimpl0(TextUnit.m23754getTypeUIouoOA(j10), TextUnit.m23754getTypeUIouoOA(j11))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m23785toStringimpl(TextUnit.m23754getTypeUIouoOA(j10))) + " and " + ((Object) TextUnitType.m23785toStringimpl(TextUnit.m23754getTypeUIouoOA(j11))));
    }

    @PublishedApi
    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m23770checkArithmeticvU0ePk(long j10, long j11, long j12) {
        boolean z9 = false;
        if (!((TextUnit.m23753getRawTypeimpl(j10) == 0 || TextUnit.m23753getRawTypeimpl(j11) == 0 || TextUnit.m23753getRawTypeimpl(j12) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m23783equalsimpl0(TextUnit.m23754getTypeUIouoOA(j10), TextUnit.m23754getTypeUIouoOA(j11)) && TextUnitType.m23783equalsimpl0(TextUnit.m23754getTypeUIouoOA(j11), TextUnit.m23754getTypeUIouoOA(j12))) {
            z9 = true;
        }
        if (z9) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m23785toStringimpl(TextUnit.m23754getTypeUIouoOA(j10))) + " and " + ((Object) TextUnitType.m23785toStringimpl(TextUnit.m23754getTypeUIouoOA(j11))));
    }

    public static final long getEm(float f10) {
        return pack(UNIT_TYPE_EM, f10);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d10) {
    }

    public static final long getSp(float f10) {
        return pack(UNIT_TYPE_SP, f10);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d10) {
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m23771isSpecifiedR2X_6o(long j10) {
        return !(TextUnit.m23753getRawTypeimpl(j10) == 0);
    }

    @Stable
    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m23772isSpecifiedR2X_6o$annotations(long j10) {
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m23773isUnspecifiedR2X_6o(long j10) {
        return TextUnit.m23753getRawTypeimpl(j10) == 0;
    }

    @Stable
    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m23774isUnspecifiedR2X_6o$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m23775lerpC3pnCVY(long j10, long j11, float f10) {
        m23769checkArithmeticNB67dxo(j10, j11);
        return pack(TextUnit.m23753getRawTypeimpl(j10), MathHelpersKt.lerp(TextUnit.m23755getValueimpl(j10), TextUnit.m23755getValueimpl(j11), f10));
    }

    @PublishedApi
    public static final long pack(long j10, float f10) {
        return TextUnit.m23747constructorimpl(j10 | (Float.floatToRawIntBits(f10) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m23776takeOrElseeAf_CNQ(long j10, Function0<TextUnit> function0) {
        return !((TextUnit.m23753getRawTypeimpl(j10) > 0L ? 1 : (TextUnit.m23753getRawTypeimpl(j10) == 0L ? 0 : -1)) == 0) ? j10 : function0.invoke().getPackedValue();
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m23778timesmpE4wyQ(float f10, long j10) {
        m23768checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m23753getRawTypeimpl(j10), f10 * TextUnit.m23755getValueimpl(j10));
    }

    public static final long getEm(double d10) {
        return pack(UNIT_TYPE_EM, (float) d10);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f10) {
    }

    public static final long getSp(double d10) {
        return pack(UNIT_TYPE_SP, (float) d10);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f10) {
    }

    public static final long getEm(int i10) {
        return pack(UNIT_TYPE_EM, i10);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i10) {
    }

    public static final long getSp(int i10) {
        return pack(UNIT_TYPE_SP, i10);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i10) {
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m23777timesmpE4wyQ(double d10, long j10) {
        m23768checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m23753getRawTypeimpl(j10), ((float) d10) * TextUnit.m23755getValueimpl(j10));
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m23779timesmpE4wyQ(int i10, long j10) {
        m23768checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m23753getRawTypeimpl(j10), i10 * TextUnit.m23755getValueimpl(j10));
    }
}
