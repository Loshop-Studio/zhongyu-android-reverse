package p115r0;

import android.animation.ValueAnimator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;
import p119s0.InterpolatorC4543a;

/* renamed from: r0.a */
/* loaded from: classes2.dex */
public class C4493a extends ValueAnimator {
    public C4493a(long j4, float f4, long j5) {
        setFloatValues(1.0f, f4);
        setDuration(j4);
        setStartDelay(j5);
        setInterpolator(new InterpolatorC4543a(Ease.QUART_OUT));
    }
}
