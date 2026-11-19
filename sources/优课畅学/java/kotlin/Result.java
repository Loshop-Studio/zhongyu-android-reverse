package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes5.dex */
public final class Result<T> implements Serializable {

    /* renamed from: b */
    public static final C9076a f17350b = new C9076a(null);

    /* renamed from: a */
    public final Object f17351a;

    public static final class Failure implements Serializable {

        /* renamed from: a */
        public final Throwable f17352a;

        public Failure(Throwable exception) {
            AbstractC9133u.m16133g(exception, "exception");
            this.f17352a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Failure) && AbstractC9133u.m16128b(this.f17352a, ((Failure) obj).f17352a);
        }

        public int hashCode() {
            return this.f17352a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f17352a + ')';
        }
    }

    /* renamed from: kotlin.Result$a */
    public static final class C9076a {
        public /* synthetic */ C9076a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C9076a() {
        }
    }

    public /* synthetic */ Result(Object obj) {
        this.f17351a = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ Result m15908a(Object obj) {
        return new Result(obj);
    }

    /* renamed from: b */
    public static Object m15909b(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static boolean m15910c(Object obj, Object obj2) {
        return (obj2 instanceof Result) && AbstractC9133u.m16128b(obj, ((Result) obj2).m15916j());
    }

    /* renamed from: d */
    public static final Throwable m15911d(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).f17352a;
        }
        return null;
    }

    /* renamed from: e */
    public static int m15912e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: g */
    public static final boolean m15913g(Object obj) {
        return obj instanceof Failure;
    }

    /* renamed from: h */
    public static final boolean m15914h(Object obj) {
        return !(obj instanceof Failure);
    }

    /* renamed from: i */
    public static String m15915i(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m15910c(this.f17351a, obj);
    }

    public int hashCode() {
        return m15912e(this.f17351a);
    }

    /* renamed from: j */
    public final /* synthetic */ Object m15916j() {
        return this.f17351a;
    }

    public String toString() {
        return m15915i(this.f17351a);
    }
}
