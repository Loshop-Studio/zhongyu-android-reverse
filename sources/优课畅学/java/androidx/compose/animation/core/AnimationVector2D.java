package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationVector2D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1 */
    private float f1131v1;

    /* renamed from: v2 */
    private float f1132v2;

    public AnimationVector2D(float f10, float f11) {
        super(null);
        this.f1131v1 = f10;
        this.f1132v2 = f11;
        this.size = 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector2D)) {
            return false;
        }
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        return animationVector2D.f1131v1 == this.f1131v1 && animationVector2D.f1132v2 == this.f1132v2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i10) {
        if (i10 == 0) {
            return this.f1131v1;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f1132v2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f1131v1;
    }

    public final float getV2() {
        return this.f1132v2;
    }

    public int hashCode() {
        return (Float.hashCode(this.f1131v1) * 31) + Float.hashCode(this.f1132v2);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f1131v1 = 0.0f;
        this.f1132v2 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i10, float f10) {
        if (i10 == 0) {
            this.f1131v1 = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f1132v2 = f10;
        }
    }

    public final void setV1$animation_core_release(float f10) {
        this.f1131v1 = f10;
    }

    public final void setV2$animation_core_release(float f10) {
        this.f1132v2 = f10;
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f1131v1 + ", v2 = " + this.f1132v2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector2D newVector$animation_core_release() {
        return new AnimationVector2D(0.0f, 0.0f);
    }
}
