package anetwork.channel.cookie;

import android.text.TextUtils;
import anet.channel.util.ALog;
import anetwork.channel.cookie.CookieManager;

/* renamed from: anetwork.channel.cookie.a */
/* loaded from: classes.dex */
final class RunnableC0985a implements Runnable {
    RunnableC0985a() {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (TextUtils.isEmpty(CookieManager.m4696f())) {
                return;
            }
            CookieManager.C0984a unused = CookieManager.f5567d = new CookieManager.C0984a(CookieManager.m4696f());
        } catch (Exception e4) {
            ALog.m4637e(CookieManager.TAG, "", null, e4, new Object[0]);
        }
    }
}
