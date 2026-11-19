package com.efs.sdk.base.p039a.p054i;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p050h.p051a.C5684a;

/* renamed from: com.efs.sdk.base.a.i.a */
/* loaded from: classes3.dex */
public abstract class AbstractHandlerC5702a extends Handler {

    /* renamed from: a */
    public C5661a f4760a;

    public AbstractHandlerC5702a() {
        super(C5684a.f4739a.getLooper());
        sendEmptyMessageDelayed(0, 60000L);
    }

    /* renamed from: a */
    public abstract void mo4197a();

    @Override // android.os.Handler
    public void handleMessage(@NonNull Message message) {
        super.handleMessage(message);
        mo4197a();
        sendEmptyMessageDelayed(0, 60000L);
    }
}
