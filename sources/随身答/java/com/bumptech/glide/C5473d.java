package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import com.bumptech.glide.load.engine.C5490f;
import java.util.List;
import java.util.Map;
import p002a1.C0012d;
import p019b1.AbstractC5098i;
import p019b1.C5095f;
import p164l0.InterfaceC8865b;

/* renamed from: com.bumptech.glide.d */
/* loaded from: classes3.dex */
public class C5473d extends ContextWrapper {

    /* renamed from: k */
    public static final AbstractC5476g f3247k = new C5470a();

    /* renamed from: a */
    public final InterfaceC8865b f3248a;

    /* renamed from: b */
    public final Registry f3249b;

    /* renamed from: c */
    public final C5095f f3250c;

    /* renamed from: d */
    public final ComponentCallbacks2C5471b.a f3251d;

    /* renamed from: e */
    public final List f3252e;

    /* renamed from: f */
    public final Map f3253f;

    /* renamed from: g */
    public final C5490f f3254g;

    /* renamed from: h */
    public final boolean f3255h;

    /* renamed from: i */
    public final int f3256i;

    /* renamed from: j */
    public C0012d f3257j;

    public C5473d(Context context, InterfaceC8865b interfaceC8865b, Registry registry, C5095f c5095f, ComponentCallbacks2C5471b.a aVar, Map map, List list, C5490f c5490f, boolean z9, int i9) {
        super(context.getApplicationContext());
        this.f3248a = interfaceC8865b;
        this.f3249b = registry;
        this.f3250c = c5095f;
        this.f3251d = aVar;
        this.f3252e = list;
        this.f3253f = map;
        this.f3254g = c5490f;
        this.f3255h = z9;
        this.f3256i = i9;
    }

    /* renamed from: a */
    public AbstractC5098i m3029a(ImageView imageView, Class cls) {
        return this.f3250c.m2146a(imageView, cls);
    }

    /* renamed from: b */
    public InterfaceC8865b m3030b() {
        return this.f3248a;
    }

    /* renamed from: c */
    public List m3031c() {
        return this.f3252e;
    }

    /* renamed from: d */
    public synchronized C0012d m3032d() {
        try {
            if (this.f3257j == null) {
                this.f3257j = (C0012d) this.f3251d.build().m27O();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3257j;
    }

    /* renamed from: e */
    public AbstractC5476g m3033e(Class cls) {
        AbstractC5476g abstractC5476g = (AbstractC5476g) this.f3253f.get(cls);
        if (abstractC5476g == null) {
            for (Map.Entry entry : this.f3253f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    abstractC5476g = (AbstractC5476g) entry.getValue();
                }
            }
        }
        return abstractC5476g == null ? f3247k : abstractC5476g;
    }

    /* renamed from: f */
    public C5490f m3034f() {
        return this.f3254g;
    }

    /* renamed from: g */
    public int m3035g() {
        return this.f3256i;
    }

    /* renamed from: h */
    public Registry m3036h() {
        return this.f3249b;
    }

    /* renamed from: i */
    public boolean m3037i() {
        return this.f3255h;
    }
}
