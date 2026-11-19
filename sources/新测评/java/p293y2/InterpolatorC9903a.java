package p293y2;

import android.view.animation.Interpolator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;

/* renamed from: y2.a */
/* loaded from: classes4.dex */
public class InterpolatorC9903a implements Interpolator {

    /* renamed from: a */
    public final Ease f17634a;

    public InterpolatorC9903a(Ease ease) {
        this.f17634a = ease;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return AbstractC9904b.m16716a(this.f17634a, f10);
    }
}
