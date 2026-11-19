package androidx.compose.animation;

import androidx.collection.AbstractC0584a;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.p011ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, m5110d2 = {"", "splinePositions", "splineTimes", "", "nbSamples", "Ld6/s;", "computeSplineInfo", "([F[FI)V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/DecayAnimationSpec;", "splineBasedDecay", "(Landroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/DecayAnimationSpec;", "", "Inflection", "F", "StartTension", "EndTension", "P1", "P2", "animation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;

    /* renamed from: P1 */
    private static final float f715P1 = 0.175f;

    /* renamed from: P2 */
    private static final float f716P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i) {
        float fM900a;
        float f;
        float f7;
        float f8;
        float f9;
        float fM900a2;
        float f10;
        float f11;
        float f12;
        float f13 = 0.0f;
        int i8 = 0;
        float f14 = 0.0f;
        while (true) {
            float f15 = 1.0f;
            if (i8 >= i) {
                fArr2[i] = 1.0f;
                fArr[i] = 1.0f;
                return;
            }
            float f16 = i8 / i;
            float f17 = 1.0f;
            while (true) {
                fM900a = AbstractC0584a.m900a(f17, f13, 2.0f, f13);
                f = f15 - fM900a;
                f7 = fM900a * 3.0f * f;
                f8 = fM900a * fM900a * fM900a;
                float fM925z = AbstractC0584a.m925z(fM900a, f716P2, f * f715P1, f7) + f8;
                f9 = f15;
                if (Math.abs(fM925z - f16) < 1.0E-5d) {
                    break;
                }
                if (fM925z > f16) {
                    f17 = fM900a;
                } else {
                    f13 = fM900a;
                }
                f15 = f9;
            }
            float f18 = 0.5f;
            fArr[i8] = (((f * 0.5f) + fM900a) * f7) + f8;
            float f19 = f9;
            while (true) {
                fM900a2 = AbstractC0584a.m900a(f19, f14, 2.0f, f14);
                f10 = f9 - fM900a2;
                f11 = fM900a2 * 3.0f * f10;
                f12 = fM900a2 * fM900a2 * fM900a2;
                float fM925z2 = AbstractC0584a.m925z(f10, f18, fM900a2, f11) + f12;
                float f20 = f16;
                if (Math.abs(fM925z2 - f16) >= 1.0E-5d) {
                    if (fM925z2 > f20) {
                        f19 = fM900a2;
                    } else {
                        f14 = fM900a2;
                    }
                    f16 = f20;
                    f18 = 0.5f;
                }
            }
            fArr2[i8] = (((fM900a2 * f716P2) + (f10 * f715P1)) * f11) + f12;
            i8++;
        }
    }

    @NotNull
    public static final <T> DecayAnimationSpec<T> splineBasedDecay(@NotNull Density density) {
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
