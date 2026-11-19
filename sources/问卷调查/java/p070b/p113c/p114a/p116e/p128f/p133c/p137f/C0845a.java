package p070b.p113c.p114a.p116e.p128f.p133c.p137f;

import android.animation.ValueAnimator;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;

/* renamed from: b.c.a.e.f.c.f.a */
/* loaded from: classes.dex */
public class C0845a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ SmoothImageView f4629a;

    public C0845a(SmoothImageView smoothImageView) {
        this.f4629a = smoothImageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4629a.f5280k.f5311f = ((Integer) valueAnimator.getAnimatedValue("animAlpha")).intValue();
        this.f4629a.f5280k.f5312g = ((Float) valueAnimator.getAnimatedValue("animScale")).floatValue();
        this.f4629a.f5280k.f5307b = ((Float) valueAnimator.getAnimatedValue("animLeft")).floatValue();
        this.f4629a.f5280k.f5308c = ((Float) valueAnimator.getAnimatedValue("animTop")).floatValue();
        this.f4629a.f5280k.f5309d = ((Float) valueAnimator.getAnimatedValue("animWidth")).floatValue();
        this.f4629a.f5280k.f5310e = ((Float) valueAnimator.getAnimatedValue("animHeight")).floatValue();
        this.f4629a.invalidate();
    }
}
