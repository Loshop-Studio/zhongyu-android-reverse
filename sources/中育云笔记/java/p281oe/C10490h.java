package p281oe;

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
import je.AbstractC9735o;
import je.C9720a;
import je.C9721a0;
import je.C9738r;
import je.InterfaceC9725e;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;

/* renamed from: oe.h */
/* loaded from: classes6.dex */
public final class C10490h {

    /* renamed from: i */
    public static final a f24931i = new a(null);

    /* renamed from: a */
    public final C9720a f24932a;

    /* renamed from: b */
    public final C10489g f24933b;

    /* renamed from: c */
    public final InterfaceC9725e f24934c;

    /* renamed from: d */
    public final AbstractC9735o f24935d;

    /* renamed from: e */
    public List f24936e;

    /* renamed from: f */
    public int f24937f;

    /* renamed from: g */
    public List f24938g;

    /* renamed from: h */
    public final List f24939h;

    /* renamed from: oe.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final String m21934a(InetSocketAddress inetSocketAddress) {
            AbstractC9979u.m20294g(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                AbstractC9979u.m20293f(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            AbstractC9979u.m20293f(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        public a() {
        }
    }

    /* renamed from: oe.h$b */
    public static final class b {

        /* renamed from: a */
        public final List f24940a;

        /* renamed from: b */
        public int f24941b;

        public b(List routes) {
            AbstractC9979u.m20294g(routes, "routes");
            this.f24940a = routes;
        }

        /* renamed from: a */
        public final List m21935a() {
            return this.f24940a;
        }

        /* renamed from: b */
        public final boolean m21936b() {
            return this.f24941b < this.f24940a.size();
        }

        /* renamed from: c */
        public final C9721a0 m21937c() {
            if (!m21936b()) {
                throw new NoSuchElementException();
            }
            List list = this.f24940a;
            int i10 = this.f24941b;
            this.f24941b = i10 + 1;
            return (C9721a0) list.get(i10);
        }
    }

    public C10490h(C9720a address, C10489g routeDatabase, InterfaceC9725e call, AbstractC9735o eventListener) {
        AbstractC9979u.m20294g(address, "address");
        AbstractC9979u.m20294g(routeDatabase, "routeDatabase");
        AbstractC9979u.m20294g(call, "call");
        AbstractC9979u.m20294g(eventListener, "eventListener");
        this.f24932a = address;
        this.f24933b = routeDatabase;
        this.f24934c = call;
        this.f24935d = eventListener;
        this.f24936e = AbstractC10978w.m24136n();
        this.f24938g = AbstractC10978w.m24136n();
        this.f24939h = new ArrayList();
        m21933f(address.m19296l(), address.m19291g());
    }

    /* renamed from: g */
    public static final List m21927g(Proxy proxy, C9738r c9738r, C10490h c10490h) {
        if (proxy != null) {
            return AbstractC10976v.m24126e(proxy);
        }
        URI uriM19429s = c9738r.m19429s();
        if (uriM19429s.getHost() == null) {
            return AbstractC9920d.m20041w(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = c10490h.f24932a.m19293i().select(uriM19429s);
        List<Proxy> list = proxiesOrNull;
        if (list == null || list.isEmpty()) {
            return AbstractC9920d.m20041w(Proxy.NO_PROXY);
        }
        AbstractC9979u.m20293f(proxiesOrNull, "proxiesOrNull");
        return AbstractC9920d.m20011S(proxiesOrNull);
    }

    /* renamed from: a */
    public final boolean m21928a() {
        return m21929b() || !this.f24939h.isEmpty();
    }

    /* renamed from: b */
    public final boolean m21929b() {
        return this.f24937f < this.f24936e.size();
    }

    /* renamed from: c */
    public final b m21930c() {
        if (!m21928a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m21929b()) {
            Proxy proxyM21931d = m21931d();
            Iterator it = this.f24938g.iterator();
            while (it.hasNext()) {
                C9721a0 c9721a0 = new C9721a0(this.f24932a, proxyM21931d, (InetSocketAddress) it.next());
                if (this.f24933b.m21926c(c9721a0)) {
                    this.f24939h.add(c9721a0);
                } else {
                    arrayList.add(c9721a0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC10937b0.m23857B(arrayList, this.f24939h);
            this.f24939h.clear();
        }
        return new b(arrayList);
    }

    /* renamed from: d */
    public final Proxy m21931d() throws SocketException, UnknownHostException {
        if (m21929b()) {
            List list = this.f24936e;
            int i10 = this.f24937f;
            this.f24937f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            m21932e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f24932a.m19296l().m19419i() + "; exhausted proxy configurations: " + this.f24936e);
    }

    /* renamed from: e */
    public final void m21932e(Proxy proxy) throws SocketException, UnknownHostException {
        String strM19419i;
        int iM19424n;
        List listMo19354a;
        ArrayList arrayList = new ArrayList();
        this.f24938g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM19419i = this.f24932a.m19296l().m19419i();
            iM19424n = this.f24932a.m19296l().m19424n();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            a aVar = f24931i;
            AbstractC9979u.m20293f(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strM19419i = aVar.m21934a(inetSocketAddress);
            iM19424n = inetSocketAddress.getPort();
        }
        if (1 > iM19424n || iM19424n >= 65536) {
            throw new SocketException("No route to " + strM19419i + ':' + iM19424n + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strM19419i, iM19424n));
            return;
        }
        if (AbstractC9920d.m20027i(strM19419i)) {
            listMo19354a = AbstractC10976v.m24126e(InetAddress.getByName(strM19419i));
        } else {
            this.f24935d.m19369m(this.f24934c, strM19419i);
            listMo19354a = this.f24932a.m19287c().mo19354a(strM19419i);
            if (listMo19354a.isEmpty()) {
                throw new UnknownHostException(this.f24932a.m19287c() + " returned no addresses for " + strM19419i);
            }
            this.f24935d.m19368l(this.f24934c, strM19419i, listMo19354a);
        }
        Iterator it = listMo19354a.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iM19424n));
        }
    }

    /* renamed from: f */
    public final void m21933f(C9738r c9738r, Proxy proxy) {
        this.f24935d.m19371o(this.f24934c, c9738r);
        List listM21927g = m21927g(proxy, c9738r, this);
        this.f24936e = listM21927g;
        this.f24937f = 0;
        this.f24935d.m19370n(this.f24934c, c9738r, listM21927g);
    }
}
