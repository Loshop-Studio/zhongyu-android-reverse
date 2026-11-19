package p122df;

import anet.channel.request.Request;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import je.C9745y;
import je.InterfaceC9725e;
import p122df.AbstractC9041h0;
import retrofit2.KotlinExtensions;
import vc.InterfaceC11588c;

/* renamed from: df.r */
/* loaded from: classes6.dex */
public abstract class AbstractC9051r extends AbstractC9035e0 {

    /* renamed from: a */
    public final C9029b0 f21133a;

    /* renamed from: b */
    public final InterfaceC9725e.a f21134b;

    /* renamed from: c */
    public final InterfaceC9040h f21135c;

    /* renamed from: df.r$a */
    public static final class a extends AbstractC9051r {

        /* renamed from: d */
        public final InterfaceC9034e f21136d;

        public a(C9029b0 c9029b0, InterfaceC9725e.a aVar, InterfaceC9040h interfaceC9040h, InterfaceC9034e interfaceC9034e) {
            super(c9029b0, aVar, interfaceC9040h);
            this.f21136d = interfaceC9034e;
        }

        @Override // p122df.AbstractC9051r
        /* renamed from: c */
        public Object mo17772c(InterfaceC9032d interfaceC9032d, Object[] objArr) {
            return this.f21136d.mo17727a(interfaceC9032d);
        }
    }

    /* renamed from: df.r$b */
    public static final class b extends AbstractC9051r {

        /* renamed from: d */
        public final InterfaceC9034e f21137d;

        /* renamed from: e */
        public final boolean f21138e;

        /* renamed from: f */
        public final boolean f21139f;

        public b(C9029b0 c9029b0, InterfaceC9725e.a aVar, InterfaceC9040h interfaceC9040h, InterfaceC9034e interfaceC9034e, boolean z10, boolean z11) {
            super(c9029b0, aVar, interfaceC9040h);
            this.f21137d = interfaceC9034e;
            this.f21138e = z10;
            this.f21139f = z11;
        }

        @Override // p122df.AbstractC9051r
        /* renamed from: c */
        public Object mo17772c(InterfaceC9032d interfaceC9032d, Object[] objArr) {
            InterfaceC9032d interfaceC9032d2 = (InterfaceC9032d) this.f21137d.mo17727a(interfaceC9032d);
            InterfaceC11588c interfaceC11588c = (InterfaceC11588c) objArr[objArr.length - 1];
            try {
                return this.f21139f ? KotlinExtensions.m24320d(interfaceC9032d2, interfaceC11588c) : this.f21138e ? KotlinExtensions.m24318b(interfaceC9032d2, interfaceC11588c) : KotlinExtensions.m24317a(interfaceC9032d2, interfaceC11588c);
            } catch (LinkageError e10) {
                throw e10;
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (VirtualMachineError e12) {
                throw e12;
            } catch (Throwable th) {
                return KotlinExtensions.m24321e(th, interfaceC11588c);
            }
        }
    }

    /* renamed from: df.r$c */
    public static final class c extends AbstractC9051r {

        /* renamed from: d */
        public final InterfaceC9034e f21140d;

        public c(C9029b0 c9029b0, InterfaceC9725e.a aVar, InterfaceC9040h interfaceC9040h, InterfaceC9034e interfaceC9034e) {
            super(c9029b0, aVar, interfaceC9040h);
            this.f21140d = interfaceC9034e;
        }

        @Override // p122df.AbstractC9051r
        /* renamed from: c */
        public Object mo17772c(InterfaceC9032d interfaceC9032d, Object[] objArr) {
            InterfaceC9032d interfaceC9032d2 = (InterfaceC9032d) this.f21140d.mo17727a(interfaceC9032d);
            InterfaceC11588c interfaceC11588c = (InterfaceC11588c) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.m24319c(interfaceC9032d2, interfaceC11588c);
            } catch (Exception e10) {
                return KotlinExtensions.m24321e(e10, interfaceC11588c);
            }
        }
    }

    public AbstractC9051r(C9029b0 c9029b0, InterfaceC9725e.a aVar, InterfaceC9040h interfaceC9040h) {
        this.f21133a = c9029b0;
        this.f21134b = aVar;
        this.f21135c = interfaceC9040h;
    }

    /* renamed from: d */
    public static InterfaceC9034e m17769d(C9033d0 c9033d0, Method method, Type type, Annotation[] annotationArr) {
        try {
            return c9033d0.m17711a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw AbstractC9041h0.m17753o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    public static InterfaceC9040h m17770e(C9033d0 c9033d0, Method method, Type type) {
        try {
            return c9033d0.m17718h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw AbstractC9041h0.m17753o(method, e10, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    public static AbstractC9051r m17771f(C9033d0 c9033d0, Method method, C9029b0 c9029b0) {
        Type genericReturnType;
        boolean z10;
        boolean z11;
        boolean zM17751m;
        boolean z12 = c9029b0.f21054l;
        Annotation[] annotations = method.getAnnotations();
        if (z12) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeM17744f = AbstractC9041h0.m17744f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (AbstractC9041h0.m17746h(typeM17744f) == C9031c0.class && (typeM17744f instanceof ParameterizedType)) {
                typeM17744f = AbstractC9041h0.m17745g(0, (ParameterizedType) typeM17744f);
                zM17751m = false;
                z10 = true;
            } else {
                if (AbstractC9041h0.m17746h(typeM17744f) == InterfaceC9032d.class) {
                    throw AbstractC9041h0.m17752n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", AbstractC9041h0.m17745g(0, (ParameterizedType) typeM17744f));
                }
                zM17751m = AbstractC9041h0.m17751m(typeM17744f);
                z10 = false;
            }
            genericReturnType = new AbstractC9041h0.b(null, InterfaceC9032d.class, typeM17744f);
            annotations = C9039g0.m17738a(annotations);
            z11 = zM17751m;
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
            z11 = false;
        }
        InterfaceC9034e interfaceC9034eM17769d = m17769d(c9033d0, method, genericReturnType, annotations);
        Type typeMo17728b = interfaceC9034eM17769d.mo17728b();
        if (typeMo17728b == C9745y.class) {
            throw AbstractC9041h0.m17752n(method, "'" + AbstractC9041h0.m17746h(typeMo17728b).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeMo17728b == C9031c0.class) {
            throw AbstractC9041h0.m17752n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (c9029b0.f21046d.equals(Request.Method.HEAD) && !Void.class.equals(typeMo17728b) && !AbstractC9041h0.m17751m(typeMo17728b)) {
            throw AbstractC9041h0.m17752n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        InterfaceC9040h interfaceC9040hM17770e = m17770e(c9033d0, method, typeMo17728b);
        InterfaceC9725e.a aVar = c9033d0.f21085b;
        return !z12 ? new a(c9029b0, aVar, interfaceC9040hM17770e, interfaceC9034eM17769d) : z10 ? new c(c9029b0, aVar, interfaceC9040hM17770e, interfaceC9034eM17769d) : new b(c9029b0, aVar, interfaceC9040hM17770e, interfaceC9034eM17769d, false, z11);
    }

    @Override // p122df.AbstractC9035e0
    /* renamed from: a */
    public final Object mo17733a(Object obj, Object[] objArr) {
        return mo17772c(new C9053t(this.f21133a, obj, objArr, this.f21134b, this.f21135c), objArr);
    }

    /* renamed from: c */
    public abstract Object mo17772c(InterfaceC9032d interfaceC9032d, Object[] objArr);
}
