package com.aliyun.ams.emas.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.taobao.accs.dispatch.IntentDispatch;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.TaobaoBaseIntentService;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes.dex */
public class AgooInnerService extends TaobaoBaseIntentService {
    /* renamed from: a */
    private static String m5377a(Bundle bundle, int i4) {
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            for (int i5 = 0; i5 < i4; i5++) {
                sb.append('\t');
            }
            if (obj instanceof String) {
                sb.append("String\t");
                sb.append(str);
                sb.append('\t');
                sb.append(obj);
                sb.append('\n');
            } else if (obj instanceof Integer) {
                sb.append("int\t");
                sb.append(str);
                sb.append('\t');
                sb.append(obj);
                sb.append('\n');
            } else if (obj instanceof Long) {
                sb.append("long\t");
                sb.append(str);
                sb.append('\t');
                sb.append(obj);
                sb.append('\n');
            } else if (obj instanceof Boolean) {
                sb.append("boolean\t");
                sb.append(str);
                sb.append('\t');
                sb.append(obj);
                sb.append('\n');
            } else if (obj instanceof Bundle) {
                sb.append("Bundle\t");
                sb.append(str);
                sb.append('\t');
                sb.append('\n');
                sb.append(m5377a((Bundle) obj, i4 + 1));
            } else {
                sb.append("unknown\t");
                sb.append(str);
                sb.append('\t');
                sb.append(obj);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    protected void onError(Context context, String str) {
        ALog.m6093i("AgooInnerService", "onError:" + str, new Object[0]);
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    protected void onMessage(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
        ALog.m6093i("AgooInnerService", "onMessage:id:" + intent.getStringExtra("id") + ", task_id:" + intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID) + ", body:" + stringExtra, new Object[0]);
        ALog.m6093i("AgooInnerService", m5377a(intent.getExtras(), 1), new Object[0]);
        Intent intent2 = new Intent();
        intent2.putExtras(intent.getExtras());
        intent2.setAction("com.alibaba.sdk.android.push.RECEIVE");
        intent2.setPackage(context.getPackageName());
        try {
            Class<?> clsM5389a = C1204l.m5389a();
            if (clsM5389a == null) {
                ALog.m6090d("AgooInnerService", "Send broadcast", new Object[0]);
                context.sendBroadcast(intent2, context.getPackageName() + ".AGOO");
            } else {
                ALog.m6090d("AgooInnerService", "Start service:" + clsM5389a.getName(), new Object[0]);
                intent2.setClass(context, clsM5389a);
                IntentDispatch.dispatchIntent(context, intent2, clsM5389a.getName());
            }
        } catch (Throwable th) {
            ALog.m6091e("AgooInnerService", "Send message failed.", th, new Object[0]);
        }
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    protected void onRegistered(Context context, String str) {
        ALog.m6093i("AgooInnerService", "onRegistered:" + str, new Object[0]);
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService
    protected void onUnregistered(Context context, String str) {
        ALog.m6093i("AgooInnerService", "onUnregistered:" + str, new Object[0]);
    }
}
