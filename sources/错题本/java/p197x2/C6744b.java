package p197x2;

import android.animation.ValueAnimator;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import p189w2.C6702a;

/* renamed from: x2.b */
/* loaded from: classes3.dex */
public final class C6744b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f11409a;

    /* renamed from: b */
    public final /* synthetic */ SmoothImageView f11410b;

    public /* synthetic */ C6744b(SmoothImageView smoothImageView, int i) {
        this.f11409a = i;
        this.f11410b = smoothImageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11409a) {
            case 0:
                InterfaceC6745c interfaceC6745c = this.f11410b.f4510t;
                if (interfaceC6745c != null) {
                    ((C6702a) interfaceC6745c).m6404a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    break;
                }
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothImageView smoothImageView = this.f11410b;
                smoothImageView.setScaleX(fFloatValue);
                smoothImageView.setScaleY(fFloatValue);
                break;
            default:
                SmoothImageView smoothImageView2 = this.f11410b;
                smoothImageView2.f4498h.f11415e = ((Integer) valueAnimator.getAnimatedValue("animAlpha")).intValue();
                smoothImageView2.f4498h.f11416f = ((Float) valueAnimator.getAnimatedValue("animScale")).floatValue();
                smoothImageView2.f4498h.f11411a = ((Float) valueAnimator.getAnimatedValue("animLeft")).floatValue();
                smoothImageView2.f4498h.f11412b = ((Float) valueAnimator.getAnimatedValue("animTop")).floatValue();
                smoothImageView2.f4498h.f11413c = ((Float) valueAnimator.getAnimatedValue("animWidth")).floatValue();
                smoothImageView2.f4498h.f11414d = ((Float) valueAnimator.getAnimatedValue("animHeight")).floatValue();
                smoothImageView2.invalidate();
                break;
        }
    }
}
