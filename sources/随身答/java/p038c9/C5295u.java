package p038c9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: c9.u */
/* loaded from: classes5.dex */
public class C5295u {

    /* renamed from: c */
    public static final C5295u f2625c = m2484e();

    /* renamed from: a */
    public final boolean f2626a;

    /* renamed from: b */
    public final Constructor f2627b;

    /* renamed from: c9.u$a */
    public static final class a extends C5295u {

        /* renamed from: c9.u$a$a, reason: collision with other inner class name */
        public static final class ExecutorC10051a implements Executor {

            /* renamed from: a */
            public final Handler f2628a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f2628a.post(runnable);
            }
        }

        public a() {
            super(true);
        }

        @Override // p038c9.C5295u
        /* renamed from: b */
        public Executor mo2487b() {
            return new ExecutorC10051a();
        }

        @Override // p038c9.C5295u
        /* renamed from: g */
        public Object mo2490g(Method method, Class cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.mo2490g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public C5295u(boolean z9) throws NoSuchMethodException, SecurityException {
        this.f2626a = z9;
        Constructor declaredConstructor = null;
        if (z9) {
            try {
                declaredConstructor = AbstractC5289o.m2478a().getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f2627b = declaredConstructor;
    }

    /* renamed from: e */
    public static C5295u m2484e() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new C5295u(true);
    }

    /* renamed from: f */
    public static C5295u m2485f() {
        return f2625c;
    }

    /* renamed from: a */
    public List m2486a(Executor executor) {
        C5281g c5281g = new C5281g(executor);
        return this.f2626a ? Arrays.asList(C5279e.f2531a, c5281g) : Collections.singletonList(c5281g);
    }

    /* renamed from: b */
    public Executor mo2487b() {
        return null;
    }

    /* renamed from: c */
    public List m2488c() {
        return this.f2626a ? Collections.singletonList(C5287m.f2578a) : Collections.EMPTY_LIST;
    }

    /* renamed from: d */
    public int m2489d() {
        return this.f2626a ? 1 : 0;
    }

    /* renamed from: g */
    public Object mo2490g(Method method, Class cls, Object obj, Object... objArr) {
        Constructor constructor = this.f2627b;
        return (constructor != null ? AbstractC5290p.m2479a(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* renamed from: h */
    public boolean m2491h(Method method) {
        return this.f2626a && method.isDefault();
    }
}
