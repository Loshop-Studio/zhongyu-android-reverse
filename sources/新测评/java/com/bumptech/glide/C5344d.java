package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C5342b;
import com.bumptech.glide.load.engine.C5379f;
import java.util.List;
import java.util.Map;
import p073e1.C7327d;
import p084f1.AbstractC7432i;
import p084f1.C7429f;
import p117i1.AbstractC7646e;
import p195p0.InterfaceC8802b;

/* renamed from: com.bumptech.glide.d */
/* loaded from: classes3.dex */
public class C5344d extends ContextWrapper {

    /* renamed from: k */
    public static final AbstractC5349i f3410k = new C5341a();

    /* renamed from: a */
    public final InterfaceC8802b f3411a;

    /* renamed from: b */
    public final AbstractC7646e.b f3412b;

    /* renamed from: c */
    public final C7429f f3413c;

    /* renamed from: d */
    public final ComponentCallbacks2C5342b.a f3414d;

    /* renamed from: e */
    public final List f3415e;

    /* renamed from: f */
    public final Map f3416f;

    /* renamed from: g */
    public final C5379f f3417g;

    /* renamed from: h */
    public final C5345e f3418h;

    /* renamed from: i */
    public final int f3419i;

    /* renamed from: j */
    public C7327d f3420j;

    public C5344d(Context context, InterfaceC8802b interfaceC8802b, AbstractC7646e.b bVar, C7429f c7429f, ComponentCallbacks2C5342b.a aVar, Map map, List list, C5379f c5379f, C5345e c5345e, int i10) {
        super(context.getApplicationContext());
        this.f3411a = interfaceC8802b;
        this.f3413c = c7429f;
        this.f3414d = aVar;
        this.f3415e = list;
        this.f3416f = map;
        this.f3417g = c5379f;
        this.f3418h = c5345e;
        this.f3419i = i10;
        this.f3412b = AbstractC7646e.m12665a(bVar);
    }

    /* renamed from: a */
    public AbstractC7432i m3314a(ImageView imageView, Class cls) {
        return this.f3413c.m11965a(imageView, cls);
    }

    /* renamed from: b */
    public InterfaceC8802b m3315b() {
        return this.f3411a;
    }

    /* renamed from: c */
    public List m3316c() {
        return this.f3415e;
    }

    /* renamed from: d */
    public synchronized C7327d m3317d() {
        try {
            if (this.f3420j == null) {
                this.f3420j = (C7327d) this.f3414d.build().m11661Q();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3420j;
    }

    /* renamed from: e */
    public AbstractC5349i m3318e(Class cls) {
        AbstractC5349i abstractC5349i = (AbstractC5349i) this.f3416f.get(cls);
        if (abstractC5349i == null) {
            for (Map.Entry entry : this.f3416f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    abstractC5349i = (AbstractC5349i) entry.getValue();
                }
            }
        }
        return abstractC5349i == null ? f3410k : abstractC5349i;
    }

    /* renamed from: f */
    public C5379f m3319f() {
        return this.f3417g;
    }

    /* renamed from: g */
    public C5345e m3320g() {
        return this.f3418h;
    }

    /* renamed from: h */
    public int m3321h() {
        return this.f3419i;
    }

    /* renamed from: i */
    public Registry m3322i() {
        return (Registry) this.f3412b.get();
    }
}
