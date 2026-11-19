package p038c9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import p038c9.AbstractC5277c0;
import p172l8.C8926y;
import p172l8.InterfaceC8906e;
import retrofit2.KotlinExtensions;

/* renamed from: c9.j */
/* loaded from: classes5.dex */
public abstract class AbstractC5284j extends AbstractC5300z {

    /* renamed from: a */
    public final C5297w f2553a;

    /* renamed from: b */
    public final InterfaceC8906e.a f2554b;

    /* renamed from: c */
    public final InterfaceC5280f f2555c;

    /* renamed from: c9.j$a */
    public static final class a extends AbstractC5284j {

        /* renamed from: d */
        public final InterfaceC5276c f2556d;

        public a(C5297w c5297w, InterfaceC8906e.a aVar, InterfaceC5280f interfaceC5280f, InterfaceC5276c interfaceC5276c) {
            super(c5297w, aVar, interfaceC5280f);
            this.f2556d = interfaceC5276c;
        }

        @Override // p038c9.AbstractC5284j
        /* renamed from: c */
        public Object mo2457c(InterfaceC5274b interfaceC5274b, Object[] objArr) {
            return this.f2556d.mo229b(interfaceC5274b);
        }
    }

    /* renamed from: c9.j$b */
    public static final class b extends AbstractC5284j {

        /* renamed from: d */
        public final InterfaceC5276c f2557d;

        /* renamed from: e */
        public final boolean f2558e;

        public b(C5297w c5297w, InterfaceC8906e.a aVar, InterfaceC5280f interfaceC5280f, InterfaceC5276c interfaceC5276c, boolean z9) {
            super(c5297w, aVar, interfaceC5280f);
            this.f2557d = interfaceC5276c;
            this.f2558e = z9;
        }

        @Override // p038c9.AbstractC5284j
        /* renamed from: c */
        public Object mo2457c(InterfaceC5274b interfaceC5274b, Object[] objArr) {
            InterfaceC5274b interfaceC5274b2 = (InterfaceC5274b) this.f2557d.mo229b(interfaceC5274b);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.f2558e ? KotlinExtensions.m15622b(interfaceC5274b2, continuation) : KotlinExtensions.m15621a(interfaceC5274b2, continuation);
            } catch (Exception e10) {
                return KotlinExtensions.m15624d(e10, continuation);
            }
        }
    }

    /* renamed from: c9.j$c */
    public static final class c extends AbstractC5284j {

        /* renamed from: d */
        public final InterfaceC5276c f2559d;

        public c(C5297w c5297w, InterfaceC8906e.a aVar, InterfaceC5280f interfaceC5280f, InterfaceC5276c interfaceC5276c) {
            super(c5297w, aVar, interfaceC5280f);
            this.f2559d = interfaceC5276c;
        }

        @Override // p038c9.AbstractC5284j
        /* renamed from: c */
        public Object mo2457c(InterfaceC5274b interfaceC5274b, Object[] objArr) {
            InterfaceC5274b interfaceC5274b2 = (InterfaceC5274b) this.f2559d.mo229b(interfaceC5274b);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.m15623c(interfaceC5274b2, continuation);
            } catch (Exception e10) {
                return KotlinExtensions.m15624d(e10, continuation);
            }
        }
    }

    public AbstractC5284j(C5297w c5297w, InterfaceC8906e.a aVar, InterfaceC5280f interfaceC5280f) {
        this.f2553a = c5297w;
        this.f2554b = aVar;
        this.f2555c = interfaceC5280f;
    }

    /* renamed from: d */
    public static InterfaceC5276c m2453d(C5299y c5299y, Method method, Type type, Annotation[] annotationArr) {
        try {
            return c5299y.m2526a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw AbstractC5277c0.m2438n(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    public static InterfaceC5280f m2454e(C5299y c5299y, Method method, Type type) {
        try {
            return c5299y.m2533h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw AbstractC5277c0.m2438n(method, e10, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    public static AbstractC5284j m2455f(C5299y c5299y, Method method, C5297w c5297w) {
        Type genericReturnType;
        boolean z9;
        boolean z10 = c5297w.f2654k;
        Annotation[] annotations = method.getAnnotations();
        if (z10) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeM2430f = AbstractC5277c0.m2430f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (AbstractC5277c0.m2432h(typeM2430f) == C5298x.class && (typeM2430f instanceof ParameterizedType)) {
                typeM2430f = AbstractC5277c0.m2431g(0, (ParameterizedType) typeM2430f);
                z9 = true;
            } else {
                z9 = false;
            }
            genericReturnType = new AbstractC5277c0.b(null, InterfaceC5274b.class, typeM2430f);
            annotations = C5275b0.m2422a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z9 = false;
        }
        InterfaceC5276c interfaceC5276cM2453d = m2453d(c5299y, method, genericReturnType, annotations);
        Type typeMo228a = interfaceC5276cM2453d.mo228a();
        if (typeMo228a == C8926y.class) {
            throw AbstractC5277c0.m2437m(method, "'" + AbstractC5277c0.m2432h(typeMo228a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeMo228a == C5298x.class) {
            throw AbstractC5277c0.m2437m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (c5297w.f2646c.equals("HEAD") && !Void.class.equals(typeMo228a)) {
            throw AbstractC5277c0.m2437m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        InterfaceC5280f interfaceC5280fM2454e = m2454e(c5299y, method, typeMo228a);
        InterfaceC8906e.a aVar = c5299y.f2684b;
        return !z10 ? new a(c5297w, aVar, interfaceC5280fM2454e, interfaceC5276cM2453d) : z9 ? new c(c5297w, aVar, interfaceC5280fM2454e, interfaceC5276cM2453d) : new b(c5297w, aVar, interfaceC5280fM2454e, interfaceC5276cM2453d, false);
    }

    @Override // p038c9.AbstractC5300z
    /* renamed from: a */
    public final Object mo2456a(Object[] objArr) {
        return mo2457c(new C5286l(this.f2553a, objArr, this.f2554b, this.f2555c), objArr);
    }

    /* renamed from: c */
    public abstract Object mo2457c(InterfaceC5274b interfaceC5274b, Object[] objArr);
}
