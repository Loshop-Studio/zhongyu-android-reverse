package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class Result<T> implements Serializable {

    /* renamed from: d */
    public static final C9921a f23263d = new C9921a(null);

    /* renamed from: c */
    public final Object f23264c;

    public static final class Failure implements Serializable {

        /* renamed from: c */
        public final Throwable f23265c;

        public Failure(Throwable exception) {
            AbstractC9979u.m20294g(exception, "exception");
            this.f23265c = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Failure) && AbstractC9979u.m20289b(this.f23265c, ((Failure) obj).f23265c);
        }

        public int hashCode() {
            return this.f23265c.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f23265c + ')';
        }
    }

    /* renamed from: kotlin.Result$a */
    public static final class C9921a {
        public /* synthetic */ C9921a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C9921a() {
        }
    }

    public /* synthetic */ Result(Object obj) {
        this.f23264c = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ Result m20053a(Object obj) {
        return new Result(obj);
    }

    /* renamed from: c */
    public static Object m20054c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m20055d(Object obj, Object obj2) {
        return (obj2 instanceof Result) && AbstractC9979u.m20289b(obj, ((Result) obj2).m20061n());
    }

    /* renamed from: e */
    public static final Throwable m20056e(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).f23265c;
        }
        return null;
    }

    /* renamed from: f */
    public static int m20057f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: g */
    public static final boolean m20058g(Object obj) {
        return obj instanceof Failure;
    }

    /* renamed from: k */
    public static final boolean m20059k(Object obj) {
        return !(obj instanceof Failure);
    }

    /* renamed from: m */
    public static String m20060m(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m20055d(this.f23264c, obj);
    }

    public int hashCode() {
        return m20057f(this.f23264c);
    }

    /* renamed from: n */
    public final /* synthetic */ Object m20061n() {
        return this.f23264c;
    }

    public String toString() {
        return m20060m(this.f23264c);
    }
}
