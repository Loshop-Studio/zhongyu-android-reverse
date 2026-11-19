package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p014ui.graphics.TransformOrigin;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes.dex */
public final class Scale {
    public static final int $stable = 0;
    private final FiniteAnimationSpec<Float> animationSpec;
    private final float scale;
    private final long transformOrigin;

    public /* synthetic */ Scale(float f10, long j10, FiniteAnimationSpec finiteAnimationSpec, AbstractC9972n abstractC9972n) {
        this(f10, j10, finiteAnimationSpec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-bnNdC4k$default, reason: not valid java name */
    public static /* synthetic */ Scale m26809copybnNdC4k$default(Scale scale, float f10, long j10, FiniteAnimationSpec finiteAnimationSpec, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = scale.scale;
        }
        if ((i10 & 2) != 0) {
            j10 = scale.transformOrigin;
        }
        if ((i10 & 4) != 0) {
            finiteAnimationSpec = scale.animationSpec;
        }
        return scale.m26811copybnNdC4k(f10, j10, finiteAnimationSpec);
    }

    public final float component1() {
        return this.scale;
    }

    /* renamed from: component2-SzJe1aQ, reason: not valid java name */
    public final long m26810component2SzJe1aQ() {
        return this.transformOrigin;
    }

    public final FiniteAnimationSpec<Float> component3() {
        return this.animationSpec;
    }

    /* renamed from: copy-bnNdC4k, reason: not valid java name */
    public final Scale m26811copybnNdC4k(float f10, long j10, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        return new Scale(f10, j10, finiteAnimationSpec, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) obj;
        return Float.compare(this.scale, scale.scale) == 0 && TransformOrigin.m31263equalsimpl0(this.transformOrigin, scale.transformOrigin) && AbstractC9979u.m20289b(this.animationSpec, scale.animationSpec);
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final float getScale() {
        return this.scale;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m26812getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public int hashCode() {
        return (((Float.hashCode(this.scale) * 31) + TransformOrigin.m31266hashCodeimpl(this.transformOrigin)) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) TransformOrigin.m31267toStringimpl(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + ')';
    }

    private Scale(float f10, long j10, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.scale = f10;
        this.transformOrigin = j10;
        this.animationSpec = finiteAnimationSpec;
    }
}
