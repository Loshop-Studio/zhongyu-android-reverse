package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.load.engine.C4715f;
import java.util.List;
import java.util.Map;
import p016b1.AbstractC4403e;
import p074i0.InterfaceC6497b;
import p181x0.C7826d;
import p188y0.AbstractC7895i;
import p188y0.C7892f;

/* renamed from: com.bumptech.glide.e */
/* loaded from: classes3.dex */
public class C4680e extends ContextWrapper {

    /* renamed from: k */
    public static final AbstractC4685j f2201k = new C4677b();

    /* renamed from: a */
    public final InterfaceC6497b f2202a;

    /* renamed from: b */
    public final AbstractC4403e.b f2203b;

    /* renamed from: c */
    public final C7892f f2204c;

    /* renamed from: d */
    public final ComponentCallbacks2C4678c.a f2205d;

    /* renamed from: e */
    public final List f2206e;

    /* renamed from: f */
    public final Map f2207f;

    /* renamed from: g */
    public final C4715f f2208g;

    /* renamed from: h */
    public final C4681f f2209h;

    /* renamed from: i */
    public final int f2210i;

    /* renamed from: j */
    public C7826d f2211j;

    public C4680e(Context context, InterfaceC6497b interfaceC6497b, AbstractC4403e.b bVar, C7892f c7892f, ComponentCallbacks2C4678c.a aVar, Map map, List list, C4715f c4715f, C4681f c4681f, int i6) {
        super(context.getApplicationContext());
        this.f2202a = interfaceC6497b;
        this.f2204c = c7892f;
        this.f2205d = aVar;
        this.f2206e = list;
        this.f2207f = map;
        this.f2208g = c4715f;
        this.f2209h = c4681f;
        this.f2210i = i6;
        this.f2203b = AbstractC4403e.m1420a(bVar);
    }

    /* renamed from: a */
    public AbstractC7895i m2493a(ImageView imageView, Class cls) {
        return this.f2204c.m9689a(imageView, cls);
    }

    /* renamed from: b */
    public InterfaceC6497b m2494b() {
        return this.f2202a;
    }

    /* renamed from: c */
    public List m2495c() {
        return this.f2206e;
    }

    /* renamed from: d */
    public synchronized C7826d m2496d() {
        try {
            if (this.f2211j == null) {
                this.f2211j = (C7826d) this.f2205d.build().mo7341Q();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2211j;
    }

    /* renamed from: e */
    public AbstractC4685j m2497e(Class cls) {
        AbstractC4685j abstractC4685j = (AbstractC4685j) this.f2207f.get(cls);
        if (abstractC4685j == null) {
            for (Map.Entry entry : this.f2207f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    abstractC4685j = (AbstractC4685j) entry.getValue();
                }
            }
        }
        return abstractC4685j == null ? f2201k : abstractC4685j;
    }

    /* renamed from: f */
    public C4715f m2498f() {
        return this.f2208g;
    }

    /* renamed from: g */
    public C4681f m2499g() {
        return this.f2209h;
    }

    /* renamed from: h */
    public int m2500h() {
        return this.f2210i;
    }

    /* renamed from: i */
    public Registry m2501i() {
        return (Registry) this.f2203b.get();
    }
}
