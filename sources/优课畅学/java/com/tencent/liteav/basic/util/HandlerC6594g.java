package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.tencent.liteav.basic.util.g */
/* loaded from: classes4.dex */
public class HandlerC6594g extends Handler {

    /* renamed from: a */
    private int f5535a;

    /* renamed from: b */
    private boolean f5536b;

    /* renamed from: c */
    private a f5537c;

    /* renamed from: com.tencent.liteav.basic.util.g$a */
    public interface a {
        /* renamed from: a */
        void mo5068a();
    }

    public HandlerC6594g(Looper looper, a aVar) {
        super(looper);
        this.f5536b = false;
        this.f5537c = aVar;
    }

    /* renamed from: a */
    public void m5067a(int i10, int i11) {
        m5066a();
        this.f5535a = i11;
        this.f5536b = true;
        sendEmptyMessageDelayed(0, i10);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar = this.f5537c;
        if (aVar != null) {
            aVar.mo5068a();
        }
        if (this.f5536b) {
            sendEmptyMessageDelayed(0, this.f5535a);
        }
    }

    /* renamed from: a */
    public void m5066a() {
        while (hasMessages(0)) {
            removeMessages(0);
        }
        this.f5536b = false;
    }
}
