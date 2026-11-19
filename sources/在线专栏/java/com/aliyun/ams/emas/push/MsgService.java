package com.aliyun.ams.emas.push;

import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.data.MsgDistributeService;
import com.taobao.accs.utl.ALog;
import p115l1.C2838e;

/* loaded from: classes.dex */
public class MsgService extends MsgDistributeService {

    /* renamed from: b */
    C2838e f6918b = new C2838e();

    @Override // com.taobao.accs.data.MsgDistributeService, android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        if (intent == null) {
            ALog.m6090d("MPS:MsgService", "intent null", new Object[0]);
            return super.onStartCommand(intent, i4, i5);
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return super.onStartCommand(intent, i4, i5);
        }
        ALog.m6090d("MPS:MsgService", "MsgService onStartCommand begin...action=" + action, new Object[0]);
        if (!TextUtils.equals(action, C1204l.f6943b)) {
            return super.onStartCommand(intent, i4, i5);
        }
        this.f6918b.m9532a(intent, getApplicationContext());
        return 2;
    }
}
