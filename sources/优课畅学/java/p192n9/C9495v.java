package p192n9;

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
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p136i9.C8896a;
import p136i9.C8907f0;
import p136i9.C8925w;
import p147j9.AbstractC9036f;
import p147j9.AbstractC9041k;

/* renamed from: n9.v */
/* loaded from: classes5.dex */
public final class C9495v {

    /* renamed from: i */
    public static final a f18836i = new a(null);

    /* renamed from: a */
    public final C8896a f18837a;

    /* renamed from: b */
    public final C9493t f18838b;

    /* renamed from: c */
    public final InterfaceC9480g f18839c;

    /* renamed from: d */
    public final boolean f18840d;

    /* renamed from: e */
    public List f18841e;

    /* renamed from: f */
    public int f18842f;

    /* renamed from: g */
    public List f18843g;

    /* renamed from: h */
    public final List f18844h;

    /* renamed from: n9.v$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final String m17607a(InetSocketAddress inetSocketAddress) {
            AbstractC9133u.m16133g(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                AbstractC9133u.m16132f(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            AbstractC9133u.m16132f(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }

        public a() {
        }
    }

    /* renamed from: n9.v$b */
    public static final class b {

        /* renamed from: a */
        public final List f18845a;

        /* renamed from: b */
        public int f18846b;

        public b(List routes) {
            AbstractC9133u.m16133g(routes, "routes");
            this.f18845a = routes;
        }

        /* renamed from: a */
        public final List m17608a() {
            return this.f18845a;
        }

        /* renamed from: b */
        public final boolean m17609b() {
            return this.f18846b < this.f18845a.size();
        }

        /* renamed from: c */
        public final C8907f0 m17610c() {
            if (!m17609b()) {
                throw new NoSuchElementException();
            }
            List list = this.f18845a;
            int i10 = this.f18846b;
            this.f18846b = i10 + 1;
            return (C8907f0) list.get(i10);
        }
    }

    public C9495v(C8896a address, C9493t routeDatabase, InterfaceC9480g connectionUser, boolean z10) {
        AbstractC9133u.m16133g(address, "address");
        AbstractC9133u.m16133g(routeDatabase, "routeDatabase");
        AbstractC9133u.m16133g(connectionUser, "connectionUser");
        this.f18837a = address;
        this.f18838b = routeDatabase;
        this.f18839c = connectionUser;
        this.f18840d = z10;
        this.f18841e = AbstractC8809v.m14771n();
        this.f18843g = AbstractC8809v.m14771n();
        this.f18844h = new ArrayList();
        m17606f(address.m14950l(), address.m14945g());
    }

    /* renamed from: g */
    public static final List m17600g(Proxy proxy, C8925w c8925w, C9495v c9495v) {
        if (proxy != null) {
            return AbstractC8807u.m14755e(proxy);
        }
        URI uriM15294r = c8925w.m15294r();
        if (uriM15294r.getHost() == null) {
            return AbstractC9041k.m15782l(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = c9495v.f18837a.m14947i().select(uriM15294r);
        return (listSelect == null || listSelect.isEmpty()) ? AbstractC9041k.m15782l(Proxy.NO_PROXY) : AbstractC9041k.m15792v(listSelect);
    }

    /* renamed from: a */
    public final boolean m17601a() {
        return m17602b() || !this.f18844h.isEmpty();
    }

    /* renamed from: b */
    public final boolean m17602b() {
        return this.f18842f < this.f18841e.size();
    }

    /* renamed from: c */
    public final b m17603c() {
        if (!m17601a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m17602b()) {
            Proxy proxyM17604d = m17604d();
            Iterator it = this.f18843g.iterator();
            while (it.hasNext()) {
                C8907f0 c8907f0 = new C8907f0(this.f18837a, proxyM17604d, (InetSocketAddress) it.next());
                if (this.f18838b.m17592c(c8907f0)) {
                    this.f18844h.add(c8907f0);
                } else {
                    arrayList.add(c8907f0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC8768a0.m14481C(arrayList, this.f18844h);
            this.f18844h.clear();
        }
        return new b(arrayList);
    }

    /* renamed from: d */
    public final Proxy m17604d() throws SocketException, UnknownHostException {
        if (m17602b()) {
            List list = this.f18841e;
            int i10 = this.f18842f;
            this.f18842f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            m17605e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f18837a.m14950l().m15284h() + "; exhausted proxy configurations: " + this.f18841e);
    }

    /* renamed from: e */
    public final void m17605e(Proxy proxy) throws SocketException, UnknownHostException {
        String strM15284h;
        int iM15289m;
        List listMo15223a;
        ArrayList arrayList = new ArrayList();
        this.f18843g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM15284h = this.f18837a.m14950l().m15284h();
            iM15289m = this.f18837a.m14950l().m15289m();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strM15284h = f18836i.m17607a(inetSocketAddress);
            iM15289m = inetSocketAddress.getPort();
        }
        if (1 > iM15289m || iM15289m >= 65536) {
            throw new SocketException("No route to " + strM15284h + ':' + iM15289m + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strM15284h, iM15289m));
            return;
        }
        if (AbstractC9036f.m15728a(strM15284h)) {
            listMo15223a = AbstractC8807u.m14755e(InetAddress.getByName(strM15284h));
        } else {
            this.f18839c.mo17427n(strM15284h);
            listMo15223a = this.f18837a.m14941c().mo15223a(strM15284h);
            if (listMo15223a.isEmpty()) {
                throw new UnknownHostException(this.f18837a.m14941c() + " returned no addresses for " + strM15284h);
            }
            this.f18839c.mo17416c(strM15284h, listMo15223a);
        }
        if (this.f18840d) {
            listMo15223a = AbstractC9486m.m17508a(listMo15223a);
        }
        Iterator it = listMo15223a.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iM15289m));
        }
    }

    /* renamed from: f */
    public final void m17606f(C8925w c8925w, Proxy proxy) {
        this.f18839c.mo17428o(c8925w);
        List listM17600g = m17600g(proxy, c8925w, this);
        this.f18841e = listM17600g;
        this.f18842f = 0;
        this.f18839c.mo17417d(c8925w, listM17600g);
    }
}
