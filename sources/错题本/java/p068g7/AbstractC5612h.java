package p068g7;

import java.util.concurrent.Executor;
import kotlinx.coroutines.AbstractC5990p0;
import p075h6.InterfaceC5636h;

/* renamed from: g7.h */
/* loaded from: classes4.dex */
public abstract class AbstractC5612h extends AbstractC5990p0 {

    /* renamed from: a */
    public ExecutorC5607c f8734a;

    @Override // kotlinx.coroutines.AbstractC5990p0
    /* renamed from: d */
    public final Executor mo4933d() {
        return this.f8734a;
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatch(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        ExecutorC5607c.m4927c(this.f8734a, runnable, 6);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatchYield(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        ExecutorC5607c.m4927c(this.f8734a, runnable, 2);
    }
}
