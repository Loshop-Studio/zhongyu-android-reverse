package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorProducer;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.InterfaceC8723c;
import p300x7.InterfaceC10559a;

/* renamed from: androidx.compose.material3.TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0 */
/* loaded from: classes2.dex */
public final class C2364x758e63df implements ColorProducer, InterfaceC9129q {
    private final /* synthetic */ InterfaceC10559a function;

    public C2364x758e63df(InterfaceC10559a interfaceC10559a) {
        this.function = interfaceC10559a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ColorProducer) && (obj instanceof InterfaceC9129q)) {
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

    @Override // androidx.compose.p013ui.graphics.ColorProducer
    /* renamed from: invoke-0d7_KjU */
    public final /* synthetic */ long mo22048invoke0d7_KjU() {
        return ((Color) this.function.invoke()).m24286unboximpl();
    }
}
