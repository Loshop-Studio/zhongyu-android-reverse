package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ViewPropertyAnimatorCompat {
    private final WeakReference<View> mView;

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static ViewPropertyAnimator translationZ(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.translationZ(f10);
        }

        public static ViewPropertyAnimator translationZBy(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.translationZBy(f10);
        }

        /* renamed from: z */
        public static ViewPropertyAnimator m1544z(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.z(f10);
        }

        public static ViewPropertyAnimator zBy(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.zBy(f10);
        }
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.mView = new WeakReference<>(view);
    }

    private void setListenerInternal(final View view, final ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    viewPropertyAnimatorListener.onAnimationCancel(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorListener.onAnimationEnd(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    viewPropertyAnimatorListener.onAnimationStart(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public ViewPropertyAnimatorCompat alpha(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat alphaBy(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().alphaBy(f10);
        }
        return this;
    }

    public void cancel() {
        View view = this.mView.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long getDuration() {
        View view = this.mView.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public Interpolator getInterpolator() {
        View view = this.mView.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long getStartDelay() {
        View view = this.mView.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    public ViewPropertyAnimatorCompat rotation(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotation(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationBy(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationBy(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationX(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationX(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationXBy(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationXBy(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationY(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationY(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationYBy(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationYBy(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat scaleX(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleX(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat scaleXBy(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleXBy(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat scaleY(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleY(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat scaleYBy(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleYBy(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setDuration(long j10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setInterpolator(Interpolator interpolator) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setListener(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = this.mView.get();
        if (view != null) {
            setListenerInternal(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setStartDelay(long j10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setUpdateListener(final ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        final View view = this.mView.get();
        if (view != null) {
            view.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.l0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    viewPropertyAnimatorUpdateListener.onAnimationUpdate(view);
                }
            } : null);
        }
        return this;
    }

    public void start() {
        View view = this.mView.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public ViewPropertyAnimatorCompat translationX(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationX(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationXBy(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationXBy(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationY(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationYBy(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationYBy(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationZ(float f10) {
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.translationZ(view.animate(), f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationZBy(float f10) {
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.translationZBy(view.animate(), f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat withEndAction(Runnable runnable) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    @SuppressLint({"WrongConstant"})
    public ViewPropertyAnimatorCompat withLayer() {
        View view = this.mView.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    public ViewPropertyAnimatorCompat withStartAction(Runnable runnable) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    /* renamed from: x */
    public ViewPropertyAnimatorCompat m1541x(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().x(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat xBy(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().xBy(f10);
        }
        return this;
    }

    /* renamed from: y */
    public ViewPropertyAnimatorCompat m1542y(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().y(f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat yBy(float f10) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().yBy(f10);
        }
        return this;
    }

    /* renamed from: z */
    public ViewPropertyAnimatorCompat m1543z(float f10) {
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.m1544z(view.animate(), f10);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat zBy(float f10) {
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.zBy(view.animate(), f10);
        }
        return this;
    }
}
