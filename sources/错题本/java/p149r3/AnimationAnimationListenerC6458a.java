package p149r3;

import android.view.animation.Animation;
import com.xuexiang.xui.widget.textview.ExpandableTextView;

/* renamed from: r3.a */
/* loaded from: classes3.dex */
public final class AnimationAnimationListenerC6458a implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ExpandableTextView f10624a;

    public AnimationAnimationListenerC6458a(ExpandableTextView expandableTextView) {
        this.f10624a = expandableTextView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ExpandableTextView expandableTextView = this.f10624a;
        expandableTextView.clearAnimation();
        expandableTextView.f5010m = false;
        expandableTextView.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        ExpandableTextView expandableTextView = this.f10624a;
        expandableTextView.f4998a.setAlpha(expandableTextView.f5009l);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
