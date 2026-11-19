package p136i9;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8801r;

/* renamed from: i9.q */
/* loaded from: classes5.dex */
public interface InterfaceC8919q {

    /* renamed from: a */
    public static final a f16779a = a.f16781a;

    /* renamed from: b */
    public static final InterfaceC8919q f16780b = new a.C10808a();

    /* renamed from: i9.q$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f16781a = new a();

        /* renamed from: i9.q$a$a, reason: collision with other inner class name */
        public static final class C10808a implements InterfaceC8919q {
            @Override // p136i9.InterfaceC8919q
            /* renamed from: a */
            public List mo15223a(String hostname) throws UnknownHostException {
                AbstractC9133u.m16133g(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    AbstractC9133u.m16132f(allByName, "getAllByName(...)");
                    return AbstractC8801r.m14736u1(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }
    }

    /* renamed from: a */
    List mo15223a(String str);
}
