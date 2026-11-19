package com.efs.sdk.base.p035a.p050i;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p046h.p047a.C1316a;

/* renamed from: com.efs.sdk.base.a.i.a */
/* loaded from: classes.dex */
public abstract class AbstractHandlerC1334a extends Handler {

    /* renamed from: a */
    public C1293a f7126a;

    AbstractHandlerC1334a() {
        super(C1316a.f7105a.getLooper());
        sendEmptyMessageDelayed(0, 60000L);
    }

    /* renamed from: a */
    abstract void mo5587a();

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        mo5587a();
        sendEmptyMessageDelayed(0, 60000L);
    }
}
