package com.tendcloud.tenddata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.x */
/* loaded from: classes5.dex */
class HandlerC8019x extends Handler {

    /* renamed from: b */
    private static final String f15131b = "EventHandler";

    /* renamed from: a */
    private C8020y f15132a;

    public HandlerC8019x(C8020y c8020y, Looper looper) {
        super(looper);
        this.f15132a = c8020y;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            int i10 = message.what;
            if (i10 == -1) {
                getLooper().quit();
                return;
            }
            if (i10 == 1) {
                this.f15132a.m12127b(message);
                return;
            }
            if (i10 == 3) {
                this.f15132a.m12125a(message);
                return;
            }
            if (i10 == 4) {
                this.f15132a.handleActivityResume(message);
                return;
            }
            if (i10 == 5) {
                this.f15132a.m12128c();
            } else if (i10 == 6) {
                this.f15132a.m12128c();
            } else {
                if (i10 != 7) {
                    return;
                }
                this.f15132a.handleCodelessConfigSave((JSONObject) message.obj);
            }
        } catch (Exception unused) {
        }
    }
}
