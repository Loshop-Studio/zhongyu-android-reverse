package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC5830k;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.c */
/* loaded from: classes4.dex */
public final class C5869c extends AbstractC5863a {

    /* renamed from: d */
    public final Thread f9286d;

    /* renamed from: e */
    public final AbstractC5987o0 f9287e;

    public C5869c(InterfaceC5636h interfaceC5636h, Thread thread, AbstractC5987o0 abstractC5987o0) {
        super(interfaceC5636h, true);
        this.f9286d = thread;
        this.f9287e = abstractC5987o0;
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: s */
    public final void mo4860s(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f9286d;
        if (AbstractC5830k.m5325b(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
