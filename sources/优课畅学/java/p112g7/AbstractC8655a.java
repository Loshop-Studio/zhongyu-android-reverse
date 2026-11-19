package p112g7;

import io.reactivex.internal.schedulers.C8973b;
import java.util.concurrent.Callable;
import p076d7.C8310a;
import p076d7.C8312c;
import p076d7.C8313d;
import p076d7.C8315f;
import p100f7.AbstractC8462a;
import p244s6.AbstractC10049f;

/* renamed from: g7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8655a {

    /* renamed from: a */
    public static final AbstractC10049f f16192a = AbstractC8462a.m13797g(new h());

    /* renamed from: b */
    public static final AbstractC10049f f16193b = AbstractC8462a.m13794d(new b());

    /* renamed from: c */
    public static final AbstractC10049f f16194c = AbstractC8462a.m13795e(new c());

    /* renamed from: d */
    public static final AbstractC10049f f16195d = C8315f.m13486d();

    /* renamed from: e */
    public static final AbstractC10049f f16196e = AbstractC8462a.m13796f(new f());

    /* renamed from: g7.a$a */
    public static final class a {

        /* renamed from: a */
        public static final AbstractC10049f f16197a = new C8310a();
    }

    /* renamed from: g7.a$b */
    public static final class b implements Callable {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC10049f call() {
            return a.f16197a;
        }
    }

    /* renamed from: g7.a$c */
    public static final class c implements Callable {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC10049f call() {
            return d.f16198a;
        }
    }

    /* renamed from: g7.a$d */
    public static final class d {

        /* renamed from: a */
        public static final AbstractC10049f f16198a = new C8312c();
    }

    /* renamed from: g7.a$e */
    public static final class e {

        /* renamed from: a */
        public static final AbstractC10049f f16199a = new C8313d();
    }

    /* renamed from: g7.a$f */
    public static final class f implements Callable {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC10049f call() {
            return e.f16199a;
        }
    }

    /* renamed from: g7.a$g */
    public static final class g {

        /* renamed from: a */
        public static final AbstractC10049f f16200a = new C8973b();
    }

    /* renamed from: g7.a$h */
    public static final class h implements Callable {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC10049f call() {
            return g.f16200a;
        }
    }

    /* renamed from: a */
    public static AbstractC10049f m13933a() {
        return AbstractC8462a.m13800j(f16193b);
    }

    /* renamed from: b */
    public static AbstractC10049f m13934b() {
        return AbstractC8462a.m13802l(f16194c);
    }
}
