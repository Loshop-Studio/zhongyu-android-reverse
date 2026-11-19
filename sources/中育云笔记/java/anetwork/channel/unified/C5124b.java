package anetwork.channel.unified;

import android.text.TextUtils;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.session.C5042b;
import anet.channel.util.HttpConstant;
import anet.channel.util.StringUtils;
import anetwork.channel.cookie.CookieManager;

/* renamed from: anetwork.channel.unified.b */
/* loaded from: classes3.dex */
public class C5124b implements IUnifiedTask {

    /* renamed from: c */
    private C5132j f2920c;

    /* renamed from: f */
    private Request f2923f;

    /* renamed from: b */
    private volatile boolean f2919b = false;

    /* renamed from: a */
    volatile Cancelable f2918a = null;

    /* renamed from: d */
    private int f2921d = 0;

    /* renamed from: e */
    private int f2922e = 0;

    public C5124b(C5132j c5132j) {
        this.f2920c = c5132j;
        this.f2923f = c5132j.f2960a.m2615a();
    }

    /* renamed from: b */
    public static /* synthetic */ int m2631b(C5124b c5124b) {
        int i10 = c5124b.f2922e;
        c5124b.f2922e = i10 + 1;
        return i10;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        this.f2919b = true;
        if (this.f2918a != null) {
            this.f2918a.cancel();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2919b) {
            return;
        }
        if (this.f2920c.f2960a.m2626i()) {
            String cookie = CookieManager.getCookie(this.f2920c.f2960a.m2624g());
            if (!TextUtils.isEmpty(cookie)) {
                Request.Builder builderNewBuilder = this.f2923f.newBuilder();
                String str = this.f2923f.getHeaders().get(HttpConstant.COOKIE);
                if (!TextUtils.isEmpty(str)) {
                    cookie = StringUtils.concatString(str, "; ", cookie);
                }
                builderNewBuilder.addHeader(HttpConstant.COOKIE, cookie);
                this.f2923f = builderNewBuilder.build();
            }
        }
        this.f2923f.f2501a.degraded = 2;
        this.f2923f.f2501a.sendBeforeTime = System.currentTimeMillis() - this.f2923f.f2501a.reqStart;
        C5042b.m2431a(this.f2923f, new C5125c(this));
    }
}
