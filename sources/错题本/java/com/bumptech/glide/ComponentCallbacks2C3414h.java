package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.C0039h;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.C3420a;
import com.google.gson.internal.C3845b;
import io.reactivex.internal.operators.observable.C5711g;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p016b0.AbstractC3085o;
import p016b0.RunnableC3059a;
import p127o0.C6258d;
import p127o0.C6261g;
import p127o0.C6264j;
import p127o0.InterfaceC6256b;
import p127o0.InterfaceC6259e;
import p127o0.InterfaceC6260f;
import p127o0.InterfaceC6263i;
import p147r0.C6446d;
import p147r0.InterfaceC6444b;
import p155s0.InterfaceC6550i;
import p180v0.AbstractC6664k;

/* renamed from: com.bumptech.glide.h */
/* loaded from: classes2.dex */
public final class ComponentCallbacks2C3414h implements ComponentCallbacks2, InterfaceC6260f {

    /* renamed from: l */
    public static final C6446d f2237l;

    /* renamed from: m */
    public static final C6446d f2238m;

    /* renamed from: a */
    public final ComponentCallbacks2C3408b f2239a;

    /* renamed from: b */
    public final Context f2240b;

    /* renamed from: c */
    public final InterfaceC6259e f2241c;

    /* renamed from: d */
    public final C3845b f2242d;

    /* renamed from: e */
    public final InterfaceC6263i f2243e;

    /* renamed from: f */
    public final C6264j f2244f;

    /* renamed from: g */
    public final RunnableC3059a f2245g;

    /* renamed from: h */
    public final Handler f2246h;

    /* renamed from: i */
    public final InterfaceC6256b f2247i;

    /* renamed from: j */
    public final CopyOnWriteArrayList f2248j;

    /* renamed from: k */
    public final C6446d f2249k;

    static {
        C6446d c6446d = (C6446d) new C6446d().m6085f(Bitmap.class);
        c6446d.f10576n = true;
        f2237l = c6446d;
        ((C6446d) new C6446d().m6085f(GifDrawable.class)).f10576n = true;
        f2238m = (C6446d) ((C6446d) ((C6446d) new C6446d().m6086g(AbstractC3085o.f1481c)).m6091m(Priority.LOW)).m6096r();
    }

    public ComponentCallbacks2C3414h(ComponentCallbacks2C3408b componentCallbacks2C3408b, InterfaceC6259e interfaceC6259e, InterfaceC6263i interfaceC6263i, Context context) {
        C6446d c6446d;
        C3845b c3845b = new C3845b();
        C5711g c5711g = componentCallbacks2C3408b.f2205h;
        this.f2244f = new C6264j();
        RunnableC3059a runnableC3059a = new RunnableC3059a(this, 7);
        this.f2245g = runnableC3059a;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f2246h = handler;
        this.f2239a = componentCallbacks2C3408b;
        this.f2241c = interfaceC6259e;
        this.f2243e = interfaceC6263i;
        this.f2242d = c3845b;
        this.f2240b = context;
        Context applicationContext = context.getApplicationContext();
        C0039h c0039h = new C0039h(8, this, c3845b);
        c5711g.getClass();
        boolean z8 = ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z8 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC6256b c6258d = z8 ? new C6258d(applicationContext, c0039h) : new C6261g();
        this.f2247i = c6258d;
        char[] cArr = AbstractC6664k.f11243a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC6259e.mo5081d(this);
        } else {
            handler.post(runnableC3059a);
        }
        interfaceC6259e.mo5081d(c6258d);
        this.f2248j = new CopyOnWriteArrayList(componentCallbacks2C3408b.f2201d.f2212e);
        C3409c c3409c = componentCallbacks2C3408b.f2201d;
        synchronized (c3409c) {
            try {
                if (c3409c.f2216i == null) {
                    c3409c.f2211d.getClass();
                    C6446d c6446d2 = new C6446d();
                    c6446d2.f10576n = true;
                    c3409c.f2216i = c6446d2;
                }
                c6446d = c3409c.f2216i;
            } finally {
            }
        }
        synchronized (this) {
            C6446d c6446d3 = (C6446d) c6446d.clone();
            if (c6446d3.f10576n && !c6446d3.f10577o) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c6446d3.f10577o = true;
            c6446d3.f10576n = true;
            this.f2249k = c6446d3;
        }
        synchronized (componentCallbacks2C3408b.f2206i) {
            try {
                if (componentCallbacks2C3408b.f2206i.contains(this)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                componentCallbacks2C3408b.f2206i.add(this);
            } finally {
            }
        }
    }

    /* renamed from: i */
    public final C3412f m2383i(Class cls) {
        return new C3412f(this.f2239a, this, cls, this.f2240b);
    }

    /* renamed from: j */
    public final C3412f m2384j() {
        return m2383i(Bitmap.class).mo2374c(f2237l);
    }

    /* renamed from: k */
    public final void m2385k(InterfaceC6550i interfaceC6550i) {
        if (interfaceC6550i == null) {
            return;
        }
        boolean zM2389o = m2389o(interfaceC6550i);
        InterfaceC6444b interfaceC6444bMo6101a = interfaceC6550i.mo6101a();
        if (zM2389o) {
            return;
        }
        ComponentCallbacks2C3408b componentCallbacks2C3408b = this.f2239a;
        synchronized (componentCallbacks2C3408b.f2206i) {
            try {
                ArrayList arrayList = componentCallbacks2C3408b.f2206i;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((ComponentCallbacks2C3414h) obj).m2389o(interfaceC6550i)) {
                        return;
                    }
                }
                if (interfaceC6444bMo6101a != null) {
                    interfaceC6550i.mo6105g(null);
                    ((C3420a) interfaceC6444bMo6101a).m2421c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final C3412f m2386l(String str) {
        C3412f c3412fM2383i = m2383i(Drawable.class);
        c3412fM2383i.f2234w = str;
        c3412fM2383i.f2236y = true;
        return c3412fM2383i;
    }

    /* renamed from: m */
    public final synchronized void m2387m() {
        C3845b c3845b = this.f2242d;
        c3845b.f3018b = true;
        ArrayList arrayListM6324d = AbstractC6664k.m6324d((Set) c3845b.f3019c);
        int size = arrayListM6324d.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM6324d.get(i);
            i++;
            C3420a c3420a = (C3420a) ((InterfaceC6444b) obj);
            if (c3420a.m2425g()) {
                synchronized (c3420a.f2336c) {
                    try {
                        if (c3420a.m2425g()) {
                            c3420a.m2421c();
                        }
                    } finally {
                    }
                }
                ((ArrayList) c3845b.f3020d).add(c3420a);
            }
        }
    }

    /* renamed from: n */
    public final synchronized void m2388n() {
        C3845b c3845b = this.f2242d;
        int i = 0;
        c3845b.f3018b = false;
        ArrayList arrayListM6324d = AbstractC6664k.m6324d((Set) c3845b.f3019c);
        int size = arrayListM6324d.size();
        while (i < size) {
            Object obj = arrayListM6324d.get(i);
            i++;
            C3420a c3420a = (C3420a) ((InterfaceC6444b) obj);
            if (!c3420a.m2424f() && !c3420a.m2425g()) {
                c3420a.m2419a();
            }
        }
        ((ArrayList) c3845b.f3020d).clear();
    }

    /* renamed from: o */
    public final synchronized boolean m2389o(InterfaceC6550i interfaceC6550i) {
        InterfaceC6444b interfaceC6444bMo6101a = interfaceC6550i.mo6101a();
        if (interfaceC6444bMo6101a == null) {
            return true;
        }
        if (!this.f2242d.m2796b(interfaceC6444bMo6101a)) {
            return false;
        }
        this.f2244f.f10017a.remove(interfaceC6550i);
        interfaceC6550i.mo6105g(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // p127o0.InterfaceC6260f
    public final synchronized void onDestroy() {
        try {
            this.f2244f.onDestroy();
            ArrayList arrayListM6324d = AbstractC6664k.m6324d(this.f2244f.f10017a);
            int size = arrayListM6324d.size();
            int i = 0;
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayListM6324d.get(i8);
                i8++;
                m2385k((InterfaceC6550i) obj);
            }
            this.f2244f.f10017a.clear();
            C3845b c3845b = this.f2242d;
            ArrayList arrayListM6324d2 = AbstractC6664k.m6324d((Set) c3845b.f3019c);
            int size2 = arrayListM6324d2.size();
            while (i < size2) {
                Object obj2 = arrayListM6324d2.get(i);
                i++;
                c3845b.m2796b((InterfaceC6444b) obj2);
            }
            ((ArrayList) c3845b.f3020d).clear();
            this.f2241c.mo5082f(this);
            this.f2241c.mo5082f(this.f2247i);
            this.f2246h.removeCallbacks(this.f2245g);
            ComponentCallbacks2C3408b componentCallbacks2C3408b = this.f2239a;
            synchronized (componentCallbacks2C3408b.f2206i) {
                if (!componentCallbacks2C3408b.f2206i.contains(this)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                componentCallbacks2C3408b.f2206i.remove(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // p127o0.InterfaceC6260f
    public final synchronized void onStart() {
        m2388n();
        this.f2244f.onStart();
    }

    @Override // p127o0.InterfaceC6260f
    public final synchronized void onStop() {
        m2387m();
        this.f2244f.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2242d + ", treeNode=" + this.f2243e + "}";
    }
}
