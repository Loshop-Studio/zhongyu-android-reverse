package p093k5;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p058f5.C6366f0;
import p058f5.InterfaceC6363e;
import p058f5.InterfaceC6371j;

/* renamed from: k5.f */
/* loaded from: classes4.dex */
public abstract class AbstractC6683f {

    /* renamed from: a */
    public static final b f8858a = new b(null);

    /* renamed from: b */
    public static final AbstractC6683f f8859b = new a();

    /* renamed from: k5.f$a */
    public static final class a extends AbstractC6683f {
    }

    /* renamed from: k5.f$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC6683f m7733a() {
            return AbstractC6683f.f8859b;
        }

        public b() {
        }
    }

    /* renamed from: b */
    public void m7726b(InterfaceC6371j connection, C6366f0 route, InterfaceC6363e call) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: c */
    public void m7727c(C6366f0 route, InterfaceC6363e call, IOException failure) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(failure, "failure");
    }

    /* renamed from: d */
    public void m7728d(C6366f0 route, InterfaceC6363e call) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: e */
    public void m7729e(InterfaceC6371j connection, InterfaceC6363e call) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: f */
    public void m7730f(InterfaceC6371j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    /* renamed from: g */
    public void m7731g(InterfaceC6371j connection, InterfaceC6363e call) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* renamed from: h */
    public void m7732h(InterfaceC6371j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }
}
