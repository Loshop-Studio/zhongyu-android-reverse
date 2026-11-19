package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6330r;
import okhttp3.InterfaceC6290d;
import p153r7.C6481c;
import p178u7.AbstractC6634h;

/* renamed from: retrofit2.p0 */
/* loaded from: classes4.dex */
public final class C6513p0 {

    /* renamed from: a */
    public final Object f10770a;

    /* renamed from: b */
    public Object f10771b;

    /* renamed from: c */
    public Object f10772c;

    /* renamed from: d */
    public Object f10773d;

    /* renamed from: e */
    public Object f10774e;

    /* renamed from: f */
    public Object f10775f;

    public C6513p0(InterfaceC6290d interfaceC6290d, C6330r c6330r, List list, List list2, Executor executor) {
        this.f10770a = new ConcurrentHashMap();
        this.f10771b = interfaceC6290d;
        this.f10772c = c6330r;
        this.f10773d = list;
        this.f10774e = list2;
        this.f10775f = executor;
    }

    /* renamed from: a */
    public InterfaceC6494g m6154a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f10774e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC6494g interfaceC6494gMo2174a = ((AbstractC6492f) list.get(i)).mo2174a(type, annotationArr);
            if (interfaceC6494gMo2174a != null) {
                return interfaceC6494gMo2174a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC6492f) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public Object m6155b(Class cls) {
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
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C6511o0(this, cls));
    }

    /* renamed from: c */
    public InterfaceC6506m m6156c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f10773d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC6506m interfaceC6506mMo4819a = ((AbstractC6504l) list.get(i)).mo4819a(type);
            if (interfaceC6506mMo4819a != null) {
                return interfaceC6506mMo4819a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC6504l) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public InterfaceC6506m m6157d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f10773d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC6506m interfaceC6506mMo4820b = ((AbstractC6504l) list.get(i)).mo4820b(type, annotationArr, this);
            if (interfaceC6506mMo4820b != null) {
                return interfaceC6506mMo4820b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC6504l) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public void m6158e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f10773d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC6504l) list.get(i)).getClass();
        }
    }

    public C6513p0(C6481c taskRunner) {
        AbstractC5830k.m5330g(taskRunner, "taskRunner");
        this.f10770a = taskRunner;
        this.f10775f = AbstractC6634h.f11123a;
    }
}
