package p294x1;

import android.view.animation.Interpolator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;

/* renamed from: x1.a */
/* loaded from: classes4.dex */
public class InterpolatorC10489a implements Interpolator {

    /* renamed from: a */
    public final Ease f20913a;

    public InterpolatorC10489a(Ease ease) {
        this.f20913a = ease;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return AbstractC10490b.m19684a(this.f20913a, f10);
    }
}
