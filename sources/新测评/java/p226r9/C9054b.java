package p226r9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import p011a9.AbstractC0061x;
import p011a9.AbstractC0063z;
import p226r9.InterfaceC9066h;
import p259u9.InterfaceC9619w;

/* renamed from: r9.b */
/* loaded from: classes5.dex */
public final class C9054b extends InterfaceC9066h.a {

    /* renamed from: r9.b$a */
    public static final class a implements InterfaceC9066h {

        /* renamed from: a */
        public static final a f15534a = new a();

        @Override // p226r9.InterfaceC9066h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0063z convert(AbstractC0063z abstractC0063z) {
            try {
                return AbstractC9067h0.m15279a(abstractC0063z);
            } finally {
                abstractC0063z.close();
            }
        }
    }

    /* renamed from: r9.b$d */
    public static final class d implements InterfaceC9066h {

        /* renamed from: a */
        public static final d f15537a = new d();

        @Override // p226r9.InterfaceC9066h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: r9.b$e */
    public static final class e implements InterfaceC9066h {

        /* renamed from: a */
        public static final e f15538a = new e();

        @Override // p226r9.InterfaceC9066h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit convert(AbstractC0063z abstractC0063z) {
            abstractC0063z.close();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: r9.b$f */
    public static final class f implements InterfaceC9066h {

        /* renamed from: a */
        public static final f f15539a = new f();

        @Override // p226r9.InterfaceC9066h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(AbstractC0063z abstractC0063z) {
            abstractC0063z.close();
            return null;
        }
    }

    @Override // p226r9.InterfaceC9066h.a
    /* renamed from: c */
    public InterfaceC9066h mo15218c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C9059d0 c9059d0) {
        if (AbstractC0061x.class.isAssignableFrom(AbstractC9067h0.m15286h(type))) {
            return b.f15535a;
        }
        return null;
    }

    @Override // p226r9.InterfaceC9066h.a
    /* renamed from: d */
    public InterfaceC9066h mo15219d(Type type, Annotation[] annotationArr, C9059d0 c9059d0) {
        if (type == AbstractC0063z.class) {
            return AbstractC9067h0.m15290l(annotationArr, InterfaceC9619w.class) ? c.f15536a : a.f15534a;
        }
        if (type == Void.class) {
            return f.f15539a;
        }
        if (AbstractC9067h0.m15291m(type)) {
            return e.f15538a;
        }
        return null;
    }

    /* renamed from: r9.b$b */
    public static final class b implements InterfaceC9066h {

        /* renamed from: a */
        public static final b f15535a = new b();

        @Override // p226r9.InterfaceC9066h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0061x convert(AbstractC0061x abstractC0061x) {
            return abstractC0061x;
        }
    }

    /* renamed from: r9.b$c */
    public static final class c implements InterfaceC9066h {

        /* renamed from: a */
        public static final c f15536a = new c();

        @Override // p226r9.InterfaceC9066h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0063z convert(AbstractC0063z abstractC0063z) {
            return abstractC0063z;
        }
    }
}
