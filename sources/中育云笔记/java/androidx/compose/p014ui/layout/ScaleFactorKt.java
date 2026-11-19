package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f10, float f11) {
        return ScaleFactor.m32312constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    @Stable
    /* renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m32326divUQTWf7w(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j11 & 4294967295L));
        return Size.m30697constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m32327isSpecifiedFK8aYYs(long j10) {
        return j10 != ScaleFactor.Companion.m32325getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m32328isSpecifiedFK8aYYs$annotations(long j10) {
    }

    /* renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m32329isUnspecifiedFK8aYYs(long j10) {
        return j10 == ScaleFactor.Companion.m32325getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m32330isUnspecifiedFK8aYYs$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m32331lerpbDIf60(long j10, long j11, float f10) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f10);
        return ScaleFactor.m32312constructorimpl((Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m32332takeOrElseoyDd2qo(long j10, InterfaceC9529a interfaceC9529a) {
        return j10 != ScaleFactor.Companion.m32325getUnspecified_hLwfpc() ? j10 : ((ScaleFactor) interfaceC9529a.invoke()).m32323unboximpl();
    }

    @Stable
    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m32333timesUQTWf7w(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * Float.intBitsToFloat((int) (j11 & 4294967295L));
        return Size.m30697constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m32334timesmw2e94(long j10, long j11) {
        return m32333timesUQTWf7w(j11, j10);
    }
}
