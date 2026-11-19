package ca;

import ca.C5278b;
import ca.InterfaceC5284e;
import ca.InterfaceC5290h;
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
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p136i9.C8897a0;
import p136i9.C8925w;
import p136i9.InterfaceC8904e;

/* renamed from: ca.d0 */
/* loaded from: classes5.dex */
public final class C5283d0 {

    /* renamed from: a */
    public final ConcurrentHashMap f2475a = new ConcurrentHashMap();

    /* renamed from: b */
    public final InterfaceC8904e.a f2476b;

    /* renamed from: c */
    public final C8925w f2477c;

    /* renamed from: d */
    public final List f2478d;

    /* renamed from: e */
    public final int f2479e;

    /* renamed from: f */
    public final List f2480f;

    /* renamed from: g */
    public final int f2481g;

    /* renamed from: h */
    public final Executor f2482h;

    /* renamed from: i */
    public final boolean f2483i;

    /* renamed from: ca.d0$a */
    public class a implements InvocationHandler {

        /* renamed from: a */
        public final Object[] f2484a = new Object[0];

        /* renamed from: b */
        public final /* synthetic */ Class f2485b;

        public a(Class cls) {
            this.f2485b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f2484a;
            }
            C5307x c5307x = AbstractC5306w.f2602b;
            return c5307x.mo2338c(method) ? c5307x.mo2337b(method, this.f2485b, obj, objArr) : C5283d0.this.m2252c(this.f2485b, method).mo2272a(obj, objArr);
        }
    }

    /* renamed from: ca.d0$b */
    public static final class b {

        /* renamed from: a */
        public InterfaceC8904e.a f2487a;

        /* renamed from: b */
        public C8925w f2488b;

        /* renamed from: c */
        public final List f2489c = new ArrayList();

        /* renamed from: d */
        public final List f2490d = new ArrayList();

        /* renamed from: e */
        public Executor f2491e;

        /* renamed from: f */
        public boolean f2492f;

        /* renamed from: a */
        public b m2260a(InterfaceC5290h.a aVar) {
            List list = this.f2489c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public b m2261b(C8925w c8925w) {
            Objects.requireNonNull(c8925w, "baseUrl == null");
            if ("".equals(c8925w.m15288l().get(r0.size() - 1))) {
                this.f2488b = c8925w;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + c8925w);
        }

        /* renamed from: c */
        public b m2262c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return m2261b(C8925w.m15277g(str));
        }

        /* renamed from: d */
        public C5283d0 m2263d() {
            if (this.f2488b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC8904e.a c8897a0 = this.f2487a;
            if (c8897a0 == null) {
                c8897a0 = new C8897a0();
            }
            InterfaceC8904e.a aVar = c8897a0;
            Executor executor = this.f2491e;
            if (executor == null) {
                executor = AbstractC5306w.f2601a;
            }
            Executor executor2 = executor;
            C5280c c5280c = AbstractC5306w.f2603c;
            ArrayList arrayList = new ArrayList(this.f2490d);
            List listMo2239a = c5280c.mo2239a(executor2);
            arrayList.addAll(listMo2239a);
            List listMo2240b = c5280c.mo2240b();
            int size = listMo2240b.size();
            ArrayList arrayList2 = new ArrayList(this.f2489c.size() + 1 + size);
            arrayList2.add(new C5278b());
            arrayList2.addAll(this.f2489c);
            arrayList2.addAll(listMo2240b);
            return new C5283d0(aVar, this.f2488b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listMo2239a.size(), executor2, this.f2492f);
        }

        /* renamed from: e */
        public b m2264e(InterfaceC8904e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f2487a = aVar;
            return this;
        }

        /* renamed from: f */
        public b m2265f(C8897a0 c8897a0) {
            Objects.requireNonNull(c8897a0, "client == null");
            return m2264e(c8897a0);
        }
    }

    public C5283d0(InterfaceC8904e.a aVar, C8925w c8925w, List list, int i10, List list2, int i11, Executor executor, boolean z10) {
        this.f2476b = aVar;
        this.f2477c = c8925w;
        this.f2478d = list;
        this.f2479e = i10;
        this.f2480f = list2;
        this.f2481g = i11;
        this.f2482h = executor;
        this.f2483i = z10;
    }

    /* renamed from: a */
    public InterfaceC5284e m2250a(Type type, Annotation[] annotationArr) {
        return m2253d(null, type, annotationArr);
    }

    /* renamed from: b */
    public Object m2251b(Class cls) throws SecurityException {
        m2259j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* renamed from: c */
    public AbstractC5285e0 m2252c(Class cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f2475a.get(method);
            if (objPutIfAbsent instanceof AbstractC5285e0) {
                return (AbstractC5285e0) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f2475a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                AbstractC5285e0 abstractC5285e0M2271b = AbstractC5285e0.m2271b(this, cls, method);
                                this.f2475a.put(method, abstractC5285e0M2271b);
                                return abstractC5285e0M2271b;
                            } catch (Throwable th) {
                                this.f2475a.remove(method);
                                throw th;
                            }
                        }
                    } finally {
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f2475a.get(method);
                    if (obj2 != null) {
                        return (AbstractC5285e0) obj2;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: d */
    public InterfaceC5284e m2253d(InterfaceC5284e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f2480f.indexOf(aVar) + 1;
        int size = this.f2480f.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC5284e interfaceC5284eMo2270a = ((InterfaceC5284e.a) this.f2480f.get(i10)).mo2270a(type, annotationArr, this);
            if (interfaceC5284eMo2270a != null) {
                return interfaceC5284eMo2270a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC5284e.a) this.f2480f.get(i11)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f2480f.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC5284e.a) this.f2480f.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public InterfaceC5290h m2254e(InterfaceC5290h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f2478d.indexOf(aVar) + 1;
        int size = this.f2478d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC5290h interfaceC5290hMo2219c = ((InterfaceC5290h.a) this.f2478d.get(i10)).mo2219c(type, annotationArr, annotationArr2, this);
            if (interfaceC5290hMo2219c != null) {
                return interfaceC5290hMo2219c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC5290h.a) this.f2478d.get(i11)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f2478d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC5290h.a) this.f2478d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public InterfaceC5290h m2255f(InterfaceC5290h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f2478d.indexOf(aVar) + 1;
        int size = this.f2478d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC5290h interfaceC5290hMo2220d = ((InterfaceC5290h.a) this.f2478d.get(i10)).mo2220d(type, annotationArr, this);
            if (interfaceC5290hMo2220d != null) {
                return interfaceC5290hMo2220d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC5290h.a) this.f2478d.get(i11)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f2478d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC5290h.a) this.f2478d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public InterfaceC5290h m2256g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m2254e(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: h */
    public InterfaceC5290h m2257h(Type type, Annotation[] annotationArr) {
        return m2255f(null, type, annotationArr);
    }

    /* renamed from: i */
    public InterfaceC5290h m2258i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f2478d.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC5290h interfaceC5290hM2280e = ((InterfaceC5290h.a) this.f2478d.get(i10)).m2280e(type, annotationArr, this);
            if (interfaceC5290hM2280e != null) {
                return interfaceC5290hM2280e;
            }
        }
        return C5278b.d.f2431a;
    }

    /* renamed from: j */
    public final void m2259j(Class cls) throws SecurityException {
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
        if (this.f2483i) {
            C5307x c5307x = AbstractC5306w.f2602b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!c5307x.mo2338c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    m2252c(cls, method);
                }
            }
        }
    }
}
