package androidx.compose.animation.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata(m5174d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002¨\u0006\u0006"}, m5175d2 = {"Animatable", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "initialValue", "visibilityThreshold", "animation-core_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AnimatableKt {
    public static final Animatable<Float, AnimationVector1D> Animatable(float f4, float f5) {
        return new Animatable<>(Float.valueOf(f4), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(f5), null, 8, null);
    }

    public static /* synthetic */ Animatable Animatable$default(float f4, float f5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f5 = 0.01f;
        }
        return Animatable(f4, f5);
    }
}
