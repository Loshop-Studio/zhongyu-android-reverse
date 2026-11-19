package p196z1;

import android.view.animation.Interpolator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;

/* renamed from: z1.a */
/* loaded from: classes3.dex */
public class InterpolatorC7932a implements Interpolator {

    /* renamed from: a */
    public final Ease f10658a;

    public InterpolatorC7932a(Ease ease) {
        this.f10658a = ease;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        return AbstractC7933b.m9735a(this.f10658a, f6);
    }
}
