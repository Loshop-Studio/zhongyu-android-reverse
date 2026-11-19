package com.aliyun.ams.emas.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import p115l1.C2838e;

/* loaded from: classes.dex */
public class NotificationActivity extends Activity {

    /* renamed from: a */
    C2838e f6919a = new C2838e();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            String action = intent.getAction();
            ALog.m6090d("MPS:NotificationActivity", " onCreate begin...action=" + action, new Object[0]);
            if (TextUtils.equals(action, C1204l.f6943b)) {
                this.f6919a.m9533b(intent, getApplicationContext(), 1);
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            String action = intent.getAction();
            ALog.m6090d("MPS:NotificationActivity", " onNewIntent begin...action=" + action, new Object[0]);
            if (TextUtils.equals(action, C1204l.f6943b)) {
                this.f6919a.m9533b(intent, getApplicationContext(), 1);
            }
        }
        finish();
    }
}
