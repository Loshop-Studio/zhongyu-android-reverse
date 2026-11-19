package com.huawei.hms.support.api.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import p344t5.AbstractC11234h;
import p344t5.AbstractC11244r;

/* loaded from: classes5.dex */
public class PushMsgReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static void m8692a(Context context, Intent intent) {
        if (intent.hasExtra("selfshow_info")) {
            if (!AbstractC11234h.m25007a(context)) {
                HMSLog.m8727i("PushMsgReceiver", context.getPackageName() + " disable display notification.");
                if (!intent.hasExtra("selfshow_event_id")) {
                    return;
                }
            }
            AbstractC11244r.m25077a(context, intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        HMSLog.m8727i("PushMsgReceiver", "push receive broadcast message, Intent:" + intent.getAction() + " pkgName:" + context.getPackageName());
        try {
            intent.getStringExtra("TestIntent");
            String action = intent.getAction();
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context.getApplicationContext());
            }
            if ("com.huawei.intent.action.PUSH_DELAY_NOTIFY".equals(action) || ("com.huawei.intent.action.PUSH".equals(action) && HwBuildEx.VERSION.EMUI_SDK_INT < 10)) {
                m8692a(context, intent);
            } else {
                HMSLog.m8727i("PushMsgReceiver", "message can't be recognised.");
            }
        } catch (Exception unused) {
            HMSLog.m8725e("PushMsgReceiver", "intent has some error");
        }
    }
}
