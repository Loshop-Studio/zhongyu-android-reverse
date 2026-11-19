package okhttp3.internal.connection;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6284a;
import okhttp3.C6330r;
import okhttp3.InterfaceC6292e;
import p129o2.C6268a;
import p139p7.AbstractC6396c;

/* renamed from: okhttp3.internal.connection.n */
/* loaded from: classes4.dex */
public final class C6315n {

    /* renamed from: a */
    public final C6284a f10188a;

    /* renamed from: b */
    public final C6268a f10189b;

    /* renamed from: c */
    public final List f10190c;

    /* renamed from: d */
    public int f10191d;

    /* renamed from: e */
    public Object f10192e;

    /* renamed from: f */
    public final ArrayList f10193f;

    public C6315n(C6284a c6284a, C6268a routeDatabase, InterfaceC6292e interfaceC6292e) {
        List listM6050j;
        AbstractC5830k.m5330g(routeDatabase, "routeDatabase");
        this.f10188a = c6284a;
        this.f10189b = routeDatabase;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f10190c = emptyList;
        this.f10192e = emptyList;
        this.f10193f = new ArrayList();
        C6330r url = c6284a.f10050i;
        Proxy proxy = c6284a.f10048g;
        AbstractC5830k.m5330g(url, "url");
        if (proxy != null) {
            listM6050j = AbstractC5806u.m5286y(proxy);
        } else {
            URI uriM5974h = url.m5974h();
            if (uriM5974h.getHost() == null) {
                listM6050j = AbstractC6396c.m6050j(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = c6284a.f10049h.select(uriM5974h);
                listM6050j = (listSelect == null || listSelect.isEmpty()) ? AbstractC6396c.m6050j(Proxy.NO_PROXY) : AbstractC6396c.m6062v(listSelect);
            }
        }
        this.f10190c = listM6050j;
        this.f10191d = 0;
    }

    /* renamed from: a */
    public final boolean m5935a() {
        return this.f10191d < this.f10190c.size() || !this.f10193f.isEmpty();
    }
}
