package com.tencent.bugly.proguard;

import com.jaredrummler.android.colorpicker.ColorPanelView;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tencent.bugly.proguard.m0 */
/* loaded from: classes3.dex */
public final class RunnableC4124m0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3850a = 0;

    /* renamed from: b */
    public final /* synthetic */ int f3851b;

    /* renamed from: c */
    public final /* synthetic */ Object f3852c;

    public RunnableC4124m0(ColorPanelView colorPanelView, int i) {
        this.f3852c = colorPanelView;
        this.f3851b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        switch (this.f3850a) {
            case 0:
                for (int i = 0; i < this.f3851b && (runnable = (Runnable) ((LinkedBlockingQueue) this.f3852c).poll()) != null; i++) {
                    runnable.run();
                }
            default:
                ((ColorPanelView) this.f3852c).setColor(this.f3851b);
                break;
        }
    }

    public RunnableC4124m0(int i, LinkedBlockingQueue linkedBlockingQueue) {
        this.f3851b = i;
        this.f3852c = linkedBlockingQueue;
    }
}
