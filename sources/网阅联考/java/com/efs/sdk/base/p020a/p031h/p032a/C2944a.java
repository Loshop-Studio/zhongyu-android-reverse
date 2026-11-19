package com.efs.sdk.base.p020a.p031h.p032a;

import android.os.HandlerThread;

/* renamed from: com.efs.sdk.base.a.h.a.a */
/* loaded from: classes2.dex */
public final class C2944a {

    /* renamed from: a */
    public static HandlerThread f1135a;

    static {
        HandlerThread handlerThread = new HandlerThread("efs-base", 10);
        f1135a = handlerThread;
        handlerThread.start();
    }
}
