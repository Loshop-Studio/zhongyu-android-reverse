package p122df;

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
import je.C9738r;
import je.C9742v;
import je.InterfaceC9725e;
import p122df.C9028b;
import p122df.InterfaceC9034e;
import p122df.InterfaceC9040h;

/* renamed from: df.d0 */
/* loaded from: classes6.dex */
public final class C9033d0 {

    /* renamed from: a */
    public final ConcurrentHashMap f21084a = new ConcurrentHashMap();

    /* renamed from: b */
    public final InterfaceC9725e.a f21085b;

    /* renamed from: c */
    public final C9738r f21086c;

    /* renamed from: d */
    public final List f21087d;

    /* renamed from: e */
    public final int f21088e;

    /* renamed from: f */
    public final List f21089f;

    /* renamed from: g */
    public final int f21090g;

    /* renamed from: h */
    public final Executor f21091h;

    /* renamed from: i */
    public final boolean f21092i;

    /* renamed from: df.d0$a */
    public class a implements InvocationHandler {

        /* renamed from: c */
        public final Object[] f21093c = new Object[0];

        /* renamed from: d */
        public final /* synthetic */ Class f21094d;

        public a(Class cls) {
            this.f21094d = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f21093c;
            }
            C9057x c9057x = AbstractC9056w.f21211b;
            return c9057x.mo17794c(method) ? c9057x.mo17793b(method, this.f21094d, obj, objArr) : C9033d0.this.m17713c(this.f21094d, method).mo17733a(obj, objArr);
        }
    }

    /* renamed from: df.d0$b */
    public static final class b {

        /* renamed from: a */
        public InterfaceC9725e.a f21096a;

        /* renamed from: b */
        public C9738r f21097b;

        /* renamed from: c */
        public final List f21098c = new ArrayList();

        /* renamed from: d */
        public final List f21099d = new ArrayList();

        /* renamed from: e */
        public Executor f21100e;

        /* renamed from: f */
        public boolean f21101f;

        /* renamed from: a */
        public b m17721a(InterfaceC9040h.a aVar) {
            List list = this.f21098c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public b m17722b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return m17723c(C9738r.m19412h(str));
        }

        /* renamed from: c */
        public b m17723c(C9738r c9738r) {
            Objects.requireNonNull(c9738r, "baseUrl == null");
            if ("".equals(c9738r.m19423m().get(r0.size() - 1))) {
                this.f21097b = c9738r;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + c9738r);
        }

        /* renamed from: d */
        public C9033d0 m17724d() {
            if (this.f21097b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC9725e.a c9742v = this.f21096a;
            if (c9742v == null) {
                c9742v = new C9742v();
            }
            InterfaceC9725e.a aVar = c9742v;
            Executor executor = this.f21100e;
            if (executor == null) {
                executor = AbstractC9056w.f21210a;
            }
            Executor executor2 = executor;
            C9030c c9030c = AbstractC9056w.f21212c;
            ArrayList arrayList = new ArrayList(this.f21099d);
            List listMo17700a = c9030c.mo17700a(executor2);
            arrayList.addAll(listMo17700a);
            List listMo17701b = c9030c.mo17701b();
            int size = listMo17701b.size();
            ArrayList arrayList2 = new ArrayList(this.f21098c.size() + 1 + size);
            arrayList2.add(new C9028b());
            arrayList2.addAll(this.f21098c);
            arrayList2.addAll(listMo17701b);
            return new C9033d0(aVar, this.f21097b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listMo17700a.size(), executor2, this.f21101f);
        }

        /* renamed from: e */
        public b m17725e(InterfaceC9725e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f21096a = aVar;
            return this;
        }

        /* renamed from: f */
        public b m17726f(C9742v c9742v) {
            Objects.requireNonNull(c9742v, "client == null");
            return m17725e(c9742v);
        }
    }

    public C9033d0(InterfaceC9725e.a aVar, C9738r c9738r, List list, int i10, List list2, int i11, Executor executor, boolean z10) {
        this.f21085b = aVar;
        this.f21086c = c9738r;
        this.f21087d = list;
        this.f21088e = i10;
        this.f21089f = list2;
        this.f21090g = i11;
        this.f21091h = executor;
        this.f21092i = z10;
    }

    /* renamed from: a */
    public InterfaceC9034e m17711a(Type type, Annotation[] annotationArr) {
        return m17714d(null, type, annotationArr);
    }

    /* renamed from: b */
    public Object m17712b(Class cls) throws SecurityException {
        m17720j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* renamed from: c */
    public AbstractC9035e0 m17713c(Class cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f21084a.get(method);
            if (objPutIfAbsent instanceof AbstractC9035e0) {
                return (AbstractC9035e0) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f21084a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                AbstractC9035e0 abstractC9035e0M17732b = AbstractC9035e0.m17732b(this, cls, method);
                                this.f21084a.put(method, abstractC9035e0M17732b);
                                return abstractC9035e0M17732b;
                            } catch (Throwable th) {
                                this.f21084a.remove(method);
                                throw th;
                            }
                        }
                    } finally {
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f21084a.get(method);
                    if (obj2 != null) {
                        return (AbstractC9035e0) obj2;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: d */
    public InterfaceC9034e m17714d(InterfaceC9034e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f21089f.indexOf(aVar) + 1;
        int size = this.f21089f.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC9034e interfaceC9034eMo17731a = ((InterfaceC9034e.a) this.f21089f.get(i10)).mo17731a(type, annotationArr, this);
            if (interfaceC9034eMo17731a != null) {
                return interfaceC9034eMo17731a;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((InterfaceC9034e.a) this.f21089f.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f21089f.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((InterfaceC9034e.a) this.f21089f.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: e */
    public InterfaceC9040h m17715e(InterfaceC9040h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f21087d.indexOf(aVar) + 1;
        int size = this.f21087d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC9040h interfaceC9040hRequestBodyConverter = ((InterfaceC9040h.a) this.f21087d.get(i10)).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (interfaceC9040hRequestBodyConverter != null) {
                return interfaceC9040hRequestBodyConverter;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((InterfaceC9040h.a) this.f21087d.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f21087d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((InterfaceC9040h.a) this.f21087d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: f */
    public InterfaceC9040h m17716f(InterfaceC9040h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f21087d.indexOf(aVar) + 1;
        int size = this.f21087d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC9040h interfaceC9040hResponseBodyConverter = ((InterfaceC9040h.a) this.f21087d.get(i10)).responseBodyConverter(type, annotationArr, this);
            if (interfaceC9040hResponseBodyConverter != null) {
                return interfaceC9040hResponseBodyConverter;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((InterfaceC9040h.a) this.f21087d.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f21087d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((InterfaceC9040h.a) this.f21087d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: g */
    public InterfaceC9040h m17717g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m17715e(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: h */
    public InterfaceC9040h m17718h(Type type, Annotation[] annotationArr) {
        return m17716f(null, type, annotationArr);
    }

    /* renamed from: i */
    public InterfaceC9040h m17719i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f21087d.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC9040h interfaceC9040hStringConverter = ((InterfaceC9040h.a) this.f21087d.get(i10)).stringConverter(type, annotationArr, this);
            if (interfaceC9040hStringConverter != null) {
                return interfaceC9040hStringConverter;
            }
        }
        return C9028b.d.f21040a;
    }

    /* renamed from: j */
    public final void m17720j(Class cls) throws SecurityException {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f21092i) {
            C9057x c9057x = AbstractC9056w.f21211b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!c9057x.mo17794c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    m17713c(cls, method);
                }
            }
        }
    }
}
