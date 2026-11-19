package p119s0;

import android.view.animation.Interpolator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;

/* renamed from: s0.a */
/* loaded from: classes2.dex */
public class InterpolatorC4543a implements Interpolator {

    /* renamed from: a */
    public final Ease f5688a;

    public InterpolatorC4543a(Ease ease) {
        this.f5688a = ease;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        return AbstractC4544b.m6180a(this.f5688a, f4);
    }
}
