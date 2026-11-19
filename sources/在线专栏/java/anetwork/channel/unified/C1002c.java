package anetwork.channel.unified;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cookie.CookieManager;
import com.taobao.accs.common.Constants;
import java.util.List;
import java.util.Map;

/* renamed from: anetwork.channel.unified.c */
/* loaded from: classes.dex */
class C1002c implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ C1001b f5646a;

    C1002c(C1001b c1001b) {
        this.f5646a = c1001b;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z3) {
        if (this.f5646a.f5642c.f5685d.get()) {
            return;
        }
        C1001b.m4740b(this.f5646a);
        if (this.f5646a.f5642c.f5683b != null) {
            this.f5646a.f5642c.f5683b.onDataReceiveSize(this.f5646a.f5644e, this.f5646a.f5643d, byteArray);
        }
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i4, String str, RequestStatistic requestStatistic) {
        if (this.f5646a.f5642c.f5685d.getAndSet(true)) {
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.m4639i("anet.DegradeTask", "[onFinish]", this.f5646a.f5642c.f5684c, Constants.KEY_HTTP_CODE, Integer.valueOf(i4), "msg", str);
        }
        this.f5646a.f5642c.m4757a();
        requestStatistic.isDone.set(true);
        if (this.f5646a.f5642c.f5683b != null) {
            this.f5646a.f5642c.f5683b.onFinish(new DefaultFinishEvent(i4, str, this.f5646a.f5645f));
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i4, Map<String, List<String>> map) {
        if (this.f5646a.f5642c.f5685d.get()) {
            return;
        }
        this.f5646a.f5642c.m4757a();
        CookieManager.setCookie(this.f5646a.f5642c.f5682a.m4733g(), map);
        this.f5646a.f5643d = HttpHelper.parseContentLength(map);
        if (this.f5646a.f5642c.f5683b != null) {
            this.f5646a.f5642c.f5683b.onResponseCode(i4, map);
        }
    }
}
