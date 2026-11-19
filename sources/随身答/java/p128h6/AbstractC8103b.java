package p128h6;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h6.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8103b {

    /* renamed from: h6.b$a */
    public static abstract class a extends AbstractC8103b {

        /* renamed from: h6.b$a$a, reason: collision with other inner class name */
        public static final class C10073a extends a {

            /* renamed from: a */
            public final Throwable f13827a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10073a(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f13827a = throwable;
            }

            /* renamed from: a */
            public final Throwable m12947a() {
                return this.f13827a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10073a) && Intrinsics.areEqual(this.f13827a, ((C10073a) obj).f13827a);
            }

            public int hashCode() {
                return this.f13827a.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.f13827a + ")";
            }
        }

        /* renamed from: h6.b$a$b */
        public static final class b extends a {

            /* renamed from: a */
            public final String f13828a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String msg) {
                super(null);
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.f13828a = msg;
            }

            /* renamed from: a */
            public final String m12948a() {
                return this.f13828a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f13828a, ((b) obj).f13828a);
            }

            public int hashCode() {
                return this.f13828a.hashCode();
            }

            public String toString() {
                return "Success(msg=" + this.f13828a + ")";
            }
        }

        /* renamed from: h6.b$a$c */
        public static final class c extends a {

            /* renamed from: a */
            public final String f13829a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String msg) {
                super(null);
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.f13829a = msg;
            }

            /* renamed from: a */
            public final String m12949a() {
                return this.f13829a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f13829a, ((c) obj).f13829a);
            }

            public int hashCode() {
                return this.f13829a.hashCode();
            }

            public String toString() {
                return "Warn(msg=" + this.f13829a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC8103b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC8103b() {
    }
}
