package androidx.compose.material3;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorProducer;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10772c;

/* renamed from: androidx.compose.material3.TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0 */
/* loaded from: classes2.dex */
public final class C2394x758e63df implements ColorProducer, InterfaceC9975q {
    private final /* synthetic */ InterfaceC9529a function;

    public C2394x758e63df(InterfaceC9529a interfaceC9529a) {
        this.function = interfaceC9529a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ColorProducer) && (obj instanceof InterfaceC9975q)) {
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

    @Override // androidx.compose.p014ui.graphics.ColorProducer
    /* renamed from: invoke-0d7_KjU */
    public final /* synthetic */ long mo28650invoke0d7_KjU() {
        return ((Color) this.function.invoke()).m30888unboximpl();
    }
}
