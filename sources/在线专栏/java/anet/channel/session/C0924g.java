package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.C0890b;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import java.util.List;
import java.util.Map;

/* renamed from: anet.channel.session.g */
/* loaded from: classes.dex */
class C0924g implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ RunnableC0923f f5301a;

    C0924g(RunnableC0923f runnableC0923f) {
        this.f5301a = runnableC0923f;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z3) {
        this.f5301a.f5298b.onDataReceive(byteArray, z3);
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i4, String str, RequestStatistic requestStatistic) {
        if (i4 <= 0 && i4 != -204) {
            this.f5301a.f5300d.handleCallbacks(2, new C0890b(2, 0, "Http connect fail"));
        }
        this.f5301a.f5298b.onFinish(i4, str, requestStatistic);
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i4, Map<String, List<String>> map) {
        ALog.m4639i("awcn.HttpSession", "", this.f5301a.f5297a.getSeq(), "httpStatusCode", Integer.valueOf(i4));
        ALog.m4639i("awcn.HttpSession", "", this.f5301a.f5297a.getSeq(), "response headers", map);
        this.f5301a.f5298b.onResponseCode(i4, map);
        this.f5301a.f5299c.serverRT = HttpHelper.parseServerRT(map);
        RunnableC0923f runnableC0923f = this.f5301a;
        runnableC0923f.f5300d.handleResponseCode(runnableC0923f.f5297a, i4);
        RunnableC0923f runnableC0923f2 = this.f5301a;
        runnableC0923f2.f5300d.handleResponseHeaders(runnableC0923f2.f5297a, map);
    }
}
