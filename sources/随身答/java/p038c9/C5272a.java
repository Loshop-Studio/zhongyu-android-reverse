package p038c9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import p038c9.InterfaceC5280f;
import p110f9.InterfaceC7978w;
import p172l8.AbstractC8925x;
import p172l8.AbstractC8927z;

/* renamed from: c9.a */
/* loaded from: classes5.dex */
public final class C5272a extends InterfaceC5280f.a {

    /* renamed from: a */
    public boolean f2516a = true;

    /* renamed from: c9.a$a */
    public static final class a implements InterfaceC5280f {

        /* renamed from: a */
        public static final a f2517a = new a();

        @Override // p038c9.InterfaceC5280f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC8927z convert(AbstractC8927z abstractC8927z) {
            try {
                return AbstractC5277c0.m2425a(abstractC8927z);
            } finally {
                abstractC8927z.close();
            }
        }
    }

    /* renamed from: c9.a$d */
    public static final class d implements InterfaceC5280f {

        /* renamed from: a */
        public static final d f2520a = new d();

        @Override // p038c9.InterfaceC5280f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: c9.a$e */
    public static final class e implements InterfaceC5280f {

        /* renamed from: a */
        public static final e f2521a = new e();

        @Override // p038c9.InterfaceC5280f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit convert(AbstractC8927z abstractC8927z) {
            abstractC8927z.close();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: c9.a$f */
    public static final class f implements InterfaceC5280f {

        /* renamed from: a */
        public static final f f2522a = new f();

        @Override // p038c9.InterfaceC5280f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(AbstractC8927z abstractC8927z) {
            abstractC8927z.close();
            return null;
        }
    }

    @Override // p038c9.InterfaceC5280f.a
    /* renamed from: c */
    public InterfaceC5280f mo2414c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C5299y c5299y) {
        if (AbstractC8925x.class.isAssignableFrom(AbstractC5277c0.m2432h(type))) {
            return b.f2518a;
        }
        return null;
    }

    @Override // p038c9.InterfaceC5280f.a
    /* renamed from: d */
    public InterfaceC5280f mo2415d(Type type, Annotation[] annotationArr, C5299y c5299y) {
        if (type == AbstractC8927z.class) {
            return AbstractC5277c0.m2436l(annotationArr, InterfaceC7978w.class) ? c.f2519a : a.f2517a;
        }
        if (type == Void.class) {
            return f.f2522a;
        }
        if (!this.f2516a || type != Unit.class) {
            return null;
        }
        try {
            return e.f2521a;
        } catch (NoClassDefFoundError unused) {
            this.f2516a = false;
            return null;
        }
    }

    /* renamed from: c9.a$b */
    public static final class b implements InterfaceC5280f {

        /* renamed from: a */
        public static final b f2518a = new b();

        @Override // p038c9.InterfaceC5280f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC8925x convert(AbstractC8925x abstractC8925x) {
            return abstractC8925x;
        }
    }

    /* renamed from: c9.a$c */
    public static final class c implements InterfaceC5280f {

        /* renamed from: a */
        public static final c f2519a = new c();

        @Override // p038c9.InterfaceC5280f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC8927z convert(AbstractC8927z abstractC8927z) {
            return abstractC8927z;
        }
    }
}
