package p055f0;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: f0.j */
/* loaded from: classes2.dex */
public final class C5505j implements InterfaceC5502g {

    /* renamed from: b */
    public final Map f8519b;

    /* renamed from: c */
    public volatile Map f8520c;

    public C5505j(Map map) {
        this.f8519b = Collections.unmodifiableMap(map);
    }

    @Override // p055f0.InterfaceC5502g
    /* renamed from: a */
    public final Map mo4881a() {
        if (this.f8520c == null) {
            synchronized (this) {
                try {
                    if (this.f8520c == null) {
                        this.f8520c = Collections.unmodifiableMap(m4882b());
                    }
                } finally {
                }
            }
        }
        return this.f8520c;
    }

    /* renamed from: b */
    public final HashMap m4882b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f8519b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C5504i) list.get(i)).f8518a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5505j) {
            return this.f8519b.equals(((C5505j) obj).f8519b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8519b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f8519b + '}';
    }
}
