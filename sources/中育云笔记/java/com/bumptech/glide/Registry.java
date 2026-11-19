package com.bumptech.glide;

import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C5826f;
import com.bumptech.glide.load.data.InterfaceC5825e;
import com.bumptech.glide.load.engine.C5846e;
import com.bumptech.glide.load.engine.C5850i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p125e1.AbstractC9069a;
import p168h0.InterfaceC9434a;
import p168h0.InterfaceC9439f;
import p168h0.InterfaceC9440g;
import p198j0.InterfaceC9657j;
import p254n0.C10302p;
import p254n0.InterfaceC10301o;
import p368v0.C11408f;
import p368v0.InterfaceC11407e;
import p413y0.C11881a;
import p413y0.C11882b;
import p413y0.C11883c;
import p413y0.C11884d;
import p413y0.C11885e;
import p413y0.C11886f;

/* loaded from: classes3.dex */
public class Registry {

    /* renamed from: a */
    public final C10302p f4573a;

    /* renamed from: b */
    public final C11881a f4574b;

    /* renamed from: c */
    public final C11885e f4575c;

    /* renamed from: d */
    public final C11886f f4576d;

    /* renamed from: e */
    public final C5826f f4577e;

    /* renamed from: f */
    public final C11408f f4578f;

    /* renamed from: g */
    public final C11882b f4579g;

    /* renamed from: h */
    public final C11884d f4580h = new C11884d();

    /* renamed from: i */
    public final C11883c f4581i = new C11883c();

    /* renamed from: j */
    public final Pools.Pool f4582j;

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
        Pools.Pool poolM17859e = AbstractC9069a.m17859e();
        this.f4582j = poolM17859e;
        this.f4573a = new C10302p(poolM17859e);
        this.f4574b = new C11881a();
        this.f4575c = new C11885e();
        this.f4576d = new C11886f();
        this.f4577e = new C5826f();
        this.f4578f = new C11408f();
        this.f4579g = new C11882b();
        m3938r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: a */
    public Registry m3921a(Class cls, InterfaceC9434a interfaceC9434a) {
        this.f4574b.m26417a(cls, interfaceC9434a);
        return this;
    }

    /* renamed from: b */
    public Registry m3922b(Class cls, InterfaceC9440g interfaceC9440g) {
        this.f4576d.m26434a(cls, interfaceC9440g);
        return this;
    }

    /* renamed from: c */
    public Registry m3923c(Class cls, Class cls2, InterfaceC9439f interfaceC9439f) {
        m3925e("legacy_append", cls, cls2, interfaceC9439f);
        return this;
    }

    /* renamed from: d */
    public Registry m3924d(Class cls, Class cls2, InterfaceC10301o interfaceC10301o) {
        this.f4573a.m21479a(cls, cls2, interfaceC10301o);
        return this;
    }

    /* renamed from: e */
    public Registry m3925e(String str, Class cls, Class cls2, InterfaceC9439f interfaceC9439f) {
        this.f4575c.m26428a(str, interfaceC9439f, cls, cls2);
        return this;
    }

    /* renamed from: f */
    public final List m3926f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f4575c.m26431d(cls, cls2)) {
            for (Class cls5 : this.f4578f.m25363b(cls4, cls3)) {
                arrayList.add(new C5846e(cls, cls4, cls5, this.f4575c.m26429b(cls, cls4), this.f4578f.m25362a(cls4, cls5), this.f4582j));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m3927g() {
        List listM26421b = this.f4579g.m26421b();
        if (listM26421b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listM26421b;
    }

    /* renamed from: h */
    public C5850i m3928h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        C5850i c5850iM26422a = this.f4581i.m26422a(cls, cls2, cls3);
        C5850i c5850i = null;
        if (this.f4581i.m26424c(c5850iM26422a)) {
            return null;
        }
        if (c5850iM26422a != null) {
            return c5850iM26422a;
        }
        List listM3926f = m3926f(cls, cls2, cls3);
        if (listM3926f.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            c5850i = new C5850i(cls4, cls5, cls6, listM3926f, this.f4582j);
        }
        this.f4581i.m26425d(cls4, cls5, cls6, c5850i);
        return c5850i;
    }

    /* renamed from: i */
    public List m3929i(Object obj) {
        return this.f4573a.m21481d(obj);
    }

    /* renamed from: j */
    public List m3930j(Class cls, Class cls2, Class cls3) {
        List listM26426a = this.f4580h.m26426a(cls, cls2, cls3);
        if (listM26426a == null) {
            listM26426a = new ArrayList();
            Iterator it = this.f4573a.m21480c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f4575c.m26431d((Class) it.next(), cls2)) {
                    if (!this.f4578f.m25363b(cls4, cls3).isEmpty() && !listM26426a.contains(cls4)) {
                        listM26426a.add(cls4);
                    }
                }
            }
            this.f4580h.m26427b(cls, cls2, cls3, Collections.unmodifiableList(listM26426a));
        }
        return listM26426a;
    }

    /* renamed from: k */
    public InterfaceC9440g m3931k(InterfaceC9657j interfaceC9657j) {
        InterfaceC9440g interfaceC9440gM26435b = this.f4576d.m26435b(interfaceC9657j.mo4219a());
        if (interfaceC9440gM26435b != null) {
            return interfaceC9440gM26435b;
        }
        throw new NoResultEncoderAvailableException(interfaceC9657j.mo4219a());
    }

    /* renamed from: l */
    public InterfaceC5825e m3932l(Object obj) {
        return this.f4577e.m4064a(obj);
    }

    /* renamed from: m */
    public InterfaceC9434a m3933m(Object obj) {
        InterfaceC9434a interfaceC9434aM26418b = this.f4574b.m26418b(obj.getClass());
        if (interfaceC9434aM26418b != null) {
            return interfaceC9434aM26418b;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    /* renamed from: n */
    public boolean m3934n(InterfaceC9657j interfaceC9657j) {
        return this.f4576d.m26435b(interfaceC9657j.mo4219a()) != null;
    }

    /* renamed from: o */
    public Registry m3935o(ImageHeaderParser imageHeaderParser) {
        this.f4579g.m26420a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public Registry m3936p(InterfaceC5825e.a aVar) {
        this.f4577e.m4065b(aVar);
        return this;
    }

    /* renamed from: q */
    public Registry m3937q(Class cls, Class cls2, InterfaceC11407e interfaceC11407e) {
        this.f4578f.m25364c(cls, cls2, interfaceC11407e);
        return this;
    }

    /* renamed from: r */
    public final Registry m3938r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f4575c.m26432e(arrayList);
        return this;
    }
}
