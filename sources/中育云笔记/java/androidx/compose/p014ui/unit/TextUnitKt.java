package androidx.compose.p014ui.unit;

import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m33707TextUnitanM5pPY(float f10, long j10) {
        return pack(j10, f10);
    }

    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m33708checkArithmeticR2X_6o(long j10) {
        if (TextUnit.m33693getRawTypeimpl(j10) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m33709checkArithmeticNB67dxo(long j10, long j11) {
        if (!((TextUnit.m33693getRawTypeimpl(j10) == 0 || TextUnit.m33693getRawTypeimpl(j11) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(j10), TextUnit.m33694getTypeUIouoOA(j11))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m33725toStringimpl(TextUnit.m33694getTypeUIouoOA(j10))) + " and " + ((Object) TextUnitType.m33725toStringimpl(TextUnit.m33694getTypeUIouoOA(j11))));
    }

    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m33710checkArithmeticvU0ePk(long j10, long j11, long j12) {
        boolean z10 = false;
        if (!((TextUnit.m33693getRawTypeimpl(j10) == 0 || TextUnit.m33693getRawTypeimpl(j11) == 0 || TextUnit.m33693getRawTypeimpl(j12) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(j10), TextUnit.m33694getTypeUIouoOA(j11)) && TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(j11), TextUnit.m33694getTypeUIouoOA(j12))) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m33725toStringimpl(TextUnit.m33694getTypeUIouoOA(j10))) + " and " + ((Object) TextUnitType.m33725toStringimpl(TextUnit.m33694getTypeUIouoOA(j11))));
    }

    public static final long getEm(float f10) {
        return pack(8589934592L, f10);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d10) {
    }

    public static final long getSp(float f10) {
        return pack(4294967296L, f10);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d10) {
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m33711isSpecifiedR2X_6o(long j10) {
        return !(TextUnit.m33693getRawTypeimpl(j10) == 0);
    }

    @Stable
    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m33712isSpecifiedR2X_6o$annotations(long j10) {
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m33713isUnspecifiedR2X_6o(long j10) {
        return TextUnit.m33693getRawTypeimpl(j10) == 0;
    }

    @Stable
    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m33714isUnspecifiedR2X_6o$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m33715lerpC3pnCVY(long j10, long j11, float f10) {
        m33709checkArithmeticNB67dxo(j10, j11);
        return pack(TextUnit.m33693getRawTypeimpl(j10), MathHelpersKt.lerp(TextUnit.m33695getValueimpl(j10), TextUnit.m33695getValueimpl(j11), f10));
    }

    public static final long pack(long j10, float f10) {
        return TextUnit.m33687constructorimpl(j10 | (Float.floatToRawIntBits(f10) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m33716takeOrElseeAf_CNQ(long j10, InterfaceC9529a interfaceC9529a) {
        return !((TextUnit.m33693getRawTypeimpl(j10) > 0L ? 1 : (TextUnit.m33693getRawTypeimpl(j10) == 0L ? 0 : -1)) == 0) ? j10 : ((TextUnit) interfaceC9529a.invoke()).m33704unboximpl();
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m33718timesmpE4wyQ(float f10, long j10) {
        m33708checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m33693getRawTypeimpl(j10), f10 * TextUnit.m33695getValueimpl(j10));
    }

    public static final long getEm(double d10) {
        return pack(8589934592L, (float) d10);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f10) {
    }

    public static final long getSp(double d10) {
        return pack(4294967296L, (float) d10);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f10) {
    }

    public static final long getEm(int i10) {
        return pack(8589934592L, i10);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i10) {
    }

    public static final long getSp(int i10) {
        return pack(4294967296L, i10);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i10) {
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m33717timesmpE4wyQ(double d10, long j10) {
        m33708checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m33693getRawTypeimpl(j10), ((float) d10) * TextUnit.m33695getValueimpl(j10));
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m33719timesmpE4wyQ(int i10, long j10) {
        m33708checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m33693getRawTypeimpl(j10), i10 * TextUnit.m33695getValueimpl(j10));
    }
}
