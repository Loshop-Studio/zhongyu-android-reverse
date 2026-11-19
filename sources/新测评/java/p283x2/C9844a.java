package p283x2;

import android.animation.ValueAnimator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;
import p293y2.InterpolatorC9903a;

/* renamed from: x2.a */
/* loaded from: classes4.dex */
public class C9844a extends ValueAnimator {
    public C9844a(long j10, float f10, long j11) {
        setFloatValues(1.0f, f10);
        setDuration(j10);
        setStartDelay(j11);
        setInterpolator(new InterpolatorC9903a(Ease.QUART_OUT));
    }
}
