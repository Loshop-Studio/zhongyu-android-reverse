package p189y1;

import android.animation.ValueAnimator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;
import p196z1.InterpolatorC7932a;

/* renamed from: y1.a */
/* loaded from: classes3.dex */
public class C7896a extends ValueAnimator {
    public C7896a(long j6, float f6, long j7) {
        setFloatValues(1.0f, f6);
        setDuration(j6);
        setStartDelay(j7);
        setInterpolator(new InterpolatorC7932a(Ease.QUART_OUT));
    }
}
