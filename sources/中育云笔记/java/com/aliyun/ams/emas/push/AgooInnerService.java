package com.aliyun.ams.emas.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.taobao.accs.dispatch.IntentDispatch;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.TaobaoBaseIntentService;
import org.android.agoo.common.AgooConstants;
import p038c0.AbstractC5218n;

/* loaded from: classes3.dex */
public class AgooInnerService extends TaobaoBaseIntentService {
    /* renamed from: a */
    public static String m3874a(Bundle bundle, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append('\t');
            }
            if (obj instanceof String) {
                sb2.append("String\t");
                sb2.append(str);
                sb2.append('\t');
                sb2.append(obj);
                sb2.append('\n');
            } else if (obj instanceof Integer) {
                sb2.append("int\t");
                sb2.append(str);
                sb2.append('\t');
                sb2.append(obj);
                sb2.append('\n');
            } else if (obj instanceof Long) {
                sb2.append("long\t");
                sb2.append(str);
                sb2.append('\t');
                sb2.append(obj);
                sb2.append('\n');
            } else if (obj instanceof Boolean) {
                sb2.append("boolean\t");
                sb2.append(str);
                sb2.append('\t');
                sb2.append(obj);
                sb2.append('\n');
            } else if (obj instanceof Bundle) {
                sb2.append("Bundle\t");
                sb2.append(str);
                sb2.append('\t');
                sb2.append('\n');
                sb2.append(m3874a((Bundle) obj, i10 + 1));
            } else {
                sb2.append("unknown\t");
                sb2.append(str);
                sb2.append('\t');
                sb2.append(obj);
                sb2.append('\n');
            }
        }
        return sb2.toString();
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    public void onError(Context context, String str) {
        ALog.m10119i("AgooInnerService", "onError:" + str, new Object[0]);
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    public void onMessage(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
        ALog.m10119i("AgooInnerService", "onMessage:id:" + intent.getStringExtra(AgooConstants.MESSAGE_ID) + ", task_id:" + intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID) + ", body:" + stringExtra, new Object[0]);
        ALog.m10119i("AgooInnerService", m3874a(intent.getExtras(), 1), new Object[0]);
        Intent intent2 = new Intent();
        intent2.putExtras(intent.getExtras());
        intent2.setAction("com.alibaba.sdk.android.push.RECEIVE");
        intent2.setPackage(context.getPackageName());
        try {
            Class<?> clsM2784a = AbstractC5218n.m2784a();
            if (clsM2784a == null) {
                ALog.m10116d("AgooInnerService", "Send broadcast", new Object[0]);
                context.sendBroadcast(intent2, context.getPackageName() + ".AGOO");
                return;
            }
            ALog.m10116d("AgooInnerService", "Start service:" + clsM2784a.getName(), new Object[0]);
            intent2.setClass(context, clsM2784a);
            IntentDispatch.dispatchIntent(context, intent2, clsM2784a.getName());
        } catch (Throwable th) {
            ALog.m10117e("AgooInnerService", "Send message failed.", th, new Object[0]);
        }
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    public void onRegistered(Context context, String str) {
        ALog.m10119i("AgooInnerService", "onRegistered:" + str, new Object[0]);
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService
    public void onUnregistered(Context context, String str) {
        ALog.m10119i("AgooInnerService", "onUnregistered:" + str, new Object[0]);
    }
}
