package com.bumptech.glide;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.bumptech.glide.C4681f;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.load.engine.C4715f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p074i0.C6500e;
import p074i0.C6504i;
import p074i0.C6505j;
import p074i0.InterfaceC6497b;
import p074i0.InterfaceC6499d;
import p081j0.C6578f;
import p081j0.C6579g;
import p081j0.C6581i;
import p081j0.InterfaceC6573a;
import p081j0.InterfaceC6580h;
import p088k0.ExecutorServiceC6624a;
import p160u0.C7752e;
import p160u0.C7762o;
import p160u0.InterfaceC7750c;
import p167v0.AbstractC7785a;
import p181x0.C7826d;

/* renamed from: com.bumptech.glide.d */
/* loaded from: classes3.dex */
public final class C4679d {

    /* renamed from: c */
    public C4715f f2185c;

    /* renamed from: d */
    public InterfaceC6499d f2186d;

    /* renamed from: e */
    public InterfaceC6497b f2187e;

    /* renamed from: f */
    public InterfaceC6580h f2188f;

    /* renamed from: g */
    public ExecutorServiceC6624a f2189g;

    /* renamed from: h */
    public ExecutorServiceC6624a f2190h;

    /* renamed from: i */
    public InterfaceC6573a.a f2191i;

    /* renamed from: j */
    public C6581i f2192j;

    /* renamed from: k */
    public InterfaceC7750c f2193k;

    /* renamed from: n */
    public C7762o.b f2196n;

    /* renamed from: o */
    public ExecutorServiceC6624a f2197o;

    /* renamed from: p */
    public boolean f2198p;

    /* renamed from: q */
    public List f2199q;

    /* renamed from: a */
    public final Map f2183a = new ArrayMap();

    /* renamed from: b */
    public final C4681f.a f2184b = new C4681f.a();

    /* renamed from: l */
    public int f2194l = 4;

    /* renamed from: m */
    public ComponentCallbacks2C4678c.a f2195m = new a();

    /* renamed from: com.bumptech.glide.d$a */
    public class a implements ComponentCallbacks2C4678c.a {
        public a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C4678c.a
        public C7826d build() {
            return new C7826d();
        }
    }

    /* renamed from: com.bumptech.glide.d$b */
    public static final class b {
    }

    /* renamed from: com.bumptech.glide.d$c */
    public static final class c {
    }

    /* renamed from: a */
    public ComponentCallbacks2C4678c m2491a(Context context, List list, AbstractC7785a abstractC7785a) {
        if (this.f2189g == null) {
            this.f2189g = ExecutorServiceC6624a.m7596h();
        }
        if (this.f2190h == null) {
            this.f2190h = ExecutorServiceC6624a.m7594f();
        }
        if (this.f2197o == null) {
            this.f2197o = ExecutorServiceC6624a.m7592d();
        }
        if (this.f2192j == null) {
            this.f2192j = new C6581i.a(context).m7461a();
        }
        if (this.f2193k == null) {
            this.f2193k = new C7752e();
        }
        if (this.f2186d == null) {
            int iM7458b = this.f2192j.m7458b();
            if (iM7458b > 0) {
                this.f2186d = new C6505j(iM7458b);
            } else {
                this.f2186d = new C6500e();
            }
        }
        if (this.f2187e == null) {
            this.f2187e = new C6504i(this.f2192j.m7457a());
        }
        if (this.f2188f == null) {
            this.f2188f = new C6579g(this.f2192j.m7459d());
        }
        if (this.f2191i == null) {
            this.f2191i = new C6578f(context);
        }
        if (this.f2185c == null) {
            this.f2185c = new C4715f(this.f2188f, this.f2191i, this.f2190h, this.f2189g, ExecutorServiceC6624a.m7597i(), this.f2197o, this.f2198p);
        }
        List list2 = this.f2199q;
        if (list2 == null) {
            this.f2199q = Collections.EMPTY_LIST;
        } else {
            this.f2199q = Collections.unmodifiableList(list2);
        }
        return new ComponentCallbacks2C4678c(context, this.f2185c, this.f2188f, this.f2186d, this.f2187e, new C7762o(this.f2196n), this.f2193k, this.f2194l, this.f2195m, this.f2183a, this.f2199q, list, abstractC7785a, this.f2184b.m2504b());
    }

    /* renamed from: b */
    public void m2492b(C7762o.b bVar) {
        this.f2196n = bVar;
    }
}
