package p128o2;

import java.io.Serializable;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o2.l */
/* loaded from: classes.dex */
public final class C2919l<T> implements Serializable {

    /* renamed from: a */
    @NotNull
    public static final a f11409a = new a(null);

    /* renamed from: o2.l$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }
    }

    /* renamed from: o2.l$b */
    public static final class b implements Serializable {

        /* renamed from: a */
        @NotNull
        public final Throwable f11410a;

        public b(@NotNull Throwable exception) {
            C2769l.m9241e(exception, "exception");
            this.f11410a = exception;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof b) && C2769l.m9237a(this.f11410a, ((b) obj).f11410a);
        }

        public int hashCode() {
            return this.f11410a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(" + this.f11410a + ')';
        }
    }

    @NotNull
    /* renamed from: a */
    public static <T> Object m9989a(@Nullable Object obj) {
        return obj;
    }

    @Nullable
    /* renamed from: b */
    public static final Throwable m9990b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f11410a;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m9991c(Object obj) {
        return obj instanceof b;
    }

    /* renamed from: d */
    public static final boolean m9992d(Object obj) {
        return !(obj instanceof b);
    }
}
