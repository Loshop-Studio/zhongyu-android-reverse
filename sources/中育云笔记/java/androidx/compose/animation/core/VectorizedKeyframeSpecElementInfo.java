package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class VectorizedKeyframeSpecElementInfo<V extends AnimationVector> {
    public static final int $stable = 0;
    private final int arcMode;
    private final Easing easing;
    private final V vectorValue;

    public /* synthetic */ VectorizedKeyframeSpecElementInfo(AnimationVector animationVector, Easing easing, int i10, AbstractC9972n abstractC9972n) {
        this(animationVector, easing, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-2NF0KzA$default, reason: not valid java name */
    public static /* synthetic */ VectorizedKeyframeSpecElementInfo m26912copy2NF0KzA$default(VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo, AnimationVector animationVector, Easing easing, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            animationVector = vectorizedKeyframeSpecElementInfo.vectorValue;
        }
        if ((i11 & 2) != 0) {
            easing = vectorizedKeyframeSpecElementInfo.easing;
        }
        if ((i11 & 4) != 0) {
            i10 = vectorizedKeyframeSpecElementInfo.arcMode;
        }
        return vectorizedKeyframeSpecElementInfo.m26914copy2NF0KzA(animationVector, easing, i10);
    }

    public final V component1() {
        return this.vectorValue;
    }

    public final Easing component2() {
        return this.easing;
    }

    /* renamed from: component3--9T-Mq4, reason: not valid java name */
    public final int m26913component39TMq4() {
        return this.arcMode;
    }

    /* renamed from: copy-2NF0KzA, reason: not valid java name */
    public final VectorizedKeyframeSpecElementInfo<V> m26914copy2NF0KzA(V v10, Easing easing, int i10) {
        return new VectorizedKeyframeSpecElementInfo<>(v10, easing, i10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorizedKeyframeSpecElementInfo)) {
            return false;
        }
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) obj;
        return AbstractC9979u.m20289b(this.vectorValue, vectorizedKeyframeSpecElementInfo.vectorValue) && AbstractC9979u.m20289b(this.easing, vectorizedKeyframeSpecElementInfo.easing) && ArcMode.m26854equalsimpl0(this.arcMode, vectorizedKeyframeSpecElementInfo.arcMode);
    }

    /* renamed from: getArcMode--9T-Mq4, reason: not valid java name */
    public final int m26915getArcMode9TMq4() {
        return this.arcMode;
    }

    public final Easing getEasing() {
        return this.easing;
    }

    public final V getVectorValue() {
        return this.vectorValue;
    }

    public int hashCode() {
        return (((this.vectorValue.hashCode() * 31) + this.easing.hashCode()) * 31) + ArcMode.m26855hashCodeimpl(this.arcMode);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.vectorValue + ", easing=" + this.easing + ", arcMode=" + ((Object) ArcMode.m26856toStringimpl(this.arcMode)) + ')';
    }

    private VectorizedKeyframeSpecElementInfo(V v10, Easing easing, int i10) {
        this.vectorValue = v10;
        this.easing = easing;
        this.arcMode = i10;
    }
}
