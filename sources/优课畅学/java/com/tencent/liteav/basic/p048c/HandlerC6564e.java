package com.tencent.liteav.basic.p048c;

import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.HandlerC6591d;

/* renamed from: com.tencent.liteav.basic.c.e */
/* loaded from: classes4.dex */
public class HandlerC6564e extends HandlerC6591d {

    /* renamed from: a */
    public int f5225a;

    /* renamed from: b */
    public int f5226b;

    /* renamed from: c */
    public Surface f5227c;

    /* renamed from: d */
    public boolean f5228d;

    /* renamed from: e */
    public C6561b f5229e;

    /* renamed from: f */
    public EGLContext f5230f;

    /* renamed from: g */
    public C6560a f5231g;

    /* renamed from: h */
    public javax.microedition.khronos.egl.EGLContext f5232h;

    /* renamed from: i */
    private a f5233i;

    /* renamed from: com.tencent.liteav.basic.c.e$a */
    public interface a {
        /* renamed from: c */
        void mo4820c();

        /* renamed from: d */
        void mo4821d();

        /* renamed from: e */
        void mo4822e();
    }

    public HandlerC6564e(Looper looper) {
        super(looper);
        this.f5225a = 720;
        this.f5226b = 1280;
        this.f5227c = null;
        this.f5233i = null;
        this.f5228d = false;
        this.f5229e = null;
        this.f5230f = null;
        this.f5231g = null;
        this.f5232h = null;
    }

    /* renamed from: a */
    public static void m4823a(final Handler handler, final HandlerThread handlerThread) {
        if (handler == null || handlerThread == null) {
            return;
        }
        Message message = new Message();
        message.what = 101;
        message.obj = new Runnable() { // from class: com.tencent.liteav.basic.c.e.1
            @Override // java.lang.Runnable
            public void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.basic.c.e.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Handler handler2 = handler;
                        if (handler2 != null) {
                            handler2.removeCallbacksAndMessages(null);
                        }
                        HandlerThread handlerThread2 = handlerThread;
                        if (handlerThread2 != null) {
                            handlerThread2.quitSafely();
                        }
                    }
                });
            }
        };
        handler.sendMessage(message);
    }

    /* renamed from: c */
    private void m4826c(Message message) {
        try {
            a aVar = this.f5233i;
            if (aVar != null) {
                aVar.mo4821d();
            }
        } catch (Exception e10) {
            TXCLog.m4991e("TXGLThreadHandler", "onMsgRend Exception " + e10.getMessage());
        }
    }

    /* renamed from: d */
    private void m4828d() {
        TXCLog.m4998w("TXGLThreadHandler", "surface-render: destroy egl context " + this.f5227c);
        a aVar = this.f5233i;
        if (aVar != null) {
            aVar.mo4822e();
        }
        C6560a c6560a = this.f5231g;
        if (c6560a != null) {
            c6560a.m4794c();
            this.f5231g = null;
        }
        C6561b c6561b = this.f5229e;
        if (c6561b != null) {
            c6561b.m4804c();
            this.f5229e = null;
        }
        this.f5227c = null;
    }

    /* renamed from: b */
    public void m4831b() {
        C6560a c6560a = this.f5231g;
        if (c6560a != null) {
            c6560a.m4792a();
        }
        C6561b c6561b = this.f5229e;
        if (c6561b != null) {
            c6561b.m4805d();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null) {
            return;
        }
        switch (message.what) {
            case 100:
                m4824a(message);
                break;
            case 101:
                m4825b(message);
                break;
            case 102:
                m4826c(message);
                break;
        }
        Object obj = message.obj;
        if (obj != null) {
            ((Runnable) obj).run();
        }
    }

    /* renamed from: c */
    private boolean m4827c() {
        TXCLog.m4994i("TXGLThreadHandler", String.format("init egl size[%d/%d]", Integer.valueOf(this.f5225a), Integer.valueOf(this.f5226b)));
        if (!this.f5228d) {
            this.f5231g = C6560a.m4788a(null, this.f5232h, this.f5227c, this.f5225a, this.f5226b);
        } else {
            this.f5229e = C6561b.m4798a(null, this.f5230f, this.f5227c, this.f5225a, this.f5226b);
        }
        if (this.f5231g == null && this.f5229e == null) {
            return false;
        }
        TXCLog.m4998w("TXGLThreadHandler", "surface-render: create egl context " + this.f5227c);
        a aVar = this.f5233i;
        if (aVar == null) {
            return true;
        }
        aVar.mo4820c();
        return true;
    }

    /* renamed from: b */
    private void m4825b(Message message) {
        m4828d();
    }

    /* renamed from: a */
    public void m4830a(a aVar) {
        this.f5233i = aVar;
    }

    /* renamed from: a */
    public Surface m4829a() {
        return this.f5227c;
    }

    /* renamed from: a */
    private void m4824a(Message message) {
        try {
            m4827c();
        } catch (Exception unused) {
            TXCLog.m4991e("TXGLThreadHandler", "surface-render: init egl context exception " + this.f5227c);
            this.f5227c = null;
        }
    }
}
