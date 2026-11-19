package p075d1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p012b1.InterfaceC1026a;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3445n;

/* renamed from: d1.d */
/* loaded from: classes.dex */
public abstract class AbstractC2448d<T> {

    /* renamed from: f */
    private static final String f10010f = AbstractC3445n.m10503f("ConstraintTracker");

    /* renamed from: a */
    protected final InterfaceC2654a f10011a;

    /* renamed from: b */
    protected final Context f10012b;

    /* renamed from: c */
    private final Object f10013c = new Object();

    /* renamed from: d */
    private final Set<InterfaceC1026a<T>> f10014d = new LinkedHashSet();

    /* renamed from: e */
    T f10015e;

    /* renamed from: d1.d$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f10016a;

        a(List list) {
            this.f10016a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f10016a.iterator();
            while (it.hasNext()) {
                ((InterfaceC1026a) it.next()).mo4785a(AbstractC2448d.this.f10015e);
            }
        }
    }

    AbstractC2448d(Context context, InterfaceC2654a interfaceC2654a) {
        this.f10012b = context.getApplicationContext();
        this.f10011a = interfaceC2654a;
    }

    /* renamed from: a */
    public void m8182a(InterfaceC1026a<T> interfaceC1026a) {
        synchronized (this.f10013c) {
            if (this.f10014d.add(interfaceC1026a)) {
                if (this.f10014d.size() == 1) {
                    this.f10015e = mo8175b();
                    AbstractC3445n.m10501c().mo10504a(f10010f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f10015e), new Throwable[0]);
                    mo8180e();
                }
                interfaceC1026a.mo4785a(this.f10015e);
            }
        }
    }

    /* renamed from: b */
    public abstract T mo8175b();

    /* renamed from: c */
    public void m8183c(InterfaceC1026a<T> interfaceC1026a) {
        synchronized (this.f10013c) {
            if (this.f10014d.remove(interfaceC1026a) && this.f10014d.isEmpty()) {
                mo8181f();
            }
        }
    }

    /* renamed from: d */
    public void m8184d(T t3) {
        synchronized (this.f10013c) {
            T t4 = this.f10015e;
            if (t4 != t3 && (t4 == null || !t4.equals(t3))) {
                this.f10015e = t3;
                this.f10011a.mo8913a().execute(new a(new ArrayList(this.f10014d)));
            }
        }
    }

    /* renamed from: e */
    public abstract void mo8180e();

    /* renamed from: f */
    public abstract void mo8181f();
}
