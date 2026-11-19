package com.taobao.accs.net;

import android.text.TextUtils;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.AccsState;
import com.taobao.accs.net.C7650j;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.util.List;
import java.util.Map;

/* renamed from: com.taobao.accs.net.s */
/* loaded from: classes5.dex */
class C7659s implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ IAuth.AuthCallback f13123a;

    /* renamed from: b */
    final /* synthetic */ C7650j.a f13124b;

    public C7659s(C7650j.a aVar, IAuth.AuthCallback authCallback) {
        this.f13124b = aVar;
        this.f13123a = authCallback;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        if (i10 < 0) {
            this.f13124b.f13102e.mo3537e("auth onFinish", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(i10));
            this.f13123a.onAuthFail(i10, "onFinish auth fail");
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        Map<String, String> mapM10132a = UtilityImpl.m10132a(map);
        this.f13124b.f13102e.mo3534d(BaseMonitor.ALARM_POINT_AUTH, "header", mapM10132a);
        String str = mapM10132a.get("x-at");
        if (!TextUtils.isEmpty(str)) {
            this.f13124b.f13101d.f13062k = str;
        }
        if (i10 == 200) {
            this.f13124b.f13102e.mo3539i(BaseMonitor.ALARM_POINT_AUTH, "httpStatusCode", Integer.valueOf(i10));
            this.f13123a.onAuthSuccess();
            if (this.f13124b.f13101d instanceof C7650j) {
                ((C7650j) this.f13124b.f13101d).m10064q();
                return;
            }
            return;
        }
        String str2 = mapM10132a.get("s-accs-retcode");
        this.f13124b.f13102e.mo3537e(BaseMonitor.ALARM_POINT_AUTH, "httpStatusCode", Integer.valueOf(i10));
        AccsState.getInstance().m9843b(AccsState.RECENT_ERRORS, "auth fail " + str2);
        this.f13123a.onAuthFail(i10, "auth fail");
    }
}
