package p092f9;

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
import p011a9.AbstractC0052o;
import p011a9.C0037a;
import p011a9.C0038a0;
import p011a9.C0055r;
import p011a9.InterfaceC0042e;
import p028b9.AbstractC5070d;

/* renamed from: f9.h */
/* loaded from: classes5.dex */
public final class C7504h {

    /* renamed from: i */
    public static final a f12350i = new a(null);

    /* renamed from: a */
    public final C0037a f12351a;

    /* renamed from: b */
    public final C7503g f12352b;

    /* renamed from: c */
    public final InterfaceC0042e f12353c;

    /* renamed from: d */
    public final AbstractC0052o f12354d;

    /* renamed from: e */
    public List f12355e;

    /* renamed from: f */
    public int f12356f;

    /* renamed from: g */
    public List f12357g;

    /* renamed from: h */
    public final List f12358h;

    /* renamed from: f9.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m12208a(InetSocketAddress inetSocketAddress) {
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

    /* renamed from: f9.h$b */
    public static final class b {

        /* renamed from: a */
        public final List f12359a;

        /* renamed from: b */
        public int f12360b;

        public b(List routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f12359a = routes;
        }

        /* renamed from: a */
        public final List m12209a() {
            return this.f12359a;
        }

        /* renamed from: b */
        public final boolean m12210b() {
            return this.f12360b < this.f12359a.size();
        }

        /* renamed from: c */
        public final C0038a0 m12211c() {
            if (!m12210b()) {
                throw new NoSuchElementException();
            }
            List list = this.f12359a;
            int i10 = this.f12360b;
            this.f12360b = i10 + 1;
            return (C0038a0) list.get(i10);
        }
    }

    public C7504h(C0037a address, C7503g routeDatabase, InterfaceC0042e call, AbstractC0052o eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f12351a = address;
        this.f12352b = routeDatabase;
        this.f12353c = call;
        this.f12354d = eventListener;
        this.f12355e = CollectionsKt.emptyList();
        this.f12357g = CollectionsKt.emptyList();
        this.f12358h = new ArrayList();
        m12207f(address.m85l(), address.m80g());
    }

    /* renamed from: g */
    public static final List m12201g(Proxy proxy, C0055r c0055r, C7504h c7504h) {
        if (proxy != null) {
            return CollectionsKt.listOf(proxy);
        }
        URI uriM220s = c0055r.m220s();
        if (uriM220s.getHost() == null) {
            return AbstractC5070d.m2658w(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = c7504h.f12351a.m82i().select(uriM220s);
        if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
            return AbstractC5070d.m2658w(Proxy.NO_PROXY);
        }
        Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
        return AbstractC5070d.m2628S(proxiesOrNull);
    }

    /* renamed from: a */
    public final boolean m12202a() {
        return m12203b() || !this.f12358h.isEmpty();
    }

    /* renamed from: b */
    public final boolean m12203b() {
        return this.f12356f < this.f12355e.size();
    }

    /* renamed from: c */
    public final b m12204c() {
        if (!m12202a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m12203b()) {
            Proxy proxyM12205d = m12205d();
            Iterator it = this.f12357g.iterator();
            while (it.hasNext()) {
                C0038a0 c0038a0 = new C0038a0(this.f12351a, proxyM12205d, (InetSocketAddress) it.next());
                if (this.f12352b.m12200c(c0038a0)) {
                    this.f12358h.add(c0038a0);
                } else {
                    arrayList.add(c0038a0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            CollectionsKt.addAll(arrayList, this.f12358h);
            this.f12358h.clear();
        }
        return new b(arrayList);
    }

    /* renamed from: d */
    public final Proxy m12205d() throws SocketException, UnknownHostException {
        if (m12203b()) {
            List list = this.f12355e;
            int i10 = this.f12356f;
            this.f12356f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            m12206e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f12351a.m85l().m210i() + "; exhausted proxy configurations: " + this.f12355e);
    }

    /* renamed from: e */
    public final void m12206e(Proxy proxy) throws SocketException, UnknownHostException {
        String strM210i;
        int iM215n;
        List listMo145a;
        ArrayList arrayList = new ArrayList();
        this.f12357g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM210i = this.f12351a.m85l().m210i();
            iM215n = this.f12351a.m85l().m215n();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            a aVar = f12350i;
            Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strM210i = aVar.m12208a(inetSocketAddress);
            iM215n = inetSocketAddress.getPort();
        }
        if (1 > iM215n || iM215n >= 65536) {
            throw new SocketException("No route to " + strM210i + ':' + iM215n + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strM210i, iM215n));
            return;
        }
        if (AbstractC5070d.m2644i(strM210i)) {
            listMo145a = CollectionsKt.listOf(InetAddress.getByName(strM210i));
        } else {
            this.f12354d.m160m(this.f12353c, strM210i);
            listMo145a = this.f12351a.m76c().mo145a(strM210i);
            if (listMo145a.isEmpty()) {
                throw new UnknownHostException(this.f12351a.m76c() + " returned no addresses for " + strM210i);
            }
            this.f12354d.m159l(this.f12353c, strM210i, listMo145a);
        }
        Iterator it = listMo145a.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iM215n));
        }
    }

    /* renamed from: f */
    public final void m12207f(C0055r c0055r, Proxy proxy) {
        this.f12354d.m162o(this.f12353c, c0055r);
        List listM12201g = m12201g(proxy, c0055r, this);
        this.f12355e = listM12201g;
        this.f12356f = 0;
        this.f12354d.m161n(this.f12353c, c0055r, listM12201g);
    }
}
