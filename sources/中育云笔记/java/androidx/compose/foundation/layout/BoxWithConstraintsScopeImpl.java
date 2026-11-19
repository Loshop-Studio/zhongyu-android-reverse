package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;
    private final Density density;

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j10, AbstractC9972n abstractC9972n) {
        this(density, j10);
    }

    private final Density component1() {
        return this.density;
    }

    /* renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m27368copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            density = boxWithConstraintsScopeImpl.density;
        }
        if ((i10 & 2) != 0) {
            j10 = boxWithConstraintsScopeImpl.constraints;
        }
        return boxWithConstraintsScopeImpl.m27370copy0kLqBqw(density, j10);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    public Modifier align(Modifier modifier, Alignment alignment) {
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* renamed from: component2-msEJaDk, reason: not valid java name */
    public final long m27369component2msEJaDk() {
        return this.constraints;
    }

    /* renamed from: copy-0kLqBqw, reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m27370copy0kLqBqw(Density density, long j10) {
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
        return AbstractC9979u.m20289b(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m33447equalsimpl0(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo27363getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public float mo27364getMaxHeightD9Ej5fM() {
        return Constraints.m33449getHasBoundedHeightimpl(mo27363getConstraintsmsEJaDk()) ? this.density.mo27096toDpu2uoSUM(Constraints.m33453getMaxHeightimpl(mo27363getConstraintsmsEJaDk())) : C3186Dp.Companion.m33520getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo27365getMaxWidthD9Ej5fM() {
        return Constraints.m33450getHasBoundedWidthimpl(mo27363getConstraintsmsEJaDk()) ? this.density.mo27096toDpu2uoSUM(Constraints.m33454getMaxWidthimpl(mo27363getConstraintsmsEJaDk())) : C3186Dp.Companion.m33520getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinHeight-D9Ej5fM */
    public float mo27366getMinHeightD9Ej5fM() {
        return this.density.mo27096toDpu2uoSUM(Constraints.m33455getMinHeightimpl(mo27363getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinWidth-D9Ej5fM */
    public float mo27367getMinWidthD9Ej5fM() {
        return this.density.mo27096toDpu2uoSUM(Constraints.m33456getMinWidthimpl(mo27363getConstraintsmsEJaDk()));
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m33457hashCodeimpl(this.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    public Modifier matchParentSize(Modifier modifier) {
        return this.$$delegate_0.matchParentSize(modifier);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m33459toStringimpl(this.constraints)) + ')';
    }

    private BoxWithConstraintsScopeImpl(Density density, long j10) {
        this.density = density;
        this.constraints = j10;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }
}
