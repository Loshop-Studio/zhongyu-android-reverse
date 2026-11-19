package com.efs.sdk.base.p035a.p046h.p047a;

import android.os.HandlerThread;

/* renamed from: com.efs.sdk.base.a.h.a.a */
/* loaded from: classes.dex */
public final class C1316a {

    /* renamed from: a */
    public static HandlerThread f7105a;

    static {
        HandlerThread handlerThread = new HandlerThread("efs-base", 10);
        f7105a = handlerThread;
        handlerThread.start();
    }
}
