package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.InterfaceC8723c;
import p300x7.InterfaceC10559a;

/* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 */
/* loaded from: classes.dex */
public final class C1932xf8ffea21 implements OffsetProvider, InterfaceC9129q {
    private final /* synthetic */ InterfaceC10559a function;

    public C1932xf8ffea21(InterfaceC10559a interfaceC10559a) {
        this.function = interfaceC10559a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof OffsetProvider) && (obj instanceof InterfaceC9129q)) {
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

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    /* renamed from: provide-F1C5BW0 */
    public final /* synthetic */ long mo21170provideF1C5BW0() {
        return ((Offset) this.function.invoke()).m24045unboximpl();
    }
}
