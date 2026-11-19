package com.bumptech.glide;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.bumptech.glide.ComponentCallbacks2C2858c;
import com.bumptech.glide.load.engine.C2877f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p016c0.C2753d;
import p098n.C4396e;
import p098n.C4400i;
import p098n.C4401j;
import p098n.InterfaceC4393b;
import p098n.InterfaceC4395d;
import p102o.C4415f;
import p102o.C4416g;
import p102o.C4418i;
import p102o.InterfaceC4410a;
import p102o.InterfaceC4417h;
import p106p.ExecutorServiceC4445a;
import p146z.C4694f;
import p146z.C4701m;
import p146z.InterfaceC4692d;

/* renamed from: com.bumptech.glide.d */
/* loaded from: classes2.dex */
public final class C2859d {

    /* renamed from: b */
    public C2877f f575b;

    /* renamed from: c */
    public InterfaceC4395d f576c;

    /* renamed from: d */
    public InterfaceC4393b f577d;

    /* renamed from: e */
    public InterfaceC4417h f578e;

    /* renamed from: f */
    public ExecutorServiceC4445a f579f;

    /* renamed from: g */
    public ExecutorServiceC4445a f580g;

    /* renamed from: h */
    public InterfaceC4410a.a f581h;

    /* renamed from: i */
    public C4418i f582i;

    /* renamed from: j */
    public InterfaceC4692d f583j;

    /* renamed from: m */
    public C4701m.b f586m;

    /* renamed from: n */
    public ExecutorServiceC4445a f587n;

    /* renamed from: o */
    public boolean f588o;

    /* renamed from: p */
    public List f589p;

    /* renamed from: q */
    public boolean f590q;

    /* renamed from: r */
    public boolean f591r;

    /* renamed from: a */
    public final Map f574a = new ArrayMap();

    /* renamed from: k */
    public int f584k = 4;

    /* renamed from: l */
    public ComponentCallbacks2C2858c.a f585l = new a();

    /* renamed from: com.bumptech.glide.d$a */
    public class a implements ComponentCallbacks2C2858c.a {
        public a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C2858c.a
        public C2753d build() {
            return new C2753d();
        }
    }

    /* renamed from: a */
    public ComponentCallbacks2C2858c m1701a(Context context) {
        if (this.f579f == null) {
            this.f579f = ExecutorServiceC4445a.m5660g();
        }
        if (this.f580g == null) {
            this.f580g = ExecutorServiceC4445a.m5658e();
        }
        if (this.f587n == null) {
            this.f587n = ExecutorServiceC4445a.m5656c();
        }
        if (this.f582i == null) {
            this.f582i = new C4418i.a(context).m5519a();
        }
        if (this.f583j == null) {
            this.f583j = new C4694f();
        }
        if (this.f576c == null) {
            int iM5516b = this.f582i.m5516b();
            if (iM5516b > 0) {
                this.f576c = new C4401j(iM5516b);
            } else {
                this.f576c = new C4396e();
            }
        }
        if (this.f577d == null) {
            this.f577d = new C4400i(this.f582i.m5515a());
        }
        if (this.f578e == null) {
            this.f578e = new C4416g(this.f582i.m5517d());
        }
        if (this.f581h == null) {
            this.f581h = new C4415f(context);
        }
        if (this.f575b == null) {
            this.f575b = new C2877f(this.f578e, this.f581h, this.f580g, this.f579f, ExecutorServiceC4445a.m5661h(), this.f587n, this.f588o);
        }
        List list = this.f589p;
        if (list == null) {
            this.f589p = Collections.emptyList();
        } else {
            this.f589p = Collections.unmodifiableList(list);
        }
        return new ComponentCallbacks2C2858c(context, this.f575b, this.f578e, this.f576c, this.f577d, new C4701m(this.f586m), this.f583j, this.f584k, this.f585l, this.f574a, this.f589p, this.f590q, this.f591r);
    }

    /* renamed from: b */
    public void m1702b(C4701m.b bVar) {
        this.f586m = bVar;
    }
}
