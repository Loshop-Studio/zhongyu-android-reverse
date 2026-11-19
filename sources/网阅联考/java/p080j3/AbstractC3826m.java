package p080j3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import p080j3.AbstractC3822i0;
import p117r2.C4496a0;
import p117r2.InterfaceC4502e;
import retrofit2.KotlinExtensions;

/* renamed from: j3.m */
/* loaded from: classes2.dex */
public abstract class AbstractC3826m extends AbstractC3816f0 {

    /* renamed from: a */
    public final C3810c0 f4662a;

    /* renamed from: b */
    public final InterfaceC4502e.a f4663b;

    /* renamed from: c */
    public final InterfaceC3821i f4664c;

    /* renamed from: j3.m$a */
    public static final class a extends AbstractC3826m {

        /* renamed from: d */
        public final InterfaceC3809c f4665d;

        public a(C3810c0 c3810c0, InterfaceC4502e.a aVar, InterfaceC3821i interfaceC3821i, InterfaceC3809c interfaceC3809c) {
            super(c3810c0, aVar, interfaceC3821i);
            this.f4665d = interfaceC3809c;
        }

        @Override // p080j3.AbstractC3826m
        /* renamed from: c */
        public Object mo5081c(InterfaceC3807b interfaceC3807b, Object[] objArr) {
            return this.f4665d.mo4998a(interfaceC3807b);
        }
    }

    /* renamed from: j3.m$b */
    public static final class b extends AbstractC3826m {

        /* renamed from: d */
        public final InterfaceC3809c f4666d;

        /* renamed from: e */
        public final boolean f4667e;

        public b(C3810c0 c3810c0, InterfaceC4502e.a aVar, InterfaceC3821i interfaceC3821i, InterfaceC3809c interfaceC3809c, boolean z3) {
            super(c3810c0, aVar, interfaceC3821i);
            this.f4666d = interfaceC3809c;
            this.f4667e = z3;
        }

        @Override // p080j3.AbstractC3826m
        /* renamed from: c */
        public Object mo5081c(InterfaceC3807b interfaceC3807b, Object[] objArr) {
            InterfaceC3807b interfaceC3807b2 = (InterfaceC3807b) this.f4666d.mo4998a(interfaceC3807b);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.f4667e ? KotlinExtensions.m6164b(interfaceC3807b2, continuation) : KotlinExtensions.m6163a(interfaceC3807b2, continuation);
            } catch (Exception e4) {
                return KotlinExtensions.m6166d(e4, continuation);
            }
        }
    }

    /* renamed from: j3.m$c */
    public static final class c extends AbstractC3826m {

        /* renamed from: d */
        public final InterfaceC3809c f4668d;

        public c(C3810c0 c3810c0, InterfaceC4502e.a aVar, InterfaceC3821i interfaceC3821i, InterfaceC3809c interfaceC3809c) {
            super(c3810c0, aVar, interfaceC3821i);
            this.f4668d = interfaceC3809c;
        }

        @Override // p080j3.AbstractC3826m
        /* renamed from: c */
        public Object mo5081c(InterfaceC3807b interfaceC3807b, Object[] objArr) {
            InterfaceC3807b interfaceC3807b2 = (InterfaceC3807b) this.f4668d.mo4998a(interfaceC3807b);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.m6165c(interfaceC3807b2, continuation);
            } catch (Exception e4) {
                return KotlinExtensions.m6166d(e4, continuation);
            }
        }
    }

    public AbstractC3826m(C3810c0 c3810c0, InterfaceC4502e.a aVar, InterfaceC3821i interfaceC3821i) {
        this.f4662a = c3810c0;
        this.f4663b = aVar;
        this.f4664c = interfaceC3821i;
    }

    /* renamed from: d */
    public static InterfaceC3809c m5078d(C3814e0 c3814e0, Method method, Type type, Annotation[] annotationArr) {
        try {
            return c3814e0.m5026a(type, annotationArr);
        } catch (RuntimeException e4) {
            throw AbstractC3822i0.m5066n(method, e4, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    public static InterfaceC3821i m5079e(C3814e0 c3814e0, Method method, Type type) {
        try {
            return c3814e0.m5033h(type, method.getAnnotations());
        } catch (RuntimeException e4) {
            throw AbstractC3822i0.m5066n(method, e4, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    public static AbstractC3826m m5080f(C3814e0 c3814e0, Method method, C3810c0 c3810c0) {
        Type genericReturnType;
        boolean z3;
        boolean z4 = c3810c0.f4585k;
        Annotation[] annotations = method.getAnnotations();
        if (z4) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeM5058f = AbstractC3822i0.m5058f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (AbstractC3822i0.m5060h(typeM5058f) == C3812d0.class && (typeM5058f instanceof ParameterizedType)) {
                typeM5058f = AbstractC3822i0.m5059g(0, (ParameterizedType) typeM5058f);
                z3 = true;
            } else {
                z3 = false;
            }
            genericReturnType = new AbstractC3822i0.b(null, InterfaceC3807b.class, typeM5058f);
            annotations = C3820h0.m5049a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z3 = false;
        }
        InterfaceC3809c interfaceC3809cM5078d = m5078d(c3814e0, method, genericReturnType, annotations);
        Type typeMo4999b = interfaceC3809cM5078d.mo4999b();
        if (typeMo4999b == C4496a0.class) {
            throw AbstractC3822i0.m5065m(method, "'" + AbstractC3822i0.m5060h(typeMo4999b).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeMo4999b == C3812d0.class) {
            throw AbstractC3822i0.m5065m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (c3810c0.f4577c.equals("HEAD") && !Void.class.equals(typeMo4999b)) {
            throw AbstractC3822i0.m5065m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        InterfaceC3821i interfaceC3821iM5079e = m5079e(c3814e0, method, typeMo4999b);
        InterfaceC4502e.a aVar = c3814e0.f4615b;
        return !z4 ? new a(c3810c0, aVar, interfaceC3821iM5079e, interfaceC3809cM5078d) : z3 ? new c(c3810c0, aVar, interfaceC3821iM5079e, interfaceC3809cM5078d) : new b(c3810c0, aVar, interfaceC3821iM5079e, interfaceC3809cM5078d, false);
    }

    @Override // p080j3.AbstractC3816f0
    /* renamed from: a */
    public final Object mo5045a(Object[] objArr) {
        return mo5081c(new C3828o(this.f4662a, objArr, this.f4663b, this.f4664c), objArr);
    }

    /* renamed from: c */
    public abstract Object mo5081c(InterfaceC3807b interfaceC3807b, Object[] objArr);
}
