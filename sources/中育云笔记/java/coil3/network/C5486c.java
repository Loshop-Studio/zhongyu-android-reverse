package coil3.network;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* renamed from: coil3.network.c */
/* loaded from: classes3.dex */
public final class C5486c {

    /* renamed from: b */
    public static final b f3858b = new b(null);

    /* renamed from: c */
    public static final C5486c f3859c = new a().m3243b();

    /* renamed from: a */
    public final Map f3860a;

    /* renamed from: coil3.network.c$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ C5486c(Map map, AbstractC9972n abstractC9972n) {
        this(map);
    }

    /* renamed from: b */
    public final Map m3239b() {
        return this.f3860a;
    }

    /* renamed from: c */
    public final String m3240c(String str) {
        Map map = this.f3860a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        List list = (List) map.get(lowerCase);
        if (list != null) {
            return (String) AbstractC10947g0.m23957z0(list);
        }
        return null;
    }

    /* renamed from: d */
    public final a m3241d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5486c) && AbstractC9979u.m20289b(this.f3860a, ((C5486c) obj).f3860a);
    }

    public int hashCode() {
        return this.f3860a.hashCode();
    }

    public String toString() {
        return "NetworkHeaders(data=" + this.f3860a + ')';
    }

    /* renamed from: coil3.network.c$a */
    public static final class a {

        /* renamed from: a */
        public final Map f3861a;

        public a() {
            this.f3861a = new LinkedHashMap();
        }

        /* renamed from: a */
        public final a m3242a(String str, String str2) {
            Map map = this.f3861a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
            Object arrayList = map.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
            return this;
        }

        /* renamed from: b */
        public final C5486c m3243b() {
            return new C5486c(AbstractC9925a.m20101u(this.f3861a), null);
        }

        /* renamed from: c */
        public final a m3244c(String str, String str2) {
            Map map = this.f3861a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, AbstractC10978w.m24141s(str2));
            return this;
        }

        /* renamed from: d */
        public final a m3245d(String str, List list) {
            Map map = this.f3861a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, AbstractC10947g0.m23925a1(list));
            return this;
        }

        public a(C5486c c5486c) {
            Map map = c5486c.f3860a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), AbstractC10947g0.m23925a1((Collection) entry.getValue()));
            }
            this.f3861a = linkedHashMap;
        }
    }

    public C5486c(Map map) {
        this.f3860a = map;
    }
}
