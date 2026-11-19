package p120s1;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s1.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4545a {

    /* renamed from: s1.a$a */
    public static final class a extends AbstractC4545a {

        /* renamed from: a */
        public final Object f5690a;

        /* renamed from: b */
        public final int f5691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object body, int i4) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            this.f5690a = body;
            this.f5691b = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f5690a, aVar.f5690a) && this.f5691b == aVar.f5691b;
        }

        public int hashCode() {
            return (this.f5690a.hashCode() * 31) + this.f5691b;
        }

        public String toString() {
            return "ApiError(body=" + this.f5690a + ", code=" + this.f5691b + ')';
        }
    }

    /* renamed from: s1.a$b */
    public static final class b extends AbstractC4545a {

        /* renamed from: a */
        public final IOException f5692a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IOException error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f5692a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f5692a, ((b) obj).f5692a);
        }

        public int hashCode() {
            return this.f5692a.hashCode();
        }

        public String toString() {
            return "NetworkError(error=" + this.f5692a + ')';
        }
    }

    /* renamed from: s1.a$c */
    public static final class c extends AbstractC4545a {

        /* renamed from: a */
        public final Object f5693a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object body) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            this.f5693a = body;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f5693a, ((c) obj).f5693a);
        }

        public int hashCode() {
            return this.f5693a.hashCode();
        }

        public String toString() {
            return "Success(body=" + this.f5693a + ')';
        }
    }

    /* renamed from: s1.a$d */
    public static final class d extends AbstractC4545a {

        /* renamed from: a */
        public final Throwable f5694a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f5694a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f5694a, ((d) obj).f5694a);
        }

        public int hashCode() {
            return this.f5694a.hashCode();
        }

        public String toString() {
            return "UnknownError(error=" + this.f5694a + ')';
        }
    }

    public AbstractC4545a() {
    }

    public /* synthetic */ AbstractC4545a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
