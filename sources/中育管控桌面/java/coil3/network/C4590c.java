package coil3.network;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: coil3.network.c */
/* loaded from: classes3.dex */
public final class C4590c {

    /* renamed from: b */
    public static final b f1867b = new b(null);

    /* renamed from: c */
    public static final C4590c f1868c = new a().m1978b();

    /* renamed from: a */
    public final Map f1869a;

    /* renamed from: coil3.network.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ C4590c(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* renamed from: b */
    public final Map m1974b() {
        return this.f1869a;
    }

    /* renamed from: c */
    public final String m1975c(String str) {
        Map map = this.f1869a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List list = (List) map.get(lowerCase);
        if (list != null) {
            return (String) CollectionsKt.lastOrNull(list);
        }
        return null;
    }

    /* renamed from: d */
    public final a m1976d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4590c) && Intrinsics.areEqual(this.f1869a, ((C4590c) obj).f1869a);
    }

    public int hashCode() {
        return this.f1869a.hashCode();
    }

    public String toString() {
        return "NetworkHeaders(data=" + this.f1869a + ')';
    }

    /* renamed from: coil3.network.c$a */
    public static final class a {

        /* renamed from: a */
        public final Map f1870a;

        public a() {
            this.f1870a = new LinkedHashMap();
        }

        /* renamed from: a */
        public final a m1977a(String str, String str2) {
            Map map = this.f1870a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Object arrayList = map.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
            return this;
        }

        /* renamed from: b */
        public final C4590c m1978b() {
            return new C4590c(MapsKt.toMap(this.f1870a), null);
        }

        /* renamed from: c */
        public final a m1979c(String str, String str2) {
            Map map = this.f1870a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, CollectionsKt.mutableListOf(str2));
            return this;
        }

        /* renamed from: d */
        public final a m1980d(String str, List list) {
            Map map = this.f1870a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, CollectionsKt.toMutableList((Collection) list));
            return this;
        }

        public a(C4590c c4590c) {
            Map map = c4590c.f1869a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), CollectionsKt.toMutableList((Collection) entry.getValue()));
            }
            this.f1870a = linkedHashMap;
        }
    }

    public C4590c(Map map) {
        this.f1869a = map;
    }
}
