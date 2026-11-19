package p001a0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p001a0.InterfaceC0002b;
import p116h0.AbstractC8701e;
import p116h0.AbstractC8707k;

/* renamed from: a0.r */
/* loaded from: classes3.dex */
public final class C0018r {

    /* renamed from: d */
    public static volatile C0018r f40d;

    /* renamed from: a */
    public final c f41a;

    /* renamed from: b */
    public final Set f42b = new HashSet();

    /* renamed from: c */
    public boolean f43c;

    /* renamed from: a0.r$a */
    public class a implements AbstractC8701e.b {

        /* renamed from: a */
        public final /* synthetic */ Context f44a;

        public a(Context context) {
            this.f44a = context;
        }

        @Override // p116h0.AbstractC8701e.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f44a.getSystemService("connectivity");
        }
    }

    /* renamed from: a0.r$b */
    public class b implements InterfaceC0002b.a {
        public b() {
        }

        @Override // p001a0.InterfaceC0002b.a
        /* renamed from: a */
        public void mo2a(boolean z10) {
            ArrayList arrayList;
            AbstractC8707k.m14183a();
            synchronized (C0018r.this) {
                arrayList = new ArrayList(C0018r.this.f42b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC0002b.a) it.next()).mo2a(z10);
            }
        }
    }

    /* renamed from: a0.r$c */
    public interface c {
        /* renamed from: a */
        boolean mo37a();

        void unregister();
    }

    /* renamed from: a0.r$d */
    public static final class d implements c {

        /* renamed from: a */
        public boolean f47a;

        /* renamed from: b */
        public final InterfaceC0002b.a f48b;

        /* renamed from: c */
        public final AbstractC8701e.b f49c;

        /* renamed from: d */
        public final ConnectivityManager.NetworkCallback f50d = new a();

        /* renamed from: a0.r$d$a */
        public class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: a0.r$d$a$a, reason: collision with other inner class name */
            public class RunnableC10750a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ boolean f52a;

                public RunnableC10750a(boolean z10) {
                    this.f52a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.m38a(this.f52a);
                }
            }

            public a() {
            }

            /* renamed from: a */
            public void m38a(boolean z10) {
                AbstractC8707k.m14183a();
                d dVar = d.this;
                boolean z11 = dVar.f47a;
                dVar.f47a = z10;
                if (z11 != z10) {
                    dVar.f48b.mo2a(z10);
                }
            }

            /* renamed from: b */
            public final void m39b(boolean z10) {
                AbstractC8707k.m14204v(new RunnableC10750a(z10));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                m39b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                m39b(false);
            }
        }

        public d(AbstractC8701e.b bVar, InterfaceC0002b.a aVar) {
            this.f49c = bVar;
            this.f48b = aVar;
        }

        @Override // p001a0.C0018r.c
        /* renamed from: a */
        public boolean mo37a() {
            this.f47a = ((ConnectivityManager) this.f49c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f49c.get()).registerDefaultNetworkCallback(this.f50d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }

        @Override // p001a0.C0018r.c
        public void unregister() {
            ((ConnectivityManager) this.f49c.get()).unregisterNetworkCallback(this.f50d);
        }
    }

    public C0018r(Context context) {
        this.f41a = new d(AbstractC8701e.m14163a(new a(context)), new b());
    }

    /* renamed from: a */
    public static C0018r m31a(Context context) {
        if (f40d == null) {
            synchronized (C0018r.class) {
                try {
                    if (f40d == null) {
                        f40d = new C0018r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f40d;
    }

    /* renamed from: b */
    public final void m32b() {
        if (this.f43c || this.f42b.isEmpty()) {
            return;
        }
        this.f43c = this.f41a.mo37a();
    }

    /* renamed from: c */
    public final void m33c() {
        if (this.f43c && this.f42b.isEmpty()) {
            this.f41a.unregister();
            this.f43c = false;
        }
    }

    /* renamed from: d */
    public synchronized void m34d(InterfaceC0002b.a aVar) {
        this.f42b.add(aVar);
        m32b();
    }

    /* renamed from: e */
    public synchronized void m35e(InterfaceC0002b.a aVar) {
        this.f42b.remove(aVar);
        m33c();
    }
}
