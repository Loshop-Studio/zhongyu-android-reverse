package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.p009ui.unit.Density;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7880d2 = {"EndTension", "", "Inflection", "P1", "P2", "StartTension", "computeSplineInfo", "", "splinePositions", "", "splineTimes", "nbSamples", "", "splineBasedDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", ExifInterface.GPS_DIRECTION_TRUE, "density", "Landroidx/compose/ui/unit/Density;", "animation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;

    /* renamed from: P1 */
    private static final float f87P1 = 0.175f;

    /* renamed from: P2 */
    private static final float f88P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i6) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = 0.0f;
        int i7 = 0;
        float f16 = 0.0f;
        while (true) {
            float f17 = 1.0f;
            if (i7 >= i6) {
                fArr2[i6] = 1.0f;
                fArr[i6] = 1.0f;
                return;
            }
            float f18 = i7 / i6;
            float f19 = 1.0f;
            while (true) {
                f6 = ((f19 - f15) / 2.0f) + f15;
                f7 = f17 - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f20 = (((f7 * f87P1) + (f6 * f88P2)) * f8) + f9;
                f10 = f17;
                if (Math.abs(f20 - f18) < 1.0E-5d) {
                    break;
                }
                if (f20 > f18) {
                    f19 = f6;
                } else {
                    f15 = f6;
                }
                f17 = f10;
            }
            float f21 = 0.5f;
            fArr[i7] = (f8 * ((f7 * 0.5f) + f6)) + f9;
            float f22 = f10;
            while (true) {
                f11 = ((f22 - f16) / 2.0f) + f16;
                f12 = f10 - f11;
                f13 = f11 * 3.0f * f12;
                f14 = f11 * f11 * f11;
                float f23 = (((f12 * f21) + f11) * f13) + f14;
                float f24 = f18;
                if (Math.abs(f23 - f18) >= 1.0E-5d) {
                    if (f23 > f24) {
                        f22 = f11;
                    } else {
                        f16 = f11;
                    }
                    f18 = f24;
                    f21 = 0.5f;
                }
            }
            fArr2[i7] = (f13 * ((f12 * f87P1) + (f11 * f88P2))) + f14;
            i7++;
        }
    }

    public static final <T> DecayAnimationSpec<T> splineBasedDecay(Density density) {
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
