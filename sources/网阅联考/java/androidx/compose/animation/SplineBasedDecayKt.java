package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.p006ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m5175d2 = {"EndTension", "", "Inflection", "P1", "P2", "StartTension", "computeSplineInfo", "", "splinePositions", "", "splineTimes", "nbSamples", "", "splineBasedDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", ExifInterface.GPS_DIRECTION_TRUE, "density", "Landroidx/compose/ui/unit/Density;", "animation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;

    /* renamed from: P1 */
    private static final float f73P1 = 0.175f;

    /* renamed from: P2 */
    private static final float f74P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i4) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i5 = 0; i5 < i4; i5++) {
            float f14 = i5 / i4;
            float f15 = 1.0f;
            while (true) {
                f4 = ((f15 - f12) / 2.0f) + f12;
                f5 = 1.0f - f4;
                f6 = f4 * 3.0f * f5;
                f7 = f4 * f4 * f4;
                float f16 = (((f5 * f73P1) + (f4 * f74P2)) * f6) + f7;
                if (Math.abs(f16 - f14) < 1.0E-5d) {
                    break;
                } else if (f16 > f14) {
                    f15 = f4;
                } else {
                    f12 = f4;
                }
            }
            float f17 = 0.5f;
            fArr[i5] = (f6 * ((f5 * 0.5f) + f4)) + f7;
            float f18 = 1.0f;
            while (true) {
                f8 = ((f18 - f13) / 2.0f) + f13;
                f9 = 1.0f - f8;
                f10 = f8 * 3.0f * f9;
                f11 = f8 * f8 * f8;
                float f19 = (((f9 * f17) + f8) * f10) + f11;
                if (Math.abs(f19 - f14) >= 1.0E-5d) {
                    if (f19 > f14) {
                        f18 = f8;
                    } else {
                        f13 = f8;
                    }
                    f17 = 0.5f;
                }
            }
            fArr2[i5] = (f10 * ((f9 * f73P1) + (f8 * f74P2))) + f11;
        }
        fArr2[i4] = 1.0f;
        fArr[i4] = 1.0f;
    }

    public static final <T> DecayAnimationSpec<T> splineBasedDecay(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
