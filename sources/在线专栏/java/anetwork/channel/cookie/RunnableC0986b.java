package anetwork.channel.cookie;

import anet.channel.util.ALog;
import java.net.HttpCookie;

/* renamed from: anetwork.channel.cookie.b */
/* loaded from: classes.dex */
final class RunnableC0986b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f5574a;

    RunnableC0986b(String str) {
        this.f5574a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (CookieManager.f5567d == null) {
            return;
        }
        try {
            for (HttpCookie httpCookie : HttpCookie.parse(this.f5574a)) {
                if (httpCookie.getName().equals(CookieManager.f5567d.f5569a)) {
                    CookieManager.f5567d.f5570b = httpCookie.toString();
                    CookieManager.f5567d.f5572d = httpCookie.getDomain();
                    CookieManager.f5567d.f5571c = this.f5574a;
                    CookieManager.f5567d.m4697a();
                    return;
                }
            }
        } catch (Exception e4) {
            ALog.m4637e(CookieManager.TAG, "cookieMonitorSave error.", null, e4, new Object[0]);
        }
    }
}
