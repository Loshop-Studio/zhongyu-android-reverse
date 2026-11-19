package com.taobao.accs.net;

import android.text.TextUtils;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import com.taobao.accs.AccsState;
import com.taobao.accs.net.C1753j;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.util.List;
import java.util.Map;

/* renamed from: com.taobao.accs.net.s */
/* loaded from: classes.dex */
class C1762s implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ IAuth.AuthCallback f7725a;

    /* renamed from: b */
    final /* synthetic */ C1753j.a f7726b;

    C1762s(C1753j.a aVar, IAuth.AuthCallback authCallback) {
        this.f7726b = aVar;
        this.f7725a = authCallback;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z3) {
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i4, String str, RequestStatistic requestStatistic) {
        if (i4 < 0) {
            this.f7726b.f7704e.mo5087e("auth onFinish", "statusCode", Integer.valueOf(i4));
            this.f7725a.onAuthFail(i4, "onFinish auth fail");
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i4, Map<String, List<String>> map) {
        Map<String, String> mapM6106a = UtilityImpl.m6106a(map);
        this.f7726b.f7704e.mo5084d(BaseMonitor.ALARM_POINT_AUTH, "header", mapM6106a);
        String str = mapM6106a.get("x-at");
        if (!TextUtils.isEmpty(str)) {
            this.f7726b.f7703d.f7664k = str;
        }
        if (i4 == 200) {
            this.f7726b.f7704e.mo5089i(BaseMonitor.ALARM_POINT_AUTH, "httpStatusCode", Integer.valueOf(i4));
            this.f7725a.onAuthSuccess();
            if (this.f7726b.f7703d instanceof C1753j) {
                ((C1753j) this.f7726b.f7703d).m6038q();
                return;
            }
            return;
        }
        String str2 = mapM6106a.get("s-accs-retcode");
        this.f7726b.f7704e.mo5087e(BaseMonitor.ALARM_POINT_AUTH, "httpStatusCode", Integer.valueOf(i4));
        AccsState.getInstance().m5817b(AccsState.RECENT_ERRORS, "auth fail " + str2);
        this.f7725a.onAuthFail(i4, "auth fail");
    }
}
