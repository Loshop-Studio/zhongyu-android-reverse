package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@Immutable
/* loaded from: classes.dex */
public final class Slide {
    public static final int $stable = 0;
    private final FiniteAnimationSpec<IntOffset> animationSpec;
    private final InterfaceC10570l slideOffset;

    public Slide(InterfaceC10570l interfaceC10570l, FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.slideOffset = interfaceC10570l;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Slide copy$default(Slide slide, InterfaceC10570l interfaceC10570l, FiniteAnimationSpec finiteAnimationSpec, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = slide.slideOffset;
        }
        if ((i10 & 2) != 0) {
            finiteAnimationSpec = slide.animationSpec;
        }
        return slide.copy(interfaceC10570l, finiteAnimationSpec);
    }

    public final InterfaceC10570l component1() {
        return this.slideOffset;
    }

    public final FiniteAnimationSpec<IntOffset> component2() {
        return this.animationSpec;
    }

    public final Slide copy(InterfaceC10570l interfaceC10570l, FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return new Slide(interfaceC10570l, finiteAnimationSpec);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        return AbstractC9133u.m16128b(this.slideOffset, slide.slideOffset) && AbstractC9133u.m16128b(this.animationSpec, slide.animationSpec);
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    public final InterfaceC10570l getSlideOffset() {
        return this.slideOffset;
    }

    public int hashCode() {
        return (this.slideOffset.hashCode() * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }
}
