package com.bumptech.glide;

import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C4694f;
import com.bumptech.glide.load.data.InterfaceC4693e;
import com.bumptech.glide.load.engine.C4714e;
import com.bumptech.glide.load.engine.C4718i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p024c1.AbstractC4482a;
import p053f0.InterfaceC6282a;
import p053f0.InterfaceC6286e;
import p053f0.InterfaceC6287f;
import p067h0.InterfaceC6440j;
import p097l0.C7282p;
import p097l0.InterfaceC7281o;
import p153t0.C7720f;
import p153t0.InterfaceC7719e;
import p174w0.C7803a;
import p174w0.C7804b;
import p174w0.C7805c;
import p174w0.C7806d;
import p174w0.C7807e;
import p174w0.C7808f;

/* loaded from: classes3.dex */
public class Registry {

    /* renamed from: a */
    public final C7282p f2161a;

    /* renamed from: b */
    public final C7803a f2162b;

    /* renamed from: c */
    public final C7807e f2163c;

    /* renamed from: d */
    public final C7808f f2164d;

    /* renamed from: e */
    public final C4694f f2165e;

    /* renamed from: f */
    public final C7720f f2166f;

    /* renamed from: g */
    public final C7804b f2167g;

    /* renamed from: h */
    public final C7806d f2168h = new C7806d();

    /* renamed from: i */
    public final C7805c f2169i = new C7805c();

    /* renamed from: j */
    public final Pools.Pool f2170j;

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
        Pools.Pool poolM1581e = AbstractC4482a.m1581e();
        this.f2170j = poolM1581e;
        this.f2161a = new C7282p(poolM1581e);
        this.f2162b = new C7803a();
        this.f2163c = new C7807e();
        this.f2164d = new C7808f();
        this.f2165e = new C4694f();
        this.f2166f = new C7720f();
        this.f2167g = new C7804b();
        m2467r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: a */
    public Registry m2450a(Class cls, InterfaceC6282a interfaceC6282a) {
        this.f2162b.m9381a(cls, interfaceC6282a);
        return this;
    }

    /* renamed from: b */
    public Registry m2451b(Class cls, InterfaceC6287f interfaceC6287f) {
        this.f2164d.m9398a(cls, interfaceC6287f);
        return this;
    }

    /* renamed from: c */
    public Registry m2452c(Class cls, Class cls2, InterfaceC6286e interfaceC6286e) {
        m2454e("legacy_append", cls, cls2, interfaceC6286e);
        return this;
    }

    /* renamed from: d */
    public Registry m2453d(Class cls, Class cls2, InterfaceC7281o interfaceC7281o) {
        this.f2161a.m8253a(cls, cls2, interfaceC7281o);
        return this;
    }

    /* renamed from: e */
    public Registry m2454e(String str, Class cls, Class cls2, InterfaceC6286e interfaceC6286e) {
        this.f2163c.m9392a(str, interfaceC6286e, cls, cls2);
        return this;
    }

    /* renamed from: f */
    public final List m2455f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f2163c.m9395d(cls, cls2)) {
            for (Class cls5 : this.f2166f.m9205b(cls4, cls3)) {
                arrayList.add(new C4714e(cls, cls4, cls5, this.f2163c.m9393b(cls, cls4), this.f2166f.m9204a(cls4, cls5), this.f2170j));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m2456g() {
        List listM9385b = this.f2167g.m9385b();
        if (listM9385b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listM9385b;
    }

    /* renamed from: h */
    public C4718i m2457h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        C4718i c4718iM9386a = this.f2169i.m9386a(cls, cls2, cls3);
        C4718i c4718i = null;
        if (this.f2169i.m9388c(c4718iM9386a)) {
            return null;
        }
        if (c4718iM9386a != null) {
            return c4718iM9386a;
        }
        List listM2455f = m2455f(cls, cls2, cls3);
        if (listM2455f.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            c4718i = new C4718i(cls4, cls5, cls6, listM2455f, this.f2170j);
        }
        this.f2169i.m9389d(cls4, cls5, cls6, c4718i);
        return c4718i;
    }

    /* renamed from: i */
    public List m2458i(Object obj) {
        return this.f2161a.m8255d(obj);
    }

    /* renamed from: j */
    public List m2459j(Class cls, Class cls2, Class cls3) {
        List listM9390a = this.f2168h.m9390a(cls, cls2, cls3);
        if (listM9390a == null) {
            listM9390a = new ArrayList();
            Iterator it = this.f2161a.m8254c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f2163c.m9395d((Class) it.next(), cls2)) {
                    if (!this.f2166f.m9205b(cls4, cls3).isEmpty() && !listM9390a.contains(cls4)) {
                        listM9390a.add(cls4);
                    }
                }
            }
            this.f2168h.m9391b(cls, cls2, cls3, Collections.unmodifiableList(listM9390a));
        }
        return listM9390a;
    }

    /* renamed from: k */
    public InterfaceC6287f m2460k(InterfaceC6440j interfaceC6440j) {
        InterfaceC6287f interfaceC6287fM9399b = this.f2164d.m9399b(interfaceC6440j.mo2749a());
        if (interfaceC6287fM9399b != null) {
            return interfaceC6287fM9399b;
        }
        throw new NoResultEncoderAvailableException(interfaceC6440j.mo2749a());
    }

    /* renamed from: l */
    public InterfaceC4693e m2461l(Object obj) {
        return this.f2165e.m2595a(obj);
    }

    /* renamed from: m */
    public InterfaceC6282a m2462m(Object obj) {
        InterfaceC6282a interfaceC6282aM9382b = this.f2162b.m9382b(obj.getClass());
        if (interfaceC6282aM9382b != null) {
            return interfaceC6282aM9382b;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    /* renamed from: n */
    public boolean m2463n(InterfaceC6440j interfaceC6440j) {
        return this.f2164d.m9399b(interfaceC6440j.mo2749a()) != null;
    }

    /* renamed from: o */
    public Registry m2464o(ImageHeaderParser imageHeaderParser) {
        this.f2167g.m9384a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public Registry m2465p(InterfaceC4693e.a aVar) {
        this.f2165e.m2596b(aVar);
        return this;
    }

    /* renamed from: q */
    public Registry m2466q(Class cls, Class cls2, InterfaceC7719e interfaceC7719e) {
        this.f2166f.m9206c(cls, cls2, interfaceC7719e);
        return this;
    }

    /* renamed from: r */
    public final Registry m2467r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f2163c.m9396e(arrayList);
        return this;
    }
}
