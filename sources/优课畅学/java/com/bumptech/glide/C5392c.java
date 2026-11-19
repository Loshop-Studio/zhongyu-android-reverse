package com.bumptech.glide;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.bumptech.glide.C5394e;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.bumptech.glide.load.engine.C5428f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p001a0.C0005e;
import p001a0.C0015o;
import p001a0.InterfaceC0003c;
import p020b0.AbstractC5023a;
import p069d0.C8272d;
import p193o.C9501e;
import p193o.C9505i;
import p193o.C9506j;
import p193o.InterfaceC9498b;
import p193o.InterfaceC9500d;
import p204p.C9629f;
import p204p.C9630g;
import p204p.C9632i;
import p204p.InterfaceC9624a;
import p204p.InterfaceC9631h;
import p215q.ExecutorServiceC9776a;

/* renamed from: com.bumptech.glide.c */
/* loaded from: classes3.dex */
public final class C5392c {

    /* renamed from: c */
    public C5428f f2827c;

    /* renamed from: d */
    public InterfaceC9500d f2828d;

    /* renamed from: e */
    public InterfaceC9498b f2829e;

    /* renamed from: f */
    public InterfaceC9631h f2830f;

    /* renamed from: g */
    public ExecutorServiceC9776a f2831g;

    /* renamed from: h */
    public ExecutorServiceC9776a f2832h;

    /* renamed from: i */
    public InterfaceC9624a.a f2833i;

    /* renamed from: j */
    public C9632i f2834j;

    /* renamed from: k */
    public InterfaceC0003c f2835k;

    /* renamed from: n */
    public C0015o.b f2838n;

    /* renamed from: o */
    public ExecutorServiceC9776a f2839o;

    /* renamed from: p */
    public boolean f2840p;

    /* renamed from: q */
    public List f2841q;

    /* renamed from: a */
    public final Map f2825a = new ArrayMap();

    /* renamed from: b */
    public final C5394e.a f2826b = new C5394e.a();

    /* renamed from: l */
    public int f2836l = 4;

    /* renamed from: m */
    public ComponentCallbacks2C5391b.a f2837m = new a();

    /* renamed from: com.bumptech.glide.c$a */
    public class a implements ComponentCallbacks2C5391b.a {
        public a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C5391b.a
        public C8272d build() {
            return new C8272d();
        }
    }

    /* renamed from: com.bumptech.glide.c$b */
    public static final class b {
    }

    /* renamed from: com.bumptech.glide.c$c */
    public static final class c {
    }

    /* renamed from: a */
    public ComponentCallbacks2C5391b m2753a(Context context, List list, AbstractC5023a abstractC5023a) {
        if (this.f2831g == null) {
            this.f2831g = ExecutorServiceC9776a.m18334h();
        }
        if (this.f2832h == null) {
            this.f2832h = ExecutorServiceC9776a.m18332f();
        }
        if (this.f2839o == null) {
            this.f2839o = ExecutorServiceC9776a.m18330d();
        }
        if (this.f2834j == null) {
            this.f2834j = new C9632i.a(context).m18191a();
        }
        if (this.f2835k == null) {
            this.f2835k = new C0005e();
        }
        if (this.f2828d == null) {
            int iM18188b = this.f2834j.m18188b();
            if (iM18188b > 0) {
                this.f2828d = new C9506j(iM18188b);
            } else {
                this.f2828d = new C9501e();
            }
        }
        if (this.f2829e == null) {
            this.f2829e = new C9505i(this.f2834j.m18187a());
        }
        if (this.f2830f == null) {
            this.f2830f = new C9630g(this.f2834j.m18189d());
        }
        if (this.f2833i == null) {
            this.f2833i = new C9629f(context);
        }
        if (this.f2827c == null) {
            this.f2827c = new C5428f(this.f2830f, this.f2833i, this.f2832h, this.f2831g, ExecutorServiceC9776a.m18335i(), this.f2839o, this.f2840p);
        }
        List list2 = this.f2841q;
        if (list2 == null) {
            this.f2841q = Collections.EMPTY_LIST;
        } else {
            this.f2841q = Collections.unmodifiableList(list2);
        }
        return new ComponentCallbacks2C5391b(context, this.f2827c, this.f2830f, this.f2828d, this.f2829e, new C0015o(this.f2838n), this.f2835k, this.f2836l, this.f2837m, this.f2825a, this.f2841q, list, abstractC5023a, this.f2826b.m2766b());
    }

    /* renamed from: b */
    public void m2754b(C0015o.b bVar) {
        this.f2838n = bVar;
    }
}
