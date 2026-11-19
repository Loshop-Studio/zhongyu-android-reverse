package androidx.core.os;

import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class HandlerKt$postAtTime$runnable$1 implements Runnable {
    final /* synthetic */ InterfaceC9529a $action;

    public HandlerKt$postAtTime$runnable$1(InterfaceC9529a interfaceC9529a) {
        this.$action = interfaceC9529a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
