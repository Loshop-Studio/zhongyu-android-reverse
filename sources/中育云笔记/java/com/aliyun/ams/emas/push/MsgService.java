package com.aliyun.ams.emas.push;

import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.data.MsgDistributeService;
import com.taobao.accs.utl.ALog;
import p038c0.AbstractC5218n;
import p124e0.C9067g;

/* loaded from: classes3.dex */
public class MsgService extends MsgDistributeService {

    /* renamed from: c */
    public C9067g f4535c = new C9067g();

    @Override // com.taobao.accs.data.MsgDistributeService, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (intent == null) {
            ALog.m10116d("MPS:MsgService", "intent null", new Object[0]);
            return super.onStartCommand(intent, i10, i11);
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return super.onStartCommand(intent, i10, i11);
        }
        ALog.m10116d("MPS:MsgService", "MsgService onStartCommand begin...action=" + action, new Object[0]);
        if (!TextUtils.equals(action, AbstractC5218n.f3102b)) {
            return super.onStartCommand(intent, i10, i11);
        }
        this.f4535c.m17852a(intent, getApplicationContext());
        return 2;
    }
}
