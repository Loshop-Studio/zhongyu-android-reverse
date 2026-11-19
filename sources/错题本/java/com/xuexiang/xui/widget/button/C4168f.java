package com.xuexiang.xui.widget.button;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import com.p035xw.repo.BubbleSeekBar;
import com.xuexiang.xui.widget.button.shinebutton.ShineView;
import com.xuexiang.xui.widget.layout.ExpandableLayout;
import com.xuexiang.xui.widget.picker.RulerView;
import com.xuexiang.xui.widget.progress.loading.MiniLoadingView;
import com.xuexiang.xui.widget.textview.badge.BadgeView;
import p166t3.C6586c;

/* renamed from: com.xuexiang.xui.widget.button.f */
/* loaded from: classes3.dex */
public final class C4168f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f4138a;

    /* renamed from: b */
    public final /* synthetic */ Object f4139b;

    public /* synthetic */ C4168f(Object obj, int i) {
        this.f4138a = i;
        this.f4139b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4138a) {
            case 0:
                ((SwitchIconView) this.f4139b).setFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                RulerView rulerView = (RulerView) this.f4139b;
                rulerView.f4571q += ((Integer) valueAnimator.getAnimatedValue()).intValue();
                float f = rulerView.f4571q;
                int i = rulerView.f4569o;
                if (f >= i / 2.0f) {
                    rulerView.f4571q = i / 2.0f;
                } else if (f <= rulerView.m3526a(rulerView.f4562h)) {
                    rulerView.f4571q = rulerView.m3526a(rulerView.f4562h);
                }
                rulerView.f4572r = rulerView.f4571q;
                rulerView.invalidate();
                return;
            case 2:
                ((ShineView) this.f4139b).f4188g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                throw null;
            case 3:
                MiniLoadingView miniLoadingView = (MiniLoadingView) this.f4139b;
                miniLoadingView.f4699c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                miniLoadingView.invalidate();
                return;
            case 4:
                C6586c c6586c = (C6586c) this.f4139b;
                BadgeView badgeView = (BadgeView) c6586c.f10998b.get();
                if (badgeView == null || !badgeView.isShown()) {
                    c6586c.cancel();
                    return;
                } else {
                    badgeView.invalidate();
                    return;
                }
            case 5:
                BubbleSeekBar bubbleSeekBar = (BubbleSeekBar) this.f4139b;
                bubbleSeekBar.f5115K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bubbleSeekBar.f5130c = bubbleSeekBar.m3628d();
                if (bubbleSeekBar.f5108D || bubbleSeekBar.f5133d0.getParent() == null) {
                    bubbleSeekBar.m3630g();
                } else {
                    bubbleSeekBar.f5141h0 = bubbleSeekBar.m3627c();
                    WindowManager.LayoutParams layoutParams = bubbleSeekBar.f5143i0;
                    layoutParams.x = (int) (bubbleSeekBar.f5141h0 + 0.5f);
                    bubbleSeekBar.f5131c0.updateViewLayout(bubbleSeekBar.f5133d0, layoutParams);
                    bubbleSeekBar.f5133d0.m6405a(bubbleSeekBar.f5162w ? String.valueOf(bubbleSeekBar.getProgressFloat()) : String.valueOf(bubbleSeekBar.getProgress()));
                }
                bubbleSeekBar.invalidate();
                bubbleSeekBar.getClass();
                return;
            default:
                ((ExpandableLayout) this.f4139b).setExpansion(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
