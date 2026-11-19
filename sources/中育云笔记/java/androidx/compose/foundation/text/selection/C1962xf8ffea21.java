package androidx.compose.foundation.text.selection;

import androidx.compose.p014ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10772c;

/* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 */
/* loaded from: classes.dex */
public final class C1962xf8ffea21 implements OffsetProvider, InterfaceC9975q {
    private final /* synthetic */ InterfaceC9529a function;

    public C1962xf8ffea21(InterfaceC9529a interfaceC9529a) {
        this.function = interfaceC9529a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof OffsetProvider) && (obj instanceof InterfaceC9975q)) {
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

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    /* renamed from: provide-F1C5BW0 */
    public final /* synthetic */ long mo27772provideF1C5BW0() {
        return ((Offset) this.function.invoke()).m30647unboximpl();
    }
}
