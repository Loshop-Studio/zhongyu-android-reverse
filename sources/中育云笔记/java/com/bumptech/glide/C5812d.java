package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.bumptech.glide.load.engine.C5847f;
import java.util.List;
import java.util.Map;
import p002a1.AbstractC0038i;
import p002a1.C0035f;
import p109d1.AbstractC8904e;
import p213k0.InterfaceC9770b;
import p428z0.C11955d;

/* renamed from: com.bumptech.glide.d */
/* loaded from: classes3.dex */
public class C5812d extends ContextWrapper {

    /* renamed from: k */
    public static final AbstractC5817i f4613k = new C5809a();

    /* renamed from: a */
    public final InterfaceC9770b f4614a;

    /* renamed from: b */
    public final AbstractC8904e.b f4615b;

    /* renamed from: c */
    public final C0035f f4616c;

    /* renamed from: d */
    public final ComponentCallbacks2C5810b.a f4617d;

    /* renamed from: e */
    public final List f4618e;

    /* renamed from: f */
    public final Map f4619f;

    /* renamed from: g */
    public final C5847f f4620g;

    /* renamed from: h */
    public final C5813e f4621h;

    /* renamed from: i */
    public final int f4622i;

    /* renamed from: j */
    public C11955d f4623j;

    public C5812d(Context context, InterfaceC9770b interfaceC9770b, AbstractC8904e.b bVar, C0035f c0035f, ComponentCallbacks2C5810b.a aVar, Map map, List list, C5847f c5847f, C5813e c5813e, int i10) {
        super(context.getApplicationContext());
        this.f4614a = interfaceC9770b;
        this.f4616c = c0035f;
        this.f4617d = aVar;
        this.f4618e = list;
        this.f4619f = map;
        this.f4620g = c5847f;
        this.f4621h = c5813e;
        this.f4622i = i10;
        this.f4615b = AbstractC8904e.m17450a(bVar);
    }

    /* renamed from: a */
    public AbstractC0038i m3964a(ImageView imageView, Class cls) {
        return this.f4616c.m74a(imageView, cls);
    }

    /* renamed from: b */
    public InterfaceC9770b m3965b() {
        return this.f4614a;
    }

    /* renamed from: c */
    public List m3966c() {
        return this.f4618e;
    }

    /* renamed from: d */
    public synchronized C11955d m3967d() {
        try {
            if (this.f4623j == null) {
                this.f4623j = (C11955d) this.f4617d.build().m26528P();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4623j;
    }

    /* renamed from: e */
    public AbstractC5817i m3968e(Class cls) {
        AbstractC5817i abstractC5817i = (AbstractC5817i) this.f4619f.get(cls);
        if (abstractC5817i == null) {
            for (Map.Entry entry : this.f4619f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    abstractC5817i = (AbstractC5817i) entry.getValue();
                }
            }
        }
        return abstractC5817i == null ? f4613k : abstractC5817i;
    }

    /* renamed from: f */
    public C5847f m3969f() {
        return this.f4620g;
    }

    /* renamed from: g */
    public C5813e m3970g() {
        return this.f4621h;
    }

    /* renamed from: h */
    public int m3971h() {
        return this.f4622i;
    }

    /* renamed from: i */
    public Registry m3972i() {
        return (Registry) this.f4615b.get();
    }
}
