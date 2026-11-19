package je;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10968r;

/* renamed from: je.n */
/* loaded from: classes6.dex */
public interface InterfaceC9734n {

    /* renamed from: a */
    public static final a f22734a = a.f22736a;

    /* renamed from: b */
    public static final InterfaceC9734n f22735b = new a.C12140a();

    /* renamed from: je.n$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f22736a = new a();

        /* renamed from: je.n$a$a, reason: collision with other inner class name */
        public static final class C12140a implements InterfaceC9734n {
            @Override // je.InterfaceC9734n
            /* renamed from: a */
            public List mo19354a(String hostname) throws UnknownHostException {
                AbstractC9979u.m20294g(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    AbstractC9979u.m20293f(allByName, "getAllByName(hostname)");
                    return AbstractC10968r.m24097p1(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }
    }

    /* renamed from: a */
    List mo19354a(String str);
}
