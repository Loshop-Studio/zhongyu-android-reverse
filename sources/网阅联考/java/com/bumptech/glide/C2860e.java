package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C2858c;
import com.bumptech.glide.load.engine.C2877f;
import java.util.List;
import java.util.Map;
import p016c0.C2753d;
import p047d0.AbstractC3699i;
import p047d0.C3696f;
import p098n.InterfaceC4393b;

/* renamed from: com.bumptech.glide.e */
/* loaded from: classes2.dex */
public class C2860e extends ContextWrapper {

    /* renamed from: k */
    public static final AbstractC2863h f593k = new C2856a();

    /* renamed from: a */
    public final InterfaceC4393b f594a;

    /* renamed from: b */
    public final Registry f595b;

    /* renamed from: c */
    public final C3696f f596c;

    /* renamed from: d */
    public final ComponentCallbacks2C2858c.a f597d;

    /* renamed from: e */
    public final List f598e;

    /* renamed from: f */
    public final Map f599f;

    /* renamed from: g */
    public final C2877f f600g;

    /* renamed from: h */
    public final boolean f601h;

    /* renamed from: i */
    public final int f602i;

    /* renamed from: j */
    public C2753d f603j;

    public C2860e(Context context, InterfaceC4393b interfaceC4393b, Registry registry, C3696f c3696f, ComponentCallbacks2C2858c.a aVar, Map map, List list, C2877f c2877f, boolean z3, int i4) {
        super(context.getApplicationContext());
        this.f594a = interfaceC4393b;
        this.f595b = registry;
        this.f596c = c3696f;
        this.f597d = aVar;
        this.f598e = list;
        this.f599f = map;
        this.f600g = c2877f;
        this.f601h = z3;
        this.f602i = i4;
    }

    /* renamed from: a */
    public AbstractC3699i m1703a(ImageView imageView, Class cls) {
        return this.f596c.m4680a(imageView, cls);
    }

    /* renamed from: b */
    public InterfaceC4393b m1704b() {
        return this.f594a;
    }

    /* renamed from: c */
    public List m1705c() {
        return this.f598e;
    }

    /* renamed from: d */
    public synchronized C2753d m1706d() {
        if (this.f603j == null) {
            this.f603j = (C2753d) this.f597d.build().m1568M();
        }
        return this.f603j;
    }

    /* renamed from: e */
    public AbstractC2863h m1707e(Class cls) {
        AbstractC2863h abstractC2863h = (AbstractC2863h) this.f599f.get(cls);
        if (abstractC2863h == null) {
            for (Map.Entry entry : this.f599f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    abstractC2863h = (AbstractC2863h) entry.getValue();
                }
            }
        }
        return abstractC2863h == null ? f593k : abstractC2863h;
    }

    /* renamed from: f */
    public C2877f m1708f() {
        return this.f600g;
    }

    /* renamed from: g */
    public int m1709g() {
        return this.f602i;
    }

    /* renamed from: h */
    public Registry m1710h() {
        return this.f595b;
    }

    /* renamed from: i */
    public boolean m1711i() {
        return this.f601h;
    }
}
