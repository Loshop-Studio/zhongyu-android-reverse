package p190w3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.p035xw.repo.BubbleSeekBar;

/* renamed from: w3.c */
/* loaded from: classes3.dex */
public final class C6711c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f11323a;

    /* renamed from: b */
    public final /* synthetic */ BubbleSeekBar f11324b;

    public /* synthetic */ C6711c(BubbleSeekBar bubbleSeekBar, int i) {
        this.f11323a = i;
        this.f11324b = bubbleSeekBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f11323a) {
            case 0:
                BubbleSeekBar bubbleSeekBar = this.f11324b;
                bubbleSeekBar.f5118N = false;
                bubbleSeekBar.invalidate();
                break;
            case 1:
                BubbleSeekBar bubbleSeekBar2 = this.f11324b;
                if (!bubbleSeekBar2.f5108D && !bubbleSeekBar2.f5106B) {
                    bubbleSeekBar2.m3629f();
                }
                bubbleSeekBar2.f5130c = bubbleSeekBar2.m3628d();
                bubbleSeekBar2.f5118N = false;
                bubbleSeekBar2.f5147k0 = true;
                bubbleSeekBar2.invalidate();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f11323a) {
            case 0:
                BubbleSeekBar bubbleSeekBar = this.f11324b;
                bubbleSeekBar.f5118N = false;
                bubbleSeekBar.invalidate();
                break;
            case 1:
                BubbleSeekBar bubbleSeekBar2 = this.f11324b;
                if (!bubbleSeekBar2.f5108D && !bubbleSeekBar2.f5106B) {
                    bubbleSeekBar2.m3629f();
                }
                bubbleSeekBar2.f5130c = bubbleSeekBar2.m3628d();
                bubbleSeekBar2.f5118N = false;
                bubbleSeekBar2.f5147k0 = true;
                bubbleSeekBar2.invalidate();
                bubbleSeekBar2.getClass();
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f11323a) {
            case 2:
                BubbleSeekBar bubbleSeekBar = this.f11324b;
                bubbleSeekBar.f5131c0.addView(bubbleSeekBar.f5133d0, bubbleSeekBar.f5143i0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
