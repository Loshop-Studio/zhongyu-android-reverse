package com.efs.sdk.base.p039a.p050h.p051a;

import android.os.HandlerThread;

/* renamed from: com.efs.sdk.base.a.h.a.a */
/* loaded from: classes3.dex */
public final class C5684a {

    /* renamed from: a */
    public static HandlerThread f4739a;

    static {
        HandlerThread handlerThread = new HandlerThread("efs-base", 10);
        f4739a = handlerThread;
        handlerThread.start();
    }
}
