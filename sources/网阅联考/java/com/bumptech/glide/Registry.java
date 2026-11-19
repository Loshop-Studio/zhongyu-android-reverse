package com.bumptech.glide;

import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C2876e;
import com.bumptech.glide.load.engine.C2880i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p011b0.C2709a;
import p011b0.C2710b;
import p011b0.C2711c;
import p011b0.C2712d;
import p011b0.C2713e;
import p011b0.C2714f;
import p067h0.AbstractC3762a;
import p076j.InterfaceC3791a;
import p076j.InterfaceC3795e;
import p076j.InterfaceC3796f;
import p081k.C3845f;
import p081k.InterfaceC3844e;
import p093m.InterfaceC4361j;
import p110q.C4466o;
import p110q.InterfaceC4465n;
import p142y.C4680f;
import p142y.InterfaceC4679e;

/* loaded from: classes2.dex */
public class Registry {

    /* renamed from: a */
    public final C4466o f551a;

    /* renamed from: b */
    public final C2709a f552b;

    /* renamed from: c */
    public final C2713e f553c;

    /* renamed from: d */
    public final C2714f f554d;

    /* renamed from: e */
    public final C3845f f555e;

    /* renamed from: f */
    public final C4680f f556f;

    /* renamed from: g */
    public final C2710b f557g;

    /* renamed from: h */
    public final C2712d f558h = new C2712d();

    /* renamed from: i */
    public final C2711c f559i = new C2711c();

    /* renamed from: j */
    public final Pools.Pool f560j;

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
        Pools.Pool poolM4854e = AbstractC3762a.m4854e();
        this.f560j = poolM4854e;
        this.f551a = new C4466o(poolM4854e);
        this.f552b = new C2709a();
        this.f553c = new C2713e();
        this.f554d = new C2714f();
        this.f555e = new C3845f();
        this.f556f = new C4680f();
        this.f557g = new C2710b();
        m1677r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: a */
    public Registry m1660a(Class cls, InterfaceC3791a interfaceC3791a) {
        this.f552b.m1484a(cls, interfaceC3791a);
        return this;
    }

    /* renamed from: b */
    public Registry m1661b(Class cls, InterfaceC3796f interfaceC3796f) {
        this.f554d.m1501a(cls, interfaceC3796f);
        return this;
    }

    /* renamed from: c */
    public Registry m1662c(Class cls, Class cls2, InterfaceC3795e interfaceC3795e) {
        m1664e("legacy_append", cls, cls2, interfaceC3795e);
        return this;
    }

    /* renamed from: d */
    public Registry m1663d(Class cls, Class cls2, InterfaceC4465n interfaceC4465n) {
        this.f551a.m5720a(cls, cls2, interfaceC4465n);
        return this;
    }

    /* renamed from: e */
    public Registry m1664e(String str, Class cls, Class cls2, InterfaceC3795e interfaceC3795e) {
        this.f553c.m1495a(str, interfaceC3795e, cls, cls2);
        return this;
    }

    /* renamed from: f */
    public final List m1665f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f553c.m1498d(cls, cls2)) {
            for (Class cls5 : this.f556f.m6608b(cls4, cls3)) {
                arrayList.add(new C2876e(cls, cls4, cls5, this.f553c.m1496b(cls, cls4), this.f556f.m6607a(cls4, cls5), this.f560j));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m1666g() {
        List listM1488b = this.f557g.m1488b();
        if (listM1488b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listM1488b;
    }

    /* renamed from: h */
    public C2880i m1667h(Class cls, Class cls2, Class cls3) {
        C2880i c2880iM1489a = this.f559i.m1489a(cls, cls2, cls3);
        if (this.f559i.m1491c(c2880iM1489a)) {
            return null;
        }
        if (c2880iM1489a == null) {
            List listM1665f = m1665f(cls, cls2, cls3);
            c2880iM1489a = listM1665f.isEmpty() ? null : new C2880i(cls, cls2, cls3, listM1665f, this.f560j);
            this.f559i.m1492d(cls, cls2, cls3, c2880iM1489a);
        }
        return c2880iM1489a;
    }

    /* renamed from: i */
    public List m1668i(Object obj) {
        return this.f551a.m5722d(obj);
    }

    /* renamed from: j */
    public List m1669j(Class cls, Class cls2, Class cls3) {
        List listM1493a = this.f558h.m1493a(cls, cls2, cls3);
        if (listM1493a == null) {
            listM1493a = new ArrayList();
            Iterator it = this.f551a.m5721c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f553c.m1498d((Class) it.next(), cls2)) {
                    if (!this.f556f.m6608b(cls4, cls3).isEmpty() && !listM1493a.contains(cls4)) {
                        listM1493a.add(cls4);
                    }
                }
            }
            this.f558h.m1494b(cls, cls2, cls3, Collections.unmodifiableList(listM1493a));
        }
        return listM1493a;
    }

    /* renamed from: k */
    public InterfaceC3796f m1670k(InterfaceC4361j interfaceC4361j) {
        InterfaceC3796f interfaceC3796fM1502b = this.f554d.m1502b(interfaceC4361j.mo1898b());
        if (interfaceC3796fM1502b != null) {
            return interfaceC3796fM1502b;
        }
        throw new NoResultEncoderAvailableException(interfaceC4361j.mo1898b());
    }

    /* renamed from: l */
    public InterfaceC3844e m1671l(Object obj) {
        return this.f555e.m5131a(obj);
    }

    /* renamed from: m */
    public InterfaceC3791a m1672m(Object obj) {
        InterfaceC3791a interfaceC3791aM1485b = this.f552b.m1485b(obj.getClass());
        if (interfaceC3791aM1485b != null) {
            return interfaceC3791aM1485b;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    /* renamed from: n */
    public boolean m1673n(InterfaceC4361j interfaceC4361j) {
        return this.f554d.m1502b(interfaceC4361j.mo1898b()) != null;
    }

    /* renamed from: o */
    public Registry m1674o(ImageHeaderParser imageHeaderParser) {
        this.f557g.m1487a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public Registry m1675p(Class cls, Class cls2, InterfaceC4679e interfaceC4679e) {
        this.f556f.m6609c(cls, cls2, interfaceC4679e);
        return this;
    }

    /* renamed from: q */
    public Registry m1676q(InterfaceC3844e.a aVar) {
        this.f555e.m5132b(aVar);
        return this;
    }

    /* renamed from: r */
    public final Registry m1677r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f553c.m1499e(arrayList);
        return this;
    }
}
