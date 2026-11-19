package androidx.compose.p009ui.layout;

import androidx.compose.p009ui.node.ModifierNodeElement;
import androidx.compose.p009ui.platform.InspectorInfo;
import androidx.compose.p009ui.spatial.RelativeLayoutBounds;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\f\u0010\u001f\u001a\u00020\t*\u00020 H\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006!"}, m7880d2 = {"Landroidx/compose/ui/layout/OnLayoutRectChangedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnLayoutRectChangedNode;", "throttleMillis", "", "debounceMillis", "callback", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "(JJLkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getDebounceMillis", "()J", "getThrottleMillis", "component1", "component2", "component3", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
final /* data */ class OnLayoutRectChangedElement extends ModifierNodeElement<OnLayoutRectChangedNode> {
    private final Function1<RelativeLayoutBounds, Unit> callback;
    private final long debounceMillis;
    private final long throttleMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public OnLayoutRectChangedElement(long j6, long j7, Function1<? super RelativeLayoutBounds, Unit> function1) {
        this.throttleMillis = j6;
        this.debounceMillis = j7;
        this.callback = function1;
    }

    public static /* synthetic */ OnLayoutRectChangedElement copy$default(OnLayoutRectChangedElement onLayoutRectChangedElement, long j6, long j7, Function1 function1, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j6 = onLayoutRectChangedElement.throttleMillis;
        }
        long j8 = j6;
        if ((i6 & 2) != 0) {
            j7 = onLayoutRectChangedElement.debounceMillis;
        }
        long j9 = j7;
        if ((i6 & 4) != 0) {
            function1 = onLayoutRectChangedElement.callback;
        }
        return onLayoutRectChangedElement.copy(j8, j9, function1);
    }

    /* renamed from: component1, reason: from getter */
    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    public final Function1<RelativeLayoutBounds, Unit> component3() {
        return this.callback;
    }

    public final OnLayoutRectChangedElement copy(long throttleMillis, long debounceMillis, Function1<? super RelativeLayoutBounds, Unit> callback) {
        return new OnLayoutRectChangedElement(throttleMillis, debounceMillis, callback);
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnLayoutRectChangedElement)) {
            return false;
        }
        OnLayoutRectChangedElement onLayoutRectChangedElement = (OnLayoutRectChangedElement) other;
        return this.throttleMillis == onLayoutRectChangedElement.throttleMillis && this.debounceMillis == onLayoutRectChangedElement.debounceMillis && Intrinsics.areEqual(this.callback, onLayoutRectChangedElement.callback);
    }

    public final Function1<RelativeLayoutBounds, Unit> getCallback() {
        return this.callback;
    }

    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Long.hashCode(this.throttleMillis) * 31) + Long.hashCode(this.debounceMillis)) * 31) + this.callback.hashCode();
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onRectChanged");
        inspectorInfo.getProperties().set("throttleMillis", Long.valueOf(this.throttleMillis));
        inspectorInfo.getProperties().set("debounceMillis", Long.valueOf(this.debounceMillis));
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    public String toString() {
        return "OnLayoutRectChangedElement(throttleMillis=" + this.throttleMillis + ", debounceMillis=" + this.debounceMillis + ", callback=" + this.callback + ')';
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    /* renamed from: create */
    public OnLayoutRectChangedNode getNode() {
        return new OnLayoutRectChangedNode(this.throttleMillis, this.debounceMillis, this.callback);
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public void update(OnLayoutRectChangedNode node) {
        node.setThrottleMillis(this.throttleMillis);
        node.setDebounceMillis(this.debounceMillis);
        node.setCallback(this.callback);
        node.disposeAndRegister();
    }
}
