package p054e7;

import kotlinx.coroutines.AbstractC5995r;
import kotlinx.coroutines.AbstractC6018z;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.InterfaceC5870c0;
import kotlinx.coroutines.InterfaceC5962g0;
import kotlinx.coroutines.RunnableC5994q1;
import p075h6.InterfaceC5636h;

/* renamed from: e7.l */
/* loaded from: classes4.dex */
public final class C5480l extends AbstractC5995r implements InterfaceC5870c0 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5870c0 f8472a;

    /* renamed from: b */
    public final AbstractC5995r f8473b;

    /* renamed from: c */
    public final String f8474c;

    /* JADX WARN: Multi-variable type inference failed */
    public C5480l(AbstractC5995r abstractC5995r, String str) {
        InterfaceC5870c0 interfaceC5870c0 = abstractC5995r instanceof InterfaceC5870c0 ? (InterfaceC5870c0) abstractC5995r : null;
        this.f8472a = interfaceC5870c0 == null ? AbstractC6018z.f9531a : interfaceC5870c0;
        this.f8473b = abstractC5995r;
        this.f8474c = str;
    }

    @Override // kotlinx.coroutines.InterfaceC5870c0
    /* renamed from: a */
    public final InterfaceC5962g0 mo4815a(long j7, RunnableC5994q1 runnableC5994q1, InterfaceC5636h interfaceC5636h) {
        return this.f8472a.mo4815a(j7, runnableC5994q1, interfaceC5636h);
    }

    @Override // kotlinx.coroutines.InterfaceC5870c0
    /* renamed from: b */
    public final void mo4816b(long j7, C5961g c5961g) {
        this.f8472a.mo4816b(j7, c5961g);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatch(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        this.f8473b.dispatch(interfaceC5636h, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatchYield(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        this.f8473b.dispatchYield(interfaceC5636h, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final boolean isDispatchNeeded(InterfaceC5636h interfaceC5636h) {
        return this.f8473b.isDispatchNeeded(interfaceC5636h);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final String toString() {
        return this.f8474c;
    }
}
