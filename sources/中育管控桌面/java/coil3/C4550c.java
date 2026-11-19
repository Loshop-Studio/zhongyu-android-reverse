package coil3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p023c0.AbstractC4457b;

/* renamed from: coil3.c */
/* loaded from: classes3.dex */
public final class C4550c {

    /* renamed from: b */
    public static final b f1503b = new b(null);

    /* renamed from: c */
    public static final C4550c f1504c = new a().m1725a();

    /* renamed from: a */
    public final Map f1505a;

    /* renamed from: coil3.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: coil3.c$c */
    public static final class c {

        /* renamed from: b */
        public static final a f1507b = new a(null);

        /* renamed from: a */
        public final Object f1508a;

        /* renamed from: coil3.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public c(Object obj) {
            this.f1508a = obj;
        }

        /* renamed from: a */
        public final Object m1727a() {
            return this.f1508a;
        }
    }

    public /* synthetic */ C4550c(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* renamed from: b */
    public final Map m1722b() {
        return this.f1505a;
    }

    /* renamed from: c */
    public final Object m1723c(c cVar) {
        return this.f1505a.get(cVar);
    }

    /* renamed from: d */
    public final a m1724d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4550c) && Intrinsics.areEqual(this.f1505a, ((C4550c) obj).f1505a);
    }

    public int hashCode() {
        return this.f1505a.hashCode();
    }

    public String toString() {
        return "Extras(data=" + this.f1505a + ')';
    }

    /* renamed from: coil3.c$a */
    public static final class a {

        /* renamed from: a */
        public final Map f1506a;

        public a() {
            this.f1506a = new LinkedHashMap();
        }

        /* renamed from: a */
        public final C4550c m1725a() {
            return new C4550c(AbstractC4457b.m1527d(this.f1506a), null);
        }

        /* renamed from: b */
        public final a m1726b(c cVar, Object obj) {
            if (obj != null) {
                this.f1506a.put(cVar, obj);
                return this;
            }
            this.f1506a.remove(cVar);
            return this;
        }

        public a(Map map) {
            this.f1506a = MapsKt.toMutableMap(map);
        }

        public a(C4550c c4550c) {
            this.f1506a = MapsKt.toMutableMap(c4550c.f1505a);
        }
    }

    public C4550c(Map map) {
        this.f1505a = map;
    }
}
