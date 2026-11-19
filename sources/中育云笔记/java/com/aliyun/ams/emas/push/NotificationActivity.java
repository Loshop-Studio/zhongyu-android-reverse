package com.aliyun.ams.emas.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import p038c0.AbstractC5218n;
import p124e0.C9067g;

/* loaded from: classes3.dex */
public class NotificationActivity extends Activity {

    /* renamed from: c */
    public C9067g f4536c = new C9067g();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            String action = intent.getAction();
            ALog.m10116d("MPS:NotificationActivity", " onCreate begin...action=" + action, new Object[0]);
            if (TextUtils.equals(action, AbstractC5218n.f3102b)) {
                this.f4536c.m17853b(intent, getApplicationContext(), 1);
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            String action = intent.getAction();
            ALog.m10116d("MPS:NotificationActivity", " onNewIntent begin...action=" + action, new Object[0]);
            if (TextUtils.equals(action, AbstractC5218n.f3102b)) {
                this.f4536c.m17853b(intent, getApplicationContext(), 1);
            }
        }
        finish();
    }
}
