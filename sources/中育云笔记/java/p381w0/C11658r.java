package p381w0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p109d1.AbstractC8904e;
import p109d1.AbstractC8910k;
import p381w0.InterfaceC11642b;

/* renamed from: w0.r */
/* loaded from: classes3.dex */
public final class C11658r {

    /* renamed from: d */
    public static volatile C11658r f27670d;

    /* renamed from: a */
    public final c f27671a;

    /* renamed from: b */
    public final Set f27672b = new HashSet();

    /* renamed from: c */
    public boolean f27673c;

    /* renamed from: w0.r$a */
    public class a implements AbstractC8904e.b {

        /* renamed from: a */
        public final /* synthetic */ Context f27674a;

        public a(Context context) {
            this.f27674a = context;
        }

        @Override // p109d1.AbstractC8904e.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f27674a.getSystemService("connectivity");
        }
    }

    /* renamed from: w0.r$b */
    public class b implements InterfaceC11642b.a {
        public b() {
        }

        @Override // p381w0.InterfaceC11642b.a
        /* renamed from: a */
        public void mo4023a(boolean z10) {
            ArrayList arrayList;
            AbstractC8910k.m17470a();
            synchronized (C11658r.this) {
                arrayList = new ArrayList(C11658r.this.f27672b);
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((InterfaceC11642b.a) obj).mo4023a(z10);
            }
        }
    }

    /* renamed from: w0.r$c */
    public interface c {
        boolean register();

        void unregister();
    }

    /* renamed from: w0.r$d */
    public static final class d implements c {

        /* renamed from: a */
        public boolean f27677a;

        /* renamed from: b */
        public final InterfaceC11642b.a f27678b;

        /* renamed from: c */
        public final AbstractC8904e.b f27679c;

        /* renamed from: d */
        public final ConnectivityManager.NetworkCallback f27680d = new a();

        /* renamed from: w0.r$d$a */
        public class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: w0.r$d$a$a, reason: collision with other inner class name */
            public class RunnableC12154a implements Runnable {

                /* renamed from: c */
                public final /* synthetic */ boolean f27682c;

                public RunnableC12154a(boolean z10) {
                    this.f27682c = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.m25794a(this.f27682c);
                }
            }

            public a() {
            }

            /* renamed from: a */
            public void m25794a(boolean z10) {
                AbstractC8910k.m17470a();
                d dVar = d.this;
                boolean z11 = dVar.f27677a;
                dVar.f27677a = z10;
                if (z11 != z10) {
                    dVar.f27678b.mo4023a(z10);
                }
            }

            /* renamed from: b */
            public final void m25795b(boolean z10) {
                AbstractC8910k.m17491v(new RunnableC12154a(z10));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                m25795b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                m25795b(false);
            }
        }

        public d(AbstractC8904e.b bVar, InterfaceC11642b.a aVar) {
            this.f27679c = bVar;
            this.f27678b = aVar;
        }

        @Override // p381w0.C11658r.c
        public boolean register() {
            this.f27677a = ((ConnectivityManager) this.f27679c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f27679c.get()).registerDefaultNetworkCallback(this.f27680d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }

        @Override // p381w0.C11658r.c
        public void unregister() {
            ((ConnectivityManager) this.f27679c.get()).unregisterNetworkCallback(this.f27680d);
        }
    }

    public C11658r(Context context) {
        this.f27671a = new d(AbstractC8904e.m17450a(new a(context)), new b());
    }

    /* renamed from: a */
    public static C11658r m25788a(Context context) {
        if (f27670d == null) {
            synchronized (C11658r.class) {
                try {
                    if (f27670d == null) {
                        f27670d = new C11658r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f27670d;
    }

    /* renamed from: b */
    public final void m25789b() {
        if (this.f27673c || this.f27672b.isEmpty()) {
            return;
        }
        this.f27673c = this.f27671a.register();
    }

    /* renamed from: c */
    public final void m25790c() {
        if (this.f27673c && this.f27672b.isEmpty()) {
            this.f27671a.unregister();
            this.f27673c = false;
        }
    }

    /* renamed from: d */
    public synchronized void m25791d(InterfaceC11642b.a aVar) {
        this.f27672b.add(aVar);
        m25789b();
    }

    /* renamed from: e */
    public synchronized void m25792e(InterfaceC11642b.a aVar) {
        this.f27672b.remove(aVar);
        m25790c();
    }
}
