package p226r9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import p011a9.C0062y;
import p011a9.InterfaceC0042e;
import p226r9.AbstractC9067h0;
import retrofit2.KotlinExtensions;

/* renamed from: r9.r */
/* loaded from: classes5.dex */
public abstract class AbstractC9077r extends AbstractC9061e0 {

    /* renamed from: a */
    public final C9055b0 f15630a;

    /* renamed from: b */
    public final InterfaceC0042e.a f15631b;

    /* renamed from: c */
    public final InterfaceC9066h f15632c;

    /* renamed from: r9.r$a */
    public static final class a extends AbstractC9077r {

        /* renamed from: d */
        public final InterfaceC9060e f15633d;

        public a(C9055b0 c9055b0, InterfaceC0042e.a aVar, InterfaceC9066h interfaceC9066h, InterfaceC9060e interfaceC9060e) {
            super(c9055b0, aVar, interfaceC9066h);
            this.f15633d = interfaceC9060e;
        }

        @Override // p226r9.AbstractC9077r
        /* renamed from: c */
        public Object mo15312c(InterfaceC9058d interfaceC9058d, Object[] objArr) {
            return this.f15633d.mo15265b(interfaceC9058d);
        }
    }

    /* renamed from: r9.r$b */
    public static final class b extends AbstractC9077r {

        /* renamed from: d */
        public final InterfaceC9060e f15634d;

        /* renamed from: e */
        public final boolean f15635e;

        /* renamed from: f */
        public final boolean f15636f;

        public b(C9055b0 c9055b0, InterfaceC0042e.a aVar, InterfaceC9066h interfaceC9066h, InterfaceC9060e interfaceC9060e, boolean z9, boolean z10) {
            super(c9055b0, aVar, interfaceC9066h);
            this.f15634d = interfaceC9060e;
            this.f15635e = z9;
            this.f15636f = z10;
        }

        @Override // p226r9.AbstractC9077r
        /* renamed from: c */
        public Object mo15312c(InterfaceC9058d interfaceC9058d, Object[] objArr) {
            InterfaceC9058d interfaceC9058d2 = (InterfaceC9058d) this.f15634d.mo15265b(interfaceC9058d);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.f15636f ? KotlinExtensions.m15342d(interfaceC9058d2, continuation) : this.f15635e ? KotlinExtensions.m15340b(interfaceC9058d2, continuation) : KotlinExtensions.m15339a(interfaceC9058d2, continuation);
            } catch (LinkageError e10) {
                throw e10;
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (VirtualMachineError e12) {
                throw e12;
            } catch (Throwable th) {
                return KotlinExtensions.m15343e(th, continuation);
            }
        }
    }

    /* renamed from: r9.r$c */
    public static final class c extends AbstractC9077r {

        /* renamed from: d */
        public final InterfaceC9060e f15637d;

        public c(C9055b0 c9055b0, InterfaceC0042e.a aVar, InterfaceC9066h interfaceC9066h, InterfaceC9060e interfaceC9060e) {
            super(c9055b0, aVar, interfaceC9066h);
            this.f15637d = interfaceC9060e;
        }

        @Override // p226r9.AbstractC9077r
        /* renamed from: c */
        public Object mo15312c(InterfaceC9058d interfaceC9058d, Object[] objArr) {
            InterfaceC9058d interfaceC9058d2 = (InterfaceC9058d) this.f15637d.mo15265b(interfaceC9058d);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.m15341c(interfaceC9058d2, continuation);
            } catch (Exception e10) {
                return KotlinExtensions.m15343e(e10, continuation);
            }
        }
    }

    public AbstractC9077r(C9055b0 c9055b0, InterfaceC0042e.a aVar, InterfaceC9066h interfaceC9066h) {
        this.f15630a = c9055b0;
        this.f15631b = aVar;
        this.f15632c = interfaceC9066h;
    }

    /* renamed from: d */
    public static InterfaceC9060e m15309d(C9059d0 c9059d0, Method method, Type type, Annotation[] annotationArr) {
        try {
            return c9059d0.m15248a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw AbstractC9067h0.m15293o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    public static InterfaceC9066h m15310e(C9059d0 c9059d0, Method method, Type type) {
        try {
            return c9059d0.m15255h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw AbstractC9067h0.m15293o(method, e10, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    public static AbstractC9077r m15311f(C9059d0 c9059d0, Method method, C9055b0 c9055b0) {
        Type genericReturnType;
        boolean z9;
        boolean z10;
        boolean zM15291m;
        boolean z11 = c9055b0.f15551l;
        Annotation[] annotations = method.getAnnotations();
        if (z11) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeM15284f = AbstractC9067h0.m15284f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (AbstractC9067h0.m15286h(typeM15284f) == C9057c0.class && (typeM15284f instanceof ParameterizedType)) {
                typeM15284f = AbstractC9067h0.m15285g(0, (ParameterizedType) typeM15284f);
                zM15291m = false;
                z9 = true;
            } else {
                if (AbstractC9067h0.m15286h(typeM15284f) == InterfaceC9058d.class) {
                    throw AbstractC9067h0.m15292n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", AbstractC9067h0.m15285g(0, (ParameterizedType) typeM15284f));
                }
                zM15291m = AbstractC9067h0.m15291m(typeM15284f);
                z9 = false;
            }
            genericReturnType = new AbstractC9067h0.b(null, InterfaceC9058d.class, typeM15284f);
            annotations = C9065g0.m15275a(annotations);
            z10 = zM15291m;
        } else {
            genericReturnType = method.getGenericReturnType();
            z9 = false;
            z10 = false;
        }
        InterfaceC9060e interfaceC9060eM15309d = m15309d(c9059d0, method, genericReturnType, annotations);
        Type typeMo15264a = interfaceC9060eM15309d.mo15264a();
        if (typeMo15264a == C0062y.class) {
            throw AbstractC9067h0.m15292n(method, "'" + AbstractC9067h0.m15286h(typeMo15264a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeMo15264a == C9057c0.class) {
            throw AbstractC9067h0.m15292n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (c9055b0.f15543d.equals("HEAD") && !Void.class.equals(typeMo15264a) && !AbstractC9067h0.m15291m(typeMo15264a)) {
            throw AbstractC9067h0.m15292n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        InterfaceC9066h interfaceC9066hM15310e = m15310e(c9059d0, method, typeMo15264a);
        InterfaceC0042e.a aVar = c9059d0.f15582b;
        return !z11 ? new a(c9055b0, aVar, interfaceC9066hM15310e, interfaceC9060eM15309d) : z9 ? new c(c9055b0, aVar, interfaceC9066hM15310e, interfaceC9060eM15309d) : new b(c9055b0, aVar, interfaceC9066hM15310e, interfaceC9060eM15309d, false, z10);
    }

    @Override // p226r9.AbstractC9061e0
    /* renamed from: a */
    public final Object mo15270a(Object obj, Object[] objArr) {
        return mo15312c(new C9079t(this.f15630a, obj, objArr, this.f15631b, this.f15632c), objArr);
    }

    /* renamed from: c */
    public abstract Object mo15312c(InterfaceC9058d interfaceC9058d, Object[] objArr);
}
