package kotlinx.coroutines.channels;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: kotlinx.coroutines.channels.c */
/* loaded from: classes5.dex */
public final class C9160c {

    /* renamed from: b */
    public static final b f17673b = new b(null);

    /* renamed from: c */
    public static final c f17674c = new c();

    /* renamed from: a */
    public final Object f17675a;

    /* renamed from: kotlinx.coroutines.channels.c$a */
    public static final class a extends c {

        /* renamed from: a */
        public final Throwable f17676a;

        public a(Throwable th) {
            this.f17676a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC9133u.m16128b(this.f17676a, ((a) obj).f17676a);
        }

        public int hashCode() {
            Throwable th = this.f17676a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.C9160c.c
        public String toString() {
            return "Closed(" + this.f17676a + ')';
        }
    }

    /* renamed from: kotlinx.coroutines.channels.c$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final Object m16542a(Throwable th) {
            return C9160c.m16532c(new a(th));
        }

        /* renamed from: b */
        public final Object m16543b() {
            return C9160c.m16532c(C9160c.f17674c);
        }

        /* renamed from: c */
        public final Object m16544c(Object obj) {
            return C9160c.m16532c(obj);
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

    public /* synthetic */ C9160c(Object obj) {
        this.f17675a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C9160c m16531b(Object obj) {
        return new C9160c(obj);
    }

    /* renamed from: c */
    public static Object m16532c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m16533d(Object obj, Object obj2) {
        return (obj2 instanceof C9160c) && AbstractC9133u.m16128b(obj, ((C9160c) obj2).m16541l());
    }

    /* renamed from: e */
    public static final Throwable m16534e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f17676a;
        }
        return null;
    }

    /* renamed from: f */
    public static final Object m16535f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    public static int m16536g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m16537h(Object obj) {
        return obj instanceof a;
    }

    /* renamed from: i */
    public static final boolean m16538i(Object obj) {
        return obj instanceof c;
    }

    /* renamed from: j */
    public static final boolean m16539j(Object obj) {
        return !(obj instanceof c);
    }

    /* renamed from: k */
    public static String m16540k(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m16533d(this.f17675a, obj);
    }

    public int hashCode() {
        return m16536g(this.f17675a);
    }

    /* renamed from: l */
    public final /* synthetic */ Object m16541l() {
        return this.f17675a;
    }

    public String toString() {
        return m16540k(this.f17675a);
    }
}
