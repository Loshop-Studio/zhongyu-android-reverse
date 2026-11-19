package p042d3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import com.p035xw.repo.BubbleSeekBar;
import com.xuexiang.xui.widget.picker.RulerView;
import com.xuexiang.xui.widget.textview.badge.BadgeView;
import p166t3.C6586c;
import p190w3.RunnableC6710b;

/* renamed from: d3.a */
/* loaded from: classes3.dex */
public final class C5416a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f8383a;

    /* renamed from: b */
    public final /* synthetic */ Object f8384b;

    public /* synthetic */ C5416a(Object obj, int i) {
        this.f8383a = i;
        this.f8384b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f8383a) {
            case 2:
                RunnableC6710b runnableC6710b = (RunnableC6710b) this.f8384b;
                BubbleSeekBar bubbleSeekBar = runnableC6710b.f11322b;
                if (!bubbleSeekBar.f5106B) {
                    bubbleSeekBar.m3629f();
                }
                BubbleSeekBar bubbleSeekBar2 = runnableC6710b.f11322b;
                bubbleSeekBar2.f5118N = false;
                bubbleSeekBar2.invalidate();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8383a) {
            case 0:
                ((RulerView) this.f8384b).invalidate();
                break;
            case 1:
                BadgeView badgeView = (BadgeView) ((C6586c) this.f8384b).f10998b.get();
                if (badgeView != null) {
                    PointF pointF = badgeView.f5041q;
                    pointF.x = -1000.0f;
                    pointF.y = -1000.0f;
                    badgeView.f5036l = 4;
                    badgeView.mo3605c(false);
                    badgeView.getParent().requestDisallowInterceptTouchEvent(false);
                    badgeView.invalidate();
                    break;
                }
                break;
            default:
                RunnableC6710b runnableC6710b = (RunnableC6710b) this.f8384b;
                BubbleSeekBar bubbleSeekBar = runnableC6710b.f11322b;
                if (!bubbleSeekBar.f5106B) {
                    bubbleSeekBar.m3629f();
                }
                BubbleSeekBar bubbleSeekBar2 = runnableC6710b.f11322b;
                bubbleSeekBar2.f5118N = false;
                bubbleSeekBar2.invalidate();
                break;
        }
    }
}
