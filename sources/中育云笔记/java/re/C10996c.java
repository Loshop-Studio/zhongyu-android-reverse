package re;

import anet.channel.util.HttpConstant;
import com.taobao.accs.common.Constants;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import je.C9737q;
import je.C9742v;
import je.C9743w;
import je.C9745y;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.Protocol;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.C10501b;
import okhttp3.internal.http2.ErrorCode;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import pe.AbstractC10678e;
import pe.C10680g;
import pe.C10682i;
import pe.C10684k;
import pe.InterfaceC10677d;

/* renamed from: re.c */
/* loaded from: classes6.dex */
public final class C10996c implements InterfaceC10677d {

    /* renamed from: g */
    public static final a f26516g = new a(null);

    /* renamed from: h */
    public static final List f26517h = AbstractC9920d.m20041w("connection", Constants.KEY_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i */
    public static final List f26518i = AbstractC9920d.m20041w("connection", Constants.KEY_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final RealConnection f26519a;

    /* renamed from: b */
    public final C10680g f26520b;

    /* renamed from: c */
    public final C10501b f26521c;

    /* renamed from: d */
    public volatile C10997d f26522d;

    /* renamed from: e */
    public final Protocol f26523e;

    /* renamed from: f */
    public volatile boolean f26524f;

    /* renamed from: re.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final List m24252a(C9743w request) {
            AbstractC9979u.m20294g(request, "request");
            C9737q c9737qM19587e = request.m19587e();
            ArrayList arrayList = new ArrayList(c9737qM19587e.size() + 4);
            arrayList.add(new C10994a(C10994a.f26504g, request.m19589g()));
            arrayList.add(new C10994a(C10994a.f26505h, C10682i.f25746a.m22637c(request.m19592j())));
            String strM19586d = request.m19586d("Host");
            if (strM19586d != null) {
                arrayList.add(new C10994a(C10994a.f26507j, strM19586d));
            }
            arrayList.add(new C10994a(C10994a.f26506i, request.m19592j().m19428r()));
            int size = c9737qM19587e.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strM19390b = c9737qM19587e.m19390b(i10);
                Locale US = Locale.US;
                AbstractC9979u.m20293f(US, "US");
                String lowerCase = strM19390b.toLowerCase(US);
                AbstractC9979u.m20293f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!C10996c.f26517h.contains(lowerCase) || (AbstractC9979u.m20289b(lowerCase, "te") && AbstractC9979u.m20289b(c9737qM19587e.m19393f(i10), "trailers"))) {
                    arrayList.add(new C10994a(lowerCase, c9737qM19587e.m19393f(i10)));
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C9745y.a m24253b(C9737q headerBlock, Protocol protocol) throws ProtocolException, NumberFormatException {
            AbstractC9979u.m20294g(headerBlock, "headerBlock");
            AbstractC9979u.m20294g(protocol, "protocol");
            C9737q.a aVar = new C9737q.a();
            int size = headerBlock.size();
            C10684k c10684kM22644a = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strM19390b = headerBlock.m19390b(i10);
                String strM19393f = headerBlock.m19393f(i10);
                if (AbstractC9979u.m20289b(strM19390b, HttpConstant.STATUS)) {
                    c10684kM22644a = C10684k.f25749d.m22644a("HTTP/1.1 " + strM19393f);
                } else if (!C10996c.f26518i.contains(strM19390b)) {
                    aVar.m19398d(strM19390b, strM19393f);
                }
            }
            if (c10684kM22644a != null) {
                return new C9745y.a().m19661p(protocol).m19652g(c10684kM22644a.f25751b).m19658m(c10684kM22644a.f25752c).m19656k(aVar.m19400f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public a() {
        }
    }

    public C10996c(C9742v client, RealConnection connection, C10680g chain, C10501b http2Connection) {
        AbstractC9979u.m20294g(client, "client");
        AbstractC9979u.m20294g(connection, "connection");
        AbstractC9979u.m20294g(chain, "chain");
        AbstractC9979u.m20294g(http2Connection, "http2Connection");
        this.f26519a = connection;
        this.f26520b = chain;
        this.f26521c = http2Connection;
        List listM19506B = client.m19506B();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f26523e = listM19506B.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: a */
    public void mo22606a() {
        C10997d c10997d = this.f26522d;
        AbstractC9979u.m20291d(c10997d);
        c10997d.m24272n().close();
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: b */
    public Sink mo22607b(C9743w request, long j10) {
        AbstractC9979u.m20294g(request, "request");
        C10997d c10997d = this.f26522d;
        AbstractC9979u.m20291d(c10997d);
        return c10997d.m24272n();
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: c */
    public void mo22608c(C9743w request) throws IOException {
        AbstractC9979u.m20294g(request, "request");
        if (this.f26522d != null) {
            return;
        }
        this.f26522d = this.f26521c.m22081L(f26516g.m24252a(request), request.m19583a() != null);
        if (this.f26524f) {
            C10997d c10997d = this.f26522d;
            AbstractC9979u.m20291d(c10997d);
            c10997d.m24264f(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        C10997d c10997d2 = this.f26522d;
        AbstractC9979u.m20291d(c10997d2);
        Timeout timeoutM24280v = c10997d2.m24280v();
        long jM22631h = this.f26520b.m22631h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeoutM24280v.timeout(jM22631h, timeUnit);
        C10997d c10997d3 = this.f26522d;
        AbstractC9979u.m20291d(c10997d3);
        c10997d3.m24258E().timeout(this.f26520b.m22633j(), timeUnit);
    }

    @Override // pe.InterfaceC10677d
    public void cancel() {
        this.f26524f = true;
        C10997d c10997d = this.f26522d;
        if (c10997d != null) {
            c10997d.m24264f(ErrorCode.CANCEL);
        }
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: d */
    public long mo22609d(C9745y response) {
        AbstractC9979u.m20294g(response, "response");
        if (AbstractC10678e.m22615c(response)) {
            return AbstractC9920d.m20040v(response);
        }
        return 0L;
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: e */
    public Source mo22610e(C9745y response) {
        AbstractC9979u.m20294g(response, "response");
        C10997d c10997d = this.f26522d;
        AbstractC9979u.m20291d(c10997d);
        return c10997d.m24274p();
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: f */
    public C9745y.a mo22611f(boolean z10) throws NumberFormatException, IOException {
        C10997d c10997d = this.f26522d;
        if (c10997d == null) {
            throw new IOException("stream wasn't created");
        }
        C9745y.a aVarM24253b = f26516g.m24253b(c10997d.m24256C(), this.f26523e);
        if (z10 && aVarM24253b.m19653h() == 100) {
            return null;
        }
        return aVarM24253b;
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: g */
    public void mo22612g() {
        this.f26521c.flush();
    }

    @Override // pe.InterfaceC10677d
    public RealConnection getConnection() {
        return this.f26519a;
    }
}
