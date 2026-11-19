package p226q8;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p172l8.AbstractC8916o;
import p172l8.C8901a;
import p172l8.C8902a0;
import p172l8.C8919r;
import p172l8.InterfaceC8906e;
import p182m8.AbstractC9045d;

/* renamed from: q8.h */
/* loaded from: classes5.dex */
public final class C9385h {

    /* renamed from: i */
    public static final a f16358i = new a(null);

    /* renamed from: a */
    public final C8901a f16359a;

    /* renamed from: b */
    public final C9384g f16360b;

    /* renamed from: c */
    public final InterfaceC8906e f16361c;

    /* renamed from: d */
    public final AbstractC8916o f16362d;

    /* renamed from: e */
    public List f16363e;

    /* renamed from: f */
    public int f16364f;

    /* renamed from: g */
    public List f16365g;

    /* renamed from: h */
    public final List f16366h;

    /* renamed from: q8.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m15440a(InetSocketAddress inetSocketAddress) {
            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        public a() {
        }
    }

    /* renamed from: q8.h$b */
    public static final class b {

        /* renamed from: a */
        public final List f16367a;

        /* renamed from: b */
        public int f16368b;

        public b(List routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f16367a = routes;
        }

        /* renamed from: a */
        public final List m15441a() {
            return this.f16367a;
        }

        /* renamed from: b */
        public final boolean m15442b() {
            return this.f16368b < this.f16367a.size();
        }

        /* renamed from: c */
        public final C8902a0 m15443c() {
            if (!m15442b()) {
                throw new NoSuchElementException();
            }
            List list = this.f16367a;
            int i9 = this.f16368b;
            this.f16368b = i9 + 1;
            return (C8902a0) list.get(i9);
        }
    }

    public C9385h(C8901a address, C9384g routeDatabase, InterfaceC8906e call, AbstractC8916o eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f16359a = address;
        this.f16360b = routeDatabase;
        this.f16361c = call;
        this.f16362d = eventListener;
        this.f16363e = CollectionsKt.emptyList();
        this.f16365g = CollectionsKt.emptyList();
        this.f16366h = new ArrayList();
        m15439f(address.m13844l(), address.m13839g());
    }

    /* renamed from: g */
    public static final List m15433g(Proxy proxy, C8919r c8919r, C9385h c9385h) {
        if (proxy != null) {
            return CollectionsKt.listOf(proxy);
        }
        URI uriM13976s = c8919r.m13976s();
        if (uriM13976s.getHost() == null) {
            return AbstractC9045d.m14507w(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = c9385h.f16359a.m13841i().select(uriM13976s);
        if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
            return AbstractC9045d.m14507w(Proxy.NO_PROXY);
        }
        Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
        return AbstractC9045d.m14477S(proxiesOrNull);
    }

    /* renamed from: a */
    public final boolean m15434a() {
        return m15435b() || !this.f16366h.isEmpty();
    }

    /* renamed from: b */
    public final boolean m15435b() {
        return this.f16364f < this.f16363e.size();
    }

    /* renamed from: c */
    public final b m15436c() {
        if (!m15434a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m15435b()) {
            Proxy proxyM15437d = m15437d();
            Iterator it = this.f16365g.iterator();
            while (it.hasNext()) {
                C8902a0 c8902a0 = new C8902a0(this.f16359a, proxyM15437d, (InetSocketAddress) it.next());
                if (this.f16360b.m15432c(c8902a0)) {
                    this.f16366h.add(c8902a0);
                } else {
                    arrayList.add(c8902a0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            CollectionsKt.addAll(arrayList, this.f16366h);
            this.f16366h.clear();
        }
        return new b(arrayList);
    }

    /* renamed from: d */
    public final Proxy m15437d() throws SocketException, UnknownHostException {
        if (m15435b()) {
            List list = this.f16363e;
            int i9 = this.f16364f;
            this.f16364f = i9 + 1;
            Proxy proxy = (Proxy) list.get(i9);
            m15438e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f16359a.m13844l().m13966i() + "; exhausted proxy configurations: " + this.f16363e);
    }

    /* renamed from: e */
    public final void m15438e(Proxy proxy) throws SocketException, UnknownHostException {
        String strM13966i;
        int iM13971n;
        List listMo13901a;
        ArrayList arrayList = new ArrayList();
        this.f16365g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM13966i = this.f16359a.m13844l().m13966i();
            iM13971n = this.f16359a.m13844l().m13971n();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            a aVar = f16358i;
            Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strM13966i = aVar.m15440a(inetSocketAddress);
            iM13971n = inetSocketAddress.getPort();
        }
        if (1 > iM13971n || iM13971n >= 65536) {
            throw new SocketException("No route to " + strM13966i + ':' + iM13971n + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strM13966i, iM13971n));
            return;
        }
        if (AbstractC9045d.m14493i(strM13966i)) {
            listMo13901a = CollectionsKt.listOf(InetAddress.getByName(strM13966i));
        } else {
            this.f16362d.m13916m(this.f16361c, strM13966i);
            listMo13901a = this.f16359a.m13835c().mo13901a(strM13966i);
            if (listMo13901a.isEmpty()) {
                throw new UnknownHostException(this.f16359a.m13835c() + " returned no addresses for " + strM13966i);
            }
            this.f16362d.m13915l(this.f16361c, strM13966i, listMo13901a);
        }
        Iterator it = listMo13901a.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iM13971n));
        }
    }

    /* renamed from: f */
    public final void m15439f(C8919r c8919r, Proxy proxy) {
        this.f16362d.m13918o(this.f16361c, c8919r);
        List listM15433g = m15433g(proxy, c8919r, this);
        this.f16363e = listM15433g;
        this.f16364f = 0;
        this.f16362d.m13917n(this.f16361c, c8919r, listM15433g);
    }
}
