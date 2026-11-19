package p090g1;

import android.content.Context;
import androidx.work.C0810a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C0829d;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import p085f1.C2517o;
import p085f1.C2520r;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3445n;
import p169x0.C3453v;
import p169x0.InterfaceC3449r;

/* renamed from: g1.o */
/* loaded from: classes.dex */
public class C2643o implements InterfaceC3449r {

    /* renamed from: c */
    static final String f10446c = AbstractC3445n.m10503f("WorkProgressUpdater");

    /* renamed from: a */
    final WorkDatabase f10447a;

    /* renamed from: b */
    final InterfaceC2654a f10448b;

    /* renamed from: g1.o$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UUID f10449a;

        /* renamed from: b */
        final /* synthetic */ C0810a f10450b;

        /* renamed from: c */
        final /* synthetic */ C0829d f10451c;

        a(UUID uuid, C0810a c0810a, C0829d c0829d) {
            this.f10449a = uuid;
            this.f10450b = c0810a;
            this.f10451c = c0829d;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2520r c2520rMo8463k;
            String string = this.f10449a.toString();
            AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
            String str = C2643o.f10446c;
            abstractC3445nM10501c.mo10504a(str, String.format("Updating progress for %s (%s)", this.f10449a, this.f10450b), new Throwable[0]);
            C2643o.this.f10447a.m3542e();
            try {
                c2520rMo8463k = C2643o.this.f10447a.mo4171M().mo8463k(string);
            } finally {
                try {
                } finally {
                }
            }
            if (c2520rMo8463k == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (c2520rMo8463k.f10166b == C3453v.a.RUNNING) {
                C2643o.this.f10447a.mo4170L().mo8444b(new C2517o(string, this.f10450b));
            } else {
                AbstractC3445n.m10501c().mo10508h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
            }
            this.f10451c.mo4268o(null);
            C2643o.this.f10447a.m3539A();
        }
    }

    public C2643o(WorkDatabase workDatabase, InterfaceC2654a interfaceC2654a) {
        this.f10447a = workDatabase;
        this.f10448b = interfaceC2654a;
    }

    @Override // p169x0.InterfaceC3449r
    /* renamed from: a */
    public ListenableFuture<Void> mo8852a(Context context, UUID uuid, C0810a c0810a) {
        C0829d c0829dM4279s = C0829d.m4279s();
        this.f10448b.mo8914b(new a(uuid, c0810a, c0829dM4279s));
        return c0829dM4279s;
    }
}
