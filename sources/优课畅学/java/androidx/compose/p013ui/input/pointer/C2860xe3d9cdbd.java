package androidx.compose.p013ui.input.pointer;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.InterfaceC8723c;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10574p;

/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0 */
/* loaded from: classes2.dex */
public final class C2860xe3d9cdbd implements PointerInputEventHandler, InterfaceC9129q {
    private final /* synthetic */ InterfaceC10574p function;

    public C2860xe3d9cdbd(InterfaceC10574p interfaceC10574p) {
        this.function = interfaceC10574p;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof InterfaceC9129q)) {
            return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC9129q
    public final InterfaceC8723c getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c interfaceC9324c) {
        return this.function.invoke(pointerInputScope, interfaceC9324c);
    }
}
