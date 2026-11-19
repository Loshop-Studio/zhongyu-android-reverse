package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f10, float f11) {
        return ScaleFactor.m25710constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    @Stable
    /* renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m25724divUQTWf7w(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j11 & 4294967295L));
        return Size.m24095constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m25725isSpecifiedFK8aYYs(long j10) {
        return j10 != ScaleFactor.Companion.m25723getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m25726isSpecifiedFK8aYYs$annotations(long j10) {
    }

    /* renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m25727isUnspecifiedFK8aYYs(long j10) {
        return j10 == ScaleFactor.Companion.m25723getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m25728isUnspecifiedFK8aYYs$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m25729lerpbDIf60(long j10, long j11, float f10) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f10);
        return ScaleFactor.m25710constructorimpl((Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m25730takeOrElseoyDd2qo(long j10, InterfaceC10559a interfaceC10559a) {
        return j10 != ScaleFactor.Companion.m25723getUnspecified_hLwfpc() ? j10 : ((ScaleFactor) interfaceC10559a.invoke()).m25721unboximpl();
    }

    @Stable
    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m25731timesUQTWf7w(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * Float.intBitsToFloat((int) (j11 & 4294967295L));
        return Size.m24095constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m25732timesmw2e94(long j10, long j11) {
        return m25731timesUQTWf7w(j11, j10);
    }
}
