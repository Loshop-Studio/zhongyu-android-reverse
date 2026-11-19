package com.bumptech.glide;

import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C5407f;
import com.bumptech.glide.load.data.InterfaceC5406e;
import com.bumptech.glide.load.engine.C5427e;
import com.bumptech.glide.load.engine.C5431i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p031c0.C5222a;
import p031c0.C5223b;
import p031c0.C5224c;
import p031c0.C5225d;
import p031c0.C5226e;
import p031c0.C5227f;
import p127i0.AbstractC8748a;
import p160l.InterfaceC9227a;
import p160l.InterfaceC9231e;
import p160l.InterfaceC9232f;
import p182n.InterfaceC9357j;
import p226r.C9890p;
import p226r.InterfaceC9889o;
import p314z.C10689f;
import p314z.InterfaceC10688e;

/* loaded from: classes3.dex */
public class Registry {

    /* renamed from: a */
    public final C9890p f2803a;

    /* renamed from: b */
    public final C5222a f2804b;

    /* renamed from: c */
    public final C5226e f2805c;

    /* renamed from: d */
    public final C5227f f2806d;

    /* renamed from: e */
    public final C5407f f2807e;

    /* renamed from: f */
    public final C10689f f2808f;

    /* renamed from: g */
    public final C5223b f2809g;

    /* renamed from: h */
    public final C5225d f2810h = new C5225d();

    /* renamed from: i */
    public final C5224c f2811i = new C5224c();

    /* renamed from: j */
    public final Pools.Pool f2812j;

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
        Pools.Pool poolM14410e = AbstractC8748a.m14410e();
        this.f2812j = poolM14410e;
        this.f2803a = new C9890p(poolM14410e);
        this.f2804b = new C5222a();
        this.f2805c = new C5226e();
        this.f2806d = new C5227f();
        this.f2807e = new C5407f();
        this.f2808f = new C10689f();
        this.f2809g = new C5223b();
        m2730r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: a */
    public Registry m2713a(Class cls, Class cls2, InterfaceC9231e interfaceC9231e) {
        m2717e("legacy_append", cls, cls2, interfaceC9231e);
        return this;
    }

    /* renamed from: b */
    public Registry m2714b(Class cls, Class cls2, InterfaceC9889o interfaceC9889o) {
        this.f2803a.m18508a(cls, cls2, interfaceC9889o);
        return this;
    }

    /* renamed from: c */
    public Registry m2715c(Class cls, InterfaceC9227a interfaceC9227a) {
        this.f2804b.m2113a(cls, interfaceC9227a);
        return this;
    }

    /* renamed from: d */
    public Registry m2716d(Class cls, InterfaceC9232f interfaceC9232f) {
        this.f2806d.m2130a(cls, interfaceC9232f);
        return this;
    }

    /* renamed from: e */
    public Registry m2717e(String str, Class cls, Class cls2, InterfaceC9231e interfaceC9231e) {
        this.f2805c.m2124a(str, interfaceC9231e, cls, cls2);
        return this;
    }

    /* renamed from: f */
    public final List m2718f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f2805c.m2127d(cls, cls2)) {
            for (Class cls5 : this.f2808f.m19982b(cls4, cls3)) {
                arrayList.add(new C5427e(cls, cls4, cls5, this.f2805c.m2125b(cls, cls4), this.f2808f.m19981a(cls4, cls5), this.f2812j));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m2719g() {
        List listM2117b = this.f2809g.m2117b();
        if (listM2117b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listM2117b;
    }

    /* renamed from: h */
    public C5431i m2720h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        C5431i c5431iM2118a = this.f2811i.m2118a(cls, cls2, cls3);
        C5431i c5431i = null;
        if (this.f2811i.m2120c(c5431iM2118a)) {
            return null;
        }
        if (c5431iM2118a != null) {
            return c5431iM2118a;
        }
        List listM2718f = m2718f(cls, cls2, cls3);
        if (listM2718f.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            c5431i = new C5431i(cls4, cls5, cls6, listM2718f, this.f2812j);
        }
        this.f2811i.m2121d(cls4, cls5, cls6, c5431i);
        return c5431i;
    }

    /* renamed from: i */
    public List m2721i(Object obj) {
        return this.f2803a.m18510d(obj);
    }

    /* renamed from: j */
    public List m2722j(Class cls, Class cls2, Class cls3) {
        List listM2122a = this.f2810h.m2122a(cls, cls2, cls3);
        if (listM2122a == null) {
            listM2122a = new ArrayList();
            Iterator it = this.f2803a.m18509c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f2805c.m2127d((Class) it.next(), cls2)) {
                    if (!this.f2808f.m19982b(cls4, cls3).isEmpty() && !listM2122a.contains(cls4)) {
                        listM2122a.add(cls4);
                    }
                }
            }
            this.f2810h.m2123b(cls, cls2, cls3, Collections.unmodifiableList(listM2122a));
        }
        return listM2122a;
    }

    /* renamed from: k */
    public InterfaceC9232f m2723k(InterfaceC9357j interfaceC9357j) {
        InterfaceC9232f interfaceC9232fM2131b = this.f2806d.m2131b(interfaceC9357j.mo3016b());
        if (interfaceC9232fM2131b != null) {
            return interfaceC9232fM2131b;
        }
        throw new NoResultEncoderAvailableException(interfaceC9357j.mo3016b());
    }

    /* renamed from: l */
    public InterfaceC5406e m2724l(Object obj) {
        return this.f2807e.m2860a(obj);
    }

    /* renamed from: m */
    public InterfaceC9227a m2725m(Object obj) {
        InterfaceC9227a interfaceC9227aM2114b = this.f2804b.m2114b(obj.getClass());
        if (interfaceC9227aM2114b != null) {
            return interfaceC9227aM2114b;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    /* renamed from: n */
    public boolean m2726n(InterfaceC9357j interfaceC9357j) {
        return this.f2806d.m2131b(interfaceC9357j.mo3016b()) != null;
    }

    /* renamed from: o */
    public Registry m2727o(ImageHeaderParser imageHeaderParser) {
        this.f2809g.m2116a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public Registry m2728p(InterfaceC5406e.a aVar) {
        this.f2807e.m2861b(aVar);
        return this;
    }

    /* renamed from: q */
    public Registry m2729q(Class cls, Class cls2, InterfaceC10688e interfaceC10688e) {
        this.f2808f.m19983c(cls, cls2, interfaceC10688e);
        return this;
    }

    /* renamed from: r */
    public final Registry m2730r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f2805c.m2128e(arrayList);
        return this;
    }
}
