package p080j3;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p080j3.C3805a;
import p080j3.InterfaceC3809c;
import p080j3.InterfaceC3821i;
import p117r2.C4517t;
import p117r2.C4521x;
import p117r2.InterfaceC4502e;

/* renamed from: j3.e0 */
/* loaded from: classes2.dex */
public final class C3814e0 {

    /* renamed from: a */
    public final Map f4614a = new ConcurrentHashMap();

    /* renamed from: b */
    public final InterfaceC4502e.a f4615b;

    /* renamed from: c */
    public final C4517t f4616c;

    /* renamed from: d */
    public final List f4617d;

    /* renamed from: e */
    public final List f4618e;

    /* renamed from: f */
    public final Executor f4619f;

    /* renamed from: g */
    public final boolean f4620g;

    /* renamed from: j3.e0$a */
    public class a implements InvocationHandler {

        /* renamed from: a */
        public final C3806a0 f4621a = C3806a0.m4975f();

        /* renamed from: b */
        public final Object[] f4622b = new Object[0];

        /* renamed from: c */
        public final /* synthetic */ Class f4623c;

        public a(Class cls) {
            this.f4623c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f4622b;
            }
            return this.f4621a.m4981h(method) ? this.f4621a.mo4980g(method, this.f4623c, obj, objArr) : C3814e0.this.m5028c(method).mo5045a(objArr);
        }
    }

    public C3814e0(InterfaceC4502e.a aVar, C4517t c4517t, List list, List list2, Executor executor, boolean z3) {
        this.f4615b = aVar;
        this.f4616c = c4517t;
        this.f4617d = list;
        this.f4618e = list2;
        this.f4619f = executor;
        this.f4620g = z3;
    }

    /* renamed from: a */
    public InterfaceC3809c m5026a(Type type, Annotation[] annotationArr) {
        return m5029d(null, type, annotationArr);
    }

    /* renamed from: b */
    public Object m5027b(Class cls) throws SecurityException {
        m5035j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* renamed from: c */
    public AbstractC3816f0 m5028c(Method method) {
        AbstractC3816f0 abstractC3816f0M5044b;
        AbstractC3816f0 abstractC3816f0 = (AbstractC3816f0) this.f4614a.get(method);
        if (abstractC3816f0 != null) {
            return abstractC3816f0;
        }
        synchronized (this.f4614a) {
            abstractC3816f0M5044b = (AbstractC3816f0) this.f4614a.get(method);
            if (abstractC3816f0M5044b == null) {
                abstractC3816f0M5044b = AbstractC3816f0.m5044b(this, method);
                this.f4614a.put(method, abstractC3816f0M5044b);
            }
        }
        return abstractC3816f0M5044b;
    }

    /* renamed from: d */
    public InterfaceC3809c m5029d(InterfaceC3809c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f4618e.indexOf(aVar) + 1;
        int size = this.f4618e.size();
        for (int i4 = iIndexOf; i4 < size; i4++) {
            InterfaceC3809c interfaceC3809cMo5002a = ((InterfaceC3809c.a) this.f4618e.get(i4)).mo5002a(type, annotationArr, this);
            if (interfaceC3809cMo5002a != null) {
                return interfaceC3809cMo5002a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i5 = 0; i5 < iIndexOf; i5++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC3809c.a) this.f4618e.get(i5)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f4618e.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC3809c.a) this.f4618e.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public InterfaceC3821i m5030e(InterfaceC3821i.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f4617d.indexOf(aVar) + 1;
        int size = this.f4617d.size();
        for (int i4 = iIndexOf; i4 < size; i4++) {
            InterfaceC3821i interfaceC3821iMo4965c = ((InterfaceC3821i.a) this.f4617d.get(i4)).mo4965c(type, annotationArr, annotationArr2, this);
            if (interfaceC3821iMo4965c != null) {
                return interfaceC3821iMo4965c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i5 = 0; i5 < iIndexOf; i5++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC3821i.a) this.f4617d.get(i5)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f4617d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC3821i.a) this.f4617d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public InterfaceC3821i m5031f(InterfaceC3821i.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f4617d.indexOf(aVar) + 1;
        int size = this.f4617d.size();
        for (int i4 = iIndexOf; i4 < size; i4++) {
            InterfaceC3821i interfaceC3821iMo4966d = ((InterfaceC3821i.a) this.f4617d.get(i4)).mo4966d(type, annotationArr, this);
            if (interfaceC3821iMo4966d != null) {
                return interfaceC3821iMo4966d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i5 = 0; i5 < iIndexOf; i5++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC3821i.a) this.f4617d.get(i5)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f4617d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC3821i.a) this.f4617d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public InterfaceC3821i m5032g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m5030e(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: h */
    public InterfaceC3821i m5033h(Type type, Annotation[] annotationArr) {
        return m5031f(null, type, annotationArr);
    }

    /* renamed from: i */
    public InterfaceC3821i m5034i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f4617d.size();
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC3821i interfaceC3821iM5052e = ((InterfaceC3821i.a) this.f4617d.get(i4)).m5052e(type, annotationArr, this);
            if (interfaceC3821iM5052e != null) {
                return interfaceC3821iM5052e;
            }
        }
        return C3805a.d.f4553a;
    }

    /* renamed from: j */
    public final void m5035j(Class cls) throws SecurityException {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f4620g) {
            C3806a0 c3806a0M4975f = C3806a0.m4975f();
            for (Method method : cls.getDeclaredMethods()) {
                if (!c3806a0M4975f.m4981h(method) && !Modifier.isStatic(method.getModifiers())) {
                    m5028c(method);
                }
            }
        }
    }

    /* renamed from: j3.e0$b */
    public static final class b {

        /* renamed from: a */
        public final C3806a0 f4625a;

        /* renamed from: b */
        public InterfaceC4502e.a f4626b;

        /* renamed from: c */
        public C4517t f4627c;

        /* renamed from: d */
        public final List f4628d;

        /* renamed from: e */
        public final List f4629e;

        /* renamed from: f */
        public Executor f4630f;

        /* renamed from: g */
        public boolean f4631g;

        public b(C3806a0 c3806a0) {
            this.f4628d = new ArrayList();
            this.f4629e = new ArrayList();
            this.f4625a = c3806a0;
        }

        /* renamed from: a */
        public b m5036a(InterfaceC3809c.a aVar) {
            List list = this.f4629e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public b m5037b(InterfaceC3821i.a aVar) {
            List list = this.f4628d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: c */
        public b m5038c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return m5039d(C4517t.m5980h(str));
        }

        /* renamed from: d */
        public b m5039d(C4517t c4517t) {
            Objects.requireNonNull(c4517t, "baseUrl == null");
            if ("".equals(c4517t.m5991m().get(r0.size() - 1))) {
                this.f4627c = c4517t;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + c4517t);
        }

        /* renamed from: e */
        public C3814e0 m5040e() {
            if (this.f4627c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC4502e.a c4521x = this.f4626b;
            if (c4521x == null) {
                c4521x = new C4521x();
            }
            InterfaceC4502e.a aVar = c4521x;
            Executor executorMo4977b = this.f4630f;
            if (executorMo4977b == null) {
                executorMo4977b = this.f4625a.mo4977b();
            }
            Executor executor = executorMo4977b;
            ArrayList arrayList = new ArrayList(this.f4629e);
            arrayList.addAll(this.f4625a.m4976a(executor));
            ArrayList arrayList2 = new ArrayList(this.f4628d.size() + 1 + this.f4625a.m4979d());
            arrayList2.add(new C3805a());
            arrayList2.addAll(this.f4628d);
            arrayList2.addAll(this.f4625a.m4978c());
            return new C3814e0(aVar, this.f4627c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f4631g);
        }

        /* renamed from: f */
        public b m5041f(InterfaceC4502e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f4626b = aVar;
            return this;
        }

        /* renamed from: g */
        public b m5042g(C4521x c4521x) {
            Objects.requireNonNull(c4521x, "client == null");
            return m5041f(c4521x);
        }

        public b() {
            this(C3806a0.m4975f());
        }
    }
}
