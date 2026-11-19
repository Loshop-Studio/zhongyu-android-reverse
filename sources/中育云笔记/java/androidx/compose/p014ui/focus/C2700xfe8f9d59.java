package androidx.compose.p014ui.focus;

import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10772c;

/* renamed from: androidx.compose.ui.focus.FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 */
/* loaded from: classes2.dex */
public final class C2700xfe8f9d59 implements FocusPropertiesScope, InterfaceC9975q {
    private final /* synthetic */ InterfaceC9540l function;

    public C2700xfe8f9d59(InterfaceC9540l interfaceC9540l) {
        this.function = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.focus.FocusPropertiesScope
    public final /* synthetic */ void apply(FocusProperties focusProperties) {
        this.function.invoke(focusProperties);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FocusPropertiesScope) && (obj instanceof InterfaceC9975q)) {
            return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC9975q
    public final InterfaceC10772c getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
