package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.BackEventCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5810y;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\b%&'()*+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ9\u0010\u0015\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$¨\u0006-"}, m5110d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operations", "Ld6/s;", "syncAnimations", "(Ljava/util/List;)V", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "animationInfos", "collectAnimEffects", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "transitionInfos", "", "isPop", "firstOut", "lastIn", "createTransitionEffect", "(Ljava/util/List;ZLandroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "Landroidx/collection/ArrayMap;", "", "Landroid/view/View;", "", "names", "retainMatchingViews", "(Landroidx/collection/ArrayMap;Ljava/util/Collection;)V", "", "namedViews", "view", "findNamedViews", "(Ljava/util/Map;Landroid/view/View;)V", "collectEffects", "(Ljava/util/List;Z)V", "AnimationEffect", "AnimationInfo", "AnimatorEffect", "Api24Impl", "Api26Impl", "SpecialEffectsInfo", "TransitionEffect", "TransitionInfo", "fragment_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1176:1\n288#2,2:1177\n533#2,6:1179\n1360#2:1185\n1446#2,5:1186\n819#2:1191\n847#2,2:1192\n766#2:1194\n857#2,2:1195\n1789#2,3:1197\n1726#2,3:1200\n1855#2,2:1203\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n55#1:1177,2\n61#1:1179,6\n120#1:1185\n120#1:1186,5\n193#1:1191\n193#1:1192,2\n196#1:1194\n196#1:1195,2\n200#1:1197,3\n358#1:1200,3\n369#1:1203,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    @Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m5110d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "animationInfo", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "Landroid/view/ViewGroup;", "container", "Ld6/s;", "onCommit", "(Landroid/view/ViewGroup;)V", "onCancel", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "getAnimationInfo", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "fragment_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class AnimationEffect extends SpecialEffectsController.Effect {

        @NotNull
        private final AnimationInfo animationInfo;

        public AnimationEffect(@NotNull AnimationInfo animationInfo) {
            AbstractC5830k.m5330g(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        @NotNull
        public final AnimationInfo getAnimationInfo() {
            return this.animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(@NotNull ViewGroup container) {
            AbstractC5830k.m5330g(container, "container");
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().completeEffect(this);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(@NotNull ViewGroup container) {
            AbstractC5830k.m5330g(container, "container");
            if (this.animationInfo.isVisibilityUnchanged()) {
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            Context context = container.getContext();
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            AnimationInfo animationInfo = this.animationInfo;
            AbstractC5830k.m5329f(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation2 = animation.animation;
            if (animation2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                view.startAnimation(animation2);
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            container.startViewTransition(view);
            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, container, view);
            endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$AnimationEffect$onCommit$1(operation, container, view, this));
            view.startAnimation(endViewTransitionAnimation);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has started.");
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m5110d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Z)V", "animation", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "isAnimLoaded", "getAnimation", "context", "Landroid/content/Context;", "fragment_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class AnimationInfo extends SpecialEffectsInfo {

        @Nullable
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(@NotNull SpecialEffectsController.Operation operation, boolean z8) {
            super(operation);
            AbstractC5830k.m5330g(operation, "operation");
            this.isPop = z8;
        }

        @Nullable
        public final FragmentAnim.AnimationOrAnimator getAnimation(@NotNull Context context) {
            AbstractC5830k.m5330g(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = animationOrAnimatorLoadAnimation;
            this.isAnimLoaded = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    @Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m5110d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "animatorInfo", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "Landroid/view/ViewGroup;", "container", "Ld6/s;", "onStart", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/BackEventCompat;", "backEvent", "onProgress", "(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V", "onCommit", "onCancel", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "getAnimatorInfo", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroid/animation/AnimatorSet;", "animator", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "", "isSeekingSupported", "()Z", "fragment_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class AnimatorEffect extends SpecialEffectsController.Effect {

        @Nullable
        private AnimatorSet animator;

        @NotNull
        private final AnimationInfo animatorInfo;

        public AnimatorEffect(@NotNull AnimationInfo animatorInfo) {
            AbstractC5830k.m5330g(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        @Nullable
        public final AnimatorSet getAnimator() {
            return this.animator;
        }

        @NotNull
        public final AnimationInfo getAnimatorInfo() {
            return this.animatorInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* renamed from: isSeekingSupported */
        public boolean getIsSeekingSupported() {
            return true;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(@NotNull ViewGroup container) {
            AbstractC5830k.m5330g(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            if (!operation.getIsSeeking()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                Api26Impl.INSTANCE.reverse(animatorSet);
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("Animator from operation ");
                sb.append(operation);
                sb.append(" has been canceled");
                sb.append(operation.getIsSeeking() ? " with seeking." : ".");
                sb.append(' ');
                Log.v(FragmentManager.TAG, sb.toString());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(@NotNull ViewGroup container) {
            AbstractC5830k.m5330g(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(@NotNull BackEventCompat backEvent, @NotNull ViewGroup container) {
            AbstractC5830k.m5330g(backEvent, "backEvent");
            AbstractC5830k.m5330g(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().mTransitioning) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long j7 = Api24Impl.INSTANCE.totalDuration(animatorSet);
            long progress = (long) (backEvent.getProgress() * j7);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == j7) {
                progress = j7 - 1;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + operation);
            }
            Api26Impl.INSTANCE.setCurrentPlayTime(animatorSet, progress);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(@NotNull final ViewGroup container) {
            final AnimatorEffect animatorEffect;
            AbstractC5830k.m5330g(container, "container");
            if (this.animatorInfo.isVisibilityUnchanged()) {
                return;
            }
            Context context = container.getContext();
            AnimationInfo animationInfo = this.animatorInfo;
            AbstractC5830k.m5329f(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            this.animator = animation != null ? animation.animator : null;
            final SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            Fragment fragment = operation.getFragment();
            final boolean z8 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
            final View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorEffect = this;
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NotNull Animator anim) {
                        AbstractC5830k.m5330g(anim, "anim");
                        container.endViewTransition(view);
                        if (z8) {
                            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                            View viewToAnimate = view;
                            AbstractC5830k.m5329f(viewToAnimate, "viewToAnimate");
                            finalState.applyState(viewToAnimate, container);
                        }
                        animatorEffect.getAnimatorInfo().getOperation().completeEffect(animatorEffect);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has ended.");
                        }
                    }
                });
            } else {
                animatorEffect = this;
            }
            AnimatorSet animatorSet2 = animatorEffect.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final void setAnimator(@Nullable AnimatorSet animatorSet) {
            this.animator = animatorSet;
        }
    }

    @RequiresApi(24)
    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m5110d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api24Impl;", "", "()V", "totalDuration", "", "animatorSet", "Landroid/animation/AnimatorSet;", "fragment_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Api24Impl {

        @NotNull
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public final long totalDuration(@NotNull AnimatorSet animatorSet) {
            AbstractC5830k.m5330g(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    @RequiresApi(26)
    @Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m5110d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api26Impl;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "Ld6/s;", "reverse", "(Landroid/animation/AnimatorSet;)V", "", "time", "setCurrentPlayTime", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Api26Impl {

        @NotNull
        public static final Api26Impl INSTANCE = new Api26Impl();

        private Api26Impl() {
        }

        @DoNotInline
        public final void reverse(@NotNull AnimatorSet animatorSet) {
            AbstractC5830k.m5330g(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        @DoNotInline
        public final void setCurrentPlayTime(@NotNull AnimatorSet animatorSet, long time) {
            AbstractC5830k.m5330g(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(time);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m5110d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "isVisibilityUnchanged", "", "()Z", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "fragment_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static class SpecialEffectsInfo {

        @NotNull
        private final SpecialEffectsController.Operation operation;

        public SpecialEffectsInfo(@NotNull SpecialEffectsController.Operation operation) {
            AbstractC5830k.m5330g(operation, "operation");
            this.operation = operation;
        }

        @NotNull
        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final boolean isVisibilityUnchanged() {
            View view = this.operation.getFragment().mView;
            SpecialEffectsController.Operation.State stateAsOperationState = view != null ? SpecialEffectsController.Operation.State.INSTANCE.asOperationState(view) : null;
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (stateAsOperationState == finalState) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (stateAsOperationState == state || finalState == state) ? false : true;
        }
    }

    @Metadata(m5109d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010 J\u0017\u0010&\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b&\u0010 JG\u0010(\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0'2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b(\u0010)J=\u0010-\u001a\u00020\u001e2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0+H\u0002¢\u0006\u0004\b-\u0010.J/\u00101\u001a\u00020\u001e2\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u00100\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u00102R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010?R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010BR'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bC\u0010BR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010FR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bG\u0010BR'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bH\u0010BR#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\bI\u0010FR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bJ\u0010FR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010K\u001a\u0004\b\u0019\u0010LR\u001d\u0010N\u001a\u00020M8\u0006¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010S\u001a\u0004\bP\u0010QR$\u0010T\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010=\u001a\u0004\bU\u0010?\"\u0004\bV\u0010WR\"\u0010X\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010K\u001a\u0004\bY\u0010L\"\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010LR\u0011\u0010^\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b]\u0010L¨\u0006_"}, m5110d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "transitionInfos", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "firstOut", "lastIn", "Landroidx/fragment/app/FragmentTransitionImpl;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "Landroidx/collection/ArrayMap;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/FragmentTransitionImpl;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;Z)V", "Landroid/view/ViewGroup;", "container", "Ld6/s;", "onStart", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/BackEventCompat;", "backEvent", "onProgress", "(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V", "onCommit", "onCancel", "Lkotlin/Pair;", "createMergedTransition", "(Landroid/view/ViewGroup;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)Lkotlin/Pair;", "enteringViews", "Lkotlin/Function0;", "executeTransition", "runTransition", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lr6/a;)V", "transitioningViews", "view", "captureTransitioningViews", "(Ljava/util/ArrayList;Landroid/view/View;)V", "Ljava/util/List;", "getTransitionInfos", "()Ljava/util/List;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "getFirstOut", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "getLastIn", "Landroidx/fragment/app/FragmentTransitionImpl;", "getTransitionImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "getSharedElementFirstOutViews", "()Ljava/util/ArrayList;", "getSharedElementLastInViews", "Landroidx/collection/ArrayMap;", "getSharedElementNameMapping", "()Landroidx/collection/ArrayMap;", "getEnteringNames", "getExitingNames", "getFirstOutViews", "getLastInViews", "Z", "()Z", "Landroidx/core/os/CancellationSignal;", "transitionSignal", "Landroidx/core/os/CancellationSignal;", "getTransitionSignal", "()Landroidx/core/os/CancellationSignal;", "getTransitionSignal$annotations", "()V", "controller", "getController", "setController", "(Ljava/lang/Object;)V", "noControllerReturned", "getNoControllerReturned", "setNoControllerReturned", "(Z)V", "isSeekingSupported", "getTransitioning", "transitioning", "fragment_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1176:1\n1726#2,3:1177\n1726#2,3:1180\n1855#2,2:1183\n1549#2:1185\n1620#2,3:1186\n1855#2,2:1189\n1855#2,2:1192\n1549#2:1194\n1620#2,3:1195\n1855#2,2:1198\n1#3:1191\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect\n*L\n726#1:1177,3\n735#1:1180,3\n743#1:1183,2\n772#1:1185\n772#1:1186,3\n772#1:1189,2\n857#1:1192,2\n889#1:1194\n889#1:1195,3\n889#1:1198,2\n*E\n"})
    public static final class TransitionEffect extends SpecialEffectsController.Effect {

        @Nullable
        private Object controller;

        @NotNull
        private final ArrayList<String> enteringNames;

        @NotNull
        private final ArrayList<String> exitingNames;

        @Nullable
        private final SpecialEffectsController.Operation firstOut;

        @NotNull
        private final ArrayMap<String, View> firstOutViews;
        private final boolean isPop;

        @Nullable
        private final SpecialEffectsController.Operation lastIn;

        @NotNull
        private final ArrayMap<String, View> lastInViews;
        private boolean noControllerReturned;

        @NotNull
        private final ArrayList<View> sharedElementFirstOutViews;

        @NotNull
        private final ArrayList<View> sharedElementLastInViews;

        @NotNull
        private final ArrayMap<String, String> sharedElementNameMapping;

        @Nullable
        private final Object sharedElementTransition;

        @NotNull
        private final FragmentTransitionImpl transitionImpl;

        @NotNull
        private final List<TransitionInfo> transitionInfos;

        @NotNull
        private final CancellationSignal transitionSignal;

        public TransitionEffect(@NotNull List<TransitionInfo> transitionInfos, @Nullable SpecialEffectsController.Operation operation, @Nullable SpecialEffectsController.Operation operation2, @NotNull FragmentTransitionImpl transitionImpl, @Nullable Object obj, @NotNull ArrayList<View> sharedElementFirstOutViews, @NotNull ArrayList<View> sharedElementLastInViews, @NotNull ArrayMap<String, String> sharedElementNameMapping, @NotNull ArrayList<String> enteringNames, @NotNull ArrayList<String> exitingNames, @NotNull ArrayMap<String, View> firstOutViews, @NotNull ArrayMap<String, View> lastInViews, boolean z8) {
            AbstractC5830k.m5330g(transitionInfos, "transitionInfos");
            AbstractC5830k.m5330g(transitionImpl, "transitionImpl");
            AbstractC5830k.m5330g(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            AbstractC5830k.m5330g(sharedElementLastInViews, "sharedElementLastInViews");
            AbstractC5830k.m5330g(sharedElementNameMapping, "sharedElementNameMapping");
            AbstractC5830k.m5330g(enteringNames, "enteringNames");
            AbstractC5830k.m5330g(exitingNames, "exitingNames");
            AbstractC5830k.m5330g(firstOutViews, "firstOutViews");
            AbstractC5830k.m5330g(lastInViews, "lastInViews");
            this.transitionInfos = transitionInfos;
            this.firstOut = operation;
            this.lastIn = operation2;
            this.transitionImpl = transitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = sharedElementFirstOutViews;
            this.sharedElementLastInViews = sharedElementLastInViews;
            this.sharedElementNameMapping = sharedElementNameMapping;
            this.enteringNames = enteringNames;
            this.exitingNames = exitingNames;
            this.firstOutViews = firstOutViews;
            this.lastInViews = lastInViews;
            this.isPop = z8;
            this.transitionSignal = new CancellationSignal();
        }

        private final void captureTransitioningViews(ArrayList<View> transitioningViews, View view) {
            if (!(view instanceof ViewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    captureTransitioningViews(transitioningViews, childAt);
                }
            }
        }

        private final Pair<ArrayList<View>, Object> createMergedTransition(ViewGroup container, SpecialEffectsController.Operation lastIn, SpecialEffectsController.Operation firstOut) {
            SpecialEffectsController.Operation operation = lastIn;
            SpecialEffectsController.Operation operation2 = firstOut;
            View view = new View(container.getContext());
            Rect rect = new Rect();
            Iterator<TransitionInfo> it = this.transitionInfos.iterator();
            boolean z8 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().hasSharedElementTransition() && operation2 != null && operation != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), this.isPop, this.firstOutViews, true);
                    OneShotPreDrawListener.add(container, new RunnableC2702a(operation, operation2, 1, this));
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        String str = this.exitingNames.get(0);
                        AbstractC5830k.m5329f(str, "exitingNames[0]");
                        view2 = this.firstOutViews.get(str);
                        this.transitionImpl.setEpicenter(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        String str2 = this.enteringNames.get(0);
                        AbstractC5830k.m5329f(str2, "enteringNames[0]");
                        View view3 = this.lastInViews.get(str2);
                        if (view3 != null) {
                            OneShotPreDrawListener.add(container, new RunnableC2702a(this.transitionImpl, view3, 2, rect));
                            z8 = true;
                        }
                    }
                    this.transitionImpl.setSharedElementTargets(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    fragmentTransitionImpl.scheduleRemoveTargets(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<TransitionInfo> it2 = this.transitionInfos.iterator();
            Object objMergeTransitionsTogether = null;
            Object objMergeTransitionsTogether2 = null;
            while (it2.hasNext()) {
                TransitionInfo next = it2.next();
                SpecialEffectsController.Operation operation3 = next.getOperation();
                boolean z9 = z8;
                Object objCloneTransition = this.transitionImpl.cloneTransition(next.getTransition());
                if (objCloneTransition != null) {
                    ArrayList<View> arrayList2 = new ArrayList<>();
                    Iterator<TransitionInfo> it3 = it2;
                    View view4 = operation3.getFragment().mView;
                    AbstractC5830k.m5329f(view4, "operation.fragment.mView");
                    captureTransitioningViews(arrayList2, view4);
                    if (this.sharedElementTransition != null && (operation3 == operation2 || operation3 == operation)) {
                        if (operation3 == operation2) {
                            arrayList2.removeAll(AbstractC5805t.m5221H0(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(AbstractC5805t.m5221H0(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.addTarget(objCloneTransition, view);
                    } else {
                        this.transitionImpl.addTargets(objCloneTransition, arrayList2);
                        this.transitionImpl.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList2, null, null, null, null);
                        if (operation3.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation3.setAwaitingContainerChanges(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation3.getFragment().mView);
                            this.transitionImpl.scheduleHideFragmentView(objCloneTransition, operation3.getFragment().mView, arrayList3);
                            OneShotPreDrawListener.add(container, new RunnableC2703b(arrayList2, 0));
                        }
                    }
                    if (operation3.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z9) {
                            this.transitionImpl.setEpicenter(objCloneTransition, rect);
                        }
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Entering Transition: " + objCloneTransition);
                            Log.v(FragmentManager.TAG, ">>>>> EnteringViews <<<<<");
                            int size = arrayList2.size();
                            int i = 0;
                            while (i < size) {
                                int i8 = size;
                                View transitioningViews = arrayList2.get(i);
                                i++;
                                AbstractC5830k.m5329f(transitioningViews, "transitioningViews");
                                Log.v(FragmentManager.TAG, "View: " + transitioningViews);
                                size = i8;
                            }
                        }
                    } else {
                        this.transitionImpl.setEpicenter(objCloneTransition, view2);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Exiting Transition: " + objCloneTransition);
                            Log.v(FragmentManager.TAG, ">>>>> ExitingViews <<<<<");
                            int i9 = 0;
                            for (int size2 = arrayList2.size(); i9 < size2; size2 = size2) {
                                View transitioningViews2 = arrayList2.get(i9);
                                i9++;
                                AbstractC5830k.m5329f(transitioningViews2, "transitioningViews");
                                Log.v(FragmentManager.TAG, "View: " + transitioningViews2);
                            }
                        }
                    }
                    if (next.getIsOverlapAllowed()) {
                        objMergeTransitionsTogether = this.transitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether, objCloneTransition, null);
                    } else {
                        objMergeTransitionsTogether2 = this.transitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether2, objCloneTransition, null);
                    }
                    operation = lastIn;
                    operation2 = firstOut;
                    z8 = z9;
                    it2 = it3;
                } else {
                    operation = lastIn;
                    operation2 = firstOut;
                    z8 = z9;
                }
            }
            Object objMergeTransitionsInSequence = this.transitionImpl.mergeTransitionsInSequence(objMergeTransitionsTogether, objMergeTransitionsTogether2, this.sharedElementTransition);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Final merged transition: " + objMergeTransitionsInSequence + " for container " + container);
            }
            return new Pair<>(arrayList, objMergeTransitionsInSequence);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$12(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, TransitionEffect this$0) {
            AbstractC5830k.m5330g(this$0, "this$0");
            FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), this$0.isPop, this$0.lastInViews, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$13(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
            AbstractC5830k.m5330g(impl, "$impl");
            AbstractC5830k.m5330g(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.getBoundsOnScreen(view, lastInEpicenterRect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$14(ArrayList transitioningViews) {
            AbstractC5830k.m5330g(transitioningViews, "$transitioningViews");
            FragmentTransition.setViewVisibility(transitioningViews, 4);
        }

        public static /* synthetic */ void getTransitionSignal$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCommit$lambda$11$lambda$10(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
            AbstractC5830k.m5330g(operation, "$operation");
            AbstractC5830k.m5330g(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
            }
            operation.completeEffect(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onStart$lambda$6$lambda$4(Ref$ObjectRef seekCancelLambda) {
            AbstractC5830k.m5330g(seekCancelLambda, "$seekCancelLambda");
            InterfaceC6469a interfaceC6469a = (InterfaceC6469a) seekCancelLambda.element;
            if (interfaceC6469a != null) {
                interfaceC6469a.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onStart$lambda$6$lambda$5(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
            AbstractC5830k.m5330g(operation, "$operation");
            AbstractC5830k.m5330g(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
            }
            operation.completeEffect(this$0);
        }

        private final void runTransition(ArrayList<View> enteringViews, ViewGroup container, InterfaceC6469a executeTransition) {
            FragmentTransition.setViewVisibility(enteringViews, 4);
            ArrayList<String> arrayListPrepareSetNameOverridesReordered = this.transitionImpl.prepareSetNameOverridesReordered(this.sharedElementLastInViews);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, ">>>>> Beginning transition <<<<<");
                Log.v(FragmentManager.TAG, ">>>>> SharedElementFirstOutViews <<<<<");
                ArrayList<View> arrayList = this.sharedElementFirstOutViews;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    View sharedElementFirstOutViews = arrayList.get(i);
                    i++;
                    AbstractC5830k.m5329f(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = sharedElementFirstOutViews;
                    Log.v(FragmentManager.TAG, "View: " + view + " Name: " + ViewCompat.getTransitionName(view));
                }
                Log.v(FragmentManager.TAG, ">>>>> SharedElementLastInViews <<<<<");
                ArrayList<View> arrayList2 = this.sharedElementLastInViews;
                int size2 = arrayList2.size();
                int i8 = 0;
                while (i8 < size2) {
                    View sharedElementLastInViews = arrayList2.get(i8);
                    i8++;
                    AbstractC5830k.m5329f(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = sharedElementLastInViews;
                    Log.v(FragmentManager.TAG, "View: " + view2 + " Name: " + ViewCompat.getTransitionName(view2));
                }
            }
            executeTransition.invoke();
            this.transitionImpl.setNameOverridesReordered(container, this.sharedElementFirstOutViews, this.sharedElementLastInViews, arrayListPrepareSetNameOverridesReordered, this.sharedElementNameMapping);
            FragmentTransition.setViewVisibility(enteringViews, 0);
            this.transitionImpl.swapSharedElementTargets(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        @Nullable
        public final Object getController() {
            return this.controller;
        }

        @NotNull
        public final ArrayList<String> getEnteringNames() {
            return this.enteringNames;
        }

        @NotNull
        public final ArrayList<String> getExitingNames() {
            return this.exitingNames;
        }

        @Nullable
        public final SpecialEffectsController.Operation getFirstOut() {
            return this.firstOut;
        }

        @NotNull
        public final ArrayMap<String, View> getFirstOutViews() {
            return this.firstOutViews;
        }

        @Nullable
        public final SpecialEffectsController.Operation getLastIn() {
            return this.lastIn;
        }

        @NotNull
        public final ArrayMap<String, View> getLastInViews() {
            return this.lastInViews;
        }

        public final boolean getNoControllerReturned() {
            return this.noControllerReturned;
        }

        @NotNull
        public final ArrayList<View> getSharedElementFirstOutViews() {
            return this.sharedElementFirstOutViews;
        }

        @NotNull
        public final ArrayList<View> getSharedElementLastInViews() {
            return this.sharedElementLastInViews;
        }

        @NotNull
        public final ArrayMap<String, String> getSharedElementNameMapping() {
            return this.sharedElementNameMapping;
        }

        @Nullable
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        @NotNull
        public final FragmentTransitionImpl getTransitionImpl() {
            return this.transitionImpl;
        }

        @NotNull
        public final List<TransitionInfo> getTransitionInfos() {
            return this.transitionInfos;
        }

        @NotNull
        public final CancellationSignal getTransitionSignal() {
            return this.transitionSignal;
        }

        public final boolean getTransitioning() {
            List<TransitionInfo> list = this.transitionInfos;
            if (list != null && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((TransitionInfo) it.next()).getOperation().getFragment().mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: isPop, reason: from getter */
        public final boolean getIsPop() {
            return this.isPop;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* renamed from: isSeekingSupported */
        public boolean getIsSeekingSupported() {
            if (!this.transitionImpl.isSeekingSupported()) {
                return false;
            }
            List<TransitionInfo> list = this.transitionInfos;
            if (list == null || !list.isEmpty()) {
                for (TransitionInfo transitionInfo : list) {
                    if (Build.VERSION.SDK_INT < 34 || transitionInfo.getTransition() == null || !this.transitionImpl.isSeekingSupported(transitionInfo.getTransition())) {
                        return false;
                    }
                }
            }
            Object obj = this.sharedElementTransition;
            return obj == null || this.transitionImpl.isSeekingSupported(obj);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(@NotNull ViewGroup container) {
            AbstractC5830k.m5330g(container, "container");
            this.transitionSignal.cancel();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(@NotNull final ViewGroup container) {
            AbstractC5830k.m5330g(container, "container");
            int i = 0;
            if (!container.isLaidOut() || this.noControllerReturned) {
                for (TransitionInfo transitionInfo : this.transitionInfos) {
                    SpecialEffectsController.Operation operation = transitionInfo.getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (this.noControllerReturned) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + operation);
                        } else {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation);
                        }
                    }
                    transitionInfo.getOperation().completeEffect(this);
                }
                this.noControllerReturned = false;
                return;
            }
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.animateToEnd(obj);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ending execution of operations from " + this.firstOut + " to " + this.lastIn);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> pairCreateMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
            ArrayList<View> arrayListComponent1 = pairCreateMergedTransition.component1();
            final Object objComponent2 = pairCreateMergedTransition.component2();
            List<TransitionInfo> list = this.transitionInfos;
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TransitionInfo) it.next()).getOperation());
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj2;
                this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), objComponent2, this.transitionSignal, new RunnableC2704c(operation2, this, 1));
            }
            runTransition(arrayListComponent1, container, new InterfaceC6469a() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m13583invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m13583invoke() {
                    this.this$0.getTransitionImpl().beginDelayedTransition(container, objComponent2);
                }
            });
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Completed executing operations from " + this.firstOut + " to " + this.lastIn);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(@NotNull BackEventCompat backEvent, @NotNull ViewGroup container) {
            AbstractC5830k.m5330g(backEvent, "backEvent");
            AbstractC5830k.m5330g(container, "container");
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.setCurrentPlayTime(obj, backEvent.getProgress());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(@NotNull final ViewGroup container) {
            AbstractC5830k.m5330g(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((TransitionInfo) it.next()).getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            if (getTransitioning() && this.sharedElementTransition != null && !getIsSeekingSupported()) {
                Log.i(FragmentManager.TAG, "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (getIsSeekingSupported() && getTransitioning()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Pair<ArrayList<View>, Object> pairCreateMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
                ArrayList<View> arrayListComponent1 = pairCreateMergedTransition.component1();
                final Object objComponent2 = pairCreateMergedTransition.component2();
                List<TransitionInfo> list = this.transitionInfos;
                ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((TransitionInfo) it2.next()).getOperation());
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) arrayList.get(i);
                    this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), objComponent2, this.transitionSignal, new RunnableC2703b(ref$ObjectRef, 1), new RunnableC2704c(operation2, this, 0));
                }
                runTransition(arrayListComponent1, container, new InterfaceC6469a() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4

                    @Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "invoke", "()V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 8, 0})
                    @SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1176:1\n1726#2,3:1177\n1855#2,2:1180\n1855#2,2:1182\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1\n*L\n806#1:1177,3\n811#1:1180,2\n836#1:1182,2\n*E\n"})
                    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1 */
                    public static final class C26411 extends Lambda implements InterfaceC6469a {
                        final /* synthetic */ ViewGroup $container;
                        final /* synthetic */ Object $mergedTransition;
                        final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C26411(DefaultSpecialEffectsController.TransitionEffect transitionEffect, Object obj, ViewGroup viewGroup) {
                            super(0);
                            this.this$0 = transitionEffect;
                            this.$mergedTransition = obj;
                            this.$container = viewGroup;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void invoke$lambda$2(DefaultSpecialEffectsController.TransitionEffect this$0, ViewGroup container) {
                            AbstractC5830k.m5330g(this$0, "this$0");
                            AbstractC5830k.m5330g(container, "$container");
                            Iterator<T> it = this$0.getTransitionInfos().iterator();
                            while (it.hasNext()) {
                                SpecialEffectsController.Operation operation = ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation();
                                View view = operation.getFragment().getView();
                                if (view != null) {
                                    operation.getFinalState().applyState(view, container);
                                }
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void invoke$lambda$4(DefaultSpecialEffectsController.TransitionEffect this$0) {
                            AbstractC5830k.m5330g(this$0, "this$0");
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Transition for all operations has completed");
                            }
                            Iterator<T> it = this$0.getTransitionInfos().iterator();
                            while (it.hasNext()) {
                                ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().completeEffect(this$0);
                            }
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m13585invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13585invoke() {
                            List<DefaultSpecialEffectsController.TransitionInfo> transitionInfos = this.this$0.getTransitionInfos();
                            if (transitionInfos == null || !transitionInfos.isEmpty()) {
                                Iterator<T> it = transitionInfos.iterator();
                                while (it.hasNext()) {
                                    if (!((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().getIsSeeking()) {
                                        if (FragmentManager.isLoggingEnabled(2)) {
                                            Log.v(FragmentManager.TAG, "Completing animating immediately");
                                        }
                                        CancellationSignal cancellationSignal = new CancellationSignal();
                                        this.this$0.getTransitionImpl().setListenerForTransitionEnd(this.this$0.getTransitionInfos().get(0).getOperation().getFragment(), this.$mergedTransition, cancellationSignal, new RunnableC2703b(this.this$0, 2));
                                        cancellationSignal.cancel();
                                        return;
                                    }
                                }
                            }
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animating to start");
                            }
                            FragmentTransitionImpl transitionImpl = this.this$0.getTransitionImpl();
                            Object controller = this.this$0.getController();
                            AbstractC5830k.m5327d(controller);
                            transitionImpl.animateToStart(controller, new RunnableC2705d(0, this.this$0, this.$container));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13584invoke();
                        return C5443s.f8405a;
                    }

                    /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1] */
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13584invoke() {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Attempting to create TransitionSeekController");
                        }
                        DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
                        transitionEffect.setController(transitionEffect.getTransitionImpl().controlDelayedTransition(container, objComponent2));
                        if (this.this$0.getController() == null) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "TransitionSeekController was not created.");
                            }
                            this.this$0.setNoControllerReturned(true);
                            return;
                        }
                        ref$ObjectRef.element = new C26411(this.this$0, objComponent2, container);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Started executing operations from " + this.this$0.getFirstOut() + " to " + this.this$0.getLastIn());
                        }
                    }
                });
            }
        }

        public final void setController(@Nullable Object obj) {
            this.controller = obj;
        }

        public final void setNoControllerReturned(boolean z8) {
            this.noControllerReturned = z8;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(@NotNull ViewGroup container) {
        super(container);
        AbstractC5830k.m5330g(container, "container");
    }

    @SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
    private final void collectAnimEffects(List<AnimationInfo> animationInfos) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = animationInfos.iterator();
        while (it.hasNext()) {
            AbstractC5810y.m5291S(((AnimationInfo) it.next()).getOperation().getEffects$fragment_release(), arrayList2);
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        int i = 0;
        boolean z8 = false;
        for (AnimationInfo animationInfo : animationInfos) {
            Context context = getContainer().getContext();
            SpecialEffectsController.Operation operation = animationInfo.getOperation();
            AbstractC5830k.m5329f(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation != null) {
                if (animation.animator == null) {
                    arrayList.add(animationInfo);
                } else {
                    Fragment fragment = operation.getFragment();
                    if (operation.getEffects$fragment_release().isEmpty()) {
                        if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation.setAwaitingContainerChanges(false);
                        }
                        operation.addEffect(new AnimatorEffect(animationInfo));
                        z8 = true;
                    } else if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AnimationInfo animationInfo2 = (AnimationInfo) obj;
            SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (zIsEmpty) {
                if (!z8) {
                    operation2.addEffect(new AnimationEffect(animationInfo2));
                } else if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectEffects$lambda$2(DefaultSpecialEffectsController this$0, SpecialEffectsController.Operation operation) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(operation, "$operation");
        this$0.applyContainerChangesToOperation$fragment_release(operation);
    }

    private final void createTransitionEffect(List<TransitionInfo> transitionInfos, boolean isPop, SpecialEffectsController.Operation firstOut, SpecialEffectsController.Operation lastIn) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        FragmentTransitionImpl fragmentTransitionImpl;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i8;
        Object obj;
        String strFindKeyForValue;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : transitionInfos) {
            if (!((TransitionInfo) obj2).isVisibilityUnchanged()) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size = arrayList5.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj3 = arrayList5.get(i9);
            i9++;
            if (((TransitionInfo) obj3).getHandlingImpl() != null) {
                arrayList6.add(obj3);
            }
        }
        int size2 = arrayList6.size();
        FragmentTransitionImpl fragmentTransitionImpl2 = null;
        int i10 = 0;
        while (i10 < size2) {
            Object obj4 = arrayList6.get(i10);
            i10++;
            TransitionInfo transitionInfo = (TransitionInfo) obj4;
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (fragmentTransitionImpl2 != null && handlingImpl != fragmentTransitionImpl2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl2 = handlingImpl;
        }
        if (fragmentTransitionImpl2 == null) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayMap arrayMap = new ArrayMap();
        ArrayList<String> arrayList9 = new ArrayList<>();
        ArrayList<String> arrayList10 = new ArrayList<>();
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
        int size3 = arrayList6.size();
        ArrayList<String> sharedElementTargetNames = arrayList9;
        ArrayList<String> sharedElementSourceNames = arrayList10;
        Object obj5 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj6 = arrayList6.get(i11);
            int i12 = i11 + 1;
            TransitionInfo transitionInfo2 = (TransitionInfo) obj6;
            if (!transitionInfo2.hasSharedElementTransition() || firstOut == null || lastIn == null) {
                i = i12;
                arrayList2 = arrayList6;
                fragmentTransitionImpl = fragmentTransitionImpl2;
                arrayList3 = arrayList7;
                arrayList4 = arrayList8;
                i8 = size3;
                i11 = i;
                fragmentTransitionImpl2 = fragmentTransitionImpl;
                arrayList7 = arrayList3;
                arrayList8 = arrayList4;
                size3 = i8;
                arrayList6 = arrayList2;
            } else {
                Object objWrapTransitionInSet = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(transitionInfo2.getSharedElementTransition()));
                sharedElementSourceNames = lastIn.getFragment().getSharedElementSourceNames();
                AbstractC5830k.m5329f(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = firstOut.getFragment().getSharedElementSourceNames();
                AbstractC5830k.m5329f(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames2 = firstOut.getFragment().getSharedElementTargetNames();
                i = i12;
                AbstractC5830k.m5329f(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                int size4 = sharedElementTargetNames2.size();
                fragmentTransitionImpl = fragmentTransitionImpl2;
                arrayList3 = arrayList7;
                int i13 = 0;
                while (i13 < size4) {
                    int i14 = size4;
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i13));
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i13));
                    }
                    i13++;
                    size4 = i14;
                }
                sharedElementTargetNames = lastIn.getFragment().getSharedElementTargetNames();
                AbstractC5830k.m5329f(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                Pair pair = !isPop ? new Pair(firstOut.getFragment().getExitTransitionCallback(), lastIn.getFragment().getEnterTransitionCallback()) : new Pair(firstOut.getFragment().getEnterTransitionCallback(), lastIn.getFragment().getExitTransitionCallback());
                SharedElementCallback sharedElementCallback = (SharedElementCallback) pair.component1();
                SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pair.component2();
                int size5 = sharedElementSourceNames.size();
                arrayList4 = arrayList8;
                int i15 = 0;
                while (true) {
                    i8 = size3;
                    if (i15 >= size5) {
                        break;
                    }
                    int i16 = size5;
                    String str = sharedElementSourceNames.get(i15);
                    AbstractC5830k.m5329f(str, "exitingNames[i]");
                    String str2 = sharedElementTargetNames.get(i15);
                    AbstractC5830k.m5329f(str2, "enteringNames[i]");
                    arrayMap.put(str, str2);
                    i15++;
                    size3 = i8;
                    size5 = i16;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, ">>> entering view names <<<");
                    int size6 = sharedElementTargetNames.size();
                    arrayList2 = arrayList6;
                    obj = objWrapTransitionInSet;
                    int i17 = 0;
                    while (i17 < size6) {
                        String str3 = sharedElementTargetNames.get(i17);
                        int i18 = i17 + 1;
                        String str4 = str3;
                        Log.v(FragmentManager.TAG, "Name: " + str4);
                        size6 = size6;
                        i17 = i18;
                    }
                    Log.v(FragmentManager.TAG, ">>> exiting view names <<<");
                    int i19 = 0;
                    for (int size7 = sharedElementSourceNames.size(); i19 < size7; size7 = size7) {
                        String str5 = sharedElementSourceNames.get(i19);
                        Log.v(FragmentManager.TAG, "Name: " + str5);
                        i19++;
                    }
                } else {
                    arrayList2 = arrayList6;
                    obj = objWrapTransitionInSet;
                }
                View view = firstOut.getFragment().mView;
                AbstractC5830k.m5329f(view, "firstOut.fragment.mView");
                findNamedViews(arrayMap2, view);
                arrayMap2.retainAll(sharedElementSourceNames);
                if (sharedElementCallback != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing exit callback for operation " + firstOut);
                    }
                    sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap2);
                    int size8 = sharedElementSourceNames.size() - 1;
                    if (size8 >= 0) {
                        while (true) {
                            int i20 = size8 - 1;
                            String str6 = sharedElementSourceNames.get(size8);
                            AbstractC5830k.m5329f(str6, "exitingNames[i]");
                            String str7 = str6;
                            View view2 = arrayMap2.get(str7);
                            if (view2 == null) {
                                arrayMap.remove(str7);
                            } else if (!str7.equals(ViewCompat.getTransitionName(view2))) {
                                arrayMap.put(ViewCompat.getTransitionName(view2), (String) arrayMap.remove(str7));
                            }
                            if (i20 < 0) {
                                break;
                            } else {
                                size8 = i20;
                            }
                        }
                    }
                } else {
                    arrayMap.retainAll(arrayMap2.keySet());
                }
                View view3 = lastIn.getFragment().mView;
                AbstractC5830k.m5329f(view3, "lastIn.fragment.mView");
                findNamedViews(arrayMap3, view3);
                arrayMap3.retainAll(sharedElementTargetNames);
                arrayMap3.retainAll(arrayMap.values());
                if (sharedElementCallback2 != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing enter callback for operation " + lastIn);
                    }
                    sharedElementCallback2.onMapSharedElements(sharedElementTargetNames, arrayMap3);
                    int size9 = sharedElementTargetNames.size() - 1;
                    if (size9 >= 0) {
                        while (true) {
                            int i21 = size9 - 1;
                            String str8 = sharedElementTargetNames.get(size9);
                            AbstractC5830k.m5329f(str8, "enteringNames[i]");
                            String str9 = str8;
                            View view4 = arrayMap3.get(str9);
                            if (view4 == null) {
                                String strFindKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, str9);
                                if (strFindKeyForValue2 != null) {
                                    arrayMap.remove(strFindKeyForValue2);
                                }
                            } else if (!str9.equals(ViewCompat.getTransitionName(view4)) && (strFindKeyForValue = FragmentTransition.findKeyForValue(arrayMap, str9)) != null) {
                                arrayMap.put(strFindKeyForValue, ViewCompat.getTransitionName(view4));
                            }
                            if (i21 < 0) {
                                break;
                            } else {
                                size9 = i21;
                            }
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap, arrayMap3);
                }
                Collection<String> collectionKeySet = arrayMap.keySet();
                AbstractC5830k.m5329f(collectionKeySet, "sharedElementNameMapping.keys");
                retainMatchingViews(arrayMap2, collectionKeySet);
                Collection<String> collectionValues = arrayMap.values();
                AbstractC5830k.m5329f(collectionValues, "sharedElementNameMapping.values");
                retainMatchingViews(arrayMap3, collectionValues);
                if (arrayMap.isEmpty()) {
                    Log.i(FragmentManager.TAG, "Ignoring shared elements transition " + obj + " between " + firstOut + " and " + lastIn + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                    arrayList3.clear();
                    arrayList4.clear();
                    i11 = i;
                    fragmentTransitionImpl2 = fragmentTransitionImpl;
                    arrayList7 = arrayList3;
                    arrayList8 = arrayList4;
                    size3 = i8;
                    arrayList6 = arrayList2;
                    obj5 = null;
                } else {
                    obj5 = obj;
                    i11 = i;
                    fragmentTransitionImpl2 = fragmentTransitionImpl;
                    arrayList7 = arrayList3;
                    arrayList8 = arrayList4;
                    size3 = i8;
                    arrayList6 = arrayList2;
                }
            }
        }
        ArrayList arrayList11 = arrayList6;
        FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
        ArrayList arrayList12 = arrayList7;
        ArrayList arrayList13 = arrayList8;
        if (obj5 == null) {
            if (arrayList11.isEmpty()) {
                return;
            }
            int size10 = arrayList11.size();
            int i22 = 0;
            while (i22 < size10) {
                arrayList = arrayList11;
                Object obj7 = arrayList.get(i22);
                i22++;
                if (((TransitionInfo) obj7).getTransition() == null) {
                    arrayList11 = arrayList;
                }
            }
            return;
        }
        arrayList = arrayList11;
        ArrayList arrayList14 = arrayList;
        TransitionEffect transitionEffect = new TransitionEffect(arrayList14, firstOut, lastIn, fragmentTransitionImpl3, obj5, arrayList12, arrayList13, arrayMap, sharedElementTargetNames, sharedElementSourceNames, arrayMap2, arrayMap3, isPop);
        int size11 = arrayList14.size();
        int i23 = 0;
        while (i23 < size11) {
            Object obj8 = arrayList14.get(i23);
            i23++;
            ((TransitionInfo) obj8).getOperation().addEffect(transitionEffect);
        }
    }

    private final void findNamedViews(Map<String, View> namedViews, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            namedViews.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(namedViews, childAt);
                }
            }
        }
    }

    private final void retainMatchingViews(ArrayMap<String, View> arrayMap, final Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = arrayMap.entrySet();
        AbstractC5830k.m5329f(entries, "entries");
        AbstractC5810y.m5293U(entries, new InterfaceC6471c() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.retainMatchingViews.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            @NotNull
            public final Boolean invoke(@NotNull Map.Entry<String, View> entry) {
                AbstractC5830k.m5330g(entry, "entry");
                return Boolean.valueOf(AbstractC5805t.m5224d0(collection, ViewCompat.getTransitionName(entry.getValue())));
            }
        }, false);
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> operations) {
        Fragment fragment = ((SpecialEffectsController.Operation) AbstractC5805t.m5235o0(operations)).getFragment();
        for (SpecialEffectsController.Operation operation : operations) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void collectEffects(@org.jetbrains.annotations.NotNull java.util.List<? extends androidx.fragment.app.SpecialEffectsController.Operation> r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "operations"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r11, r0)
            r0 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L13
            java.lang.String r1 = "Collecting Effects"
            android.util.Log.v(r2, r1)
        L13:
            java.util.Iterator r1 = r11.iterator()
        L17:
            boolean r3 = r1.hasNext()
            r4 = 0
            java.lang.String r5 = "operation.fragment.mView"
            if (r3 == 0) goto L41
            java.lang.Object r3 = r1.next()
            r6 = r3
            androidx.fragment.app.SpecialEffectsController$Operation r6 = (androidx.fragment.app.SpecialEffectsController.Operation) r6
            androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.INSTANCE
            androidx.fragment.app.Fragment r8 = r6.getFragment()
            android.view.View r8 = r8.mView
            kotlin.jvm.internal.AbstractC5830k.m5329f(r8, r5)
            androidx.fragment.app.SpecialEffectsController$Operation$State r7 = r7.asOperationState(r8)
            androidx.fragment.app.SpecialEffectsController$Operation$State r8 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r7 != r8) goto L17
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r6.getFinalState()
            if (r6 == r8) goto L17
            goto L42
        L41:
            r3 = r4
        L42:
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3
            int r1 = r11.size()
            java.util.ListIterator r1 = r11.listIterator(r1)
        L4c:
            boolean r6 = r1.hasPrevious()
            if (r6 == 0) goto L73
            java.lang.Object r6 = r1.previous()
            r7 = r6
            androidx.fragment.app.SpecialEffectsController$Operation r7 = (androidx.fragment.app.SpecialEffectsController.Operation) r7
            androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r8 = androidx.fragment.app.SpecialEffectsController.Operation.State.INSTANCE
            androidx.fragment.app.Fragment r9 = r7.getFragment()
            android.view.View r9 = r9.mView
            kotlin.jvm.internal.AbstractC5830k.m5329f(r9, r5)
            androidx.fragment.app.SpecialEffectsController$Operation$State r8 = r8.asOperationState(r9)
            androidx.fragment.app.SpecialEffectsController$Operation$State r9 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r8 == r9) goto L4c
            androidx.fragment.app.SpecialEffectsController$Operation$State r7 = r7.getFinalState()
            if (r7 != r9) goto L4c
            r4 = r6
        L73:
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L94
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Executing operations from "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " to "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L94:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.syncAnimations(r11)
            java.util.Iterator r11 = r11.iterator()
        La5:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Ld6
            java.lang.Object r2 = r11.next()
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo
            r5.<init>(r2, r12)
            r0.add(r5)
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo
            r6 = 0
            r7 = 1
            if (r12 == 0) goto Lc3
            if (r2 != r3) goto Lc6
        Lc1:
            r6 = r7
            goto Lc6
        Lc3:
            if (r2 != r4) goto Lc6
            goto Lc1
        Lc6:
            r5.<init>(r2, r12, r6)
            r1.add(r5)
            androidx.fragment.app.d r5 = new androidx.fragment.app.d
            r6 = 1
            r5.<init>(r6, r10, r2)
            r2.addCompletionListener(r5)
            goto La5
        Ld6:
            r10.createTransitionEffect(r1, r12, r3, r4)
            r10.collectAnimEffects(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.collectEffects(java.util.List, boolean):void");
    }

    @Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\u0006\u0010\u0014\u001a\u00020\u0005R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, m5110d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "providesSharedElementTransition", "(Landroidx/fragment/app/SpecialEffectsController$Operation;ZZ)V", "handlingImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHandlingImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "isOverlapAllowed", "()Z", "sharedElementTransition", "", "getSharedElementTransition", "()Ljava/lang/Object;", "transition", "getTransition", "hasSharedElementTransition", "fragment_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;

        @Nullable
        private final Object sharedElementTransition;

        @Nullable
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(@NotNull SpecialEffectsController.Operation operation, boolean z8, boolean z9) {
            Object returnTransition;
            super(operation);
            AbstractC5830k.m5330g(operation, "operation");
            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation.getFragment();
                returnTransition = z8 ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z8 ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            this.isOverlapAllowed = operation.getFinalState() == state ? z8 ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap() : true;
            this.sharedElementTransition = z9 ? z8 ? operation.getFragment().getSharedElementReturnTransition() : operation.getFragment().getSharedElementEnterTransition() : null;
        }

        @Nullable
        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        @Nullable
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        @Nullable
        public final Object getTransition() {
            return this.transition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        /* renamed from: isOverlapAllowed, reason: from getter */
        public final boolean getIsOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        private final FragmentTransitionImpl getHandlingImpl(Object transition) {
            if (transition == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(transition)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(transition)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + transition + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
