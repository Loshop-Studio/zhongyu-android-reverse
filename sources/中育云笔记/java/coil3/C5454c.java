package coil3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p001a0.AbstractC0005b;

/* renamed from: coil3.c */
/* loaded from: classes3.dex */
public final class C5454c {

    /* renamed from: b */
    public static final b f3590b = new b(null);

    /* renamed from: c */
    public static final C5454c f3591c = new a().m3050a();

    /* renamed from: a */
    public final Map f3592a;

    /* renamed from: coil3.c$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: coil3.c$c */
    public static final class c {

        /* renamed from: b */
        public static final a f3594b = new a(null);

        /* renamed from: a */
        public final Object f3595a;

        /* renamed from: coil3.c$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC9972n abstractC9972n) {
                this();
            }

            public a() {
            }
        }

        public c(Object obj) {
            this.f3595a = obj;
        }

        /* renamed from: a */
        public final Object m3052a() {
            return this.f3595a;
        }
    }

    public /* synthetic */ C5454c(Map map, AbstractC9972n abstractC9972n) {
        this(map);
    }

    /* renamed from: b */
    public final Map m3047b() {
        return this.f3592a;
    }

    /* renamed from: c */
    public final Object m3048c(c cVar) {
        return this.f3592a.get(cVar);
    }

    /* renamed from: d */
    public final a m3049d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5454c) && AbstractC9979u.m20289b(this.f3592a, ((C5454c) obj).f3592a);
    }

    public int hashCode() {
        return this.f3592a.hashCode();
    }

    public String toString() {
        return "Extras(data=" + this.f3592a + ')';
    }

    /* renamed from: coil3.c$a */
    public static final class a {

        /* renamed from: a */
        public final Map f3593a;

        public a() {
            this.f3593a = new LinkedHashMap();
        }

        /* renamed from: a */
        public final C5454c m3050a() {
            return new C5454c(AbstractC0005b.m11d(this.f3593a), null);
        }

        /* renamed from: b */
        public final a m3051b(c cVar, Object obj) {
            if (obj != null) {
                this.f3593a.put(cVar, obj);
                return this;
            }
            this.f3593a.remove(cVar);
            return this;
        }

        public a(Map map) {
            this.f3593a = AbstractC9925a.m20104x(map);
        }

        public a(C5454c c5454c) {
            this.f3593a = AbstractC9925a.m20104x(c5454c.f3592a);
        }
    }

    public C5454c(Map map) {
        this.f3592a = map;
    }
}
