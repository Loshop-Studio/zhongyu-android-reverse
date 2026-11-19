package com.tencent.smtt.sdk;

import android.os.HandlerThread;

/* renamed from: com.tencent.smtt.sdk.ai */
/* loaded from: classes4.dex */
class HandlerThreadC6783ai extends HandlerThread {

    /* renamed from: a */
    private static HandlerThreadC6783ai f6808a;

    public HandlerThreadC6783ai(String str) {
        super(str);
    }

    /* renamed from: a */
    public static synchronized HandlerThreadC6783ai m6061a() {
        try {
            if (f6808a == null) {
                HandlerThreadC6783ai handlerThreadC6783ai = new HandlerThreadC6783ai("TbsHandlerThread");
                f6808a = handlerThreadC6783ai;
                handlerThreadC6783ai.start();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6808a;
    }
}
