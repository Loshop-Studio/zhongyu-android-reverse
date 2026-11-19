package androidx.core.os;

import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class HandlerKt$postAtTime$runnable$1 implements Runnable {
    final /* synthetic */ InterfaceC10559a $action;

    public HandlerKt$postAtTime$runnable$1(InterfaceC10559a interfaceC10559a) {
        this.$action = interfaceC10559a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
