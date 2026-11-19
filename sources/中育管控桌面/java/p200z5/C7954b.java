package p200z5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import p029c6.InterfaceC4532w;
import p058f5.AbstractC6360c0;
import p058f5.AbstractC6364e0;
import p200z5.InterfaceC7966h;

/* renamed from: z5.b */
/* loaded from: classes4.dex */
public final class C7954b extends InterfaceC7966h.a {

    /* renamed from: z5.b$a */
    public static final class a implements InterfaceC7966h {

        /* renamed from: a */
        public static final a f10689a = new a();

        @Override // p200z5.InterfaceC7966h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6364e0 convert(AbstractC6364e0 abstractC6364e0) {
            try {
                return AbstractC7967h0.m9821a(abstractC6364e0);
            } finally {
                abstractC6364e0.close();
            }
        }
    }

    /* renamed from: z5.b$d */
    public static final class d implements InterfaceC7966h {

        /* renamed from: a */
        public static final d f10692a = new d();

        @Override // p200z5.InterfaceC7966h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: z5.b$e */
    public static final class e implements InterfaceC7966h {

        /* renamed from: a */
        public static final e f10693a = new e();

        @Override // p200z5.InterfaceC7966h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit convert(AbstractC6364e0 abstractC6364e0) {
            abstractC6364e0.close();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: z5.b$f */
    public static final class f implements InterfaceC7966h {

        /* renamed from: a */
        public static final f f10694a = new f();

        @Override // p200z5.InterfaceC7966h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(AbstractC6364e0 abstractC6364e0) {
            abstractC6364e0.close();
            return null;
        }
    }

    @Override // p200z5.InterfaceC7966h.a
    /* renamed from: c */
    public InterfaceC7966h mo28c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C7959d0 c7959d0) {
        if (AbstractC6360c0.class.isAssignableFrom(AbstractC7967h0.m9828h(type))) {
            return b.f10690a;
        }
        return null;
    }

    @Override // p200z5.InterfaceC7966h.a
    /* renamed from: d */
    public InterfaceC7966h mo29d(Type type, Annotation[] annotationArr, C7959d0 c7959d0) {
        if (type == AbstractC6364e0.class) {
            return AbstractC7967h0.m9832l(annotationArr, InterfaceC4532w.class) ? c.f10691a : a.f10689a;
        }
        if (type == Void.class) {
            return f.f10694a;
        }
        if (AbstractC7967h0.m9833m(type)) {
            return e.f10693a;
        }
        return null;
    }

    /* renamed from: z5.b$b */
    public static final class b implements InterfaceC7966h {

        /* renamed from: a */
        public static final b f10690a = new b();

        @Override // p200z5.InterfaceC7966h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6360c0 convert(AbstractC6360c0 abstractC6360c0) {
            return abstractC6360c0;
        }
    }

    /* renamed from: z5.b$c */
    public static final class c implements InterfaceC7966h {

        /* renamed from: a */
        public static final c f10691a = new c();

        @Override // p200z5.InterfaceC7966h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6364e0 convert(AbstractC6364e0 abstractC6364e0) {
            return abstractC6364e0;
        }
    }
}
