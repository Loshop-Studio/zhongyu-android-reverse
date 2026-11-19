package p148r2;

import android.support.v4.media.AbstractC0037f;
import android.widget.ImageView;

/* renamed from: r2.d */
/* loaded from: classes3.dex */
public final class RunnableC6450d implements Runnable {

    /* renamed from: a */
    public final float f10588a;

    /* renamed from: b */
    public final float f10589b;

    /* renamed from: c */
    public final long f10590c = System.currentTimeMillis();

    /* renamed from: d */
    public final float f10591d;

    /* renamed from: e */
    public final float f10592e;

    /* renamed from: f */
    public final /* synthetic */ ViewOnTouchListenerC6457k f10593f;

    public RunnableC6450d(ViewOnTouchListenerC6457k viewOnTouchListenerC6457k, float f, float f7, float f8, float f9) {
        this.f10593f = viewOnTouchListenerC6457k;
        this.f10588a = f8;
        this.f10589b = f9;
        this.f10591d = f;
        this.f10592e = f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f10593f;
        ImageView imageViewM6117g = viewOnTouchListenerC6457k.m6117g();
        if (imageViewM6117g == null) {
            return;
        }
        float interpolation = viewOnTouchListenerC6457k.f10599a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f10590c) * 1.0f) / viewOnTouchListenerC6457k.f10600b));
        float f = this.f10591d;
        viewOnTouchListenerC6457k.m6119k(AbstractC0037f.m77b(this.f10592e, f, interpolation, f) / viewOnTouchListenerC6457k.m6118j(), this.f10588a, this.f10589b);
        if (interpolation < 1.0f) {
            imageViewM6117g.postOnAnimation(this);
        }
    }
}
