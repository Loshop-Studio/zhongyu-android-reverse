package anetwork.channel.unified;

import android.text.TextUtils;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.session.C0919b;
import anet.channel.util.HttpConstant;
import anet.channel.util.StringUtils;
import anetwork.channel.cookie.CookieManager;

/* renamed from: anetwork.channel.unified.b */
/* loaded from: classes.dex */
public class C1001b implements IUnifiedTask {

    /* renamed from: c */
    private C1009j f5642c;

    /* renamed from: f */
    private Request f5645f;

    /* renamed from: b */
    private volatile boolean f5641b = false;

    /* renamed from: a */
    volatile Cancelable f5640a = null;

    /* renamed from: d */
    private int f5643d = 0;

    /* renamed from: e */
    private int f5644e = 0;

    public C1001b(C1009j c1009j) {
        this.f5642c = c1009j;
        this.f5645f = c1009j.f5682a.m4724a();
    }

    /* renamed from: b */
    static /* synthetic */ int m4740b(C1001b c1001b) {
        int i4 = c1001b.f5644e;
        c1001b.f5644e = i4 + 1;
        return i4;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        this.f5641b = true;
        if (this.f5640a != null) {
            this.f5640a.cancel();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5641b) {
            return;
        }
        if (this.f5642c.f5682a.m4735i()) {
            String cookie = CookieManager.getCookie(this.f5642c.f5682a.m4733g());
            if (!TextUtils.isEmpty(cookie)) {
                Request.Builder builderNewBuilder = this.f5645f.newBuilder();
                String str = this.f5645f.getHeaders().get(HttpConstant.COOKIE);
                if (!TextUtils.isEmpty(str)) {
                    cookie = StringUtils.concatString(str, "; ", cookie);
                }
                builderNewBuilder.addHeader(HttpConstant.COOKIE, cookie);
                this.f5645f = builderNewBuilder.build();
            }
        }
        this.f5645f.f5223a.degraded = 2;
        this.f5645f.f5223a.sendBeforeTime = System.currentTimeMillis() - this.f5645f.f5223a.reqStart;
        C0919b.m4540a(this.f5645f, new C1002c(this));
    }
}
