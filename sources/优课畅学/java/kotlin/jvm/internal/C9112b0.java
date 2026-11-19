package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.b0 */
/* loaded from: classes5.dex */
public class C9112b0 {

    /* renamed from: a */
    public final ArrayList f17479a;

    public C9112b0(int i10) {
        this.f17479a = new ArrayList(i10);
    }

    /* renamed from: a */
    public void m16088a(Object obj) {
        this.f17479a.add(obj);
    }

    /* renamed from: b */
    public void m16089b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f17479a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f17479a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f17479a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f17479a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f17479a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* renamed from: c */
    public int m16090c() {
        return this.f17479a.size();
    }

    /* renamed from: d */
    public Object[] m16091d(Object[] objArr) {
        return this.f17479a.toArray(objArr);
    }
}
