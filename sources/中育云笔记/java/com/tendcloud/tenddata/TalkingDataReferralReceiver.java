package com.tendcloud.tenddata;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import anet.channel.request.Request;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.tendcloud.tenddata.C8022zz;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public class TalkingDataReferralReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws UnsupportedEncodingException {
        String stringExtra;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.containsKey(null);
            }
            if (!"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) || (stringExtra = intent.getStringExtra("referrer")) == null || stringExtra.length() == 0) {
                return;
            }
            String strDecode = URLDecoder.decode(stringExtra, Request.DEFAULT_CHARSET);
            if (C7843ab.f14307g == null) {
                C7843ab.f14307g = context.getApplicationContext();
            }
            C8022zz.a aVar = new C8022zz.a();
            aVar.paraMap.put(DispatchConstants.DOMAIN, "app");
            aVar.paraMap.put("apiType", 1);
            aVar.paraMap.put("action", "install");
            aVar.paraMap.put("service", AbstractC7841a.UNIVERSAL);
            TreeMap treeMap = new TreeMap();
            treeMap.put(RequestParameters.SUBRESOURCE_REFERER, strDecode);
            aVar.paraMap.put("data", treeMap);
            C8022zz.m12134c().obtainMessage(102, aVar).sendToTarget();
        } catch (Throwable unused) {
        }
    }
}
