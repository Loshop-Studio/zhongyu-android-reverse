package p160u0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p016b1.AbstractC4403e;
import p016b1.AbstractC4409k;
import p160u0.InterfaceC7749b;

/* renamed from: u0.r */
/* loaded from: classes3.dex */
public final class C7765r {

    /* renamed from: d */
    public static volatile C7765r f10268d;

    /* renamed from: a */
    public final c f10269a;

    /* renamed from: b */
    public final Set f10270b = new HashSet();

    /* renamed from: c */
    public boolean f10271c;

    /* renamed from: u0.r$a */
    public class a implements AbstractC4403e.b {

        /* renamed from: a */
        public final /* synthetic */ Context f10272a;

        public a(Context context) {
            this.f10272a = context;
        }

        @Override // p016b1.AbstractC4403e.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f10272a.getSystemService("connectivity");
        }
    }

    /* renamed from: u0.r$b */
    public class b implements InterfaceC7749b.a {
        public b() {
        }

        @Override // p160u0.InterfaceC7749b.a
        /* renamed from: a */
        public void mo2551a(boolean z6) {
            ArrayList arrayList;
            AbstractC4409k.m1440a();
            synchronized (C7765r.this) {
                arrayList = new ArrayList(C7765r.this.f10270b);
            }
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                ((InterfaceC7749b.a) obj).mo2551a(z6);
            }
        }
    }

    /* renamed from: u0.r$c */
    public interface c {
        /* renamed from: a */
        boolean mo9292a();

        void unregister();
    }

    /* renamed from: u0.r$d */
    public static final class d implements c {

        /* renamed from: a */
        public boolean f10275a;

        /* renamed from: b */
        public final InterfaceC7749b.a f10276b;

        /* renamed from: c */
        public final AbstractC4403e.b f10277c;

        /* renamed from: d */
        public final ConnectivityManager.NetworkCallback f10278d = new a();

        /* renamed from: u0.r$d$a */
        public class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: u0.r$d$a$a, reason: collision with other inner class name */
            public class RunnableC8041a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ boolean f10280a;

                public RunnableC8041a(boolean z6) {
                    this.f10280a = z6;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.m9293a(this.f10280a);
                }
            }

            public a() {
            }

            /* renamed from: a */
            public void m9293a(boolean z6) {
                AbstractC4409k.m1440a();
                d dVar = d.this;
                boolean z7 = dVar.f10275a;
                dVar.f10275a = z6;
                if (z7 != z6) {
                    dVar.f10276b.mo2551a(z6);
                }
            }

            /* renamed from: b */
            public final void m9294b(boolean z6) {
                AbstractC4409k.m1460u(new RunnableC8041a(z6));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                m9294b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                m9294b(false);
            }
        }

        public d(AbstractC4403e.b bVar, InterfaceC7749b.a aVar) {
            this.f10277c = bVar;
            this.f10276b = aVar;
        }

        @Override // p160u0.C7765r.c
        /* renamed from: a */
        public boolean mo9292a() {
            this.f10275a = ((ConnectivityManager) this.f10277c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f10277c.get()).registerDefaultNetworkCallback(this.f10278d);
                return true;
            } catch (RuntimeException e6) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e6);
                }
                return false;
            }
        }

        @Override // p160u0.C7765r.c
        public void unregister() {
            ((ConnectivityManager) this.f10277c.get()).unregisterNetworkCallback(this.f10278d);
        }
    }

    public C7765r(Context context) {
        this.f10269a = new d(AbstractC4403e.m1420a(new a(context)), new b());
    }

    /* renamed from: a */
    public static C7765r m9286a(Context context) {
        if (f10268d == null) {
            synchronized (C7765r.class) {
                try {
                    if (f10268d == null) {
                        f10268d = new C7765r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f10268d;
    }

    /* renamed from: b */
    public final void m9287b() {
        if (this.f10271c || this.f10270b.isEmpty()) {
            return;
        }
        this.f10271c = this.f10269a.mo9292a();
    }

    /* renamed from: c */
    public final void m9288c() {
        if (this.f10271c && this.f10270b.isEmpty()) {
            this.f10269a.unregister();
            this.f10271c = false;
        }
    }

    /* renamed from: d */
    public synchronized void m9289d(InterfaceC7749b.a aVar) {
        this.f10270b.add(aVar);
        m9287b();
    }

    /* renamed from: e */
    public synchronized void m9290e(InterfaceC7749b.a aVar) {
        this.f10270b.remove(aVar);
        m9288c();
    }
}
