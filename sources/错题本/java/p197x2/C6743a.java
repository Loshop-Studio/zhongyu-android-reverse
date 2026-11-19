package p197x2;

import android.animation.ValueAnimator;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;

/* renamed from: x2.a */
/* loaded from: classes3.dex */
public final class C6743a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f11406a;

    /* renamed from: b */
    public int f11407b = 0;

    /* renamed from: c */
    public final /* synthetic */ SmoothImageView f11408c;

    public /* synthetic */ C6743a(SmoothImageView smoothImageView, int i) {
        this.f11406a = i;
        this.f11408c = smoothImageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11406a) {
            case 0:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i = this.f11407b;
                if (i != 0) {
                    this.f11408c.offsetTopAndBottom(iIntValue - i);
                }
                this.f11407b = iIntValue;
                break;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i8 = this.f11407b;
                if (i8 != 0) {
                    this.f11408c.offsetLeftAndRight(iIntValue2 - i8);
                }
                this.f11407b = iIntValue2;
                break;
        }
    }
}
