package p156l5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l5.b */
/* loaded from: classes4.dex */
public abstract class AbstractC8507b {

    /* renamed from: l5.b$a */
    public static abstract class a extends AbstractC8507b {

        /* renamed from: l5.b$a$a, reason: collision with other inner class name */
        public static final class C10153a extends a {

            /* renamed from: a */
            public final String f14107a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10153a(String msg) {
                super(null);
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.f14107a = msg;
            }

            /* renamed from: a */
            public final String m13982a() {
                return this.f14107a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10153a) && Intrinsics.areEqual(this.f14107a, ((C10153a) obj).f14107a);
            }

            public int hashCode() {
                return this.f14107a.hashCode();
            }

            public String toString() {
                return "Info(msg=" + this.f14107a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC8507b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC8507b() {
    }
}
