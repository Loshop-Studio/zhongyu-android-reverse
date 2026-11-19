package androidx.compose.p011ui.layout;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\u0015R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0018¨\u0006+"}, m5110d2 = {"Landroidx/compose/ui/layout/OnLayoutRectChangedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnLayoutRectChangedNode;", "", "throttleMillis", "debounceMillis", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "Ld6/s;", "callback", "<init>", "(JJLr6/c;)V", "create", "()Landroidx/compose/ui/layout/OnLayoutRectChangedNode;", "node", "update", "(Landroidx/compose/ui/layout/OnLayoutRectChangedNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()J", "component2", "component3", "()Lr6/c;", "copy", "(JJLr6/c;)Landroidx/compose/ui/layout/OnLayoutRectChangedElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getThrottleMillis", "getDebounceMillis", "Lr6/c;", "getCallback", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final /* data */ class OnLayoutRectChangedElement extends ModifierNodeElement<OnLayoutRectChangedNode> {

    @NotNull
    private final InterfaceC6471c callback;
    private final long debounceMillis;
    private final long throttleMillis;

    public OnLayoutRectChangedElement(long j7, long j8, @NotNull InterfaceC6471c interfaceC6471c) {
        this.throttleMillis = j7;
        this.debounceMillis = j8;
        this.callback = interfaceC6471c;
    }

    public static /* synthetic */ OnLayoutRectChangedElement copy$default(OnLayoutRectChangedElement onLayoutRectChangedElement, long j7, long j8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = onLayoutRectChangedElement.throttleMillis;
        }
        long j9 = j7;
        if ((i & 2) != 0) {
            j8 = onLayoutRectChangedElement.debounceMillis;
        }
        long j10 = j8;
        if ((i & 4) != 0) {
            interfaceC6471c = onLayoutRectChangedElement.callback;
        }
        return onLayoutRectChangedElement.copy(j9, j10, interfaceC6471c);
    }

    /* renamed from: component1, reason: from getter */
    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InterfaceC6471c getCallback() {
        return this.callback;
    }

    @NotNull
    public final OnLayoutRectChangedElement copy(long throttleMillis, long debounceMillis, @NotNull InterfaceC6471c callback) {
        return new OnLayoutRectChangedElement(throttleMillis, debounceMillis, callback);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnLayoutRectChangedElement)) {
            return false;
        }
        OnLayoutRectChangedElement onLayoutRectChangedElement = (OnLayoutRectChangedElement) other;
        return this.throttleMillis == onLayoutRectChangedElement.throttleMillis && this.debounceMillis == onLayoutRectChangedElement.debounceMillis && AbstractC5830k.m5325b(this.callback, onLayoutRectChangedElement.callback);
    }

    @NotNull
    public final InterfaceC6471c getCallback() {
        return this.callback;
    }

    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        return this.callback.hashCode() + AbstractC0584a.m897B(this.debounceMillis, Long.hashCode(this.throttleMillis) * 31, 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onRectChanged");
        inspectorInfo.getProperties().set("throttleMillis", Long.valueOf(this.throttleMillis));
        inspectorInfo.getProperties().set("debounceMillis", Long.valueOf(this.debounceMillis));
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    @NotNull
    public String toString() {
        return "OnLayoutRectChangedElement(throttleMillis=" + this.throttleMillis + ", debounceMillis=" + this.debounceMillis + ", callback=" + this.callback + ')';
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public OnLayoutRectChangedNode getNode() {
        return new OnLayoutRectChangedNode(this.throttleMillis, this.debounceMillis, this.callback);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull OnLayoutRectChangedNode node) {
        node.setThrottleMillis(this.throttleMillis);
        node.setDebounceMillis(this.debounceMillis);
        node.setCallback(this.callback);
        node.disposeAndRegister();
    }
}
