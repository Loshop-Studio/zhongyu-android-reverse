package p254n0;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: n0.k */
/* loaded from: classes3.dex */
public final class C10297k implements InterfaceC10295i {

    /* renamed from: c */
    public final Map f24523c;

    /* renamed from: d */
    public volatile Map f24524d;

    /* renamed from: n0.k$a */
    public static final class a {

        /* renamed from: d */
        public static final String f24525d;

        /* renamed from: e */
        public static final Map f24526e;

        /* renamed from: a */
        public boolean f24527a = true;

        /* renamed from: b */
        public Map f24528b = f24526e;

        /* renamed from: c */
        public boolean f24529c = true;

        static {
            String strM21468b = m21468b();
            f24525d = strM21468b;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM21468b)) {
                map.put(HttpHeaders.USER_AGENT, Collections.singletonList(new b(strM21468b)));
            }
            f24526e = Collections.unmodifiableMap(map);
        }

        /* renamed from: b */
        public static String m21468b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        /* renamed from: a */
        public C10297k m21469a() {
            this.f24527a = true;
            return new C10297k(this.f24528b);
        }
    }

    /* renamed from: n0.k$b */
    public static final class b implements InterfaceC10296j {

        /* renamed from: a */
        public final String f24530a;

        public b(String str) {
            this.f24530a = str;
        }

        @Override // p254n0.InterfaceC10296j
        /* renamed from: a */
        public String mo21465a() {
            return this.f24530a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f24530a.equals(((b) obj).f24530a);
            }
            return false;
        }

        public int hashCode() {
            return this.f24530a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f24530a + "'}";
        }
    }

    public C10297k(Map map) {
        this.f24523c = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final String m21466a(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strMo21465a = ((InterfaceC10296j) list.get(i10)).mo21465a();
            if (!TextUtils.isEmpty(strMo21465a)) {
                sb2.append(strMo21465a);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public final Map m21467b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f24523c.entrySet()) {
            String strM21466a = m21466a((List) entry.getValue());
            if (!TextUtils.isEmpty(strM21466a)) {
                map.put(entry.getKey(), strM21466a);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10297k) {
            return this.f24523c.equals(((C10297k) obj).f24523c);
        }
        return false;
    }

    @Override // p254n0.InterfaceC10295i
    public Map getHeaders() {
        if (this.f24524d == null) {
            synchronized (this) {
                try {
                    if (this.f24524d == null) {
                        this.f24524d = Collections.unmodifiableMap(m21467b());
                    }
                } finally {
                }
            }
        }
        return this.f24524d;
    }

    public int hashCode() {
        return this.f24523c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f24523c + '}';
    }
}
