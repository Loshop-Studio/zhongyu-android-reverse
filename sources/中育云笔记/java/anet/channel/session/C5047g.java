package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.C5013b;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import java.util.List;
import java.util.Map;

/* renamed from: anet.channel.session.g */
/* loaded from: classes3.dex */
class C5047g implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ RunnableC5046f f2579a;

    public C5047g(RunnableC5046f runnableC5046f) {
        this.f2579a = runnableC5046f;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
        this.f2579a.f2576b.onDataReceive(byteArray, z10);
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        if (i10 <= 0 && i10 != -204) {
            this.f2579a.f2578d.handleCallbacks(2, new C5013b(2, 0, "Http connect fail"));
        }
        this.f2579a.f2576b.onFinish(i10, str, requestStatistic);
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        ALog.m2530i("awcn.HttpSession", "", this.f2579a.f2575a.getSeq(), "httpStatusCode", Integer.valueOf(i10));
        ALog.m2530i("awcn.HttpSession", "", this.f2579a.f2575a.getSeq(), "response headers", map);
        this.f2579a.f2576b.onResponseCode(i10, map);
        this.f2579a.f2577c.serverRT = HttpHelper.parseServerRT(map);
        RunnableC5046f runnableC5046f = this.f2579a;
        runnableC5046f.f2578d.handleResponseCode(runnableC5046f.f2575a, i10);
        RunnableC5046f runnableC5046f2 = this.f2579a;
        runnableC5046f2.f2578d.handleResponseHeaders(runnableC5046f2.f2575a, map);
    }
}
