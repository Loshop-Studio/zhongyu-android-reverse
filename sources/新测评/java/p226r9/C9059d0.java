package p226r9;

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
import p011a9.C0055r;
import p011a9.C0059v;
import p011a9.InterfaceC0042e;
import p226r9.C9054b;
import p226r9.InterfaceC9060e;
import p226r9.InterfaceC9066h;

/* renamed from: r9.d0 */
/* loaded from: classes5.dex */
public final class C9059d0 {

    /* renamed from: a */
    public final ConcurrentHashMap f15581a = new ConcurrentHashMap();

    /* renamed from: b */
    public final InterfaceC0042e.a f15582b;

    /* renamed from: c */
    public final C0055r f15583c;

    /* renamed from: d */
    public final List f15584d;

    /* renamed from: e */
    public final int f15585e;

    /* renamed from: f */
    public final List f15586f;

    /* renamed from: g */
    public final int f15587g;

    /* renamed from: h */
    public final Executor f15588h;

    /* renamed from: i */
    public final boolean f15589i;

    /* renamed from: r9.d0$a */
    public class a implements InvocationHandler {

        /* renamed from: a */
        public final Object[] f15590a = new Object[0];

        /* renamed from: b */
        public final /* synthetic */ Class f15591b;

        public a(Class cls) {
            this.f15591b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f15590a;
            }
            C9083x c9083x = AbstractC9082w.f15708b;
            return c9083x.mo15334c(method) ? c9083x.mo15333b(method, this.f15591b, obj, objArr) : C9059d0.this.m15250c(this.f15591b, method).mo15270a(obj, objArr);
        }
    }

    /* renamed from: r9.d0$b */
    public static final class b {

        /* renamed from: a */
        public InterfaceC0042e.a f15593a;

        /* renamed from: b */
        public C0055r f15594b;

        /* renamed from: c */
        public final List f15595c = new ArrayList();

        /* renamed from: d */
        public final List f15596d = new ArrayList();

        /* renamed from: e */
        public Executor f15597e;

        /* renamed from: f */
        public boolean f15598f;

        /* renamed from: a */
        public b m15258a(InterfaceC9066h.a aVar) {
            List list = this.f15595c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public b m15259b(C0055r c0055r) {
            Objects.requireNonNull(c0055r, "baseUrl == null");
            if ("".equals(c0055r.m214m().get(r0.size() - 1))) {
                this.f15594b = c0055r;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + c0055r);
        }

        /* renamed from: c */
        public b m15260c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return m15259b(C0055r.m203h(str));
        }

        /* renamed from: d */
        public C9059d0 m15261d() {
            if (this.f15594b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC0042e.a c0059v = this.f15593a;
            if (c0059v == null) {
                c0059v = new C0059v();
            }
            InterfaceC0042e.a aVar = c0059v;
            Executor executor = this.f15597e;
            if (executor == null) {
                executor = AbstractC9082w.f15707a;
            }
            Executor executor2 = executor;
            C9056c c9056c = AbstractC9082w.f15709c;
            ArrayList arrayList = new ArrayList(this.f15596d);
            List listMo15238a = c9056c.mo15238a(executor2);
            arrayList.addAll(listMo15238a);
            List listMo15239b = c9056c.mo15239b();
            int size = listMo15239b.size();
            ArrayList arrayList2 = new ArrayList(this.f15595c.size() + 1 + size);
            arrayList2.add(new C9054b());
            arrayList2.addAll(this.f15595c);
            arrayList2.addAll(listMo15239b);
            return new C9059d0(aVar, this.f15594b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listMo15238a.size(), executor2, this.f15598f);
        }

        /* renamed from: e */
        public b m15262e(InterfaceC0042e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f15593a = aVar;
            return this;
        }

        /* renamed from: f */
        public b m15263f(C0059v c0059v) {
            Objects.requireNonNull(c0059v, "client == null");
            return m15262e(c0059v);
        }
    }

    public C9059d0(InterfaceC0042e.a aVar, C0055r c0055r, List list, int i10, List list2, int i11, Executor executor, boolean z9) {
        this.f15582b = aVar;
        this.f15583c = c0055r;
        this.f15584d = list;
        this.f15585e = i10;
        this.f15586f = list2;
        this.f15587g = i11;
        this.f15588h = executor;
        this.f15589i = z9;
    }

    /* renamed from: a */
    public InterfaceC9060e m15248a(Type type, Annotation[] annotationArr) {
        return m15251d(null, type, annotationArr);
    }

    /* renamed from: b */
    public Object m15249b(Class cls) throws SecurityException {
        m15257j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* renamed from: c */
    public AbstractC9061e0 m15250c(Class cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f15581a.get(method);
            if (objPutIfAbsent instanceof AbstractC9061e0) {
                return (AbstractC9061e0) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f15581a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                AbstractC9061e0 abstractC9061e0M15269b = AbstractC9061e0.m15269b(this, cls, method);
                                this.f15581a.put(method, abstractC9061e0M15269b);
                                return abstractC9061e0M15269b;
                            } catch (Throwable th) {
                                this.f15581a.remove(method);
                                throw th;
                            }
                        }
                    } finally {
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f15581a.get(method);
                    if (obj2 != null) {
                        return (AbstractC9061e0) obj2;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: d */
    public InterfaceC9060e m15251d(InterfaceC9060e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f15586f.indexOf(aVar) + 1;
        int size = this.f15586f.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC9060e interfaceC9060eMo15268a = ((InterfaceC9060e.a) this.f15586f.get(i10)).mo15268a(type, annotationArr, this);
            if (interfaceC9060eMo15268a != null) {
                return interfaceC9060eMo15268a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC9060e.a) this.f15586f.get(i11)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f15586f.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC9060e.a) this.f15586f.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public InterfaceC9066h m15252e(InterfaceC9066h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f15584d.indexOf(aVar) + 1;
        int size = this.f15584d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC9066h interfaceC9066hMo15218c = ((InterfaceC9066h.a) this.f15584d.get(i10)).mo15218c(type, annotationArr, annotationArr2, this);
            if (interfaceC9066hMo15218c != null) {
                return interfaceC9066hMo15218c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC9066h.a) this.f15584d.get(i11)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f15584d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC9066h.a) this.f15584d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public InterfaceC9066h m15253f(InterfaceC9066h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f15584d.indexOf(aVar) + 1;
        int size = this.f15584d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC9066h interfaceC9066hMo15219d = ((InterfaceC9066h.a) this.f15584d.get(i10)).mo15219d(type, annotationArr, this);
            if (interfaceC9066hMo15219d != null) {
                return interfaceC9066hMo15219d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC9066h.a) this.f15584d.get(i11)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f15584d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC9066h.a) this.f15584d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public InterfaceC9066h m15254g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m15252e(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: h */
    public InterfaceC9066h m15255h(Type type, Annotation[] annotationArr) {
        return m15253f(null, type, annotationArr);
    }

    /* renamed from: i */
    public InterfaceC9066h m15256i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f15584d.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC9066h interfaceC9066hM15278e = ((InterfaceC9066h.a) this.f15584d.get(i10)).m15278e(type, annotationArr, this);
            if (interfaceC9066hM15278e != null) {
                return interfaceC9066hM15278e;
            }
        }
        return C9054b.d.f15537a;
    }

    /* renamed from: j */
    public final void m15257j(Class cls) throws SecurityException {
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
        if (this.f15589i) {
            C9083x c9083x = AbstractC9082w.f15708b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!c9083x.mo15334c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    m15250c(cls, method);
                }
            }
        }
    }
}
