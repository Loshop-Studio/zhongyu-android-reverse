package p110q;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: q.j */
/* loaded from: classes2.dex */
public final class C4461j implements InterfaceC4459h {

    /* renamed from: c */
    public final Map f5174c;

    /* renamed from: d */
    public volatile Map f5175d;

    /* renamed from: q.j$a */
    public static final class a {

        /* renamed from: d */
        public static final String f5176d;

        /* renamed from: e */
        public static final Map f5177e;

        /* renamed from: a */
        public boolean f5178a = true;

        /* renamed from: b */
        public Map f5179b = f5177e;

        /* renamed from: c */
        public boolean f5180c = true;

        static {
            String strM5709b = m5709b();
            f5176d = strM5709b;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM5709b)) {
                map.put("User-Agent", Collections.singletonList(new b(strM5709b)));
            }
            f5177e = Collections.unmodifiableMap(map);
        }

        /* renamed from: b */
        public static String m5709b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i4 = 0; i4 < length; i4++) {
                char cCharAt = property.charAt(i4);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C4461j m5710a() {
            this.f5178a = true;
            return new C4461j(this.f5179b);
        }
    }

    /* renamed from: q.j$b */
    public static final class b implements InterfaceC4460i {

        /* renamed from: a */
        public final String f5181a;

        public b(String str) {
            this.f5181a = str;
        }

        @Override // p110q.InterfaceC4460i
        /* renamed from: a */
        public String mo5706a() {
            return this.f5181a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f5181a.equals(((b) obj).f5181a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5181a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f5181a + "'}";
        }
    }

    public C4461j(Map map) {
        this.f5174c = Collections.unmodifiableMap(map);
    }

    @Override // p110q.InterfaceC4459h
    /* renamed from: a */
    public Map mo5705a() {
        if (this.f5175d == null) {
            synchronized (this) {
                if (this.f5175d == null) {
                    this.f5175d = Collections.unmodifiableMap(m5708c());
                }
            }
        }
        return this.f5175d;
    }

    /* renamed from: b */
    public final String m5707b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            String strMo5706a = ((InterfaceC4460i) list.get(i4)).mo5706a();
            if (!TextUtils.isEmpty(strMo5706a)) {
                sb.append(strMo5706a);
                if (i4 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final Map m5708c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f5174c.entrySet()) {
            String strM5707b = m5707b((List) entry.getValue());
            if (!TextUtils.isEmpty(strM5707b)) {
                map.put(entry.getKey(), strM5707b);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4461j) {
            return this.f5174c.equals(((C4461j) obj).f5174c);
        }
        return false;
    }

    public int hashCode() {
        return this.f5174c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f5174c + '}';
    }
}
