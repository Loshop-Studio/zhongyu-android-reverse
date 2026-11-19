package androidx.compose.foundation.layout;

import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
public final class FlowLayoutOverflowKt {
    public static final InterfaceC10773d lazyInt(String str, InterfaceC9529a interfaceC9529a) {
        return new LazyImpl(interfaceC9529a, str);
    }

    public static /* synthetic */ InterfaceC10773d lazyInt$default(String str, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Lazy item is not yet initialized";
        }
        return lazyInt(str, interfaceC9529a);
    }
}
