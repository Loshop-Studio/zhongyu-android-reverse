package com.bumptech.glide;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import com.bumptech.glide.load.engine.C5490f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p002a1.C0012d;
import p164l0.C8868e;
import p164l0.C8872i;
import p164l0.C8873j;
import p164l0.InterfaceC8865b;
import p164l0.InterfaceC8867d;
import p174m0.C8944f;
import p174m0.C8945g;
import p174m0.C8947i;
import p174m0.InterfaceC8939a;
import p174m0.InterfaceC8946h;
import p184n0.ExecutorServiceC9082a;
import p288x0.C9853f;
import p288x0.C9860m;
import p288x0.InterfaceC9851d;

/* renamed from: com.bumptech.glide.c */
/* loaded from: classes3.dex */
public final class C5472c {

    /* renamed from: b */
    public C5490f f3229b;

    /* renamed from: c */
    public InterfaceC8867d f3230c;

    /* renamed from: d */
    public InterfaceC8865b f3231d;

    /* renamed from: e */
    public InterfaceC8946h f3232e;

    /* renamed from: f */
    public ExecutorServiceC9082a f3233f;

    /* renamed from: g */
    public ExecutorServiceC9082a f3234g;

    /* renamed from: h */
    public InterfaceC8939a.a f3235h;

    /* renamed from: i */
    public C8947i f3236i;

    /* renamed from: j */
    public InterfaceC9851d f3237j;

    /* renamed from: m */
    public C9860m.b f3240m;

    /* renamed from: n */
    public ExecutorServiceC9082a f3241n;

    /* renamed from: o */
    public boolean f3242o;

    /* renamed from: p */
    public List f3243p;

    /* renamed from: q */
    public boolean f3244q;

    /* renamed from: r */
    public boolean f3245r;

    /* renamed from: a */
    public final Map f3228a = new ArrayMap();

    /* renamed from: k */
    public int f3238k = 4;

    /* renamed from: l */
    public ComponentCallbacks2C5471b.a f3239l = new a();

    /* renamed from: com.bumptech.glide.c$a */
    public class a implements ComponentCallbacks2C5471b.a {
        public a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C5471b.a
        public C0012d build() {
            return new C0012d();
        }
    }

    /* renamed from: a */
    public ComponentCallbacks2C5471b m3027a(Context context) {
        if (this.f3233f == null) {
            this.f3233f = ExecutorServiceC9082a.m14570g();
        }
        if (this.f3234g == null) {
            this.f3234g = ExecutorServiceC9082a.m14568e();
        }
        if (this.f3241n == null) {
            this.f3241n = ExecutorServiceC9082a.m14566c();
        }
        if (this.f3236i == null) {
            this.f3236i = new C8947i.a(context).m14272a();
        }
        if (this.f3237j == null) {
            this.f3237j = new C9853f();
        }
        if (this.f3230c == null) {
            int iM14269b = this.f3236i.m14269b();
            if (iM14269b > 0) {
                this.f3230c = new C8873j(iM14269b);
            } else {
                this.f3230c = new C8868e();
            }
        }
        if (this.f3231d == null) {
            this.f3231d = new C8872i(this.f3236i.m14268a());
        }
        if (this.f3232e == null) {
            this.f3232e = new C8945g(this.f3236i.m14270d());
        }
        if (this.f3235h == null) {
            this.f3235h = new C8944f(context);
        }
        if (this.f3229b == null) {
            this.f3229b = new C5490f(this.f3232e, this.f3235h, this.f3234g, this.f3233f, ExecutorServiceC9082a.m14571h(), this.f3241n, this.f3242o);
        }
        List list = this.f3243p;
        if (list == null) {
            this.f3243p = Collections.EMPTY_LIST;
        } else {
            this.f3243p = Collections.unmodifiableList(list);
        }
        return new ComponentCallbacks2C5471b(context, this.f3229b, this.f3232e, this.f3230c, this.f3231d, new C9860m(this.f3240m), this.f3237j, this.f3238k, this.f3239l, this.f3228a, this.f3243p, this.f3244q, this.f3245r);
    }

    /* renamed from: b */
    public void m3028b(C9860m.b bVar) {
        this.f3240m = bVar;
    }
}
