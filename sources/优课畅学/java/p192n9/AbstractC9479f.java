package p192n9;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p136i9.C8907f0;
import p136i9.InterfaceC8904e;
import p136i9.InterfaceC8912j;

/* renamed from: n9.f */
/* loaded from: classes5.dex */
public abstract class AbstractC9479f {

    /* renamed from: a */
    public static final b f18728a = new b(null);

    /* renamed from: b */
    public static final AbstractC9479f f18729b = new a();

    /* renamed from: n9.f$a */
    public static final class a extends AbstractC9479f {
    }

    /* renamed from: n9.f$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final AbstractC9479f m17466a() {
            return AbstractC9479f.f18729b;
        }

        public b() {
        }
    }

    /* renamed from: b */
    public void m17459b(InterfaceC8912j connection, C8907f0 route, InterfaceC8904e call) {
        AbstractC9133u.m16133g(connection, "connection");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(call, "call");
    }

    /* renamed from: c */
    public void m17460c(C8907f0 route, InterfaceC8904e call, IOException failure) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(call, "call");
        AbstractC9133u.m16133g(failure, "failure");
    }

    /* renamed from: d */
    public void m17461d(C8907f0 route, InterfaceC8904e call) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(call, "call");
    }

    /* renamed from: e */
    public void m17462e(InterfaceC8912j connection, InterfaceC8904e call) {
        AbstractC9133u.m16133g(connection, "connection");
        AbstractC9133u.m16133g(call, "call");
    }

    /* renamed from: f */
    public void m17463f(InterfaceC8912j connection) {
        AbstractC9133u.m16133g(connection, "connection");
    }

    /* renamed from: g */
    public void m17464g(InterfaceC8912j connection, InterfaceC8904e call) {
        AbstractC9133u.m16133g(connection, "connection");
        AbstractC9133u.m16133g(call, "call");
    }

    /* renamed from: h */
    public void m17465h(InterfaceC8912j connection) {
        AbstractC9133u.m16133g(connection, "connection");
    }
}
