package p122df;

import gf.InterfaceC9430w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import je.AbstractC9744x;
import je.AbstractC9746z;
import p122df.InterfaceC9040h;
import p309qc.C10786q;

/* renamed from: df.b */
/* loaded from: classes6.dex */
public final class C9028b extends InterfaceC9040h.a {

    /* renamed from: df.b$a */
    public static final class a implements InterfaceC9040h {

        /* renamed from: a */
        public static final a f21037a = new a();

        @Override // p122df.InterfaceC9040h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC9746z convert(AbstractC9746z abstractC9746z) {
            try {
                return AbstractC9041h0.m17739a(abstractC9746z);
            } finally {
                abstractC9746z.close();
            }
        }
    }

    /* renamed from: df.b$d */
    public static final class d implements InterfaceC9040h {

        /* renamed from: a */
        public static final d f21040a = new d();

        @Override // p122df.InterfaceC9040h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: df.b$e */
    public static final class e implements InterfaceC9040h {

        /* renamed from: a */
        public static final e f21041a = new e();

        @Override // p122df.InterfaceC9040h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10786q convert(AbstractC9746z abstractC9746z) {
            abstractC9746z.close();
            return C10786q.f26013a;
        }
    }

    /* renamed from: df.b$f */
    public static final class f implements InterfaceC9040h {

        /* renamed from: a */
        public static final f f21042a = new f();

        @Override // p122df.InterfaceC9040h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(AbstractC9746z abstractC9746z) {
            abstractC9746z.close();
            return null;
        }
    }

    @Override // p122df.InterfaceC9040h.a
    public InterfaceC9040h requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C9033d0 c9033d0) {
        if (AbstractC9744x.class.isAssignableFrom(AbstractC9041h0.m17746h(type))) {
            return b.f21038a;
        }
        return null;
    }

    @Override // p122df.InterfaceC9040h.a
    public InterfaceC9040h responseBodyConverter(Type type, Annotation[] annotationArr, C9033d0 c9033d0) {
        if (type == AbstractC9746z.class) {
            return AbstractC9041h0.m17750l(annotationArr, InterfaceC9430w.class) ? c.f21039a : a.f21037a;
        }
        if (type == Void.class) {
            return f.f21042a;
        }
        if (AbstractC9041h0.m17751m(type)) {
            return e.f21041a;
        }
        return null;
    }

    /* renamed from: df.b$b */
    public static final class b implements InterfaceC9040h {

        /* renamed from: a */
        public static final b f21038a = new b();

        @Override // p122df.InterfaceC9040h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC9744x convert(AbstractC9744x abstractC9744x) {
            return abstractC9744x;
        }
    }

    /* renamed from: df.b$c */
    public static final class c implements InterfaceC9040h {

        /* renamed from: a */
        public static final c f21039a = new c();

        @Override // p122df.InterfaceC9040h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC9746z convert(AbstractC9746z abstractC9746z) {
            return abstractC9746z;
        }
    }
}
