package p200z5;

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
import p058f5.C6356a0;
import p058f5.C6384w;
import p058f5.InterfaceC6363e;
import p200z5.C7954b;
import p200z5.InterfaceC7960e;
import p200z5.InterfaceC7966h;

/* renamed from: z5.d0 */
/* loaded from: classes4.dex */
public final class C7959d0 {

    /* renamed from: a */
    public final ConcurrentHashMap f10736a = new ConcurrentHashMap();

    /* renamed from: b */
    public final InterfaceC6363e.a f10737b;

    /* renamed from: c */
    public final C6384w f10738c;

    /* renamed from: d */
    public final List f10739d;

    /* renamed from: e */
    public final int f10740e;

    /* renamed from: f */
    public final List f10741f;

    /* renamed from: g */
    public final int f10742g;

    /* renamed from: h */
    public final Executor f10743h;

    /* renamed from: i */
    public final boolean f10744i;

    /* renamed from: z5.d0$a */
    public class a implements InvocationHandler {

        /* renamed from: a */
        public final Object[] f10745a = new Object[0];

        /* renamed from: b */
        public final /* synthetic */ Class f10746b;

        public a(Class cls) {
            this.f10746b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f10745a;
            }
            C7983x c7983x = AbstractC7982w.f10863b;
            return c7983x.mo9876c(method) ? c7983x.mo9875b(method, this.f10746b, obj, objArr) : C7959d0.this.m9794c(this.f10746b, method).mo9814a(obj, objArr);
        }
    }

    /* renamed from: z5.d0$b */
    public static final class b {

        /* renamed from: a */
        public InterfaceC6363e.a f10748a;

        /* renamed from: b */
        public C6384w f10749b;

        /* renamed from: c */
        public final List f10750c = new ArrayList();

        /* renamed from: d */
        public final List f10751d = new ArrayList();

        /* renamed from: e */
        public Executor f10752e;

        /* renamed from: f */
        public boolean f10753f;

        /* renamed from: a */
        public b m9802a(InterfaceC7966h.a aVar) {
            List list = this.f10750c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public b m9803b(C6384w c6384w) {
            Objects.requireNonNull(c6384w, "baseUrl == null");
            if ("".equals(c6384w.m6827l().get(r0.size() - 1))) {
                this.f10749b = c6384w;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + c6384w);
        }

        /* renamed from: c */
        public b m9804c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return m9803b(C6384w.m6816g(str));
        }

        /* renamed from: d */
        public C7959d0 m9805d() {
            if (this.f10749b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC6363e.a c6356a0 = this.f10748a;
            if (c6356a0 == null) {
                c6356a0 = new C6356a0();
            }
            InterfaceC6363e.a aVar = c6356a0;
            Executor executor = this.f10752e;
            if (executor == null) {
                executor = AbstractC7982w.f10862a;
            }
            Executor executor2 = executor;
            C7956c c7956c = AbstractC7982w.f10864c;
            ArrayList arrayList = new ArrayList(this.f10751d);
            List listMo9781a = c7956c.mo9781a(executor2);
            arrayList.addAll(listMo9781a);
            List listMo9782b = c7956c.mo9782b();
            int size = listMo9782b.size();
            ArrayList arrayList2 = new ArrayList(this.f10750c.size() + 1 + size);
            arrayList2.add(new C7954b());
            arrayList2.addAll(this.f10750c);
            arrayList2.addAll(listMo9782b);
            return new C7959d0(aVar, this.f10749b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listMo9781a.size(), executor2, this.f10753f);
        }

        /* renamed from: e */
        public b m9806e(InterfaceC6363e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f10748a = aVar;
            return this;
        }

        /* renamed from: f */
        public b m9807f(C6356a0 c6356a0) {
            Objects.requireNonNull(c6356a0, "client == null");
            return m9806e(c6356a0);
        }
    }

    public C7959d0(InterfaceC6363e.a aVar, C6384w c6384w, List list, int i6, List list2, int i7, Executor executor, boolean z6) {
        this.f10737b = aVar;
        this.f10738c = c6384w;
        this.f10739d = list;
        this.f10740e = i6;
        this.f10741f = list2;
        this.f10742g = i7;
        this.f10743h = executor;
        this.f10744i = z6;
    }

    /* renamed from: a */
    public InterfaceC7960e m9792a(Type type, Annotation[] annotationArr) {
        return m9795d(null, type, annotationArr);
    }

    /* renamed from: b */
    public Object m9793b(Class cls) throws SecurityException {
        m9801j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* renamed from: c */
    public AbstractC7961e0 m9794c(Class cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f10736a.get(method);
            if (objPutIfAbsent instanceof AbstractC7961e0) {
                return (AbstractC7961e0) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f10736a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                AbstractC7961e0 abstractC7961e0M9813b = AbstractC7961e0.m9813b(this, cls, method);
                                this.f10736a.put(method, abstractC7961e0M9813b);
                                return abstractC7961e0M9813b;
                            } catch (Throwable th) {
                                this.f10736a.remove(method);
                                throw th;
                            }
                        }
                    } finally {
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f10736a.get(method);
                    if (obj2 != null) {
                        return (AbstractC7961e0) obj2;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: d */
    public InterfaceC7960e m9795d(InterfaceC7960e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f10741f.indexOf(aVar) + 1;
        int size = this.f10741f.size();
        for (int i6 = iIndexOf; i6 < size; i6++) {
            InterfaceC7960e interfaceC7960eMo9812a = ((InterfaceC7960e.a) this.f10741f.get(i6)).mo9812a(type, annotationArr, this);
            if (interfaceC7960eMo9812a != null) {
                return interfaceC7960eMo9812a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i7 = 0; i7 < iIndexOf; i7++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC7960e.a) this.f10741f.get(i7)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f10741f.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC7960e.a) this.f10741f.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public InterfaceC7966h m9796e(InterfaceC7966h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f10739d.indexOf(aVar) + 1;
        int size = this.f10739d.size();
        for (int i6 = iIndexOf; i6 < size; i6++) {
            InterfaceC7966h interfaceC7966hMo28c = ((InterfaceC7966h.a) this.f10739d.get(i6)).mo28c(type, annotationArr, annotationArr2, this);
            if (interfaceC7966hMo28c != null) {
                return interfaceC7966hMo28c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i7 = 0; i7 < iIndexOf; i7++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC7966h.a) this.f10739d.get(i7)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f10739d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC7966h.a) this.f10739d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public InterfaceC7966h m9797f(InterfaceC7966h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f10739d.indexOf(aVar) + 1;
        int size = this.f10739d.size();
        for (int i6 = iIndexOf; i6 < size; i6++) {
            InterfaceC7966h interfaceC7966hMo29d = ((InterfaceC7966h.a) this.f10739d.get(i6)).mo29d(type, annotationArr, this);
            if (interfaceC7966hMo29d != null) {
                return interfaceC7966hMo29d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i7 = 0; i7 < iIndexOf; i7++) {
                sb.append("\n   * ");
                sb.append(((InterfaceC7966h.a) this.f10739d.get(i7)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f10739d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((InterfaceC7966h.a) this.f10739d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public InterfaceC7966h m9798g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m9796e(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: h */
    public InterfaceC7966h m9799h(Type type, Annotation[] annotationArr) {
        return m9797f(null, type, annotationArr);
    }

    /* renamed from: i */
    public InterfaceC7966h m9800i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f10739d.size();
        for (int i6 = 0; i6 < size; i6++) {
            InterfaceC7966h interfaceC7966hM9820e = ((InterfaceC7966h.a) this.f10739d.get(i6)).m9820e(type, annotationArr, this);
            if (interfaceC7966hM9820e != null) {
                return interfaceC7966hM9820e;
            }
        }
        return C7954b.d.f10692a;
    }

    /* renamed from: j */
    public final void m9801j(Class cls) throws SecurityException {
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
        if (this.f10744i) {
            C7983x c7983x = AbstractC7982w.f10863b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!c7983x.mo9876c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    m9794c(cls, method);
                }
            }
        }
    }
}
