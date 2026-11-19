package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.node.OwnerScope;
import androidx.compose.p014ui.semantics.ScrollAxisRange;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ScrollObservationScope implements OwnerScope {
    public static final int $stable = 8;
    private final List<ScrollObservationScope> allScopes;
    private ScrollAxisRange horizontalScrollAxisRange;
    private Float oldXValue;
    private Float oldYValue;
    private final int semanticsNodeId;
    private ScrollAxisRange verticalScrollAxisRange;

    public ScrollObservationScope(int i10, List<ScrollObservationScope> list, Float f10, Float f11, ScrollAxisRange scrollAxisRange, ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i10;
        this.allScopes = list;
        this.oldXValue = f10;
        this.oldYValue = f11;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    public final List<ScrollObservationScope> getAllScopes() {
        return this.allScopes;
    }

    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    public final Float getOldXValue() {
        return this.oldXValue;
    }

    public final Float getOldYValue() {
        return this.oldYValue;
    }

    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    @Override // androidx.compose.p014ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.allScopes.contains(this);
    }

    public final void setHorizontalScrollAxisRange(ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void setOldXValue(Float f10) {
        this.oldXValue = f10;
    }

    public final void setOldYValue(Float f10) {
        this.oldYValue = f10;
    }

    public final void setVerticalScrollAxisRange(ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }
}
