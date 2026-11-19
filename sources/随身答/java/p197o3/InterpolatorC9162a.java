package p197o3;

import android.view.animation.Interpolator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;

/* renamed from: o3.a */
/* loaded from: classes4.dex */
public class InterpolatorC9162a implements Interpolator {

    /* renamed from: a */
    public final Ease f15488a;

    public InterpolatorC9162a(Ease ease) {
        this.f15488a = ease;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return AbstractC9163b.m14757a(this.f15488a, f10);
    }
}
