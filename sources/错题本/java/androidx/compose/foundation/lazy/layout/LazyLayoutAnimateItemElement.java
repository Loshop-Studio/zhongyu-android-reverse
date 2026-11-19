package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0012*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JF\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%¨\u0006&"}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "fadeInSpec", "Landroidx/compose/ui/unit/IntOffset;", "placementSpec", "fadeOutSpec", "<init>", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "component1", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "component2", "component3", "create", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "node", "Ld6/s;", "update", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class LazyLayoutAnimateItemElement extends ModifierNodeElement<LazyLayoutAnimationSpecsNode> {
    public static final int $stable = 0;

    @Nullable
    private final FiniteAnimationSpec<Float> fadeInSpec;

    @Nullable
    private final FiniteAnimationSpec<Float> fadeOutSpec;

    @Nullable
    private final FiniteAnimationSpec<IntOffset> placementSpec;

    public LazyLayoutAnimateItemElement(@Nullable FiniteAnimationSpec<Float> finiteAnimationSpec, @Nullable FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, @Nullable FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        this.fadeInSpec = finiteAnimationSpec;
        this.placementSpec = finiteAnimationSpec2;
        this.fadeOutSpec = finiteAnimationSpec3;
    }

    private final FiniteAnimationSpec<Float> component1() {
        return this.fadeInSpec;
    }

    private final FiniteAnimationSpec<IntOffset> component2() {
        return this.placementSpec;
    }

    private final FiniteAnimationSpec<Float> component3() {
        return this.fadeOutSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LazyLayoutAnimateItemElement copy$default(LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = lazyLayoutAnimateItemElement.fadeInSpec;
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec2 = lazyLayoutAnimateItemElement.placementSpec;
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec3 = lazyLayoutAnimateItemElement.fadeOutSpec;
        }
        return lazyLayoutAnimateItemElement.copy(finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }

    @NotNull
    public final LazyLayoutAnimateItemElement copy(@Nullable FiniteAnimationSpec<Float> fadeInSpec, @Nullable FiniteAnimationSpec<IntOffset> placementSpec, @Nullable FiniteAnimationSpec<Float> fadeOutSpec) {
        return new LazyLayoutAnimateItemElement(fadeInSpec, placementSpec, fadeOutSpec);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) other;
        return AbstractC5830k.m5325b(this.fadeInSpec, lazyLayoutAnimateItemElement.fadeInSpec) && AbstractC5830k.m5325b(this.placementSpec, lazyLayoutAnimateItemElement.placementSpec) && AbstractC5830k.m5325b(this.fadeOutSpec, lazyLayoutAnimateItemElement.fadeOutSpec);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeInSpec;
        int iHashCode = (finiteAnimationSpec == null ? 0 : finiteAnimationSpec.hashCode()) * 31;
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec2 = this.placementSpec;
        int iHashCode2 = (iHashCode + (finiteAnimationSpec2 == null ? 0 : finiteAnimationSpec2.hashCode())) * 31;
        FiniteAnimationSpec<Float> finiteAnimationSpec3 = this.fadeOutSpec;
        return iHashCode2 + (finiteAnimationSpec3 != null ? finiteAnimationSpec3.hashCode() : 0);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateItem");
        inspectorInfo.getProperties().set("fadeInSpec", this.fadeInSpec);
        inspectorInfo.getProperties().set("placementSpec", this.placementSpec);
        inspectorInfo.getProperties().set("fadeOutSpec", this.fadeOutSpec);
    }

    @NotNull
    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.fadeInSpec + ", placementSpec=" + this.placementSpec + ", fadeOutSpec=" + this.fadeOutSpec + ')';
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public LazyLayoutAnimationSpecsNode getNode() {
        return new LazyLayoutAnimationSpecsNode(this.fadeInSpec, this.placementSpec, this.fadeOutSpec);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull LazyLayoutAnimationSpecsNode node) {
        node.setFadeInSpec(this.fadeInSpec);
        node.setPlacementSpec(this.placementSpec);
        node.setFadeOutSpec(this.fadeOutSpec);
    }
}
