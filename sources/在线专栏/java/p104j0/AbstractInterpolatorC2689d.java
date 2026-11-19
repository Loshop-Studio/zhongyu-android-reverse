package p104j0;

import android.view.animation.Interpolator;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* renamed from: j0.d */
/* loaded from: classes.dex */
abstract class AbstractInterpolatorC2689d implements Interpolator {

    /* renamed from: a */
    private final float[] f10642a;

    /* renamed from: b */
    private final float f10643b;

    protected AbstractInterpolatorC2689d(float[] fArr) {
        this.f10642a = fArr;
        this.f10643b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        if (f4 <= IGoodView.DEFAULT_TO_ALPHA) {
            return IGoodView.DEFAULT_TO_ALPHA;
        }
        float[] fArr = this.f10642a;
        int iMin = Math.min((int) ((fArr.length - 1) * f4), fArr.length - 2);
        float f5 = this.f10643b;
        float f6 = (f4 - (iMin * f5)) / f5;
        float[] fArr2 = this.f10642a;
        return fArr2[iMin] + (f6 * (fArr2[iMin + 1] - fArr2[iMin]));
    }
}
