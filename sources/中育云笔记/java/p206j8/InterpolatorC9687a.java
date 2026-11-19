package p206j8;

import android.view.animation.Interpolator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;

/* renamed from: j8.a */
/* loaded from: classes5.dex */
public class InterpolatorC9687a implements Interpolator {

    /* renamed from: a */
    public final Ease f22490a;

    public InterpolatorC9687a(Ease ease) {
        this.f22490a = ease;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return AbstractC9688b.m19175a(this.f22490a, f10);
    }
}
