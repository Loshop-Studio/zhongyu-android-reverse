package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.b0 */
/* loaded from: classes6.dex */
public class C9958b0 {

    /* renamed from: a */
    public final ArrayList f23408a;

    public C9958b0(int i10) {
        this.f23408a = new ArrayList(i10);
    }

    /* renamed from: a */
    public void m20246a(Object obj) {
        this.f23408a.add(obj);
    }

    /* renamed from: b */
    public void m20247b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f23408a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f23408a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f23408a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f23408a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f23408a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* renamed from: c */
    public int m20248c() {
        return this.f23408a.size();
    }

    /* renamed from: d */
    public Object[] m20249d(Object[] objArr) {
        return this.f23408a.toArray(objArr);
    }
}
