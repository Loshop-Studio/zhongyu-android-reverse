package com.bumptech.glide;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.bumptech.glide.C5813e;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.bumptech.glide.load.engine.C5847f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p213k0.C9773e;
import p213k0.C9777i;
import p213k0.C9778j;
import p213k0.InterfaceC9770b;
import p213k0.InterfaceC9772d;
import p229l0.C10099f;
import p229l0.C10100g;
import p229l0.C10102i;
import p229l0.InterfaceC10094a;
import p229l0.InterfaceC10101h;
import p242m0.ExecutorServiceC10189a;
import p381w0.C11645e;
import p381w0.C11655o;
import p381w0.InterfaceC11643c;
import p397x0.AbstractC11755a;
import p428z0.C11955d;

/* renamed from: com.bumptech.glide.c */
/* loaded from: classes3.dex */
public final class C5811c {

    /* renamed from: c */
    public C5847f f4597c;

    /* renamed from: d */
    public InterfaceC9772d f4598d;

    /* renamed from: e */
    public InterfaceC9770b f4599e;

    /* renamed from: f */
    public InterfaceC10101h f4600f;

    /* renamed from: g */
    public ExecutorServiceC10189a f4601g;

    /* renamed from: h */
    public ExecutorServiceC10189a f4602h;

    /* renamed from: i */
    public InterfaceC10094a.a f4603i;

    /* renamed from: j */
    public C10102i f4604j;

    /* renamed from: k */
    public InterfaceC11643c f4605k;

    /* renamed from: n */
    public C11655o.b f4608n;

    /* renamed from: o */
    public ExecutorServiceC10189a f4609o;

    /* renamed from: p */
    public boolean f4610p;

    /* renamed from: q */
    public List f4611q;

    /* renamed from: a */
    public final Map f4595a = new ArrayMap();

    /* renamed from: b */
    public final C5813e.a f4596b = new C5813e.a();

    /* renamed from: l */
    public int f4606l = 4;

    /* renamed from: m */
    public ComponentCallbacks2C5810b.a f4607m = new a();

    /* renamed from: com.bumptech.glide.c$a */
    public class a implements ComponentCallbacks2C5810b.a {
        public a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C5810b.a
        public C11955d build() {
            return new C11955d();
        }
    }

    /* renamed from: com.bumptech.glide.c$b */
    public static final class b {
    }

    /* renamed from: com.bumptech.glide.c$c */
    public static final class c {
    }

    /* renamed from: a */
    public ComponentCallbacks2C5810b m3962a(Context context, List list, AbstractC11755a abstractC11755a) {
        if (this.f4601g == null) {
            this.f4601g = ExecutorServiceC10189a.m21268h();
        }
        if (this.f4602h == null) {
            this.f4602h = ExecutorServiceC10189a.m21266f();
        }
        if (this.f4609o == null) {
            this.f4609o = ExecutorServiceC10189a.m21264d();
        }
        if (this.f4604j == null) {
            this.f4604j = new C10102i.a(context).m21128a();
        }
        if (this.f4605k == null) {
            this.f4605k = new C11645e();
        }
        if (this.f4598d == null) {
            int iM21125b = this.f4604j.m21125b();
            if (iM21125b > 0) {
                this.f4598d = new C9778j(iM21125b);
            } else {
                this.f4598d = new C9773e();
            }
        }
        if (this.f4599e == null) {
            this.f4599e = new C9777i(this.f4604j.m21124a());
        }
        if (this.f4600f == null) {
            this.f4600f = new C10100g(this.f4604j.m21126d());
        }
        if (this.f4603i == null) {
            this.f4603i = new C10099f(context);
        }
        if (this.f4597c == null) {
            this.f4597c = new C5847f(this.f4600f, this.f4603i, this.f4602h, this.f4601g, ExecutorServiceC10189a.m21269i(), this.f4609o, this.f4610p);
        }
        List list2 = this.f4611q;
        if (list2 == null) {
            this.f4611q = Collections.EMPTY_LIST;
        } else {
            this.f4611q = Collections.unmodifiableList(list2);
        }
        return new ComponentCallbacks2C5810b(context, this.f4597c, this.f4600f, this.f4598d, this.f4599e, new C11655o(this.f4608n), this.f4605k, this.f4606l, this.f4607m, this.f4595a, this.f4611q, list, abstractC11755a, this.f4596b.m3975b());
    }

    /* renamed from: b */
    public void m3963b(C11655o.b bVar) {
        this.f4608n = bVar;
    }
}
