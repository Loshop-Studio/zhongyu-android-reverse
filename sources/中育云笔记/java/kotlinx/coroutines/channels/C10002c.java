package kotlinx.coroutines.channels;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: kotlinx.coroutines.channels.c */
/* loaded from: classes6.dex */
public final class C10002c {

    /* renamed from: b */
    public static final b f23583b = new b(null);

    /* renamed from: c */
    public static final c f23584c = new c();

    /* renamed from: a */
    public final Object f23585a;

    /* renamed from: kotlinx.coroutines.channels.c$a */
    public static final class a extends c {

        /* renamed from: a */
        public final Throwable f23586a;

        public a(Throwable th) {
            this.f23586a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC9979u.m20289b(this.f23586a, ((a) obj).f23586a);
        }

        public int hashCode() {
            Throwable th = this.f23586a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.C10002c.c
        public String toString() {
            return "Closed(" + this.f23586a + ')';
        }
    }

    /* renamed from: kotlinx.coroutines.channels.c$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final Object m20735a(Throwable th) {
            return C10002c.m20725c(new a(th));
        }

        /* renamed from: b */
        public final Object m20736b() {
            return C10002c.m20725c(C10002c.f23584c);
        }

        /* renamed from: c */
        public final Object m20737c(Object obj) {
            return C10002c.m20725c(obj);
        }

        public b() {
        }
    }

    /* renamed from: kotlinx.coroutines.channels.c$c */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ C10002c(Object obj) {
        this.f23585a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C10002c m20724b(Object obj) {
        return new C10002c(obj);
    }

    /* renamed from: c */
    public static Object m20725c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m20726d(Object obj, Object obj2) {
        return (obj2 instanceof C10002c) && AbstractC9979u.m20289b(obj, ((C10002c) obj2).m20734l());
    }

    /* renamed from: e */
    public static final Throwable m20727e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f23586a;
        }
        return null;
    }

    /* renamed from: f */
    public static final Object m20728f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    public static int m20729g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m20730h(Object obj) {
        return obj instanceof a;
    }

    /* renamed from: i */
    public static final boolean m20731i(Object obj) {
        return obj instanceof c;
    }

    /* renamed from: j */
    public static final boolean m20732j(Object obj) {
        return !(obj instanceof c);
    }

    /* renamed from: k */
    public static String m20733k(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m20726d(this.f23585a, obj);
    }

    public int hashCode() {
        return m20729g(this.f23585a);
    }

    /* renamed from: l */
    public final /* synthetic */ Object m20734l() {
        return this.f23585a;
    }

    public String toString() {
        return m20733k(this.f23585a);
    }
}
