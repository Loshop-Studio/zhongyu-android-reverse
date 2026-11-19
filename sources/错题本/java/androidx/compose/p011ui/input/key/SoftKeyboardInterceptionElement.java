package androidx.compose.p011ui.input.key;

import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J@\u0010\u0016\u001a\u00020\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0014R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u0014¨\u0006%"}, m5110d2 = {"Landroidx/compose/ui/input/key/SoftKeyboardInterceptionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/key/InterceptedKeyInputNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "onKeyEvent", "onPreKeyEvent", "<init>", "(Lr6/c;Lr6/c;)V", "create", "()Landroidx/compose/ui/input/key/InterceptedKeyInputNode;", "node", "Ld6/s;", "update", "(Landroidx/compose/ui/input/key/InterceptedKeyInputNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Lr6/c;", "component2", "copy", "(Lr6/c;Lr6/c;)Landroidx/compose/ui/input/key/SoftKeyboardInterceptionElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lr6/c;", "getOnKeyEvent", "getOnPreKeyEvent", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final /* data */ class SoftKeyboardInterceptionElement extends ModifierNodeElement<InterceptedKeyInputNode> {

    @Nullable
    private final InterfaceC6471c onKeyEvent;

    @Nullable
    private final InterfaceC6471c onPreKeyEvent;

    public SoftKeyboardInterceptionElement(@Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2) {
        this.onKeyEvent = interfaceC6471c;
        this.onPreKeyEvent = interfaceC6471c2;
    }

    public static /* synthetic */ SoftKeyboardInterceptionElement copy$default(SoftKeyboardInterceptionElement softKeyboardInterceptionElement, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6471c = softKeyboardInterceptionElement.onKeyEvent;
        }
        if ((i & 2) != 0) {
            interfaceC6471c2 = softKeyboardInterceptionElement.onPreKeyEvent;
        }
        return softKeyboardInterceptionElement.copy(interfaceC6471c, interfaceC6471c2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final InterfaceC6471c getOnKeyEvent() {
        return this.onKeyEvent;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final InterfaceC6471c getOnPreKeyEvent() {
        return this.onPreKeyEvent;
    }

    @NotNull
    public final SoftKeyboardInterceptionElement copy(@Nullable InterfaceC6471c onKeyEvent, @Nullable InterfaceC6471c onPreKeyEvent) {
        return new SoftKeyboardInterceptionElement(onKeyEvent, onPreKeyEvent);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) other;
        return AbstractC5830k.m5325b(this.onKeyEvent, softKeyboardInterceptionElement.onKeyEvent) && AbstractC5830k.m5325b(this.onPreKeyEvent, softKeyboardInterceptionElement.onPreKeyEvent);
    }

    @Nullable
    public final InterfaceC6471c getOnKeyEvent() {
        return this.onKeyEvent;
    }

    @Nullable
    public final InterfaceC6471c getOnPreKeyEvent() {
        return this.onPreKeyEvent;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        InterfaceC6471c interfaceC6471c = this.onKeyEvent;
        int iHashCode = (interfaceC6471c == null ? 0 : interfaceC6471c.hashCode()) * 31;
        InterfaceC6471c interfaceC6471c2 = this.onPreKeyEvent;
        return iHashCode + (interfaceC6471c2 != null ? interfaceC6471c2.hashCode() : 0);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        InterfaceC6471c interfaceC6471c = this.onKeyEvent;
        if (interfaceC6471c != null) {
            inspectorInfo.setName("onKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onKeyToSoftKeyboardInterceptedEvent", interfaceC6471c);
        }
        InterfaceC6471c interfaceC6471c2 = this.onPreKeyEvent;
        if (interfaceC6471c2 != null) {
            inspectorInfo.setName("onPreKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onPreKeyToSoftKeyboardInterceptedEvent", interfaceC6471c2);
        }
    }

    @NotNull
    public String toString() {
        return "SoftKeyboardInterceptionElement(onKeyEvent=" + this.onKeyEvent + ", onPreKeyEvent=" + this.onPreKeyEvent + ')';
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    public InterceptedKeyInputNode create() {
        return new InterceptedKeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull InterceptedKeyInputNode node) {
        node.setOnEvent(this.onKeyEvent);
        node.setOnPreEvent(this.onPreKeyEvent);
    }
}
