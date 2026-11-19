package androidx.core.os;

import kotlin.Metadata;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "run", "()V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    final /* synthetic */ InterfaceC6469a $action;

    public HandlerKt$postDelayed$runnable$1(InterfaceC6469a interfaceC6469a) {
        this.$action = interfaceC6469a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
