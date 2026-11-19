package p200z5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import p058f5.C6362d0;
import p058f5.InterfaceC6363e;
import p200z5.AbstractC7967h0;
import retrofit2.KotlinExtensions;

/* renamed from: z5.r */
/* loaded from: classes4.dex */
public abstract class AbstractC7977r extends AbstractC7961e0 {

    /* renamed from: a */
    public final C7955b0 f10785a;

    /* renamed from: b */
    public final InterfaceC6363e.a f10786b;

    /* renamed from: c */
    public final InterfaceC7966h f10787c;

    /* renamed from: z5.r$a */
    public static final class a extends AbstractC7977r {

        /* renamed from: d */
        public final InterfaceC7960e f10788d;

        public a(C7955b0 c7955b0, InterfaceC6363e.a aVar, InterfaceC7966h interfaceC7966h, InterfaceC7960e interfaceC7960e) {
            super(c7955b0, aVar, interfaceC7966h);
            this.f10788d = interfaceC7960e;
        }

        @Override // p200z5.AbstractC7977r
        /* renamed from: c */
        public Object mo9854c(InterfaceC7958d interfaceC7958d, Object[] objArr) {
            return this.f10788d.mo9809b(interfaceC7958d);
        }
    }

    /* renamed from: z5.r$b */
    public static final class b extends AbstractC7977r {

        /* renamed from: d */
        public final InterfaceC7960e f10789d;

        /* renamed from: e */
        public final boolean f10790e;

        /* renamed from: f */
        public final boolean f10791f;

        public b(C7955b0 c7955b0, InterfaceC6363e.a aVar, InterfaceC7966h interfaceC7966h, InterfaceC7960e interfaceC7960e, boolean z6, boolean z7) {
            super(c7955b0, aVar, interfaceC7966h);
            this.f10789d = interfaceC7960e;
            this.f10790e = z6;
            this.f10791f = z7;
        }

        @Override // p200z5.AbstractC7977r
        /* renamed from: c */
        public Object mo9854c(InterfaceC7958d interfaceC7958d, Object[] objArr) {
            InterfaceC7958d interfaceC7958d2 = (InterfaceC7958d) this.f10789d.mo9809b(interfaceC7958d);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.f10791f ? KotlinExtensions.m9118d(interfaceC7958d2, continuation) : this.f10790e ? KotlinExtensions.m9116b(interfaceC7958d2, continuation) : KotlinExtensions.m9115a(interfaceC7958d2, continuation);
            } catch (LinkageError e6) {
                throw e6;
            } catch (ThreadDeath e7) {
                throw e7;
            } catch (VirtualMachineError e8) {
                throw e8;
            } catch (Throwable th) {
                return KotlinExtensions.m9119e(th, continuation);
            }
        }
    }

    /* renamed from: z5.r$c */
    public static final class c extends AbstractC7977r {

        /* renamed from: d */
        public final InterfaceC7960e f10792d;

        public c(C7955b0 c7955b0, InterfaceC6363e.a aVar, InterfaceC7966h interfaceC7966h, InterfaceC7960e interfaceC7960e) {
            super(c7955b0, aVar, interfaceC7966h);
            this.f10792d = interfaceC7960e;
        }

        @Override // p200z5.AbstractC7977r
        /* renamed from: c */
        public Object mo9854c(InterfaceC7958d interfaceC7958d, Object[] objArr) {
            InterfaceC7958d interfaceC7958d2 = (InterfaceC7958d) this.f10792d.mo9809b(interfaceC7958d);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.m9117c(interfaceC7958d2, continuation);
            } catch (Exception e6) {
                return KotlinExtensions.m9119e(e6, continuation);
            }
        }
    }

    public AbstractC7977r(C7955b0 c7955b0, InterfaceC6363e.a aVar, InterfaceC7966h interfaceC7966h) {
        this.f10785a = c7955b0;
        this.f10786b = aVar;
        this.f10787c = interfaceC7966h;
    }

    /* renamed from: d */
    public static InterfaceC7960e m9851d(C7959d0 c7959d0, Method method, Type type, Annotation[] annotationArr) {
        try {
            return c7959d0.m9792a(type, annotationArr);
        } catch (RuntimeException e6) {
            throw AbstractC7967h0.m9835o(method, e6, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    public static InterfaceC7966h m9852e(C7959d0 c7959d0, Method method, Type type) {
        try {
            return c7959d0.m9799h(type, method.getAnnotations());
        } catch (RuntimeException e6) {
            throw AbstractC7967h0.m9835o(method, e6, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    public static AbstractC7977r m9853f(C7959d0 c7959d0, Method method, C7955b0 c7955b0) {
        Type genericReturnType;
        boolean z6;
        boolean z7;
        boolean zM9833m;
        boolean z8 = c7955b0.f10706l;
        Annotation[] annotations = method.getAnnotations();
        if (z8) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeM9826f = AbstractC7967h0.m9826f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (AbstractC7967h0.m9828h(typeM9826f) == C7957c0.class && (typeM9826f instanceof ParameterizedType)) {
                typeM9826f = AbstractC7967h0.m9827g(0, (ParameterizedType) typeM9826f);
                zM9833m = false;
                z6 = true;
            } else {
                if (AbstractC7967h0.m9828h(typeM9826f) == InterfaceC7958d.class) {
                    throw AbstractC7967h0.m9834n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", AbstractC7967h0.m9827g(0, (ParameterizedType) typeM9826f));
                }
                zM9833m = AbstractC7967h0.m9833m(typeM9826f);
                z6 = false;
            }
            genericReturnType = new AbstractC7967h0.b(null, InterfaceC7958d.class, typeM9826f);
            annotations = C7965g0.m9817a(annotations);
            z7 = zM9833m;
        } else {
            genericReturnType = method.getGenericReturnType();
            z6 = false;
            z7 = false;
        }
        InterfaceC7960e interfaceC7960eM9851d = m9851d(c7959d0, method, genericReturnType, annotations);
        Type typeMo9808a = interfaceC7960eM9851d.mo9808a();
        if (typeMo9808a == C6362d0.class) {
            throw AbstractC7967h0.m9834n(method, "'" + AbstractC7967h0.m9828h(typeMo9808a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeMo9808a == C7957c0.class) {
            throw AbstractC7967h0.m9834n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (c7955b0.f10698d.equals("HEAD") && !Void.class.equals(typeMo9808a) && !AbstractC7967h0.m9833m(typeMo9808a)) {
            throw AbstractC7967h0.m9834n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        InterfaceC7966h interfaceC7966hM9852e = m9852e(c7959d0, method, typeMo9808a);
        InterfaceC6363e.a aVar = c7959d0.f10737b;
        return !z8 ? new a(c7955b0, aVar, interfaceC7966hM9852e, interfaceC7960eM9851d) : z6 ? new c(c7955b0, aVar, interfaceC7966hM9852e, interfaceC7960eM9851d) : new b(c7955b0, aVar, interfaceC7966hM9852e, interfaceC7960eM9851d, false, z7);
    }

    @Override // p200z5.AbstractC7961e0
    /* renamed from: a */
    public final Object mo9814a(Object obj, Object[] objArr) {
        return mo9854c(new C7979t(this.f10785a, obj, objArr, this.f10786b, this.f10787c), objArr);
    }

    /* renamed from: c */
    public abstract Object mo9854c(InterfaceC7958d interfaceC7958d, Object[] objArr);
}
