package p080j3;

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

/* renamed from: j3.a0 */
/* loaded from: classes2.dex */
public class C3806a0 {

    /* renamed from: c */
    public static final C3806a0 f4556c = m4974e();

    /* renamed from: a */
    public final boolean f4557a;

    /* renamed from: b */
    public final Constructor f4558b;

    /* renamed from: j3.a0$a */
    public static final class a extends C3806a0 {

        /* renamed from: j3.a0$a$a, reason: collision with other inner class name */
        public static final class ExecutorC4759a implements Executor {

            /* renamed from: a */
            public final Handler f4559a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f4559a.post(runnable);
            }
        }

        public a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // p080j3.C3806a0
        /* renamed from: b */
        public Executor mo4977b() {
            return new ExecutorC4759a();
        }

        @Override // p080j3.C3806a0
        /* renamed from: g */
        public Object mo4980g(Method method, Class cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.mo4980g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public C3806a0(boolean z3) throws NoSuchMethodException, SecurityException {
        this.f4557a = z3;
        Constructor declaredConstructor = null;
        if (z3) {
            try {
                declaredConstructor = AbstractC3833t.m5107a().getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f4558b = declaredConstructor;
    }

    /* renamed from: e */
    public static C3806a0 m4974e() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new C3806a0(true);
    }

    /* renamed from: f */
    public static C3806a0 m4975f() {
        return f4556c;
    }

    /* renamed from: a */
    public List m4976a(Executor executor) {
        C3823j c3823j = new C3823j(executor);
        return this.f4557a ? Arrays.asList(C3819h.f4632a, c3823j) : Collections.singletonList(c3823j);
    }

    /* renamed from: b */
    public Executor mo4977b() {
        return null;
    }

    /* renamed from: c */
    public List m4978c() {
        return this.f4557a ? Collections.singletonList(C3831r.f4687a) : Collections.emptyList();
    }

    /* renamed from: d */
    public int m4979d() {
        return this.f4557a ? 1 : 0;
    }

    /* renamed from: g */
    public Object mo4980g(Method method, Class cls, Object obj, Object... objArr) {
        Constructor constructor = this.f4558b;
        return (constructor != null ? AbstractC3835v.m5109a(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* renamed from: h */
    public boolean m4981h(Method method) {
        return this.f4557a && method.isDefault();
    }
}
