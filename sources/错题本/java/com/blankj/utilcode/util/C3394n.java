package com.blankj.utilcode.util;

import android.util.Log;

/* renamed from: com.blankj.utilcode.util.n */
/* loaded from: classes2.dex */
public final class C3394n extends Thread {

    /* renamed from: a */
    public final /* synthetic */ int f2172a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3394n(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f2172a = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.f2172a) {
            case 0:
                try {
                    super.run();
                    break;
                } catch (Throwable th) {
                    Log.e("ThreadUtils", "Request threw uncaught throwable", th);
                    return;
                }
            default:
                super.run();
                break;
        }
    }
}
