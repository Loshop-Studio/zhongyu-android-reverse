package p192i8;

import android.animation.ValueAnimator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;
import p206j8.InterpolatorC9687a;

/* renamed from: i8.a */
/* loaded from: classes5.dex */
public class C9614a extends ValueAnimator {
    public C9614a(long j10, float f10, long j11) {
        setFloatValues(1.0f, f10);
        setDuration(j10);
        setStartDelay(j11);
        setInterpolator(new InterpolatorC9687a(Ease.QUART_OUT));
    }
}
