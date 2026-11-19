package com.bumptech.glide;

import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C5489e;
import com.bumptech.glide.load.engine.C5493i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p102f1.AbstractC7909a;
import p122h0.InterfaceC8081a;
import p122h0.InterfaceC8085e;
import p122h0.InterfaceC8086f;
import p132i0.C8117f;
import p132i0.InterfaceC8116e;
import p152k0.InterfaceC8259j;
import p194o0.C9148o;
import p194o0.InterfaceC9147n;
import p278w0.C9794f;
import p278w0.InterfaceC9793e;
import p308z0.C9981a;
import p308z0.C9982b;
import p308z0.C9983c;
import p308z0.C9984d;
import p308z0.C9985e;
import p308z0.C9986f;

/* loaded from: classes3.dex */
public class Registry {

    /* renamed from: a */
    public final C9148o f3205a;

    /* renamed from: b */
    public final C9981a f3206b;

    /* renamed from: c */
    public final C9985e f3207c;

    /* renamed from: d */
    public final C9986f f3208d;

    /* renamed from: e */
    public final C8117f f3209e;

    /* renamed from: f */
    public final C9794f f3210f;

    /* renamed from: g */
    public final C9982b f3211g;

    /* renamed from: h */
    public final C9984d f3212h = new C9984d();

    /* renamed from: i */
    public final C9983c f3213i = new C9983c();

    /* renamed from: j */
    public final Pools.Pool f3214j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public NoModelLoaderAvailableException(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public NoModelLoaderAvailableException(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        Pools.Pool poolM12439e = AbstractC7909a.m12439e();
        this.f3214j = poolM12439e;
        this.f3205a = new C9148o(poolM12439e);
        this.f3206b = new C9981a();
        this.f3207c = new C9985e();
        this.f3208d = new C9986f();
        this.f3209e = new C8117f();
        this.f3210f = new C9794f();
        this.f3211g = new C9982b();
        m3004r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: a */
    public Registry m2987a(Class cls, InterfaceC8081a interfaceC8081a) {
        this.f3206b.m17271a(cls, interfaceC8081a);
        return this;
    }

    /* renamed from: b */
    public Registry m2988b(Class cls, InterfaceC8086f interfaceC8086f) {
        this.f3208d.m17288a(cls, interfaceC8086f);
        return this;
    }

    /* renamed from: c */
    public Registry m2989c(Class cls, Class cls2, InterfaceC8085e interfaceC8085e) {
        m2991e("legacy_append", cls, cls2, interfaceC8085e);
        return this;
    }

    /* renamed from: d */
    public Registry m2990d(Class cls, Class cls2, InterfaceC9147n interfaceC9147n) {
        this.f3205a.m14704a(cls, cls2, interfaceC9147n);
        return this;
    }

    /* renamed from: e */
    public Registry m2991e(String str, Class cls, Class cls2, InterfaceC8085e interfaceC8085e) {
        this.f3207c.m17282a(str, interfaceC8085e, cls, cls2);
        return this;
    }

    /* renamed from: f */
    public final List m2992f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f3207c.m17285d(cls, cls2)) {
            for (Class cls5 : this.f3210f.m16596b(cls4, cls3)) {
                arrayList.add(new C5489e(cls, cls4, cls5, this.f3207c.m17283b(cls, cls4), this.f3210f.m16595a(cls4, cls5), this.f3214j));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m2993g() {
        List listM17275b = this.f3211g.m17275b();
        if (listM17275b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listM17275b;
    }

    /* renamed from: h */
    public C5493i m2994h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        C5493i c5493iM17276a = this.f3213i.m17276a(cls, cls2, cls3);
        C5493i c5493i = null;
        if (this.f3213i.m17278c(c5493iM17276a)) {
            return null;
        }
        if (c5493iM17276a != null) {
            return c5493iM17276a;
        }
        List listM2992f = m2992f(cls, cls2, cls3);
        if (listM2992f.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            c5493i = new C5493i(cls4, cls5, cls6, listM2992f, this.f3214j);
        }
        this.f3213i.m17279d(cls4, cls5, cls6, c5493i);
        return c5493i;
    }

    /* renamed from: i */
    public List m2995i(Object obj) {
        return this.f3205a.m14706d(obj);
    }

    /* renamed from: j */
    public List m2996j(Class cls, Class cls2, Class cls3) {
        List listM17280a = this.f3212h.m17280a(cls, cls2, cls3);
        if (listM17280a == null) {
            listM17280a = new ArrayList();
            Iterator it = this.f3205a.m14705c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f3207c.m17285d((Class) it.next(), cls2)) {
                    if (!this.f3210f.m16596b(cls4, cls3).isEmpty() && !listM17280a.contains(cls4)) {
                        listM17280a.add(cls4);
                    }
                }
            }
            this.f3212h.m17281b(cls, cls2, cls3, Collections.unmodifiableList(listM17280a));
        }
        return listM17280a;
    }

    /* renamed from: k */
    public InterfaceC8086f m2997k(InterfaceC8259j interfaceC8259j) {
        InterfaceC8086f interfaceC8086fM17289b = this.f3208d.m17289b(interfaceC8259j.mo3221a());
        if (interfaceC8086fM17289b != null) {
            return interfaceC8086fM17289b;
        }
        throw new NoResultEncoderAvailableException(interfaceC8259j.mo3221a());
    }

    /* renamed from: l */
    public InterfaceC8116e m2998l(Object obj) {
        return this.f3209e.m12995a(obj);
    }

    /* renamed from: m */
    public InterfaceC8081a m2999m(Object obj) {
        InterfaceC8081a interfaceC8081aM17272b = this.f3206b.m17272b(obj.getClass());
        if (interfaceC8081aM17272b != null) {
            return interfaceC8081aM17272b;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    /* renamed from: n */
    public boolean m3000n(InterfaceC8259j interfaceC8259j) {
        return this.f3208d.m17289b(interfaceC8259j.mo3221a()) != null;
    }

    /* renamed from: o */
    public Registry m3001o(ImageHeaderParser imageHeaderParser) {
        this.f3211g.m17274a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public Registry m3002p(InterfaceC8116e.a aVar) {
        this.f3209e.m12996b(aVar);
        return this;
    }

    /* renamed from: q */
    public Registry m3003q(Class cls, Class cls2, InterfaceC9793e interfaceC9793e) {
        this.f3210f.m16597c(cls, cls2, interfaceC9793e);
        return this;
    }

    /* renamed from: r */
    public final Registry m3004r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f3207c.m17286e(arrayList);
        return this;
    }
}
