package p218k5;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p173h5.InterfaceC9493b;
import p189i5.C9607a;
import p189i5.C9609c;
import p234l5.AbstractC10146a;
import p247m5.C10201b;
import p247m5.C10202c;
import p247m5.C10203d;
import p259n5.AbstractC10320d;

/* renamed from: k5.g */
/* loaded from: classes5.dex */
public class C9817g {

    /* renamed from: b */
    public static final ExecutorService f23049b = ExecutorsUtils.newCachedThreadPool("GrsReqPool");

    /* renamed from: c */
    public static final Map f23050c = new ConcurrentHashMap(16);

    /* renamed from: d */
    public static final Object f23051d = new Object();

    /* renamed from: a */
    public C9607a f23052a;

    /* renamed from: k5.g$a */
    public class a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ C10202c f23053a;

        /* renamed from: b */
        public final /* synthetic */ String f23054b;

        /* renamed from: c */
        public final /* synthetic */ C9609c f23055c;

        public a(C10202c c10202c, String str, C9609c c9609c) {
            this.f23053a = c10202c;
            this.f23054b = str;
            this.f23055c = c9609c;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9814d call() {
            return new C9813c(this.f23053a, C9817g.this.f23052a).m19832b(C9817g.f23049b, this.f23054b, this.f23055c);
        }
    }

    /* renamed from: k5.g$b */
    public class b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ C10202c f23057c;

        /* renamed from: d */
        public final /* synthetic */ String f23058d;

        /* renamed from: e */
        public final /* synthetic */ C9609c f23059e;

        /* renamed from: f */
        public final /* synthetic */ int f23060f;

        /* renamed from: g */
        public final /* synthetic */ InterfaceC9493b f23061g;

        public b(C10202c c10202c, String str, C9609c c9609c, int i10, InterfaceC9493b interfaceC9493b) {
            this.f23057c = c10202c;
            this.f23058d = str;
            this.f23059e = c9609c;
            this.f23060f = i10;
            this.f23061g = interfaceC9493b;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9817g c9817g = C9817g.this;
            c9817g.m19885f(c9817g.m19882c(this.f23057c, this.f23058d, this.f23059e, this.f23060f), this.f23061g);
        }
    }

    /* renamed from: c */
    public C9814d m19882c(C10202c c10202c, String str, C9609c c9609c, int i10) {
        Future futureSubmit;
        String str2;
        String str3;
        Logger.m8571d("RequestController", "request to server with service name is: " + str);
        String grsParasKey = c10202c.m21309c().getGrsParasKey(true, true, c10202c.m21307a());
        Logger.m8586v("RequestController", "request spUrlKey: " + grsParasKey);
        synchronized (f23051d) {
            try {
                if (NetworkUtil.isNetworkAvailable(c10202c.m21307a())) {
                    AbstractC10320d.a aVarM21530a = AbstractC10320d.m21530a(grsParasKey);
                    Map map = f23050c;
                    C10201b c10201b = (C10201b) map.get(grsParasKey);
                    if (c10201b != null && c10201b.m21306b()) {
                        futureSubmit = c10201b.m21305a();
                    } else if (aVarM21530a == null || !aVarM21530a.m21532a()) {
                        Logger.m8571d("RequestController", "hitGrsRequestBean == null or request block is released.");
                        futureSubmit = f23049b.submit(new a(c10202c, str, c9609c));
                        map.put(grsParasKey, new C10201b(futureSubmit));
                    }
                    if (i10 == -1) {
                        C10203d c10203dM21162a = AbstractC10146a.m21162a(c10202c.m21307a());
                        i10 = c10203dM21162a != null ? c10203dM21162a.m21319f() : 10;
                    }
                    Logger.m8581i("RequestController", "use grsQueryTimeout %d", Integer.valueOf(i10));
                    try {
                        return (C9814d) futureSubmit.get(i10, TimeUnit.SECONDS);
                    } catch (InterruptedException e10) {
                        e = e10;
                        str2 = "RequestController";
                        str3 = "when check result, find InterruptedException, check others";
                        Logger.m8589w(str2, str3, e);
                        return null;
                    } catch (CancellationException e11) {
                        e = e11;
                        str2 = "RequestController";
                        str3 = "when check result, find CancellationException, check others";
                        Logger.m8589w(str2, str3, e);
                        return null;
                    } catch (ExecutionException e12) {
                        e = e12;
                        str2 = "RequestController";
                        str3 = "when check result, find ExecutionException, check others";
                        Logger.m8589w(str2, str3, e);
                        return null;
                    } catch (TimeoutException e13) {
                        e = e13;
                        str2 = "RequestController";
                        str3 = "when check result, find TimeoutException, check others";
                        Logger.m8589w(str2, str3, e);
                        return null;
                    } catch (Exception e14) {
                        e = e14;
                        str2 = "RequestController";
                        str3 = "when check result, find Other Exception, check others";
                        Logger.m8589w(str2, str3, e);
                        return null;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public void m19883d(C9607a c9607a) {
        this.f23052a = c9607a;
    }

    /* renamed from: e */
    public void m19884e(String str) {
        synchronized (f23051d) {
            f23050c.remove(str);
        }
    }

    /* renamed from: f */
    public final void m19885f(C9814d c9814d, InterfaceC9493b interfaceC9493b) {
        if (interfaceC9493b != null) {
            if (c9814d == null) {
                Logger.m8586v("RequestController", "GrsResponse is null");
                interfaceC9493b.mo18668a();
            } else {
                Logger.m8586v("RequestController", "GrsResponse is not null");
                interfaceC9493b.mo18669a(c9814d);
            }
        }
    }

    /* renamed from: h */
    public void m19886h(C10202c c10202c, InterfaceC9493b interfaceC9493b, String str, C9609c c9609c, int i10) {
        f23049b.execute(new b(c10202c, str, c9609c, i10, interfaceC9493b));
    }
}
