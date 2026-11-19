package com.taobao.accs.dispatch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.taobao.accs.messenger.C1737a;
import com.taobao.accs.messenger.C1741e;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.Utils;

/* loaded from: classes.dex */
public class IntentDispatch {
    public static final String TAG = "IntentDispatch";
    private static C1741e binderDispatcher;

    public static void dispatchIntent(Context context, Intent intent, String str) {
        if (context == null || intent == null) {
            ALog.m6092e(TAG, "dispatchIntent context or intent is null", new Object[0]);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            if (!Utils.isTarget26(applicationContext)) {
                ALog.m6093i(TAG, "dispatchIntent start service ", new Object[0]);
                applicationContext.startService(intent);
            } else {
                if (binderDispatcher == null) {
                    binderDispatcher = new C1741e(new C1737a(applicationContext));
                }
                binderDispatcher.m5986a(str, intent);
            }
        } catch (Exception e4) {
            ALog.m6092e(TAG, "dispatchIntent method call with exception ", e4.toString());
            e4.printStackTrace();
        }
    }

    private static Intent filterExtras(Intent intent) {
        Intent intent2 = (Intent) intent.clone();
        intent2.replaceExtras(new Bundle());
        return intent2;
    }

    private static final String printBundle(Bundle bundle, int i4) {
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
                sb.append(printBundle((Bundle) obj, i4 + 1));
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
}
