package anetwork.channel.cookie;

import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.CookieMonitorStat;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import java.net.HttpCookie;

/* renamed from: anetwork.channel.cookie.c */
/* loaded from: classes.dex */
final class RunnableC0987c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f5575a;

    /* renamed from: b */
    final /* synthetic */ String f5576b;

    RunnableC0987c(String str, String str2) {
        this.f5575a = str;
        this.f5576b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (CookieManager.f5567d == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(CookieManager.f5567d.f5569a) || !HttpCookie.domainMatches(CookieManager.f5567d.f5572d, HttpUrl.parse(this.f5575a).host()) || TextUtils.isEmpty(this.f5576b)) {
                return;
            }
            if (this.f5576b.contains(CookieManager.f5567d.f5569a + "=")) {
                return;
            }
            CookieMonitorStat cookieMonitorStat = new CookieMonitorStat(this.f5575a);
            cookieMonitorStat.cookieName = CookieManager.f5567d.f5569a;
            cookieMonitorStat.cookieText = CookieManager.f5567d.f5570b;
            cookieMonitorStat.setCookie = CookieManager.f5567d.f5571c;
            cookieMonitorStat.missType = 1;
            AppMonitor.getInstance().commitStat(cookieMonitorStat);
        } catch (Exception e4) {
            ALog.m4637e(CookieManager.TAG, "cookieMonitorReport error.", null, e4, new Object[0]);
        }
    }
}
