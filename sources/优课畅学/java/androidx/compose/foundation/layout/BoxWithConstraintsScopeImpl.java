package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;
    private final Density density;

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j10, AbstractC9126n abstractC9126n) {
        this(density, j10);
    }

    private final Density component1() {
        return this.density;
    }

    /* renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m20766copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            density = boxWithConstraintsScopeImpl.density;
        }
        if ((i10 & 2) != 0) {
            j10 = boxWithConstraintsScopeImpl.constraints;
        }
        return boxWithConstraintsScopeImpl.m20768copy0kLqBqw(density, j10);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    public Modifier align(Modifier modifier, Alignment alignment) {
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* renamed from: component2-msEJaDk, reason: not valid java name */
    public final long m20767component2msEJaDk() {
        return this.constraints;
    }

    /* renamed from: copy-0kLqBqw, reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m20768copy0kLqBqw(Density density, long j10) {
        return new BoxWithConstraintsScopeImpl(density, j10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        return AbstractC9133u.m16128b(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m26845equalsimpl0(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo20761getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public float mo20762getMaxHeightD9Ej5fM() {
        return Constraints.m26847getHasBoundedHeightimpl(mo20761getConstraintsmsEJaDk()) ? this.density.mo20494toDpu2uoSUM(Constraints.m26851getMaxHeightimpl(mo20761getConstraintsmsEJaDk())) : C3156Dp.Companion.m26918getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo20763getMaxWidthD9Ej5fM() {
        return Constraints.m26848getHasBoundedWidthimpl(mo20761getConstraintsmsEJaDk()) ? this.density.mo20494toDpu2uoSUM(Constraints.m26852getMaxWidthimpl(mo20761getConstraintsmsEJaDk())) : C3156Dp.Companion.m26918getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinHeight-D9Ej5fM */
    public float mo20764getMinHeightD9Ej5fM() {
        return this.density.mo20494toDpu2uoSUM(Constraints.m26853getMinHeightimpl(mo20761getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinWidth-D9Ej5fM */
    public float mo20765getMinWidthD9Ej5fM() {
        return this.density.mo20494toDpu2uoSUM(Constraints.m26854getMinWidthimpl(mo20761getConstraintsmsEJaDk()));
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m26855hashCodeimpl(this.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    public Modifier matchParentSize(Modifier modifier) {
        return this.$$delegate_0.matchParentSize(modifier);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m26857toStringimpl(this.constraints)) + ')';
    }

    private BoxWithConstraintsScopeImpl(Density density, long j10) {
        this.density = density;
        this.constraints = j10;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }
}
