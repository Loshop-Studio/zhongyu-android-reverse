package com.taobao.accs.dispatch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.taobao.accs.messenger.C7634a;
import com.taobao.accs.messenger.C7638e;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.Utils;

/* loaded from: classes5.dex */
public class IntentDispatch {
    public static final String TAG = "IntentDispatch";
    private static C7638e binderDispatcher;

    public static void dispatchIntent(Context context, Intent intent, String str) {
        if (context == null || intent == null) {
            ALog.m10118e(TAG, "dispatchIntent context or intent is null", new Object[0]);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            if (!Utils.isTarget26(applicationContext)) {
                ALog.m10119i(TAG, "dispatchIntent start service ", new Object[0]);
                applicationContext.startService(intent);
            } else {
                if (binderDispatcher == null) {
                    binderDispatcher = new C7638e(new C7634a(applicationContext));
                }
                binderDispatcher.m10012a(str, intent);
            }
        } catch (Exception e10) {
            ALog.m10118e(TAG, "dispatchIntent method call with exception ", e10.toString());
            e10.printStackTrace();
        }
    }

    private static Intent filterExtras(Intent intent) {
        Intent intent2 = (Intent) intent.clone();
        intent2.replaceExtras(new Bundle());
        return intent2;
    }

    private static final String printBundle(Bundle bundle, int i10) {
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
                sb2.append(printBundle((Bundle) obj, i10 + 1));
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
}
