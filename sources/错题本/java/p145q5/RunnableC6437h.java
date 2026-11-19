package p145q5;

import io.reactivex.internal.operators.observable.RunnableC5713i;
import io.reactivex.internal.schedulers.C5724j;
import p159s5.InterfaceC6559b;

/* renamed from: q5.h */
/* loaded from: classes3.dex */
public final class RunnableC6437h implements InterfaceC6559b, Runnable {

    /* renamed from: a */
    public final RunnableC5713i f10560a;

    /* renamed from: b */
    public final AbstractC6438i f10561b;

    /* renamed from: c */
    public Thread f10562c;

    public RunnableC6437h(RunnableC5713i runnableC5713i, AbstractC6438i abstractC6438i) {
        this.f10560a = runnableC5713i;
        this.f10561b = abstractC6438i;
    }

    @Override // p159s5.InterfaceC6559b
    public final void dispose() {
        if (this.f10562c == Thread.currentThread()) {
            AbstractC6438i abstractC6438i = this.f10561b;
            if (abstractC6438i instanceof C5724j) {
                C5724j c5724j = (C5724j) abstractC6438i;
                if (c5724j.f9051b) {
                    return;
                }
                c5724j.f9051b = true;
                c5724j.f9050a.shutdown();
                return;
            }
        }
        this.f10561b.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10562c = Thread.currentThread();
        try {
            this.f10560a.run();
        } finally {
            dispose();
            this.f10562c = null;
        }
    }
}
