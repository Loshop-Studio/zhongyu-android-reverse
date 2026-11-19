package p000a.p031h.p040g;

import android.os.Handler;
import java.util.concurrent.Callable;
import p000a.p031h.p042i.InterfaceC0239a;

/* renamed from: a.h.g.o */
/* loaded from: classes.dex */
public class RunnableC0233o<T> implements Runnable {

    /* renamed from: b */
    public Callable<T> f1522b;

    /* renamed from: c */
    public InterfaceC0239a<T> f1523c;

    /* renamed from: d */
    public Handler f1524d;

    /* renamed from: a.h.g.o$a */
    public class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC0239a f1525b;

        /* renamed from: c */
        public final /* synthetic */ Object f1526c;

        public a(RunnableC0233o runnableC0233o, InterfaceC0239a interfaceC0239a, Object obj) {
            this.f1525b = interfaceC0239a;
            this.f1526c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            this.f1525b.mo793a(this.f1526c);
        }
    }

    public RunnableC0233o(Handler handler, Callable<T> callable, InterfaceC0239a<T> interfaceC0239a) {
        this.f1522b = callable;
        this.f1523c = interfaceC0239a;
        this.f1524d = handler;
    }

    @Override // java.lang.Runnable
    public void run() throws Exception {
        T tCall;
        try {
            tCall = this.f1522b.call();
        } catch (Exception unused) {
            tCall = null;
        }
        this.f1524d.post(new a(this, this.f1523c, tCall));
    }
}
