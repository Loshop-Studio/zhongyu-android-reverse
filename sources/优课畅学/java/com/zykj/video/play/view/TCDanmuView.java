package com.zykj.video.play.view;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.Random;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import p010a9.C0053d;
import p040c9.AbstractC5275a;
import p114g9.AbstractC8689b;
import p188n5.AbstractC9421a;
import p312y8.HandlerC10676c;
import p323z8.AbstractC10732c;
import p323z8.C10734e;
import p323z8.InterfaceC10741l;

/* loaded from: classes5.dex */
public class TCDanmuView extends AbstractC8689b {

    /* renamed from: r */
    public Context f14705r;

    /* renamed from: s */
    public DanmakuContext f14706s;

    /* renamed from: t */
    public boolean f14707t;

    /* renamed from: u */
    public HandlerThread f14708u;

    /* renamed from: v */
    public HandlerC8174c f14709v;

    /* renamed from: w */
    public AbstractC5275a f14710w;

    /* renamed from: com.zykj.video.play.view.TCDanmuView$b */
    public class C8173b extends AbstractC5275a {
        public C8173b() {
        }

        @Override // p040c9.AbstractC5275a
        /* renamed from: c */
        public InterfaceC10741l mo2200c() {
            return new C0053d();
        }
    }

    /* renamed from: com.zykj.video.play.view.TCDanmuView$c */
    public class HandlerC8174c extends Handler {
        public HandlerC8174c(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void m12512a() {
            int iNextInt = new Random().nextInt(300);
            TCDanmuView.this.m12503G("弹幕" + iNextInt + iNextInt, false);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1001) {
                return;
            }
            m12512a();
            TCDanmuView.this.f14709v.sendEmptyMessageDelayed(1001, new Random().nextInt(1000));
        }
    }

    public TCDanmuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14710w = new C8173b();
        m12505I(context);
    }

    /* renamed from: G */
    public final void m12503G(String str, boolean z10) {
        AbstractC10732c abstractC10732cM165b = this.f14706s.f18428A.m165b(1);
        if (abstractC10732cM165b != null) {
            abstractC10732cM165b.f21296c = str;
            abstractC10732cM165b.f21306m = 5;
            abstractC10732cM165b.f21304k = AbstractC9421a.m17254a(this.f14705r, 20.0f);
            abstractC10732cM165b.f21299f = -1;
            abstractC10732cM165b.m20039B(getCurrentTime());
            if (z10) {
                abstractC10732cM165b.f21305l = -16711936;
            }
            m14130h(abstractC10732cM165b);
        }
    }

    /* renamed from: H */
    public final void m12504H() {
        HandlerThread handlerThread = new HandlerThread("Danmu");
        this.f14708u = handlerThread;
        handlerThread.start();
        this.f14709v = new HandlerC8174c(this.f14708u.getLooper());
    }

    /* renamed from: I */
    public final void m12505I(Context context) {
        this.f14705r = context;
        m14131i(true);
        setCallback(new C8172a());
        DanmakuContext danmakuContextM17215a = DanmakuContext.m17215a();
        this.f14706s = danmakuContextM17215a;
        m14142t(this.f14710w, danmakuContextM17215a);
    }

    /* renamed from: J */
    public void m12506J(boolean z10) {
        TXCLog.m4994i("DanmakuView", "onToggleControllerView on:" + z10);
        if (z10) {
            this.f14709v.sendEmptyMessageAtTime(1001, 100L);
        } else {
            this.f14709v.removeMessages(1001);
        }
    }

    @Override // p114g9.AbstractC8689b
    /* renamed from: u */
    public void mo12507u() {
        super.mo12507u();
        this.f14707t = false;
        HandlerC8174c handlerC8174c = this.f14709v;
        if (handlerC8174c != null) {
            handlerC8174c.removeCallbacksAndMessages(null);
            this.f14709v = null;
        }
        HandlerThread handlerThread = this.f14708u;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f14708u = null;
        }
    }

    /* renamed from: com.zykj.video.play.view.TCDanmuView$a */
    public class C8172a implements HandlerC10676c.d {
        public C8172a() {
        }

        @Override // p312y8.HandlerC10676c.d
        /* renamed from: a */
        public void mo12508a() {
        }

        @Override // p312y8.HandlerC10676c.d
        /* renamed from: b */
        public void mo12509b() {
            TCDanmuView.this.f14707t = true;
            TCDanmuView.this.m14145x();
            TCDanmuView.this.m12504H();
        }

        @Override // p312y8.HandlerC10676c.d
        /* renamed from: c */
        public void mo12510c(C10734e c10734e) {
        }

        @Override // p312y8.HandlerC10676c.d
        /* renamed from: d */
        public void mo12511d(AbstractC10732c abstractC10732c) {
        }
    }
}
