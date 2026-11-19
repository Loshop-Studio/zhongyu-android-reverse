package com.bumptech.glide;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.bumptech.glide.C5345e;
import com.bumptech.glide.ComponentCallbacks2C5342b;
import com.bumptech.glide.load.engine.C5379f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p020b1.C4946e;
import p020b1.C4956o;
import p020b1.InterfaceC4944c;
import p031c1.AbstractC5102a;
import p073e1.C7327d;
import p195p0.C8805e;
import p195p0.C8809i;
import p195p0.C8810j;
import p195p0.InterfaceC8802b;
import p195p0.InterfaceC8804d;
import p206q0.C8871f;
import p206q0.C8872g;
import p206q0.C8874i;
import p206q0.InterfaceC8866a;
import p206q0.InterfaceC8873h;
import p217r0.ExecutorServiceC8995a;

/* renamed from: com.bumptech.glide.c */
/* loaded from: classes3.dex */
public final class C5343c {

    /* renamed from: c */
    public C5379f f3394c;

    /* renamed from: d */
    public InterfaceC8804d f3395d;

    /* renamed from: e */
    public InterfaceC8802b f3396e;

    /* renamed from: f */
    public InterfaceC8873h f3397f;

    /* renamed from: g */
    public ExecutorServiceC8995a f3398g;

    /* renamed from: h */
    public ExecutorServiceC8995a f3399h;

    /* renamed from: i */
    public InterfaceC8866a.a f3400i;

    /* renamed from: j */
    public C8874i f3401j;

    /* renamed from: k */
    public InterfaceC4944c f3402k;

    /* renamed from: n */
    public C4956o.b f3405n;

    /* renamed from: o */
    public ExecutorServiceC8995a f3406o;

    /* renamed from: p */
    public boolean f3407p;

    /* renamed from: q */
    public List f3408q;

    /* renamed from: a */
    public final Map f3392a = new ArrayMap();

    /* renamed from: b */
    public final C5345e.a f3393b = new C5345e.a();

    /* renamed from: l */
    public int f3403l = 4;

    /* renamed from: m */
    public ComponentCallbacks2C5342b.a f3404m = new a();

    /* renamed from: com.bumptech.glide.c$a */
    public class a implements ComponentCallbacks2C5342b.a {
        public a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C5342b.a
        public C7327d build() {
            return new C7327d();
        }
    }

    /* renamed from: com.bumptech.glide.c$b */
    public static final class b {
    }

    /* renamed from: com.bumptech.glide.c$c */
    public static final class c {
    }

    /* renamed from: a */
    public ComponentCallbacks2C5342b m3312a(Context context, List list, AbstractC5102a abstractC5102a) {
        if (this.f3398g == null) {
            this.f3398g = ExecutorServiceC8995a.m15106h();
        }
        if (this.f3399h == null) {
            this.f3399h = ExecutorServiceC8995a.m15104f();
        }
        if (this.f3406o == null) {
            this.f3406o = ExecutorServiceC8995a.m15102d();
        }
        if (this.f3401j == null) {
            this.f3401j = new C8874i.a(context).m14890a();
        }
        if (this.f3402k == null) {
            this.f3402k = new C4946e();
        }
        if (this.f3395d == null) {
            int iM14887b = this.f3401j.m14887b();
            if (iM14887b > 0) {
                this.f3395d = new C8810j(iM14887b);
            } else {
                this.f3395d = new C8805e();
            }
        }
        if (this.f3396e == null) {
            this.f3396e = new C8809i(this.f3401j.m14886a());
        }
        if (this.f3397f == null) {
            this.f3397f = new C8872g(this.f3401j.m14888d());
        }
        if (this.f3400i == null) {
            this.f3400i = new C8871f(context);
        }
        if (this.f3394c == null) {
            this.f3394c = new C5379f(this.f3397f, this.f3400i, this.f3399h, this.f3398g, ExecutorServiceC8995a.m15107i(), this.f3406o, this.f3407p);
        }
        List list2 = this.f3408q;
        if (list2 == null) {
            this.f3408q = Collections.EMPTY_LIST;
        } else {
            this.f3408q = Collections.unmodifiableList(list2);
        }
        return new ComponentCallbacks2C5342b(context, this.f3394c, this.f3397f, this.f3395d, this.f3396e, new C4956o(this.f3405n), this.f3402k, this.f3403l, this.f3404m, this.f3392a, this.f3408q, list, abstractC5102a, this.f3393b.m3325b());
    }

    /* renamed from: b */
    public void m3313b(C4956o.b bVar) {
        this.f3405n = bVar;
    }
}
