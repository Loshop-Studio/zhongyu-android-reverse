package coil3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p090e0.AbstractC7804b;

/* renamed from: coil3.c */
/* loaded from: classes3.dex */
public final class C5304c {

    /* renamed from: b */
    public static final b f2754b = new b(null);

    /* renamed from: c */
    public static final C5304c f2755c = new a().m2619a();

    /* renamed from: a */
    public final Map f2756a;

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
        public static final a f2758b = new a(null);

        /* renamed from: a */
        public final Object f2759a;

        /* renamed from: coil3.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public c(Object obj) {
            this.f2759a = obj;
        }

        /* renamed from: a */
        public final Object m2621a() {
            return this.f2759a;
        }
    }

    public /* synthetic */ C5304c(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* renamed from: b */
    public final Map m2616b() {
        return this.f2756a;
    }

    /* renamed from: c */
    public final Object m2617c(c cVar) {
        return this.f2756a.get(cVar);
    }

    /* renamed from: d */
    public final a m2618d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5304c) && Intrinsics.areEqual(this.f2756a, ((C5304c) obj).f2756a);
    }

    public int hashCode() {
        return this.f2756a.hashCode();
    }

    public String toString() {
        return "Extras(data=" + this.f2756a + ')';
    }

    /* renamed from: coil3.c$a */
    public static final class a {

        /* renamed from: a */
        public final Map f2757a;

        public a() {
            this.f2757a = new LinkedHashMap();
        }

        /* renamed from: a */
        public final C5304c m2619a() {
            return new C5304c(AbstractC7804b.m12178d(this.f2757a), null);
        }

        /* renamed from: b */
        public final a m2620b(c cVar, Object obj) {
            if (obj != null) {
                this.f2757a.put(cVar, obj);
                return this;
            }
            this.f2757a.remove(cVar);
            return this;
        }

        public a(Map map) {
            this.f2757a = MapsKt.toMutableMap(map);
        }

        public a(C5304c c5304c) {
            this.f2757a = MapsKt.toMutableMap(c5304c.f2756a);
        }
    }

    public C5304c(Map map) {
        this.f2756a = map;
    }
}
