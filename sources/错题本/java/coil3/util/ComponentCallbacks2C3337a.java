package coil3.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil3.C3333r;
import java.lang.ref.WeakReference;
import p140q.C6401e;

/* renamed from: coil3.util.a */
/* loaded from: classes2.dex */
public final class ComponentCallbacks2C3337a implements ComponentCallbacks2 {

    /* renamed from: a */
    public final WeakReference f2069a;

    /* renamed from: b */
    public Context f2070b;

    /* renamed from: c */
    public boolean f2071c;

    public ComponentCallbacks2C3337a(C3333r c3333r) {
        this.f2069a = new WeakReference(c3333r);
    }

    /* renamed from: a */
    public final synchronized void m2284a() {
        try {
            if (this.f2071c) {
                return;
            }
            this.f2071c = true;
            Context context = this.f2070b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            this.f2069a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((C3333r) this.f2069a.get()) == null) {
            m2284a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        C6401e c6401eM2277d;
        long size;
        try {
            C3333r c3333r = (C3333r) this.f2069a.get();
            if (c3333r == null) {
                m2284a();
            } else if (i >= 40) {
                C6401e c6401eM2277d2 = c3333r.m2277d();
                if (c6401eM2277d2 != null) {
                    c6401eM2277d2.m6067a();
                }
            } else if (i >= 10 && (c6401eM2277d = c3333r.m2277d()) != null) {
                synchronized (c6401eM2277d.f10503c) {
                    size = c6401eM2277d.f10501a.getSize();
                }
                long j7 = size / 2;
                synchronized (c6401eM2277d.f10503c) {
                    c6401eM2277d.f10501a.mo122p(j7);
                }
            }
        } finally {
        }
    }
}
