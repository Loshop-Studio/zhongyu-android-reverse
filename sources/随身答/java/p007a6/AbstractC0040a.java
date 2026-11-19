package p007a6;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a6.a */
/* loaded from: classes4.dex */
public abstract class AbstractC0040a {

    /* renamed from: a6.a$a */
    public static final class a extends AbstractC0040a {

        /* renamed from: a */
        public final Object f129a;

        /* renamed from: b */
        public final int f130b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object body, int i9) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            this.f129a = body;
            this.f130b = i9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f129a, aVar.f129a) && this.f130b == aVar.f130b;
        }

        public int hashCode() {
            return (this.f129a.hashCode() * 31) + Integer.hashCode(this.f130b);
        }

        public String toString() {
            return "ApiError(body=" + this.f129a + ", code=" + this.f130b + ')';
        }
    }

    /* renamed from: a6.a$b */
    public static final class b extends AbstractC0040a {

        /* renamed from: a */
        public final IOException f131a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IOException error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f131a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f131a, ((b) obj).f131a);
        }

        public int hashCode() {
            return this.f131a.hashCode();
        }

        public String toString() {
            return "NetworkError(error=" + this.f131a + ')';
        }
    }

    /* renamed from: a6.a$c */
    public static final class c extends AbstractC0040a {

        /* renamed from: a */
        public final Object f132a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object body) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            this.f132a = body;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f132a, ((c) obj).f132a);
        }

        public int hashCode() {
            return this.f132a.hashCode();
        }

        public String toString() {
            return "Success(body=" + this.f132a + ')';
        }
    }

    /* renamed from: a6.a$d */
    public static final class d extends AbstractC0040a {

        /* renamed from: a */
        public final Throwable f133a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f133a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f133a, ((d) obj).f133a);
        }

        public int hashCode() {
            return this.f133a.hashCode();
        }

        public String toString() {
            return "UnknownError(error=" + this.f133a + ')';
        }
    }

    public /* synthetic */ AbstractC0040a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC0040a() {
    }
}
