package com.efs.sdk.base.p020a.p035i;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p031h.p032a.C2944a;

/* renamed from: com.efs.sdk.base.a.i.a */
/* loaded from: classes2.dex */
public abstract class AbstractHandlerC2962a extends Handler {

    /* renamed from: a */
    public C2921a f1156a;

    public AbstractHandlerC2962a() {
        super(C2944a.f1135a.getLooper());
        sendEmptyMessageDelayed(0, 60000L);
    }

    /* renamed from: a */
    public abstract void mo2228a();

    @Override // android.os.Handler
    public void handleMessage(@NonNull Message message) {
        super.handleMessage(message);
        mo2228a();
        sendEmptyMessageDelayed(0, 60000L);
    }
}
