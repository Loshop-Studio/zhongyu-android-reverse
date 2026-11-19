package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class DefaultSpecialEffectsController$AnimationEffect$onCommit$1 implements Animation.AnimationListener {
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ SpecialEffectsController.Operation $operation;
    final /* synthetic */ View $viewToAnimate;
    final /* synthetic */ DefaultSpecialEffectsController.AnimationEffect this$0;

    public DefaultSpecialEffectsController$AnimationEffect$onCommit$1(SpecialEffectsController.Operation operation, ViewGroup viewGroup, View view, DefaultSpecialEffectsController.AnimationEffect animationEffect) {
        this.$operation = operation;
        this.$container = viewGroup;
        this.$viewToAnimate = view;
        this.this$0 = animationEffect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationEnd$lambda$0(ViewGroup container, View view, DefaultSpecialEffectsController.AnimationEffect this$0) {
        AbstractC9133u.m16133g(container, "$container");
        AbstractC9133u.m16133g(this$0, "this$0");
        container.endViewTransition(view);
        this$0.getAnimationInfo().getOperation().completeEffect(this$0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        AbstractC9133u.m16133g(animation, "animation");
        final ViewGroup viewGroup = this.$container;
        final View view = this.$viewToAnimate;
        final DefaultSpecialEffectsController.AnimationEffect animationEffect = this.this$0;
        viewGroup.post(new Runnable() { // from class: androidx.fragment.app.b
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSpecialEffectsController$AnimationEffect$onCommit$1.onAnimationEnd$lambda$0(viewGroup, view, animationEffect);
            }
        });
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(this.$operation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        AbstractC9133u.m16133g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        AbstractC9133u.m16133g(animation, "animation");
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(this.$operation);
        }
    }
}
