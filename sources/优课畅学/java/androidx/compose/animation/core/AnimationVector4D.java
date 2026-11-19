package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationVector4D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1 */
    private float f1136v1;

    /* renamed from: v2 */
    private float f1137v2;

    /* renamed from: v3 */
    private float f1138v3;

    /* renamed from: v4 */
    private float f1139v4;

    public AnimationVector4D(float f10, float f11, float f12, float f13) {
        super(null);
        this.f1136v1 = f10;
        this.f1137v2 = f11;
        this.f1138v3 = f12;
        this.f1139v4 = f13;
        this.size = 4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector4D)) {
            return false;
        }
        AnimationVector4D animationVector4D = (AnimationVector4D) obj;
        return animationVector4D.f1136v1 == this.f1136v1 && animationVector4D.f1137v2 == this.f1137v2 && animationVector4D.f1138v3 == this.f1138v3 && animationVector4D.f1139v4 == this.f1139v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i10) {
        if (i10 == 0) {
            return this.f1136v1;
        }
        if (i10 == 1) {
            return this.f1137v2;
        }
        if (i10 == 2) {
            return this.f1138v3;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f1139v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f1136v1;
    }

    public final float getV2() {
        return this.f1137v2;
    }

    public final float getV3() {
        return this.f1138v3;
    }

    public final float getV4() {
        return this.f1139v4;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f1136v1) * 31) + Float.hashCode(this.f1137v2)) * 31) + Float.hashCode(this.f1138v3)) * 31) + Float.hashCode(this.f1139v4);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f1136v1 = 0.0f;
        this.f1137v2 = 0.0f;
        this.f1138v3 = 0.0f;
        this.f1139v4 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i10, float f10) {
        if (i10 == 0) {
            this.f1136v1 = f10;
            return;
        }
        if (i10 == 1) {
            this.f1137v2 = f10;
        } else if (i10 == 2) {
            this.f1138v3 = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f1139v4 = f10;
        }
    }

    public final void setV1$animation_core_release(float f10) {
        this.f1136v1 = f10;
    }

    public final void setV2$animation_core_release(float f10) {
        this.f1137v2 = f10;
    }

    public final void setV3$animation_core_release(float f10) {
        this.f1138v3 = f10;
    }

    public final void setV4$animation_core_release(float f10) {
        this.f1139v4 = f10;
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f1136v1 + ", v2 = " + this.f1137v2 + ", v3 = " + this.f1138v3 + ", v4 = " + this.f1139v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector4D newVector$animation_core_release() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
