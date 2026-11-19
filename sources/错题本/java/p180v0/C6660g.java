package p180v0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: v0.g */
/* loaded from: classes2.dex */
public class C6660g {

    /* renamed from: a */
    public final LinkedHashMap f11235a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f11236b;

    /* renamed from: c */
    public long f11237c;

    public C6660g(long j7) {
        this.f11236b = j7;
    }

    /* renamed from: a */
    public final synchronized Object m6316a(Object obj) {
        return this.f11235a.get(obj);
    }

    /* renamed from: b */
    public int mo4797b(Object obj) {
        return 1;
    }

    /* renamed from: d */
    public final synchronized Object m6317d(Object obj, Object obj2) {
        long jMo4797b = mo4797b(obj2);
        if (jMo4797b >= this.f11236b) {
            mo4798c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f11237c += jMo4797b;
        }
        Object objPut = this.f11235a.put(obj, obj2);
        if (objPut != null) {
            this.f11237c -= mo4797b(objPut);
            if (!objPut.equals(obj2)) {
                mo4798c(obj, objPut);
            }
        }
        m6318e(this.f11236b);
        return objPut;
    }

    /* renamed from: e */
    public final synchronized void m6318e(long j7) {
        while (this.f11237c > j7) {
            Iterator it = this.f11235a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.f11237c -= mo4797b(value);
            Object key = entry.getKey();
            it.remove();
            mo4798c(key, value);
        }
    }

    /* renamed from: c */
    public void mo4798c(Object obj, Object obj2) {
    }
}
