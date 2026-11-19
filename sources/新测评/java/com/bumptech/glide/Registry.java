package com.bumptech.glide;

import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C5358f;
import com.bumptech.glide.load.data.InterfaceC5357e;
import com.bumptech.glide.load.engine.C5378e;
import com.bumptech.glide.load.engine.C5382i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p003a1.C0013f;
import p003a1.InterfaceC0012e;
import p062d1.C7279a;
import p062d1.C7280b;
import p062d1.C7281c;
import p062d1.C7282d;
import p062d1.C7283e;
import p062d1.C7284f;
import p128j1.AbstractC7778a;
import p162m0.InterfaceC8536a;
import p162m0.InterfaceC8540e;
import p162m0.InterfaceC8541f;
import p184o0.InterfaceC8690j;
import p228s0.C9114p;
import p228s0.InterfaceC9113o;

/* loaded from: classes3.dex */
public class Registry {

    /* renamed from: a */
    public final C9114p f3370a;

    /* renamed from: b */
    public final C7279a f3371b;

    /* renamed from: c */
    public final C7283e f3372c;

    /* renamed from: d */
    public final C7284f f3373d;

    /* renamed from: e */
    public final C5358f f3374e;

    /* renamed from: f */
    public final C0013f f3375f;

    /* renamed from: g */
    public final C7280b f3376g;

    /* renamed from: h */
    public final C7282d f3377h = new C7282d();

    /* renamed from: i */
    public final C7281c f3378i = new C7281c();

    /* renamed from: j */
    public final Pools.Pool f3379j;

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
        Pools.Pool poolM13138e = AbstractC7778a.m13138e();
        this.f3379j = poolM13138e;
        this.f3370a = new C9114p(poolM13138e);
        this.f3371b = new C7279a();
        this.f3372c = new C7283e();
        this.f3373d = new C7284f();
        this.f3374e = new C5358f();
        this.f3375f = new C0013f();
        this.f3376g = new C7280b();
        m3289r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: a */
    public Registry m3272a(Class cls, Class cls2, InterfaceC8540e interfaceC8540e) {
        m3276e("legacy_append", cls, cls2, interfaceC8540e);
        return this;
    }

    /* renamed from: b */
    public Registry m3273b(Class cls, Class cls2, InterfaceC9113o interfaceC9113o) {
        this.f3370a.m15417a(cls, cls2, interfaceC9113o);
        return this;
    }

    /* renamed from: c */
    public Registry m3274c(Class cls, InterfaceC8536a interfaceC8536a) {
        this.f3371b.m11530a(cls, interfaceC8536a);
        return this;
    }

    /* renamed from: d */
    public Registry m3275d(Class cls, InterfaceC8541f interfaceC8541f) {
        this.f3373d.m11547a(cls, interfaceC8541f);
        return this;
    }

    /* renamed from: e */
    public Registry m3276e(String str, Class cls, Class cls2, InterfaceC8540e interfaceC8540e) {
        this.f3372c.m11541a(str, interfaceC8540e, cls, cls2);
        return this;
    }

    /* renamed from: f */
    public final List m3277f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f3372c.m11544d(cls, cls2)) {
            for (Class cls5 : this.f3375f.m19b(cls4, cls3)) {
                arrayList.add(new C5378e(cls, cls4, cls5, this.f3372c.m11542b(cls, cls4), this.f3375f.m18a(cls4, cls5), this.f3379j));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m3278g() {
        List listM11534b = this.f3376g.m11534b();
        if (listM11534b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listM11534b;
    }

    /* renamed from: h */
    public C5382i m3279h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        C5382i c5382iM11535a = this.f3378i.m11535a(cls, cls2, cls3);
        C5382i c5382i = null;
        if (this.f3378i.m11537c(c5382iM11535a)) {
            return null;
        }
        if (c5382iM11535a != null) {
            return c5382iM11535a;
        }
        List listM3277f = m3277f(cls, cls2, cls3);
        if (listM3277f.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            c5382i = new C5382i(cls4, cls5, cls6, listM3277f, this.f3379j);
        }
        this.f3378i.m11538d(cls4, cls5, cls6, c5382i);
        return c5382i;
    }

    /* renamed from: i */
    public List m3280i(Object obj) {
        return this.f3370a.m15419d(obj);
    }

    /* renamed from: j */
    public List m3281j(Class cls, Class cls2, Class cls3) {
        List listM11539a = this.f3377h.m11539a(cls, cls2, cls3);
        if (listM11539a == null) {
            listM11539a = new ArrayList();
            Iterator it = this.f3370a.m15418c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f3372c.m11544d((Class) it.next(), cls2)) {
                    if (!this.f3375f.m19b(cls4, cls3).isEmpty() && !listM11539a.contains(cls4)) {
                        listM11539a.add(cls4);
                    }
                }
            }
            this.f3377h.m11540b(cls, cls2, cls3, Collections.unmodifiableList(listM11539a));
        }
        return listM11539a;
    }

    /* renamed from: k */
    public InterfaceC8541f m3282k(InterfaceC8690j interfaceC8690j) {
        InterfaceC8541f interfaceC8541fM11548b = this.f3373d.m11548b(interfaceC8690j.mo3569a());
        if (interfaceC8541fM11548b != null) {
            return interfaceC8541fM11548b;
        }
        throw new NoResultEncoderAvailableException(interfaceC8690j.mo3569a());
    }

    /* renamed from: l */
    public InterfaceC5357e m3283l(Object obj) {
        return this.f3374e.m3414a(obj);
    }

    /* renamed from: m */
    public InterfaceC8536a m3284m(Object obj) {
        InterfaceC8536a interfaceC8536aM11531b = this.f3371b.m11531b(obj.getClass());
        if (interfaceC8536aM11531b != null) {
            return interfaceC8536aM11531b;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    /* renamed from: n */
    public boolean m3285n(InterfaceC8690j interfaceC8690j) {
        return this.f3373d.m11548b(interfaceC8690j.mo3569a()) != null;
    }

    /* renamed from: o */
    public Registry m3286o(ImageHeaderParser imageHeaderParser) {
        this.f3376g.m11533a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public Registry m3287p(InterfaceC5357e.a aVar) {
        this.f3374e.m3415b(aVar);
        return this;
    }

    /* renamed from: q */
    public Registry m3288q(Class cls, Class cls2, InterfaceC0012e interfaceC0012e) {
        this.f3375f.m20c(cls, cls2, interfaceC0012e);
        return this;
    }

    /* renamed from: r */
    public final Registry m3289r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f3372c.m11545e(arrayList);
        return this;
    }
}
