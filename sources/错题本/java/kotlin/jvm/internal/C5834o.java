package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.text.AbstractC5855p;
import okhttp3.AbstractC6326o;
import okhttp3.C6329q;
import p120n0.C6208b;
import p139p7.AbstractC6396c;
import p141q0.C6409d;
import p202y.InterfaceC6765h;

/* renamed from: kotlin.jvm.internal.o */
/* loaded from: classes2.dex */
public final class C5834o {

    /* renamed from: a */
    public final ArrayList f9224a;

    public C5834o(int i, boolean z8) {
        switch (i) {
            case 2:
                this.f9224a = new ArrayList(20);
                break;
            case 3:
                this.f9224a = new ArrayList();
                break;
            case 4:
                this.f9224a = new ArrayList();
                break;
            case 5:
                this.f9224a = new ArrayList();
                break;
            default:
                this.f9224a = new ArrayList();
                break;
        }
    }

    /* renamed from: a */
    public void m5343a(Object obj) {
        this.f9224a.add(obj);
    }

    /* renamed from: b */
    public void m5344b(String name, String value) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(value, "value");
        AbstractC6326o.m5952b(name);
        AbstractC6326o.m5953c(value, name);
        m5345c(name, value);
    }

    /* renamed from: c */
    public void m5345c(String name, String value) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(value, "value");
        ArrayList arrayList = this.f9224a;
        arrayList.add(name);
        arrayList.add(AbstractC5855p.m5403k0(value).toString());
    }

    /* renamed from: d */
    public void m5346d(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z8 = obj instanceof Object[];
        ArrayList arrayList = this.f9224a;
        if (z8) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    /* renamed from: e */
    public void m5347e(String name, String value) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(value, "value");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = name.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(AbstractC6396c.m6047g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), name).toString());
            }
        }
        m5345c(name, value);
    }

    /* renamed from: f */
    public C6329q m5348f() {
        return new C6329q((String[]) this.f9224a.toArray(new String[0]));
    }

    /* renamed from: g */
    public synchronized InterfaceC6765h m5349g(Class cls) {
        int size = this.f9224a.size();
        for (int i = 0; i < size; i++) {
            C6409d c6409d = (C6409d) this.f9224a.get(i);
            if (c6409d.f10522a.isAssignableFrom(cls)) {
                return c6409d.f10523b;
            }
        }
        return null;
    }

    /* renamed from: h */
    public synchronized ArrayList m5350h(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.f9224a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            C6208b c6208b = (C6208b) obj;
            if (c6208b.f9925a.isAssignableFrom(cls) && cls2.isAssignableFrom(c6208b.f9926b)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public void m5351i(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9224a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public C5834o(int i) {
        this.f9224a = new ArrayList(i);
    }
}
