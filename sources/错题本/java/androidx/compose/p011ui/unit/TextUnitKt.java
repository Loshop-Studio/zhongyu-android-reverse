package androidx.compose.p011ui.unit;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\f\u001a\u00020\u0004*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0006\u001a\u001f\u0010\u000f\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0011\u001a\u001f\u0010\u000f\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0013\u001a\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\"\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a*\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a*\u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+\"\u0014\u0010-\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010+\"\u0014\u0010.\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010+\"\u001f\u00103\u001a\u00020/*\u00020\u00048Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010\u001c\u001a\u0004\b0\u00101\"\u001f\u00106\u001a\u00020/*\u00020\u00048Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u001c\u001a\u0004\b4\u00101\"\u001e\u0010;\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108\"\u001e\u0010>\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010:\u001a\u0004\b<\u00108\"\u001e\u0010;\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010@\u001a\u0004\b7\u0010?\"\u001e\u0010>\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010@\u001a\u0004\b<\u0010?\"\u001e\u0010;\u001a\u00020\u0004*\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010B\u001a\u0004\b7\u0010A\"\u001e\u0010>\u001a\u00020\u0004*\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010B\u001a\u0004\b<\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, m5110d2 = {"", "value", "Landroidx/compose/ui/unit/TextUnitType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/unit/TextUnit;", "TextUnit-anM5pPY", "(FJ)J", "TextUnit", "Lkotlin/Function0;", "block", "takeOrElse-eAf_CNQ", "(JLr6/a;)J", "takeOrElse", "other", "times-mpE4wyQ", "times", "", "(DJ)J", "", "(IJ)J", "", "unitType", "v", "pack", "(JF)J", "a", "Ld6/s;", "checkArithmetic--R2X_6o", "(J)V", "checkArithmetic", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "lerp", "UNIT_MASK", "J", "UNIT_TYPE_UNSPECIFIED", "UNIT_TYPE_SP", "UNIT_TYPE_EM", "", "isSpecified--R2X_6o", "(J)Z", "isSpecified--R2X_6o$annotations", "isSpecified", "isUnspecified--R2X_6o", "isUnspecified--R2X_6o$annotations", "isUnspecified", "getSp", "(F)J", "getSp$annotations", "(F)V", "sp", "getEm", "getEm$annotations", "em", "(D)J", "(D)V", "(I)J", "(I)V", "ui-unit_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,366:1\n247#1:367\n242#1,6:368\n247#1:374\n247#1:380\n247#1:391\n37#2,5:375\n37#2,5:381\n37#2,5:386\n37#2,5:392\n37#2,5:397\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n242#1:367\n253#1:368,6\n327#1:374\n332#1:380\n340#1:391\n327#1:375,5\n332#1:381,5\n335#1:386,5\n340#1:392,5\n343#1:397,5\n*E\n"})
/* loaded from: classes2.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m13511TextUnitanM5pPY(float f, long j7) {
        return pack(j7, f);
    }

    @PublishedApi
    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m13512checkArithmeticR2X_6o(long j7) {
        if (TextUnit.m13497getRawTypeimpl(j7) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    @PublishedApi
    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m13513checkArithmeticNB67dxo(long j7, long j8) {
        if (!((TextUnit.m13497getRawTypeimpl(j7) == 0 || TextUnit.m13497getRawTypeimpl(j8) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m13527equalsimpl0(TextUnit.m13498getTypeUIouoOA(j7), TextUnit.m13498getTypeUIouoOA(j8))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m13529toStringimpl(TextUnit.m13498getTypeUIouoOA(j7))) + " and " + ((Object) TextUnitType.m13529toStringimpl(TextUnit.m13498getTypeUIouoOA(j8))));
    }

    @PublishedApi
    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m13514checkArithmeticvU0ePk(long j7, long j8, long j9) {
        boolean z8 = false;
        if (!((TextUnit.m13497getRawTypeimpl(j7) == 0 || TextUnit.m13497getRawTypeimpl(j8) == 0 || TextUnit.m13497getRawTypeimpl(j9) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m13527equalsimpl0(TextUnit.m13498getTypeUIouoOA(j7), TextUnit.m13498getTypeUIouoOA(j8)) && TextUnitType.m13527equalsimpl0(TextUnit.m13498getTypeUIouoOA(j8), TextUnit.m13498getTypeUIouoOA(j9))) {
            z8 = true;
        }
        if (z8) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m13529toStringimpl(TextUnit.m13498getTypeUIouoOA(j7))) + " and " + ((Object) TextUnitType.m13529toStringimpl(TextUnit.m13498getTypeUIouoOA(j8))));
    }

    public static final long getEm(float f) {
        return pack(UNIT_TYPE_EM, f);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d9) {
    }

    public static final long getSp(float f) {
        return pack(UNIT_TYPE_SP, f);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d9) {
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m13515isSpecifiedR2X_6o(long j7) {
        return !(TextUnit.m13497getRawTypeimpl(j7) == 0);
    }

    @Stable
    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m13516isSpecifiedR2X_6o$annotations(long j7) {
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m13517isUnspecifiedR2X_6o(long j7) {
        return TextUnit.m13497getRawTypeimpl(j7) == 0;
    }

    @Stable
    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m13518isUnspecifiedR2X_6o$annotations(long j7) {
    }

    @Stable
    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m13519lerpC3pnCVY(long j7, long j8, float f) {
        m13513checkArithmeticNB67dxo(j7, j8);
        return pack(TextUnit.m13497getRawTypeimpl(j7), MathHelpersKt.lerp(TextUnit.m13499getValueimpl(j7), TextUnit.m13499getValueimpl(j8), f));
    }

    @PublishedApi
    public static final long pack(long j7, float f) {
        return TextUnit.m13491constructorimpl(j7 | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m13520takeOrElseeAf_CNQ(long j7, @NotNull InterfaceC6469a interfaceC6469a) {
        return !((TextUnit.m13497getRawTypeimpl(j7) > 0L ? 1 : (TextUnit.m13497getRawTypeimpl(j7) == 0L ? 0 : -1)) == 0) ? j7 : ((TextUnit) interfaceC6469a.invoke()).getPackedValue();
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m13522timesmpE4wyQ(float f, long j7) {
        m13512checkArithmeticR2X_6o(j7);
        return pack(TextUnit.m13497getRawTypeimpl(j7), TextUnit.m13499getValueimpl(j7) * f);
    }

    public static final long getEm(double d9) {
        return pack(UNIT_TYPE_EM, (float) d9);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f) {
    }

    public static final long getSp(double d9) {
        return pack(UNIT_TYPE_SP, (float) d9);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f) {
    }

    public static final long getEm(int i) {
        return pack(UNIT_TYPE_EM, i);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i) {
    }

    public static final long getSp(int i) {
        return pack(UNIT_TYPE_SP, i);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i) {
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m13521timesmpE4wyQ(double d9, long j7) {
        m13512checkArithmeticR2X_6o(j7);
        return pack(TextUnit.m13497getRawTypeimpl(j7), TextUnit.m13499getValueimpl(j7) * ((float) d9));
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m13523timesmpE4wyQ(int i, long j7) {
        m13512checkArithmeticR2X_6o(j7);
        return pack(TextUnit.m13497getRawTypeimpl(j7), TextUnit.m13499getValueimpl(j7) * i);
    }
}
