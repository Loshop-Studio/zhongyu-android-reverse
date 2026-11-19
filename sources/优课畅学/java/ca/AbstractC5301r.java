package ca;

import ca.AbstractC5291h0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p136i9.C8903d0;
import p136i9.InterfaceC8904e;
import p179m7.InterfaceC9324c;
import retrofit2.KotlinExtensions;

/* renamed from: ca.r */
/* loaded from: classes5.dex */
public abstract class AbstractC5301r extends AbstractC5285e0 {

    /* renamed from: a */
    public final C5279b0 f2524a;

    /* renamed from: b */
    public final InterfaceC8904e.a f2525b;

    /* renamed from: c */
    public final InterfaceC5290h f2526c;

    /* renamed from: ca.r$a */
    public static final class a extends AbstractC5301r {

        /* renamed from: d */
        public final InterfaceC5284e f2527d;

        public a(C5279b0 c5279b0, InterfaceC8904e.a aVar, InterfaceC5290h interfaceC5290h, InterfaceC5284e interfaceC5284e) {
            super(c5279b0, aVar, interfaceC5290h);
            this.f2527d = interfaceC5284e;
        }

        @Override // ca.AbstractC5301r
        /* renamed from: c */
        public Object mo2314c(InterfaceC5282d interfaceC5282d, Object[] objArr) {
            return this.f2527d.mo2267b(interfaceC5282d);
        }
    }

    /* renamed from: ca.r$b */
    public static final class b extends AbstractC5301r {

        /* renamed from: d */
        public final InterfaceC5284e f2528d;

        /* renamed from: e */
        public final boolean f2529e;

        /* renamed from: f */
        public final boolean f2530f;

        public b(C5279b0 c5279b0, InterfaceC8904e.a aVar, InterfaceC5290h interfaceC5290h, InterfaceC5284e interfaceC5284e, boolean z10, boolean z11) {
            super(c5279b0, aVar, interfaceC5290h);
            this.f2528d = interfaceC5284e;
            this.f2529e = z10;
            this.f2530f = z11;
        }

        @Override // ca.AbstractC5301r
        /* renamed from: c */
        public Object mo2314c(InterfaceC5282d interfaceC5282d, Object[] objArr) {
            InterfaceC5282d interfaceC5282d2 = (InterfaceC5282d) this.f2528d.mo2267b(interfaceC5282d);
            InterfaceC9324c interfaceC9324c = (InterfaceC9324c) objArr[objArr.length - 1];
            try {
                return this.f2530f ? KotlinExtensions.m18593d(interfaceC5282d2, interfaceC9324c) : this.f2529e ? KotlinExtensions.m18591b(interfaceC5282d2, interfaceC9324c) : KotlinExtensions.m18590a(interfaceC5282d2, interfaceC9324c);
            } catch (LinkageError e10) {
                throw e10;
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (VirtualMachineError e12) {
                throw e12;
            } catch (Throwable th) {
                return KotlinExtensions.m18594e(th, interfaceC9324c);
            }
        }
    }

    /* renamed from: ca.r$c */
    public static final class c extends AbstractC5301r {

        /* renamed from: d */
        public final InterfaceC5284e f2531d;

        public c(C5279b0 c5279b0, InterfaceC8904e.a aVar, InterfaceC5290h interfaceC5290h, InterfaceC5284e interfaceC5284e) {
            super(c5279b0, aVar, interfaceC5290h);
            this.f2531d = interfaceC5284e;
        }

        @Override // ca.AbstractC5301r
        /* renamed from: c */
        public Object mo2314c(InterfaceC5282d interfaceC5282d, Object[] objArr) {
            InterfaceC5282d interfaceC5282d2 = (InterfaceC5282d) this.f2531d.mo2267b(interfaceC5282d);
            InterfaceC9324c interfaceC9324c = (InterfaceC9324c) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.m18592c(interfaceC5282d2, interfaceC9324c);
            } catch (Exception e10) {
                return KotlinExtensions.m18594e(e10, interfaceC9324c);
            }
        }
    }

    public AbstractC5301r(C5279b0 c5279b0, InterfaceC8904e.a aVar, InterfaceC5290h interfaceC5290h) {
        this.f2524a = c5279b0;
        this.f2525b = aVar;
        this.f2526c = interfaceC5290h;
    }

    /* renamed from: d */
    public static InterfaceC5284e m2311d(C5283d0 c5283d0, Method method, Type type, Annotation[] annotationArr) {
        try {
            return c5283d0.m2250a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw AbstractC5291h0.m2295o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    public static InterfaceC5290h m2312e(C5283d0 c5283d0, Method method, Type type) {
        try {
            return c5283d0.m2257h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw AbstractC5291h0.m2295o(method, e10, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    public static AbstractC5301r m2313f(C5283d0 c5283d0, Method method, C5279b0 c5279b0) {
        Type genericReturnType;
        boolean z10;
        boolean z11;
        boolean zM2293m;
        boolean z12 = c5279b0.f2445l;
        Annotation[] annotations = method.getAnnotations();
        if (z12) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeM2286f = AbstractC5291h0.m2286f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (AbstractC5291h0.m2288h(typeM2286f) == C5281c0.class && (typeM2286f instanceof ParameterizedType)) {
                typeM2286f = AbstractC5291h0.m2287g(0, (ParameterizedType) typeM2286f);
                zM2293m = false;
                z10 = true;
            } else {
                if (AbstractC5291h0.m2288h(typeM2286f) == InterfaceC5282d.class) {
                    throw AbstractC5291h0.m2294n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", AbstractC5291h0.m2287g(0, (ParameterizedType) typeM2286f));
                }
                zM2293m = AbstractC5291h0.m2293m(typeM2286f);
                z10 = false;
            }
            genericReturnType = new AbstractC5291h0.b(null, InterfaceC5282d.class, typeM2286f);
            annotations = C5289g0.m2277a(annotations);
            z11 = zM2293m;
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
            z11 = false;
        }
        InterfaceC5284e interfaceC5284eM2311d = m2311d(c5283d0, method, genericReturnType, annotations);
        Type typeMo2266a = interfaceC5284eM2311d.mo2266a();
        if (typeMo2266a == C8903d0.class) {
            throw AbstractC5291h0.m2294n(method, "'" + AbstractC5291h0.m2288h(typeMo2266a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeMo2266a == C5281c0.class) {
            throw AbstractC5291h0.m2294n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (c5279b0.f2437d.equals("HEAD") && !Void.class.equals(typeMo2266a) && !AbstractC5291h0.m2293m(typeMo2266a)) {
            throw AbstractC5291h0.m2294n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        InterfaceC5290h interfaceC5290hM2312e = m2312e(c5283d0, method, typeMo2266a);
        InterfaceC8904e.a aVar = c5283d0.f2476b;
        return !z12 ? new a(c5279b0, aVar, interfaceC5290hM2312e, interfaceC5284eM2311d) : z10 ? new c(c5279b0, aVar, interfaceC5290hM2312e, interfaceC5284eM2311d) : new b(c5279b0, aVar, interfaceC5290hM2312e, interfaceC5284eM2311d, false, z11);
    }

    @Override // ca.AbstractC5285e0
    /* renamed from: a */
    public final Object mo2272a(Object obj, Object[] objArr) {
        return mo2314c(new C5303t(this.f2524a, obj, objArr, this.f2525b, this.f2526c), objArr);
    }

    /* renamed from: c */
    public abstract Object mo2314c(InterfaceC5282d interfaceC5282d, Object[] objArr);
}
