package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.bumptech.glide.load.engine.C5428f;
import java.util.List;
import java.util.Map;
import p069d0.C8272d;
import p081e0.AbstractC8345j;
import p081e0.C8342g;
import p116h0.AbstractC8701e;
import p193o.InterfaceC9498b;

/* renamed from: com.bumptech.glide.d */
/* loaded from: classes3.dex */
public class C5393d extends ContextWrapper {

    /* renamed from: k */
    public static final AbstractC5398i f2843k = new C5390a();

    /* renamed from: a */
    public final InterfaceC9498b f2844a;

    /* renamed from: b */
    public final AbstractC8701e.b f2845b;

    /* renamed from: c */
    public final C8342g f2846c;

    /* renamed from: d */
    public final ComponentCallbacks2C5391b.a f2847d;

    /* renamed from: e */
    public final List f2848e;

    /* renamed from: f */
    public final Map f2849f;

    /* renamed from: g */
    public final C5428f f2850g;

    /* renamed from: h */
    public final C5394e f2851h;

    /* renamed from: i */
    public final int f2852i;

    /* renamed from: j */
    public C8272d f2853j;

    public C5393d(Context context, InterfaceC9498b interfaceC9498b, AbstractC8701e.b bVar, C8342g c8342g, ComponentCallbacks2C5391b.a aVar, Map map, List list, C5428f c5428f, C5394e c5394e, int i10) {
        super(context.getApplicationContext());
        this.f2844a = interfaceC9498b;
        this.f2846c = c8342g;
        this.f2847d = aVar;
        this.f2848e = list;
        this.f2849f = map;
        this.f2850g = c5428f;
        this.f2851h = c5394e;
        this.f2852i = i10;
        this.f2845b = AbstractC8701e.m14163a(bVar);
    }

    /* renamed from: a */
    public AbstractC8345j m2755a(ImageView imageView, Class cls) {
        return this.f2846c.m13573a(imageView, cls);
    }

    /* renamed from: b */
    public InterfaceC9498b m2756b() {
        return this.f2844a;
    }

    /* renamed from: c */
    public List m2757c() {
        return this.f2848e;
    }

    /* renamed from: d */
    public synchronized C8272d m2758d() {
        try {
            if (this.f2853j == null) {
                this.f2853j = (C8272d) this.f2847d.build().m13370Q();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2853j;
    }

    /* renamed from: e */
    public AbstractC5398i m2759e(Class cls) {
        AbstractC5398i abstractC5398i = (AbstractC5398i) this.f2849f.get(cls);
        if (abstractC5398i == null) {
            for (Map.Entry entry : this.f2849f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    abstractC5398i = (AbstractC5398i) entry.getValue();
                }
            }
        }
        return abstractC5398i == null ? f2843k : abstractC5398i;
    }

    /* renamed from: f */
    public C5428f m2760f() {
        return this.f2850g;
    }

    /* renamed from: g */
    public C5394e m2761g() {
        return this.f2851h;
    }

    /* renamed from: h */
    public int m2762h() {
        return this.f2852i;
    }

    /* renamed from: i */
    public Registry m2763i() {
        return (Registry) this.f2845b.get();
    }
}
