package p136p3;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.xuexiang.xui.widget.tabbar.EasyIndicator;

/* renamed from: p3.a */
/* loaded from: classes3.dex */
public final class C6363a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup.LayoutParams f10404a;

    /* renamed from: b */
    public final /* synthetic */ EasyIndicator f10405b;

    public C6363a(EasyIndicator easyIndicator, ViewGroup.LayoutParams layoutParams) {
        this.f10405b = easyIndicator;
        this.f10404a = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.f10404a;
        layoutParams.width = iIntValue;
        this.f10405b.f4901a.setLayoutParams(layoutParams);
    }
}
