package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@Immutable
/* loaded from: classes.dex */
public final class Slide {
    public static final int $stable = 0;
    private final FiniteAnimationSpec<IntOffset> animationSpec;
    private final InterfaceC9540l slideOffset;

    public Slide(InterfaceC9540l interfaceC9540l, FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.slideOffset = interfaceC9540l;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Slide copy$default(Slide slide, InterfaceC9540l interfaceC9540l, FiniteAnimationSpec finiteAnimationSpec, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = slide.slideOffset;
        }
        if ((i10 & 2) != 0) {
            finiteAnimationSpec = slide.animationSpec;
        }
        return slide.copy(interfaceC9540l, finiteAnimationSpec);
    }

    public final InterfaceC9540l component1() {
        return this.slideOffset;
    }

    public final FiniteAnimationSpec<IntOffset> component2() {
        return this.animationSpec;
    }

    public final Slide copy(InterfaceC9540l interfaceC9540l, FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return new Slide(interfaceC9540l, finiteAnimationSpec);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        return AbstractC9979u.m20289b(this.slideOffset, slide.slideOffset) && AbstractC9979u.m20289b(this.animationSpec, slide.animationSpec);
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    public final InterfaceC9540l getSlideOffset() {
        return this.slideOffset;
    }

    public int hashCode() {
        return (this.slideOffset.hashCode() * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }
}
