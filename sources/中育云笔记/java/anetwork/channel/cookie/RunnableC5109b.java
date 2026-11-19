package anetwork.channel.cookie;

import anet.channel.util.ALog;
import java.net.HttpCookie;

/* renamed from: anetwork.channel.cookie.b */
/* loaded from: classes3.dex */
final class RunnableC5109b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2852a;

    public RunnableC5109b(String str) {
        this.f2852a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (CookieManager.f2845d == null) {
            return;
        }
        try {
            for (HttpCookie httpCookie : HttpCookie.parse(this.f2852a)) {
                if (httpCookie.getName().equals(CookieManager.f2845d.f2847a)) {
                    CookieManager.f2845d.f2848b = httpCookie.toString();
                    CookieManager.f2845d.f2850d = httpCookie.getDomain();
                    CookieManager.f2845d.f2849c = this.f2852a;
                    CookieManager.f2845d.m2588a();
                    return;
                }
            }
        } catch (Exception e10) {
            ALog.m2528e(CookieManager.TAG, "cookieMonitorSave error.", null, e10, new Object[0]);
        }
    }
}
