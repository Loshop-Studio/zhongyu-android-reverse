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
public final class C5209c {

    /* renamed from: b */
    public static final b f3183b = new b(null);

    /* renamed from: c */
    public static final C5209c f3184c = new a().m3152b();

    /* renamed from: a */
    public final Map f3185a;

    /* renamed from: coil3.network.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ C5209c(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* renamed from: b */
    public final Map m3148b() {
        return this.f3185a;
    }

    /* renamed from: c */
    public final String m3149c(String str) {
        Map map = this.f3185a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List list = (List) map.get(lowerCase);
        if (list != null) {
            return (String) CollectionsKt.lastOrNull(list);
        }
        return null;
    }

    /* renamed from: d */
    public final a m3150d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5209c) && Intrinsics.areEqual(this.f3185a, ((C5209c) obj).f3185a);
    }

    public int hashCode() {
        return this.f3185a.hashCode();
    }

    public String toString() {
        return "NetworkHeaders(data=" + this.f3185a + ')';
    }

    /* renamed from: coil3.network.c$a */
    public static final class a {

        /* renamed from: a */
        public final Map f3186a;

        public a() {
            this.f3186a = new LinkedHashMap();
        }

        /* renamed from: a */
        public final a m3151a(String str, String str2) {
            Map map = this.f3186a;
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
        public final C5209c m3152b() {
            return new C5209c(MapsKt.toMap(this.f3186a), null);
        }

        /* renamed from: c */
        public final a m3153c(String str, String str2) {
            Map map = this.f3186a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, CollectionsKt.mutableListOf(str2));
            return this;
        }

        /* renamed from: d */
        public final a m3154d(String str, List list) {
            Map map = this.f3186a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, CollectionsKt.toMutableList((Collection) list));
            return this;
        }

        public a(C5209c c5209c) {
            Map map = c5209c.f3185a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), CollectionsKt.toMutableList((Collection) entry.getValue()));
            }
            this.f3186a = linkedHashMap;
        }
    }

    public C5209c(Map map) {
        this.f3185a = map;
    }
}
