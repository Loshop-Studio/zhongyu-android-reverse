package anetwork.channel.cookie;

import android.text.TextUtils;
import anet.channel.util.ALog;
import anetwork.channel.cookie.CookieManager;

/* renamed from: anetwork.channel.cookie.a */
/* loaded from: classes3.dex */
final class RunnableC5108a implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            if (TextUtils.isEmpty(CookieManager.m2587f())) {
                return;
            }
            CookieManager.C5107a unused = CookieManager.f2845d = new CookieManager.C5107a(CookieManager.m2587f());
        } catch (Exception e10) {
            ALog.m2528e(CookieManager.TAG, "", null, e10, new Object[0]);
        }
    }
}
