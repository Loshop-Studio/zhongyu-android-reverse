package com.bumptech.glide;

import android.content.Context;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p147r0.AbstractC6443a;
import p147r0.C6446d;
import p147r0.FutureC6445c;
import p155s0.InterfaceC6550i;
import p180v0.AbstractC6658e;
import p185v7.AbstractC6675d;

/* renamed from: com.bumptech.glide.f */
/* loaded from: classes2.dex */
public final class C3412f extends AbstractC6443a {

    /* renamed from: r */
    public final Context f2229r;

    /* renamed from: s */
    public final ComponentCallbacks2C3414h f2230s;

    /* renamed from: t */
    public final Class f2231t;

    /* renamed from: u */
    public final C3409c f2232u;

    /* renamed from: v */
    public C3407a f2233v;

    /* renamed from: w */
    public Object f2234w;

    /* renamed from: x */
    public final ArrayList f2235x;

    /* renamed from: y */
    public boolean f2236y;

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3412f(ComponentCallbacks2C3408b componentCallbacks2C3408b, ComponentCallbacks2C3414h componentCallbacks2C3414h, Class cls, Context context) {
        C6446d c6446d;
        this.f2230s = componentCallbacks2C3414h;
        this.f2231t = cls;
        this.f2229r = context;
        ArrayMap arrayMap = componentCallbacks2C3414h.f2239a.f2201d.f2213f;
        C3407a c3407a = (C3407a) arrayMap.get(cls);
        if (c3407a == null) {
            Iterator it = arrayMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c3407a = (C3407a) entry.getValue();
                }
            }
        }
        this.f2233v = c3407a == null ? C3409c.f2207j : c3407a;
        this.f2232u = componentCallbacks2C3408b.f2201d;
        Iterator it2 = componentCallbacks2C3414h.f2248j.iterator();
        while (it2.hasNext()) {
            FutureC6445c futureC6445c = (FutureC6445c) it2.next();
            if (futureC6445c != null) {
                if (this.f2235x == null) {
                    this.f2235x = new ArrayList();
                }
                this.f2235x.add(futureC6445c);
            }
        }
        synchronized (componentCallbacks2C3414h) {
            c6446d = componentCallbacks2C3414h.f2249k;
        }
        mo2374c(c6446d);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2373A(p155s0.InterfaceC6550i r19, p147r0.FutureC6445c r20, p147r0.AbstractC6443a r21, java.util.concurrent.Executor r22) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C3412f.m2373A(s0.i, r0.c, r0.a, java.util.concurrent.Executor):void");
    }

    @Override // p147r0.AbstractC6443a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final C3412f mo2374c(AbstractC6443a abstractC6443a) {
        AbstractC6675d.m6343e(abstractC6443a);
        return (C3412f) super.mo2374c(abstractC6443a);
    }

    @Override // p147r0.AbstractC6443a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final C3412f clone() {
        C3412f c3412f = (C3412f) super.clone();
        c3412f.f2233v = c3412f.f2233v.clone();
        return c3412f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2378y(android.widget.ImageView r5) {
        /*
            r4 = this;
            char[] r0 = p180v0.AbstractC6664k.f11243a
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lb6
            p185v7.AbstractC6675d.m6343e(r5)
            r0 = 2048(0x800, float:2.87E-42)
            int r1 = r4.f10563a
            boolean r0 = p147r0.AbstractC6443a.m6084i(r1, r0)
            r1 = 0
            if (r0 != 0) goto L70
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L70
            int[] r0 = com.bumptech.glide.AbstractC3411e.f2227a
            android.widget.ImageView$ScaleType r2 = r5.getScaleType()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 1: goto L60;
                case 2: goto L50;
                case 3: goto L40;
                case 4: goto L40;
                case 5: goto L40;
                case 6: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L70
        L30:
            com.bumptech.glide.f r0 = r4.clone()
            i0.k r2 = p077i0.C5655k.f8795c
            i0.g r3 = new i0.g
            r3.<init>()
            r0.a r0 = r0.m6092n(r2, r3, r1)
            goto L71
        L40:
            com.bumptech.glide.f r0 = r4.clone()
            i0.k r2 = p077i0.C5655k.f8794b
            i0.r r3 = new i0.r
            r3.<init>()
            r0.a r0 = r0.m6092n(r2, r3, r1)
            goto L71
        L50:
            com.bumptech.glide.f r0 = r4.clone()
            i0.k r2 = p077i0.C5655k.f8795c
            i0.g r3 = new i0.g
            r3.<init>()
            r0.a r0 = r0.m6092n(r2, r3, r1)
            goto L71
        L60:
            com.bumptech.glide.f r0 = r4.clone()
            i0.k r2 = p077i0.C5655k.f8796d
            i0.f r3 = new i0.f
            r3.<init>()
            r0.a r0 = r0.m6088j(r2, r3)
            goto L71
        L70:
            r0 = r4
        L71:
            com.bumptech.glide.c r2 = r4.f2232u
            c8.c r2 = r2.f2210c
            r2.getClass()
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            java.lang.Class r3 = r4.f2231t
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L88
            s0.b r2 = new s0.b
            r2.<init>(r5, r1)
            goto L96
        L88:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L9d
            s0.b r2 = new s0.b
            r1 = 1
            r2.<init>(r5, r1)
        L96:
            r5 = 0
            retrofit2.a r1 = p180v0.AbstractC6658e.f11231a
            r4.m2373A(r2, r5, r0, r1)
            return
        L9d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        Lb6:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You must call this method on the main thread"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C3412f.m2378y(android.widget.ImageView):void");
    }

    /* renamed from: z */
    public final void m2379z(InterfaceC6550i interfaceC6550i) {
        m2373A(interfaceC6550i, null, this, AbstractC6658e.f11231a);
    }
}
