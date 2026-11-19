package p080j3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import p080j3.InterfaceC3821i;
import p097m3.InterfaceC4389w;
import p117r2.AbstractC4498b0;
import p117r2.AbstractC4523z;

/* renamed from: j3.a */
/* loaded from: classes2.dex */
public final class C3805a extends InterfaceC3821i.a {

    /* renamed from: a */
    public boolean f4549a = true;

    /* renamed from: j3.a$a */
    public static final class a implements InterfaceC3821i {

        /* renamed from: a */
        public static final a f4550a = new a();

        @Override // p080j3.InterfaceC3821i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC4498b0 mo4967a(AbstractC4498b0 abstractC4498b0) {
            try {
                return AbstractC3822i0.m5053a(abstractC4498b0);
            } finally {
                abstractC4498b0.close();
            }
        }
    }

    /* renamed from: j3.a$b */
    public static final class b implements InterfaceC3821i {

        /* renamed from: a */
        public static final b f4551a = new b();

        @Override // p080j3.InterfaceC3821i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC4523z mo4967a(AbstractC4523z abstractC4523z) {
            return abstractC4523z;
        }
    }

    /* renamed from: j3.a$c */
    public static final class c implements InterfaceC3821i {

        /* renamed from: a */
        public static final c f4552a = new c();

        @Override // p080j3.InterfaceC3821i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC4498b0 mo4967a(AbstractC4498b0 abstractC4498b0) {
            return abstractC4498b0;
        }
    }

    /* renamed from: j3.a$d */
    public static final class d implements InterfaceC3821i {

        /* renamed from: a */
        public static final d f4553a = new d();

        @Override // p080j3.InterfaceC3821i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String mo4967a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: j3.a$e */
    public static final class e implements InterfaceC3821i {

        /* renamed from: a */
        public static final e f4554a = new e();

        @Override // p080j3.InterfaceC3821i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Unit mo4967a(AbstractC4498b0 abstractC4498b0) {
            abstractC4498b0.close();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: j3.a$f */
    public static final class f implements InterfaceC3821i {

        /* renamed from: a */
        public static final f f4555a = new f();

        @Override // p080j3.InterfaceC3821i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo4967a(AbstractC4498b0 abstractC4498b0) {
            abstractC4498b0.close();
            return null;
        }
    }

    @Override // p080j3.InterfaceC3821i.a
    /* renamed from: c */
    public InterfaceC3821i mo4965c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C3814e0 c3814e0) {
        if (AbstractC4523z.class.isAssignableFrom(AbstractC3822i0.m5060h(type))) {
            return b.f4551a;
        }
        return null;
    }

    @Override // p080j3.InterfaceC3821i.a
    /* renamed from: d */
    public InterfaceC3821i mo4966d(Type type, Annotation[] annotationArr, C3814e0 c3814e0) {
        if (type == AbstractC4498b0.class) {
            return AbstractC3822i0.m5064l(annotationArr, InterfaceC4389w.class) ? c.f4552a : a.f4550a;
        }
        if (type == Void.class) {
            return f.f4555a;
        }
        if (!this.f4549a || type != Unit.class) {
            return null;
        }
        try {
            return e.f4554a;
        } catch (NoClassDefFoundError unused) {
            this.f4549a = false;
            return null;
        }
    }
}
