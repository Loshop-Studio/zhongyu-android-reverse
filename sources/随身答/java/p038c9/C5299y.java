package p038c9;

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
import p038c9.C5272a;
import p038c9.InterfaceC5276c;
import p038c9.InterfaceC5280f;
import p172l8.C8919r;
import p172l8.C8923v;
import p172l8.InterfaceC8906e;

/* renamed from: c9.y */
/* loaded from: classes5.dex */
public final class C5299y {

    /* renamed from: a */
    public final Map f2683a = new ConcurrentHashMap();

    /* renamed from: b */
    public final InterfaceC8906e.a f2684b;

    /* renamed from: c */
    public final C8919r f2685c;

    /* renamed from: d */
    public final List f2686d;

    /* renamed from: e */
    public final List f2687e;

    /* renamed from: f */
    public final Executor f2688f;

    /* renamed from: g */
    public final boolean f2689g;

    /* renamed from: c9.y$a */
    public class a implements InvocationHandler {

        /* renamed from: a */
        public final C5295u f2690a = C5295u.m2485f();

        /* renamed from: b */
        public final Object[] f2691b = new Object[0];

        /* renamed from: c */
        public final /* synthetic */ Class f2692c;

        public a(Class cls) {
            this.f2692c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f2691b;
            }
            return this.f2690a.m2491h(method) ? this.f2690a.mo2490g(method, this.f2692c, obj, objArr) : C5299y.this.m2528c(method).mo2456a(objArr);
        }
    }

    public C5299y(InterfaceC8906e.a aVar, C8919r c8919r, List list, List list2, Executor executor, boolean z9) {
        this.f2684b = aVar;
        this.f2685c = c8919r;
        this.f2686d = list;
        this.f2687e = list2;
        this.f2688f = executor;
        this.f2689g = z9;
    }

    /* renamed from: a */
    public InterfaceC5276c m2526a(Type type, Annotation[] annotationArr) {
        return m2529d(null, type, annotationArr);
    }

    /* renamed from: b */
    public Object m2527b(Class cls) throws SecurityException {
        m2535j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* renamed from: c */
    public AbstractC5300z m2528c(Method method) {
        AbstractC5300z abstractC5300zM2543b;
        AbstractC5300z abstractC5300z = (AbstractC5300z) this.f2683a.get(method);
        if (abstractC5300z != null) {
            return abstractC5300z;
        }
        synchronized (this.f2683a) {
            try {
                abstractC5300zM2543b = (AbstractC5300z) this.f2683a.get(method);
                if (abstractC5300zM2543b == null) {
                    abstractC5300zM2543b = AbstractC5300z.m2543b(this, method);
                    this.f2683a.put(method, abstractC5300zM2543b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC5300zM2543b;
    }

    /* renamed from: d */
    public InterfaceC5276c m2529d(InterfaceC5276c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f2687e.indexOf(aVar) + 1;
        int size = this.f2687e.size();
        for (int i9 = iIndexOf; i9 < size; i9++) {
            InterfaceC5276c interfaceC5276cMo231a = ((InterfaceC5276c.a) this.f2687e.get(i9)).mo231a(type, annotationArr, this);
            if (interfaceC5276cMo231a != null) {
                return interfaceC5276cMo231a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i10 = 0; i10 < iIndexOf; i10++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC5276c.a) this.f2687e.get(i10)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f2687e.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC5276c.a) this.f2687e.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public InterfaceC5280f m2530e(InterfaceC5280f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f2686d.indexOf(aVar) + 1;
        int size = this.f2686d.size();
        for (int i9 = iIndexOf; i9 < size; i9++) {
            InterfaceC5280f interfaceC5280fMo2414c = ((InterfaceC5280f.a) this.f2686d.get(i9)).mo2414c(type, annotationArr, annotationArr2, this);
            if (interfaceC5280fMo2414c != null) {
                return interfaceC5280fMo2414c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i10 = 0; i10 < iIndexOf; i10++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC5280f.a) this.f2686d.get(i10)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f2686d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC5280f.a) this.f2686d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public InterfaceC5280f m2531f(InterfaceC5280f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f2686d.indexOf(aVar) + 1;
        int size = this.f2686d.size();
        for (int i9 = iIndexOf; i9 < size; i9++) {
            InterfaceC5280f interfaceC5280fMo2415d = ((InterfaceC5280f.a) this.f2686d.get(i9)).mo2415d(type, annotationArr, this);
            if (interfaceC5280fMo2415d != null) {
                return interfaceC5280fMo2415d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i10 = 0; i10 < iIndexOf; i10++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC5280f.a) this.f2686d.get(i10)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f2686d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC5280f.a) this.f2686d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public InterfaceC5280f m2532g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m2530e(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: h */
    public InterfaceC5280f m2533h(Type type, Annotation[] annotationArr) {
        return m2531f(null, type, annotationArr);
    }

    /* renamed from: i */
    public InterfaceC5280f m2534i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f2686d.size();
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC5280f interfaceC5280fM2449e = ((InterfaceC5280f.a) this.f2686d.get(i9)).m2449e(type, annotationArr, this);
            if (interfaceC5280fM2449e != null) {
                return interfaceC5280fM2449e;
            }
        }
        return C5272a.d.f2520a;
    }

    /* renamed from: j */
    public final void m2535j(Class cls) throws SecurityException {
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
        if (this.f2689g) {
            C5295u c5295uM2485f = C5295u.m2485f();
            for (Method method : cls.getDeclaredMethods()) {
                if (!c5295uM2485f.m2491h(method) && !Modifier.isStatic(method.getModifiers())) {
                    m2528c(method);
                }
            }
        }
    }

    /* renamed from: c9.y$b */
    public static final class b {

        /* renamed from: a */
        public final C5295u f2694a;

        /* renamed from: b */
        public InterfaceC8906e.a f2695b;

        /* renamed from: c */
        public C8919r f2696c;

        /* renamed from: d */
        public final List f2697d;

        /* renamed from: e */
        public final List f2698e;

        /* renamed from: f */
        public Executor f2699f;

        /* renamed from: g */
        public boolean f2700g;

        public b(C5295u c5295u) {
            this.f2697d = new ArrayList();
            this.f2698e = new ArrayList();
            this.f2694a = c5295u;
        }

        /* renamed from: a */
        public b m2536a(InterfaceC5276c.a aVar) {
            List list = this.f2698e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public b m2537b(InterfaceC5280f.a aVar) {
            List list = this.f2697d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: c */
        public b m2538c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return m2539d(C8919r.m13959h(str));
        }

        /* renamed from: d */
        public b m2539d(C8919r c8919r) {
            Objects.requireNonNull(c8919r, "baseUrl == null");
            if ("".equals(c8919r.m13970m().get(r0.size() - 1))) {
                this.f2696c = c8919r;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + c8919r);
        }

        /* renamed from: e */
        public C5299y m2540e() {
            if (this.f2696c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC8906e.a c8923v = this.f2695b;
            if (c8923v == null) {
                c8923v = new C8923v();
            }
            InterfaceC8906e.a aVar = c8923v;
            Executor executorMo2487b = this.f2699f;
            if (executorMo2487b == null) {
                executorMo2487b = this.f2694a.mo2487b();
            }
            Executor executor = executorMo2487b;
            ArrayList arrayList = new ArrayList(this.f2698e);
            arrayList.addAll(this.f2694a.m2486a(executor));
            ArrayList arrayList2 = new ArrayList(this.f2697d.size() + 1 + this.f2694a.m2489d());
            arrayList2.add(new C5272a());
            arrayList2.addAll(this.f2697d);
            arrayList2.addAll(this.f2694a.m2488c());
            return new C5299y(aVar, this.f2696c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f2700g);
        }

        /* renamed from: f */
        public b m2541f(InterfaceC8906e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f2695b = aVar;
            return this;
        }

        /* renamed from: g */
        public b m2542g(C8923v c8923v) {
            Objects.requireNonNull(c8923v, "client == null");
            return m2541f(c8923v);
        }

        public b() {
            this(C5295u.m2485f());
        }
    }
}
