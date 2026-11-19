package p090g1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C0825a;
import androidx.work.impl.utils.futures.C0829d;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import p080e1.InterfaceC2471a;
import p085f1.InterfaceC2521s;
import p095h1.InterfaceC2654a;
import p169x0.C3440i;
import p169x0.C3453v;
import p169x0.InterfaceC3441j;

/* renamed from: g1.n */
/* loaded from: classes.dex */
public class C2642n implements InterfaceC3441j {

    /* renamed from: a */
    private final InterfaceC2654a f10438a;

    /* renamed from: b */
    final InterfaceC2471a f10439b;

    /* renamed from: c */
    final InterfaceC2521s f10440c;

    /* renamed from: g1.n$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0829d f10441a;

        /* renamed from: b */
        final /* synthetic */ UUID f10442b;

        /* renamed from: c */
        final /* synthetic */ C3440i f10443c;

        /* renamed from: d */
        final /* synthetic */ Context f10444d;

        a(C0829d c0829d, UUID uuid, C3440i c3440i, Context context) {
            this.f10441a = c0829d;
            this.f10442b = uuid;
            this.f10443c = c3440i;
            this.f10444d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f10441a.isCancelled()) {
                    String string = this.f10442b.toString();
                    C3453v.a aVarMo8461i = C2642n.this.f10440c.mo8461i(string);
                    if (aVarMo8461i == null || aVarMo8461i.m10524a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C2642n.this.f10439b.mo8249c(string, this.f10443c);
                    this.f10444d.startService(C0825a.m4234b(this.f10444d, string, this.f10443c));
                }
                this.f10441a.mo4268o(null);
            } catch (Throwable th) {
                this.f10441a.mo4269p(th);
            }
        }
    }

    public C2642n(WorkDatabase workDatabase, InterfaceC2471a interfaceC2471a, InterfaceC2654a interfaceC2654a) {
        this.f10439b = interfaceC2471a;
        this.f10438a = interfaceC2654a;
        this.f10440c = workDatabase.mo4171M();
    }

    @Override // p169x0.InterfaceC3441j
    /* renamed from: a */
    public ListenableFuture<Void> mo8851a(Context context, UUID uuid, C3440i c3440i) {
        C0829d c0829dM4279s = C0829d.m4279s();
        this.f10438a.mo8914b(new a(c0829dM4279s, uuid, c3440i, context));
        return c0829dM4279s;
    }
}
