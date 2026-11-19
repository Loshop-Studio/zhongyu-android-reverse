package p187n3;

import android.animation.ValueAnimator;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;
import p197o3.InterpolatorC9162a;

/* renamed from: n3.a */
/* loaded from: classes4.dex */
public class C9091a extends ValueAnimator {
    public C9091a(long j9, float f10, long j10) {
        setFloatValues(1.0f, f10);
        setDuration(j9);
        setStartDelay(j10);
        setInterpolator(new InterpolatorC9162a(Ease.QUART_OUT));
    }
}
