package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.C3420a;
import p016b0.C3091u;
import p016b0.C3093w;
import p180v0.AbstractC6658e;

/* renamed from: com.bumptech.glide.load.engine.d */
/* loaded from: classes2.dex */
public final class RunnableC3418d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2299a;

    /* renamed from: b */
    public final C3420a f2300b;

    /* renamed from: c */
    public final /* synthetic */ C3093w f2301c;

    public /* synthetic */ RunnableC3418d(C3093w c3093w, C3420a c3420a, int i) {
        this.f2299a = i;
        this.f2301c = c3093w;
        this.f2300b = c3420a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CallbackException callbackException;
        switch (this.f2299a) {
            case 0:
                C3420a c3420a = this.f2300b;
                c3420a.f2335b.m6399a();
                synchronized (c3420a.f2336c) {
                    synchronized (this.f2301c) {
                        try {
                            if (this.f2301c.f1501a.f1499a.contains(new C3091u(this.f2300b, AbstractC6658e.f11232b))) {
                                C3093w c3093w = this.f2301c;
                                C3420a c3420a2 = this.f2300b;
                                c3093w.getClass();
                                try {
                                    c3420a2.m2428j(c3093w.f1517q, 5);
                                } finally {
                                }
                            }
                            this.f2301c.m2056d();
                        } finally {
                        }
                    }
                }
                return;
            default:
                C3420a c3420a3 = this.f2300b;
                c3420a3.f2335b.m6399a();
                synchronized (c3420a3.f2336c) {
                    synchronized (this.f2301c) {
                        try {
                            if (this.f2301c.f1501a.f1499a.contains(new C3091u(this.f2300b, AbstractC6658e.f11232b))) {
                                this.f2301c.f1519s.m2005b();
                                C3093w c3093w2 = this.f2301c;
                                C3420a c3420a4 = this.f2300b;
                                c3093w2.getClass();
                                try {
                                    c3420a4.m2429k(c3093w2.f1519s, c3093w2.f1515o);
                                    this.f2301c.m2060h(this.f2300b);
                                } finally {
                                }
                            }
                            this.f2301c.m2056d();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
