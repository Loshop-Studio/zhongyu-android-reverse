package ca;

import ca.InterfaceC5290h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p103fa.InterfaceC8509w;
import p123h7.C8736p;
import p136i9.AbstractC8901c0;
import p136i9.AbstractC8905e0;

/* renamed from: ca.b */
/* loaded from: classes5.dex */
public final class C5278b extends InterfaceC5290h.a {

    /* renamed from: ca.b$a */
    public static final class a implements InterfaceC5290h {

        /* renamed from: a */
        public static final a f2428a = new a();

        @Override // ca.InterfaceC5290h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC8905e0 convert(AbstractC8905e0 abstractC8905e0) {
            try {
                return AbstractC5291h0.m2281a(abstractC8905e0);
            } finally {
                abstractC8905e0.close();
            }
        }
    }

    /* renamed from: ca.b$d */
    public static final class d implements InterfaceC5290h {

        /* renamed from: a */
        public static final d f2431a = new d();

        @Override // ca.InterfaceC5290h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: ca.b$e */
    public static final class e implements InterfaceC5290h {

        /* renamed from: a */
        public static final e f2432a = new e();

        @Override // ca.InterfaceC5290h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8736p convert(AbstractC8905e0 abstractC8905e0) {
            abstractC8905e0.close();
            return C8736p.f16368a;
        }
    }

    /* renamed from: ca.b$f */
    public static final class f implements InterfaceC5290h {

        /* renamed from: a */
        public static final f f2433a = new f();

        @Override // ca.InterfaceC5290h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(AbstractC8905e0 abstractC8905e0) {
            abstractC8905e0.close();
            return null;
        }
    }

    @Override // ca.InterfaceC5290h.a
    /* renamed from: c */
    public InterfaceC5290h mo2219c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C5283d0 c5283d0) {
        if (AbstractC8901c0.class.isAssignableFrom(AbstractC5291h0.m2288h(type))) {
            return b.f2429a;
        }
        return null;
    }

    @Override // ca.InterfaceC5290h.a
    /* renamed from: d */
    public InterfaceC5290h mo2220d(Type type, Annotation[] annotationArr, C5283d0 c5283d0) {
        if (type == AbstractC8905e0.class) {
            return AbstractC5291h0.m2292l(annotationArr, InterfaceC8509w.class) ? c.f2430a : a.f2428a;
        }
        if (type == Void.class) {
            return f.f2433a;
        }
        if (AbstractC5291h0.m2293m(type)) {
            return e.f2432a;
        }
        return null;
    }

    /* renamed from: ca.b$b */
    public static final class b implements InterfaceC5290h {

        /* renamed from: a */
        public static final b f2429a = new b();

        @Override // ca.InterfaceC5290h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC8901c0 convert(AbstractC8901c0 abstractC8901c0) {
            return abstractC8901c0;
        }
    }

    /* renamed from: ca.b$c */
    public static final class c implements InterfaceC5290h {

        /* renamed from: a */
        public static final c f2430a = new c();

        @Override // ca.InterfaceC5290h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC8905e0 convert(AbstractC8905e0 abstractC8905e0) {
            return abstractC8905e0;
        }
    }
}
