package androidx.compose.p014ui.input.pointer;

import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10772c;
import vc.InterfaceC11588c;

/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0 */
/* loaded from: classes2.dex */
public final class C2890xe3d9cdbd implements PointerInputEventHandler, InterfaceC9975q {
    private final /* synthetic */ InterfaceC9544p function;

    public C2890xe3d9cdbd(InterfaceC9544p interfaceC9544p) {
        this.function = interfaceC9544p;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof InterfaceC9975q)) {
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

    @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c interfaceC11588c) {
        return this.function.invoke(pointerInputScope, interfaceC11588c);
    }
}
