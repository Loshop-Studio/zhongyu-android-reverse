package anetwork.channel.cookie;

import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.CookieMonitorStat;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import com.huawei.hms.framework.common.ContainerUtils;
import java.net.HttpCookie;

/* renamed from: anetwork.channel.cookie.c */
/* loaded from: classes3.dex */
final class RunnableC5110c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2853a;

    /* renamed from: b */
    final /* synthetic */ String f2854b;

    public RunnableC5110c(String str, String str2) {
        this.f2853a = str;
        this.f2854b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (CookieManager.f2845d == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(CookieManager.f2845d.f2847a) || !HttpCookie.domainMatches(CookieManager.f2845d.f2850d, HttpUrl.parse(this.f2853a).host()) || TextUtils.isEmpty(this.f2854b)) {
                return;
            }
            if (this.f2854b.contains(CookieManager.f2845d.f2847a + ContainerUtils.KEY_VALUE_DELIMITER)) {
                return;
            }
            CookieMonitorStat cookieMonitorStat = new CookieMonitorStat(this.f2853a);
            cookieMonitorStat.cookieName = CookieManager.f2845d.f2847a;
            cookieMonitorStat.cookieText = CookieManager.f2845d.f2848b;
            cookieMonitorStat.setCookie = CookieManager.f2845d.f2849c;
            cookieMonitorStat.missType = 1;
            AppMonitor.getInstance().commitStat(cookieMonitorStat);
        } catch (Exception e10) {
            ALog.m2528e(CookieManager.TAG, "cookieMonitorReport error.", null, e10, new Object[0]);
        }
    }
}
