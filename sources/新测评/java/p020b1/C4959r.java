package p020b1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p020b1.InterfaceC4943b;
import p117i1.AbstractC7646e;
import p117i1.AbstractC7652k;

/* renamed from: b1.r */
/* loaded from: classes3.dex */
public final class C4959r {

    /* renamed from: d */
    public static volatile C4959r f2378d;

    /* renamed from: a */
    public final c f2379a;

    /* renamed from: b */
    public final Set f2380b = new HashSet();

    /* renamed from: c */
    public boolean f2381c;

    /* renamed from: b1.r$a */
    public class a implements AbstractC7646e.b {

        /* renamed from: a */
        public final /* synthetic */ Context f2382a;

        public a(Context context) {
            this.f2382a = context;
        }

        @Override // p117i1.AbstractC7646e.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f2382a.getSystemService("connectivity");
        }
    }

    /* renamed from: b1.r$b */
    public class b implements InterfaceC4943b.a {
        public b() {
        }

        @Override // p020b1.InterfaceC4943b.a
        /* renamed from: a */
        public void mo2330a(boolean z9) {
            ArrayList arrayList;
            AbstractC7652k.m12685a();
            synchronized (C4959r.this) {
                arrayList = new ArrayList(C4959r.this.f2380b);
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((InterfaceC4943b.a) obj).mo2330a(z9);
            }
        }
    }

    /* renamed from: b1.r$c */
    public interface c {
        /* renamed from: a */
        boolean mo2365a();

        void unregister();
    }

    /* renamed from: b1.r$d */
    public static final class d implements c {

        /* renamed from: a */
        public boolean f2385a;

        /* renamed from: b */
        public final InterfaceC4943b.a f2386b;

        /* renamed from: c */
        public final AbstractC7646e.b f2387c;

        /* renamed from: d */
        public final ConnectivityManager.NetworkCallback f2388d = new a();

        /* renamed from: b1.r$d$a */
        public class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: b1.r$d$a$a, reason: collision with other inner class name */
            public class RunnableC10129a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ boolean f2390a;

                public RunnableC10129a(boolean z9) {
                    this.f2390a = z9;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.m2366a(this.f2390a);
                }
            }

            public a() {
            }

            /* renamed from: a */
            public void m2366a(boolean z9) {
                AbstractC7652k.m12685a();
                d dVar = d.this;
                boolean z10 = dVar.f2385a;
                dVar.f2385a = z9;
                if (z10 != z9) {
                    dVar.f2386b.mo2330a(z9);
                }
            }

            /* renamed from: b */
            public final void m2367b(boolean z9) {
                AbstractC7652k.m12705u(new RunnableC10129a(z9));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                m2367b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                m2367b(false);
            }
        }

        public d(AbstractC7646e.b bVar, InterfaceC4943b.a aVar) {
            this.f2387c = bVar;
            this.f2386b = aVar;
        }

        @Override // p020b1.C4959r.c
        /* renamed from: a */
        public boolean mo2365a() {
            this.f2385a = ((ConnectivityManager) this.f2387c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f2387c.get()).registerDefaultNetworkCallback(this.f2388d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }

        @Override // p020b1.C4959r.c
        public void unregister() {
            ((ConnectivityManager) this.f2387c.get()).unregisterNetworkCallback(this.f2388d);
        }
    }

    public C4959r(Context context) {
        this.f2379a = new d(AbstractC7646e.m12665a(new a(context)), new b());
    }

    /* renamed from: a */
    public static C4959r m2359a(Context context) {
        if (f2378d == null) {
            synchronized (C4959r.class) {
                try {
                    if (f2378d == null) {
                        f2378d = new C4959r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f2378d;
    }

    /* renamed from: b */
    public final void m2360b() {
        if (this.f2381c || this.f2380b.isEmpty()) {
            return;
        }
        this.f2381c = this.f2379a.mo2365a();
    }

    /* renamed from: c */
    public final void m2361c() {
        if (this.f2381c && this.f2380b.isEmpty()) {
            this.f2379a.unregister();
            this.f2381c = false;
        }
    }

    /* renamed from: d */
    public synchronized void m2362d(InterfaceC4943b.a aVar) {
        this.f2380b.add(aVar);
        m2360b();
    }

    /* renamed from: e */
    public synchronized void m2363e(InterfaceC4943b.a aVar) {
        this.f2380b.remove(aVar);
        m2361c();
    }
}
