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
public final class C5344c {

    /* renamed from: b */
    public static final b f3078b = new b(null);

    /* renamed from: c */
    public static final C5344c f3079c = new a().m2872b();

    /* renamed from: a */
    public final Map f3080a;

    /* renamed from: coil3.network.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ C5344c(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* renamed from: b */
    public final Map m2868b() {
        return this.f3080a;
    }

    /* renamed from: c */
    public final String m2869c(String str) {
        Map map = this.f3080a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List list = (List) map.get(lowerCase);
        if (list != null) {
            return (String) CollectionsKt.lastOrNull(list);
        }
        return null;
    }

    /* renamed from: d */
    public final a m2870d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5344c) && Intrinsics.areEqual(this.f3080a, ((C5344c) obj).f3080a);
    }

    public int hashCode() {
        return this.f3080a.hashCode();
    }

    public String toString() {
        return "NetworkHeaders(data=" + this.f3080a + ')';
    }

    /* renamed from: coil3.network.c$a */
    public static final class a {

        /* renamed from: a */
        public final Map f3081a;

        public a() {
            this.f3081a = new LinkedHashMap();
        }

        /* renamed from: a */
        public final a m2871a(String str, String str2) {
            Map map = this.f3081a;
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
        public final C5344c m2872b() {
            return new C5344c(MapsKt.toMap(this.f3081a), null);
        }

        /* renamed from: c */
        public final a m2873c(String str, String str2) {
            Map map = this.f3081a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, CollectionsKt.mutableListOf(str2));
            return this;
        }

        /* renamed from: d */
        public final a m2874d(String str, List list) {
            Map map = this.f3081a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, CollectionsKt.toMutableList((Collection) list));
            return this;
        }

        public a(C5344c c5344c) {
            Map map = c5344c.f3080a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), CollectionsKt.toMutableList((Collection) entry.getValue()));
            }
            this.f3081a = linkedHashMap;
        }
    }

    public C5344c(Map map) {
        this.f3080a = map;
    }
}
