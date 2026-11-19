package androidx.compose.foundation.layout;

import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class FlowLayoutOverflowKt {
    public static final InterfaceC8724d lazyInt(String str, InterfaceC10559a interfaceC10559a) {
        return new LazyImpl(interfaceC10559a, str);
    }

    public static /* synthetic */ InterfaceC8724d lazyInt$default(String str, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Lazy item is not yet initialized";
        }
        return lazyInt(str, interfaceC10559a);
    }
}
