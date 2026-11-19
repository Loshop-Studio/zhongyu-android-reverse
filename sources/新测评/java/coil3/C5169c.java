package coil3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p030c0.AbstractC5077b;

/* renamed from: coil3.c */
/* loaded from: classes3.dex */
public final class C5169c {

    /* renamed from: b */
    public static final b f2819b = new b(null);

    /* renamed from: c */
    public static final C5169c f2820c = new a().m2891a();

    /* renamed from: a */
    public final Map f2821a;

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
        public static final a f2823b = new a(null);

        /* renamed from: a */
        public final Object f2824a;

        /* renamed from: coil3.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public c(Object obj) {
            this.f2824a = obj;
        }

        /* renamed from: a */
        public final Object m2893a() {
            return this.f2824a;
        }
    }

    public /* synthetic */ C5169c(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* renamed from: b */
    public final Map m2888b() {
        return this.f2821a;
    }

    /* renamed from: c */
    public final Object m2889c(c cVar) {
        return this.f2821a.get(cVar);
    }

    /* renamed from: d */
    public final a m2890d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5169c) && Intrinsics.areEqual(this.f2821a, ((C5169c) obj).f2821a);
    }

    public int hashCode() {
        return this.f2821a.hashCode();
    }

    public String toString() {
        return "Extras(data=" + this.f2821a + ')';
    }

    /* renamed from: coil3.c$a */
    public static final class a {

        /* renamed from: a */
        public final Map f2822a;

        public a() {
            this.f2822a = new LinkedHashMap();
        }

        /* renamed from: a */
        public final C5169c m2891a() {
            return new C5169c(AbstractC5077b.m2670d(this.f2822a), null);
        }

        /* renamed from: b */
        public final a m2892b(c cVar, Object obj) {
            if (obj != null) {
                this.f2822a.put(cVar, obj);
                return this;
            }
            this.f2822a.remove(cVar);
            return this;
        }

        public a(Map map) {
            this.f2822a = MapsKt.toMutableMap(map);
        }

        public a(C5169c c5169c) {
            this.f2822a = MapsKt.toMutableMap(c5169c.f2821a);
        }
    }

    public C5169c(Map map) {
        this.f2821a = map;
    }
}
