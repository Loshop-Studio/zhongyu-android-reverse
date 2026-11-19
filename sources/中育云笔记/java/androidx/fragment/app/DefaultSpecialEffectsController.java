package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
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
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10980x;

/* loaded from: classes2.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    public static final class AnimationEffect extends SpecialEffectsController.Effect {
        private final AnimationInfo animationInfo;

        public AnimationEffect(AnimationInfo animationInfo) {
            AbstractC9979u.m20294g(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        public final AnimationInfo getAnimationInfo() {
            return this.animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(ViewGroup container) {
            AbstractC9979u.m20294g(container, "container");
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().completeEffect(this);
            if (FragmentManager.isLoggingEnabled(2)) {
                operation.toString();
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(ViewGroup container) throws Resources.NotFoundException {
            AbstractC9979u.m20294g(container, "container");
            if (this.animationInfo.isVisibilityUnchanged()) {
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            Context context = container.getContext();
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            AnimationInfo animationInfo = this.animationInfo;
            AbstractC9979u.m20293f(context, "context");
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
                operation.toString();
            }
        }
    }

    public static final class AnimationInfo extends SpecialEffectsInfo {
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, boolean z10) {
            super(operation);
            AbstractC9979u.m20294g(operation, "operation");
            this.isPop = z10;
        }

        public final FragmentAnim.AnimationOrAnimator getAnimation(Context context) throws Resources.NotFoundException {
            AbstractC9979u.m20294g(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = animationOrAnimatorLoadAnimation;
            this.isAnimLoaded = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    public static final class AnimatorEffect extends SpecialEffectsController.Effect {
        private AnimatorSet animator;
        private final AnimationInfo animatorInfo;

        public AnimatorEffect(AnimationInfo animatorInfo) {
            AbstractC9979u.m20294g(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        public final AnimatorSet getAnimator() {
            return this.animator;
        }

        public final AnimationInfo getAnimatorInfo() {
            return this.animatorInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
            return true;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(ViewGroup container) {
            AbstractC9979u.m20294g(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            if (!operation.isSeeking()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                Api26Impl.INSTANCE.reverse(animatorSet);
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                operation.toString();
                operation.isSeeking();
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(ViewGroup container) {
            AbstractC9979u.m20294g(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.isLoggingEnabled(2)) {
                Objects.toString(operation);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(BackEventCompat backEvent, ViewGroup container) {
            AbstractC9979u.m20294g(backEvent, "backEvent");
            AbstractC9979u.m20294g(container, "container");
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
                operation.toString();
            }
            long j10 = Api24Impl.INSTANCE.totalDuration(animatorSet);
            long progress = (long) (backEvent.getProgress() * j10);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == j10) {
                progress = j10 - 1;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                animatorSet.toString();
                operation.toString();
            }
            Api26Impl.INSTANCE.setCurrentPlayTime(animatorSet, progress);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(final ViewGroup container) throws Resources.NotFoundException {
            final AnimatorEffect animatorEffect;
            AbstractC9979u.m20294g(container, "container");
            if (this.animatorInfo.isVisibilityUnchanged()) {
                return;
            }
            Context context = container.getContext();
            AnimationInfo animationInfo = this.animatorInfo;
            AbstractC9979u.m20293f(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            this.animator = animation != null ? animation.animator : null;
            final SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            Fragment fragment = operation.getFragment();
            final boolean z10 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
            final View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorEffect = this;
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator anim) {
                        AbstractC9979u.m20294g(anim, "anim");
                        container.endViewTransition(view);
                        if (z10) {
                            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                            View viewToAnimate = view;
                            AbstractC9979u.m20293f(viewToAnimate, "viewToAnimate");
                            finalState.applyState(viewToAnimate, container);
                        }
                        animatorEffect.getAnimatorInfo().getOperation().completeEffect(animatorEffect);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Objects.toString(operation);
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

        public final void setAnimator(AnimatorSet animatorSet) {
            this.animator = animatorSet;
        }
    }

    @RequiresApi(24)
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public final long totalDuration(AnimatorSet animatorSet) {
            AbstractC9979u.m20294g(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    @RequiresApi(26)
    public static final class Api26Impl {
        public static final Api26Impl INSTANCE = new Api26Impl();

        private Api26Impl() {
        }

        @DoNotInline
        public final void reverse(AnimatorSet animatorSet) {
            AbstractC9979u.m20294g(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        @DoNotInline
        public final void setCurrentPlayTime(AnimatorSet animatorSet, long j10) {
            AbstractC9979u.m20294g(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j10);
        }
    }

    public static class SpecialEffectsInfo {
        private final SpecialEffectsController.Operation operation;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation) {
            AbstractC9979u.m20294g(operation, "operation");
            this.operation = operation;
        }

        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final boolean isVisibilityUnchanged() {
            View view = this.operation.getFragment().mView;
            SpecialEffectsController.Operation.State stateAsOperationState = view != null ? SpecialEffectsController.Operation.State.Companion.asOperationState(view) : null;
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (stateAsOperationState == finalState) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (stateAsOperationState == state || finalState == state) ? false : true;
        }
    }

    public static final class TransitionEffect extends SpecialEffectsController.Effect {
        private Object controller;
        private final ArrayList<String> enteringNames;
        private final ArrayList<String> exitingNames;
        private final SpecialEffectsController.Operation firstOut;
        private final ArrayMap<String, View> firstOutViews;
        private final boolean isPop;
        private final SpecialEffectsController.Operation lastIn;
        private final ArrayMap<String, View> lastInViews;
        private boolean noControllerReturned;
        private final ArrayList<View> sharedElementFirstOutViews;
        private final ArrayList<View> sharedElementLastInViews;
        private final ArrayMap<String, String> sharedElementNameMapping;
        private final Object sharedElementTransition;
        private final FragmentTransitionImpl transitionImpl;
        private final List<TransitionInfo> transitionInfos;
        private final CancellationSignal transitionSignal;

        public TransitionEffect(List<TransitionInfo> transitionInfos, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, FragmentTransitionImpl transitionImpl, Object obj, ArrayList<View> sharedElementFirstOutViews, ArrayList<View> sharedElementLastInViews, ArrayMap<String, String> sharedElementNameMapping, ArrayList<String> enteringNames, ArrayList<String> exitingNames, ArrayMap<String, View> firstOutViews, ArrayMap<String, View> lastInViews, boolean z10) {
            AbstractC9979u.m20294g(transitionInfos, "transitionInfos");
            AbstractC9979u.m20294g(transitionImpl, "transitionImpl");
            AbstractC9979u.m20294g(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            AbstractC9979u.m20294g(sharedElementLastInViews, "sharedElementLastInViews");
            AbstractC9979u.m20294g(sharedElementNameMapping, "sharedElementNameMapping");
            AbstractC9979u.m20294g(enteringNames, "enteringNames");
            AbstractC9979u.m20294g(exitingNames, "exitingNames");
            AbstractC9979u.m20294g(firstOutViews, "firstOutViews");
            AbstractC9979u.m20294g(lastInViews, "lastInViews");
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
            this.isPop = z10;
            this.transitionSignal = new CancellationSignal();
        }

        private final void captureTransitioningViews(ArrayList<View> arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    AbstractC9979u.m20293f(child, "child");
                    captureTransitioningViews(arrayList, child);
                }
            }
        }

        private final Pair<ArrayList<View>, Object> createMergedTransition(ViewGroup viewGroup, SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
            final SpecialEffectsController.Operation operation3 = operation;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator<TransitionInfo> it = this.transitionInfos.iterator();
            boolean z10 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().hasSharedElementTransition() && operation2 != null && operation3 != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    FragmentTransition.callSharedElementStartEnd(operation3.getFragment(), operation2.getFragment(), this.isPop, this.firstOutViews, true);
                    OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$12(operation3, operation2, this);
                        }
                    });
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        String str = this.exitingNames.get(0);
                        AbstractC9979u.m20293f(str, "exitingNames[0]");
                        view2 = this.firstOutViews.get(str);
                        this.transitionImpl.setEpicenter(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        String str2 = this.enteringNames.get(0);
                        AbstractC9979u.m20293f(str2, "enteringNames[0]");
                        final View view3 = this.lastInViews.get(str2);
                        if (view3 != null) {
                            final FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                            OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$13(fragmentTransitionImpl, view3, rect);
                                }
                            });
                            z10 = true;
                        }
                    }
                    this.transitionImpl.setSharedElementTargets(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    FragmentTransitionImpl fragmentTransitionImpl2 = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    fragmentTransitionImpl2.scheduleRemoveTargets(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<TransitionInfo> it2 = this.transitionInfos.iterator();
            Object objMergeTransitionsTogether = null;
            Object objMergeTransitionsTogether2 = null;
            while (it2.hasNext()) {
                TransitionInfo next = it2.next();
                SpecialEffectsController.Operation operation4 = next.getOperation();
                Object objCloneTransition = this.transitionImpl.cloneTransition(next.getTransition());
                if (objCloneTransition != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    boolean z11 = z10;
                    View view4 = operation4.getFragment().mView;
                    Iterator<TransitionInfo> it3 = it2;
                    AbstractC9979u.m20293f(view4, "operation.fragment.mView");
                    captureTransitioningViews(arrayList2, view4);
                    if (this.sharedElementTransition != null && (operation4 == operation2 || operation4 == operation3)) {
                        if (operation4 == operation2) {
                            arrayList2.removeAll(AbstractC10947g0.m23929c1(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(AbstractC10947g0.m23929c1(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.addTarget(objCloneTransition, view);
                    } else {
                        this.transitionImpl.addTargets(objCloneTransition, arrayList2);
                        this.transitionImpl.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList2, null, null, null, null);
                        if (operation4.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation4.setAwaitingContainerChanges(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation4.getFragment().mView);
                            this.transitionImpl.scheduleHideFragmentView(objCloneTransition, operation4.getFragment().mView, arrayList3);
                            OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$14(arrayList2);
                                }
                            });
                        }
                    }
                    if (operation4.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z11) {
                            this.transitionImpl.setEpicenter(objCloneTransition, rect);
                        }
                        if (FragmentManager.isLoggingEnabled(2)) {
                            objCloneTransition.toString();
                            int size = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size) {
                                View transitioningViews = arrayList2.get(i10);
                                i10++;
                                AbstractC9979u.m20293f(transitioningViews, "transitioningViews");
                                Objects.toString(transitioningViews);
                            }
                        }
                    } else {
                        this.transitionImpl.setEpicenter(objCloneTransition, view2);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            objCloneTransition.toString();
                            int size2 = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size2) {
                                View transitioningViews2 = arrayList2.get(i11);
                                i11++;
                                AbstractC9979u.m20293f(transitioningViews2, "transitioningViews");
                                Objects.toString(transitioningViews2);
                            }
                        }
                    }
                    if (next.isOverlapAllowed()) {
                        objMergeTransitionsTogether = this.transitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether, objCloneTransition, null);
                    } else {
                        objMergeTransitionsTogether2 = this.transitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether2, objCloneTransition, null);
                    }
                    operation3 = operation;
                    z10 = z11;
                    it2 = it3;
                } else {
                    operation3 = operation;
                }
            }
            Object objMergeTransitionsInSequence = this.transitionImpl.mergeTransitionsInSequence(objMergeTransitionsTogether, objMergeTransitionsTogether2, this.sharedElementTransition);
            if (FragmentManager.isLoggingEnabled(2)) {
                Objects.toString(objMergeTransitionsInSequence);
                viewGroup.toString();
            }
            return new Pair<>(arrayList, objMergeTransitionsInSequence);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$12(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, TransitionEffect this$0) {
            AbstractC9979u.m20294g(this$0, "this$0");
            FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), this$0.isPop, this$0.lastInViews, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$13(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
            AbstractC9979u.m20294g(impl, "$impl");
            AbstractC9979u.m20294g(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.getBoundsOnScreen(view, lastInEpicenterRect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$14(ArrayList transitioningViews) {
            AbstractC9979u.m20294g(transitioningViews, "$transitioningViews");
            FragmentTransition.setViewVisibility(transitioningViews, 4);
        }

        public static /* synthetic */ void getTransitionSignal$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCommit$lambda$11$lambda$10(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
            AbstractC9979u.m20294g(operation, "$operation");
            AbstractC9979u.m20294g(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                Objects.toString(operation);
            }
            operation.completeEffect(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onStart$lambda$6$lambda$4(Ref$ObjectRef seekCancelLambda) {
            AbstractC9979u.m20294g(seekCancelLambda, "$seekCancelLambda");
            InterfaceC9529a interfaceC9529a = (InterfaceC9529a) seekCancelLambda.f23402c;
            if (interfaceC9529a != null) {
                interfaceC9529a.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onStart$lambda$6$lambda$5(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
            AbstractC9979u.m20294g(operation, "$operation");
            AbstractC9979u.m20294g(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                Objects.toString(operation);
            }
            operation.completeEffect(this$0);
        }

        private final void runTransition(ArrayList<View> arrayList, ViewGroup viewGroup, InterfaceC9529a interfaceC9529a) {
            FragmentTransition.setViewVisibility(arrayList, 4);
            ArrayList<String> arrayListPrepareSetNameOverridesReordered = this.transitionImpl.prepareSetNameOverridesReordered(this.sharedElementLastInViews);
            if (FragmentManager.isLoggingEnabled(2)) {
                ArrayList<View> arrayList2 = this.sharedElementFirstOutViews;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    View sharedElementFirstOutViews = arrayList2.get(i10);
                    i10++;
                    AbstractC9979u.m20293f(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = sharedElementFirstOutViews;
                    Objects.toString(view);
                    ViewCompat.getTransitionName(view);
                }
                ArrayList<View> arrayList3 = this.sharedElementLastInViews;
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    View sharedElementLastInViews = arrayList3.get(i11);
                    i11++;
                    AbstractC9979u.m20293f(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = sharedElementLastInViews;
                    Objects.toString(view2);
                    ViewCompat.getTransitionName(view2);
                }
            }
            interfaceC9529a.invoke();
            this.transitionImpl.setNameOverridesReordered(viewGroup, this.sharedElementFirstOutViews, this.sharedElementLastInViews, arrayListPrepareSetNameOverridesReordered, this.sharedElementNameMapping);
            FragmentTransition.setViewVisibility(arrayList, 0);
            this.transitionImpl.swapSharedElementTargets(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        public final Object getController() {
            return this.controller;
        }

        public final ArrayList<String> getEnteringNames() {
            return this.enteringNames;
        }

        public final ArrayList<String> getExitingNames() {
            return this.exitingNames;
        }

        public final SpecialEffectsController.Operation getFirstOut() {
            return this.firstOut;
        }

        public final ArrayMap<String, View> getFirstOutViews() {
            return this.firstOutViews;
        }

        public final SpecialEffectsController.Operation getLastIn() {
            return this.lastIn;
        }

        public final ArrayMap<String, View> getLastInViews() {
            return this.lastInViews;
        }

        public final boolean getNoControllerReturned() {
            return this.noControllerReturned;
        }

        public final ArrayList<View> getSharedElementFirstOutViews() {
            return this.sharedElementFirstOutViews;
        }

        public final ArrayList<View> getSharedElementLastInViews() {
            return this.sharedElementLastInViews;
        }

        public final ArrayMap<String, String> getSharedElementNameMapping() {
            return this.sharedElementNameMapping;
        }

        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        public final FragmentTransitionImpl getTransitionImpl() {
            return this.transitionImpl;
        }

        public final List<TransitionInfo> getTransitionInfos() {
            return this.transitionInfos;
        }

        public final CancellationSignal getTransitionSignal() {
            return this.transitionSignal;
        }

        public final boolean getTransitioning() {
            List<TransitionInfo> list = this.transitionInfos;
            if ((list instanceof Collection) && list.isEmpty()) {
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

        public final boolean isPop() {
            return this.isPop;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
            if (!this.transitionImpl.isSeekingSupported()) {
                return false;
            }
            List<TransitionInfo> list = this.transitionInfos;
            if (!(list instanceof Collection) || !list.isEmpty()) {
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
        public void onCancel(ViewGroup container) {
            AbstractC9979u.m20294g(container, "container");
            this.transitionSignal.cancel();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(final ViewGroup container) {
            AbstractC9979u.m20294g(container, "container");
            int i10 = 0;
            if (!container.isLaidOut() || this.noControllerReturned) {
                for (TransitionInfo transitionInfo : this.transitionInfos) {
                    SpecialEffectsController.Operation operation = transitionInfo.getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (this.noControllerReturned) {
                            Objects.toString(operation);
                        } else {
                            container.toString();
                            Objects.toString(operation);
                        }
                    }
                    transitionInfo.getOperation().completeEffect(this);
                }
                this.noControllerReturned = false;
                return;
            }
            Object obj = this.controller;
            if (obj != null) {
                FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                AbstractC9979u.m20291d(obj);
                fragmentTransitionImpl.animateToEnd(obj);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Objects.toString(this.firstOut);
                    Objects.toString(this.lastIn);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> pairCreateMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
            ArrayList<View> arrayList = (ArrayList) pairCreateMergedTransition.m20048a();
            final Object objM20049c = pairCreateMergedTransition.m20049c();
            List<TransitionInfo> list = this.transitionInfos;
            ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TransitionInfo) it.next()).getOperation());
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                final SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj2;
                this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), objM20049c, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.TransitionEffect.onCommit$lambda$11$lambda$10(operation2, this);
                    }
                });
            }
            runTransition(arrayList, container, new InterfaceC9529a() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m33779invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m33779invoke() {
                    this.this$0.getTransitionImpl().beginDelayedTransition(container, objM20049c);
                }
            });
            if (FragmentManager.isLoggingEnabled(2)) {
                Objects.toString(this.firstOut);
                Objects.toString(this.lastIn);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(BackEventCompat backEvent, ViewGroup container) {
            AbstractC9979u.m20294g(backEvent, "backEvent");
            AbstractC9979u.m20294g(container, "container");
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.setCurrentPlayTime(obj, backEvent.getProgress());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(final ViewGroup container) {
            AbstractC9979u.m20294g(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((TransitionInfo) it.next()).getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        container.toString();
                        Objects.toString(operation);
                    }
                }
                return;
            }
            if (getTransitioning() && this.sharedElementTransition != null && !isSeekingSupported()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (isSeekingSupported() && getTransitioning()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Pair<ArrayList<View>, Object> pairCreateMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
                ArrayList<View> arrayList = (ArrayList) pairCreateMergedTransition.m20048a();
                final Object objM20049c = pairCreateMergedTransition.m20049c();
                List<TransitionInfo> list = this.transitionInfos;
                ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((TransitionInfo) it2.next()).getOperation());
                }
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    final SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) arrayList2.get(i10);
                    this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), objM20049c, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$4(ref$ObjectRef);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$5(operation2, this);
                        }
                    });
                }
                runTransition(arrayList, container, new InterfaceC9529a() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4

                    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1 */
                    public static final class C38021 extends Lambda implements InterfaceC9529a {
                        final /* synthetic */ ViewGroup $container;
                        final /* synthetic */ Object $mergedTransition;
                        final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C38021(DefaultSpecialEffectsController.TransitionEffect transitionEffect, Object obj, ViewGroup viewGroup) {
                            super(0);
                            this.this$0 = transitionEffect;
                            this.$mergedTransition = obj;
                            this.$container = viewGroup;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void invoke$lambda$2(DefaultSpecialEffectsController.TransitionEffect this$0, ViewGroup container) {
                            AbstractC9979u.m20294g(this$0, "this$0");
                            AbstractC9979u.m20294g(container, "$container");
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
                            AbstractC9979u.m20294g(this$0, "this$0");
                            FragmentManager.isLoggingEnabled(2);
                            Iterator<T> it = this$0.getTransitionInfos().iterator();
                            while (it.hasNext()) {
                                ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().completeEffect(this$0);
                            }
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m33781invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m33781invoke() {
                            List<DefaultSpecialEffectsController.TransitionInfo> transitionInfos = this.this$0.getTransitionInfos();
                            if (!(transitionInfos instanceof Collection) || !transitionInfos.isEmpty()) {
                                Iterator<T> it = transitionInfos.iterator();
                                while (it.hasNext()) {
                                    if (!((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().isSeeking()) {
                                        FragmentManager.isLoggingEnabled(2);
                                        CancellationSignal cancellationSignal = new CancellationSignal();
                                        FragmentTransitionImpl transitionImpl = this.this$0.getTransitionImpl();
                                        Fragment fragment = this.this$0.getTransitionInfos().get(0).getOperation().getFragment();
                                        Object obj = this.$mergedTransition;
                                        final DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
                                        transitionImpl.setListenerForTransitionEnd(fragment, obj, cancellationSignal, 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005d: INVOKE 
                                              (r1v7 'transitionImpl' androidx.fragment.app.FragmentTransitionImpl)
                                              (r2v6 'fragment' androidx.fragment.app.Fragment)
                                              (r3v1 'obj' java.lang.Object)
                                              (r0v4 'cancellationSignal' androidx.core.os.CancellationSignal)
                                              (wrap:java.lang.Runnable:0x005a: CONSTRUCTOR (r4v0 'transitionEffect' androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect A[DONT_INLINE]) A[MD:(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void (m), WRAPPED] call: androidx.fragment.app.j.<init>(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void type: CONSTRUCTOR)
                                             VIRTUAL call: androidx.fragment.app.FragmentTransitionImpl.setListenerForTransitionEnd(androidx.fragment.app.Fragment, java.lang.Object, androidx.core.os.CancellationSignal, java.lang.Runnable):void A[MD:(androidx.fragment.app.Fragment, java.lang.Object, androidx.core.os.CancellationSignal, java.lang.Runnable):void (m)] in method: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.1.invoke():void, file: classes2.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.fragment.app.j, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 35 more
                                            */
                                        /*
                                            this = this;
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.this$0
                                            java.util.List r0 = r0.getTransitionInfos()
                                            java.lang.Iterable r0 = (java.lang.Iterable) r0
                                            boolean r1 = r0 instanceof java.util.Collection
                                            r2 = 2
                                            if (r1 == 0) goto L17
                                            r1 = r0
                                            java.util.Collection r1 = (java.util.Collection) r1
                                            boolean r1 = r1.isEmpty()
                                            if (r1 == 0) goto L17
                                            goto L64
                                        L17:
                                            java.util.Iterator r0 = r0.iterator()
                                        L1b:
                                            boolean r1 = r0.hasNext()
                                            if (r1 == 0) goto L64
                                            java.lang.Object r1 = r0.next()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
                                            androidx.fragment.app.SpecialEffectsController$Operation r1 = r1.getOperation()
                                            boolean r1 = r1.isSeeking()
                                            if (r1 != 0) goto L1b
                                            androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                                            androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal
                                            r0.<init>()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.this$0
                                            androidx.fragment.app.FragmentTransitionImpl r1 = r1.getTransitionImpl()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.this$0
                                            java.util.List r2 = r2.getTransitionInfos()
                                            r3 = 0
                                            java.lang.Object r2 = r2.get(r3)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r2 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r2
                                            androidx.fragment.app.SpecialEffectsController$Operation r2 = r2.getOperation()
                                            androidx.fragment.app.Fragment r2 = r2.getFragment()
                                            java.lang.Object r3 = r6.$mergedTransition
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r4 = r6.this$0
                                            androidx.fragment.app.j r5 = new androidx.fragment.app.j
                                            r5.<init>(r4)
                                            r1.setListenerForTransitionEnd(r2, r3, r0, r5)
                                            r0.cancel()
                                            return
                                        L64:
                                            androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.this$0
                                            androidx.fragment.app.FragmentTransitionImpl r0 = r0.getTransitionImpl()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.this$0
                                            java.lang.Object r1 = r1.getController()
                                            kotlin.jvm.internal.AbstractC9979u.m20291d(r1)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.this$0
                                            android.view.ViewGroup r3 = r6.$container
                                            androidx.fragment.app.i r4 = new androidx.fragment.app.i
                                            r4.<init>(r2, r3)
                                            r0.animateToStart(r1, r4)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.C38021.m33781invoke():void");
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // p181hd.InterfaceC9529a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m33780invoke();
                                    return C10786q.f26013a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m33780invoke() {
                                    FragmentManager.isLoggingEnabled(2);
                                    DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
                                    transitionEffect.setController(transitionEffect.getTransitionImpl().controlDelayedTransition(container, objM20049c));
                                    if (this.this$0.getController() == null) {
                                        FragmentManager.isLoggingEnabled(2);
                                        this.this$0.setNoControllerReturned(true);
                                        return;
                                    }
                                    ref$ObjectRef.f23402c = new C38021(this.this$0, objM20049c, container);
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Objects.toString(this.this$0.getFirstOut());
                                        Objects.toString(this.this$0.getLastIn());
                                    }
                                }
                            });
                        }
                    }

                    public final void setController(Object obj) {
                        this.controller = obj;
                    }

                    public final void setNoControllerReturned(boolean z10) {
                        this.noControllerReturned = z10;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DefaultSpecialEffectsController(ViewGroup container) {
                    super(container);
                    AbstractC9979u.m20294g(container, "container");
                }

                @SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
                private final void collectAnimEffects(List<AnimationInfo> list) throws Resources.NotFoundException {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC10937b0.m23857B(arrayList2, ((AnimationInfo) it.next()).getOperation().getEffects$fragment_release());
                    }
                    boolean zIsEmpty = arrayList2.isEmpty();
                    int i10 = 0;
                    boolean z10 = false;
                    for (AnimationInfo animationInfo : list) {
                        Context context = getContainer().getContext();
                        SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        AbstractC9979u.m20293f(context, "context");
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
                                    z10 = true;
                                } else if (FragmentManager.isLoggingEnabled(2)) {
                                    Objects.toString(fragment);
                                }
                            }
                        }
                    }
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        AnimationInfo animationInfo2 = (AnimationInfo) obj;
                        SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
                        Fragment fragment2 = operation2.getFragment();
                        if (zIsEmpty) {
                            if (!z10) {
                                operation2.addEffect(new AnimationEffect(animationInfo2));
                            } else if (FragmentManager.isLoggingEnabled(2)) {
                                Objects.toString(fragment2);
                            }
                        } else if (FragmentManager.isLoggingEnabled(2)) {
                            Objects.toString(fragment2);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void collectEffects$lambda$2(DefaultSpecialEffectsController this$0, SpecialEffectsController.Operation operation) {
                    AbstractC9979u.m20294g(this$0, "this$0");
                    AbstractC9979u.m20294g(operation, "$operation");
                    this$0.applyContainerChangesToOperation$fragment_release(operation);
                }

                private final void createTransitionEffect(List<TransitionInfo> list, boolean z10, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
                    int i10;
                    int i11;
                    ArrayList<String> arrayList;
                    String strFindKeyForValue;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (!((TransitionInfo) obj).isVisibilityUnchanged()) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        if (((TransitionInfo) obj2).getHandlingImpl() != null) {
                            arrayList3.add(obj2);
                        }
                    }
                    int size2 = arrayList3.size();
                    FragmentTransitionImpl fragmentTransitionImpl = null;
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj3 = arrayList3.get(i13);
                        i13++;
                        TransitionInfo transitionInfo = (TransitionInfo) obj3;
                        FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
                        if (fragmentTransitionImpl != null && handlingImpl != fragmentTransitionImpl) {
                            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
                        }
                        fragmentTransitionImpl = handlingImpl;
                    }
                    if (fragmentTransitionImpl == null) {
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayMap arrayMap = new ArrayMap();
                    ArrayList<String> arrayList6 = new ArrayList<>();
                    ArrayList<String> arrayList7 = new ArrayList<>();
                    ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
                    ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
                    int size3 = arrayList3.size();
                    ArrayList<String> sharedElementTargetNames = arrayList6;
                    ArrayList<String> arrayList8 = arrayList7;
                    Object objWrapTransitionInSet = null;
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj4 = arrayList3.get(i14);
                        int i15 = i14 + 1;
                        TransitionInfo transitionInfo2 = (TransitionInfo) obj4;
                        if (!transitionInfo2.hasSharedElementTransition() || operation == null || operation2 == null) {
                            i14 = i15;
                            fragmentTransitionImpl = fragmentTransitionImpl;
                            arrayList4 = arrayList4;
                            arrayList5 = arrayList5;
                            size3 = size3;
                        } else {
                            objWrapTransitionInSet = fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(transitionInfo2.getSharedElementTransition()));
                            ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                            AbstractC9979u.m20293f(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                            AbstractC9979u.m20293f(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementTargetNames2 = operation.getFragment().getSharedElementTargetNames();
                            AbstractC9979u.m20293f(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                            int size4 = sharedElementTargetNames2.size();
                            FragmentTransitionImpl fragmentTransitionImpl2 = fragmentTransitionImpl;
                            ArrayList arrayList9 = arrayList4;
                            int i16 = 0;
                            while (i16 < size4) {
                                int i17 = size4;
                                int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i16));
                                if (iIndexOf != -1) {
                                    sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i16));
                                }
                                i16++;
                                size4 = i17;
                            }
                            sharedElementTargetNames = operation2.getFragment().getSharedElementTargetNames();
                            AbstractC9979u.m20293f(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                            Pair pairM22975a = !z10 ? AbstractC10776g.m22975a(operation.getFragment().getExitTransitionCallback(), operation2.getFragment().getEnterTransitionCallback()) : AbstractC10776g.m22975a(operation.getFragment().getEnterTransitionCallback(), operation2.getFragment().getExitTransitionCallback());
                            SharedElementCallback sharedElementCallback = (SharedElementCallback) pairM22975a.m20048a();
                            SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pairM22975a.m20049c();
                            int size5 = sharedElementSourceNames.size();
                            ArrayList arrayList10 = arrayList5;
                            int i18 = 0;
                            while (true) {
                                i10 = size3;
                                if (i18 >= size5) {
                                    break;
                                }
                                int i19 = size5;
                                String str = sharedElementSourceNames.get(i18);
                                AbstractC9979u.m20293f(str, "exitingNames[i]");
                                String str2 = sharedElementTargetNames.get(i18);
                                AbstractC9979u.m20293f(str2, "enteringNames[i]");
                                arrayMap.put(str, str2);
                                i18++;
                                size3 = i10;
                                size5 = i19;
                            }
                            if (FragmentManager.isLoggingEnabled(2)) {
                                int size6 = sharedElementTargetNames.size();
                                i11 = 2;
                                for (int i20 = 0; i20 < size6; i20++) {
                                    sharedElementTargetNames.get(i20);
                                }
                                int size7 = sharedElementSourceNames.size();
                                for (int i21 = 0; i21 < size7; i21++) {
                                    sharedElementSourceNames.get(i21);
                                }
                            } else {
                                i11 = 2;
                            }
                            View view = operation.getFragment().mView;
                            AbstractC9979u.m20293f(view, "firstOut.fragment.mView");
                            findNamedViews(arrayMap2, view);
                            arrayMap2.retainAll(sharedElementSourceNames);
                            if (sharedElementCallback != null) {
                                if (FragmentManager.isLoggingEnabled(i11)) {
                                    operation.toString();
                                }
                                sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap2);
                                int size8 = sharedElementSourceNames.size() - 1;
                                if (size8 >= 0) {
                                    while (true) {
                                        int i22 = size8 - 1;
                                        String str3 = sharedElementSourceNames.get(size8);
                                        AbstractC9979u.m20293f(str3, "exitingNames[i]");
                                        String str4 = str3;
                                        View view2 = arrayMap2.get(str4);
                                        if (view2 == null) {
                                            arrayMap.remove(str4);
                                            arrayList = sharedElementSourceNames;
                                        } else {
                                            arrayList = sharedElementSourceNames;
                                            if (!AbstractC9979u.m20289b(str4, ViewCompat.getTransitionName(view2))) {
                                                arrayMap.put(ViewCompat.getTransitionName(view2), (String) arrayMap.remove(str4));
                                            }
                                        }
                                        if (i22 < 0) {
                                            break;
                                        }
                                        size8 = i22;
                                        sharedElementSourceNames = arrayList;
                                    }
                                } else {
                                    arrayList = sharedElementSourceNames;
                                }
                            } else {
                                arrayList = sharedElementSourceNames;
                                arrayMap.retainAll(arrayMap2.keySet());
                            }
                            View view3 = operation2.getFragment().mView;
                            AbstractC9979u.m20293f(view3, "lastIn.fragment.mView");
                            findNamedViews(arrayMap3, view3);
                            arrayMap3.retainAll(sharedElementTargetNames);
                            arrayMap3.retainAll(arrayMap.values());
                            if (sharedElementCallback2 != null) {
                                if (FragmentManager.isLoggingEnabled(i11)) {
                                    operation2.toString();
                                }
                                sharedElementCallback2.onMapSharedElements(sharedElementTargetNames, arrayMap3);
                                int size9 = sharedElementTargetNames.size() - 1;
                                if (size9 >= 0) {
                                    while (true) {
                                        int i23 = size9 - 1;
                                        String str5 = sharedElementTargetNames.get(size9);
                                        AbstractC9979u.m20293f(str5, "enteringNames[i]");
                                        String str6 = str5;
                                        View view4 = arrayMap3.get(str6);
                                        if (view4 == null) {
                                            String strFindKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, str6);
                                            if (strFindKeyForValue2 != null) {
                                                arrayMap.remove(strFindKeyForValue2);
                                            }
                                        } else if (!AbstractC9979u.m20289b(str6, ViewCompat.getTransitionName(view4)) && (strFindKeyForValue = FragmentTransition.findKeyForValue(arrayMap, str6)) != null) {
                                            arrayMap.put(strFindKeyForValue, ViewCompat.getTransitionName(view4));
                                        }
                                        if (i23 < 0) {
                                            break;
                                        } else {
                                            size9 = i23;
                                        }
                                    }
                                }
                            } else {
                                FragmentTransition.retainValues(arrayMap, arrayMap3);
                            }
                            Collection<String> collectionKeySet = arrayMap.keySet();
                            AbstractC9979u.m20293f(collectionKeySet, "sharedElementNameMapping.keys");
                            retainMatchingViews(arrayMap2, collectionKeySet);
                            Collection<String> collectionValues = arrayMap.values();
                            AbstractC9979u.m20293f(collectionValues, "sharedElementNameMapping.values");
                            retainMatchingViews(arrayMap3, collectionValues);
                            if (arrayMap.isEmpty()) {
                                Log.i("FragmentManager", "Ignoring shared elements transition " + objWrapTransitionInSet + " between " + operation + " and " + operation2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                                arrayList9.clear();
                                arrayList10.clear();
                                i14 = i15;
                                fragmentTransitionImpl = fragmentTransitionImpl2;
                                arrayList4 = arrayList9;
                                arrayList5 = arrayList10;
                                size3 = i10;
                                arrayList8 = arrayList;
                                objWrapTransitionInSet = null;
                            } else {
                                i14 = i15;
                                fragmentTransitionImpl = fragmentTransitionImpl2;
                                arrayList4 = arrayList9;
                                arrayList5 = arrayList10;
                                size3 = i10;
                                arrayList8 = arrayList;
                            }
                        }
                    }
                    FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl;
                    ArrayList arrayList11 = arrayList4;
                    ArrayList arrayList12 = arrayList5;
                    if (objWrapTransitionInSet == null) {
                        if (arrayList3.isEmpty()) {
                            return;
                        }
                        int size10 = arrayList3.size();
                        int i24 = 0;
                        while (i24 < size10) {
                            Object obj5 = arrayList3.get(i24);
                            i24++;
                            if (((TransitionInfo) obj5).getTransition() == null) {
                            }
                        }
                        return;
                    }
                    TransitionEffect transitionEffect = new TransitionEffect(arrayList3, operation, operation2, fragmentTransitionImpl3, objWrapTransitionInSet, arrayList11, arrayList12, arrayMap, sharedElementTargetNames, arrayList8, arrayMap2, arrayMap3, z10);
                    int size11 = arrayList3.size();
                    int i25 = 0;
                    while (i25 < size11) {
                        Object obj6 = arrayList3.get(i25);
                        i25++;
                        ((TransitionInfo) obj6).getOperation().addEffect(transitionEffect);
                    }
                }

                private final void findNamedViews(Map<String, View> map, View view) {
                    String transitionName = ViewCompat.getTransitionName(view);
                    if (transitionName != null) {
                        map.put(transitionName, view);
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        for (int i10 = 0; i10 < childCount; i10++) {
                            View child = viewGroup.getChildAt(i10);
                            if (child.getVisibility() == 0) {
                                AbstractC9979u.m20293f(child, "child");
                                findNamedViews(map, child);
                            }
                        }
                    }
                }

                private final void retainMatchingViews(ArrayMap<String, View> arrayMap, final Collection<String> collection) {
                    Set<Map.Entry<String, View>> entries = arrayMap.entrySet();
                    AbstractC9979u.m20293f(entries, "entries");
                    AbstractC10937b0.m23872Q(entries, new InterfaceC9540l() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.retainMatchingViews.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public final Boolean invoke(Map.Entry<String, View> entry) {
                            AbstractC9979u.m20294g(entry, "entry");
                            return Boolean.valueOf(AbstractC10947g0.m23932e0(collection, ViewCompat.getTransitionName(entry.getValue())));
                        }
                    });
                }

                private final void syncAnimations(List<? extends SpecialEffectsController.Operation> list) {
                    Fragment fragment = ((SpecialEffectsController.Operation) AbstractC10947g0.m23956y0(list)).getFragment();
                    for (SpecialEffectsController.Operation operation : list) {
                        operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
                        operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
                        operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
                        operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
                @Override // androidx.fragment.app.SpecialEffectsController
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void collectEffects(java.util.List<? extends androidx.fragment.app.SpecialEffectsController.Operation> r10, boolean r11) throws android.content.res.Resources.NotFoundException {
                    /*
                        r9 = this;
                        java.lang.String r0 = "operations"
                        kotlin.jvm.internal.AbstractC9979u.m20294g(r10, r0)
                        r0 = 2
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                        r1 = r10
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        java.util.Iterator r1 = r1.iterator()
                    L11:
                        boolean r2 = r1.hasNext()
                        r3 = 0
                        java.lang.String r4 = "operation.fragment.mView"
                        if (r2 == 0) goto L3c
                        java.lang.Object r2 = r1.next()
                        r5 = r2
                        androidx.fragment.app.SpecialEffectsController$Operation r5 = (androidx.fragment.app.SpecialEffectsController.Operation) r5
                        androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
                        androidx.fragment.app.Fragment r7 = r5.getFragment()
                        android.view.View r7 = r7.mView
                        kotlin.jvm.internal.AbstractC9979u.m20293f(r7, r4)
                        androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r6.asOperationState(r7)
                        androidx.fragment.app.SpecialEffectsController$Operation$State r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                        if (r6 != r7) goto L11
                        androidx.fragment.app.SpecialEffectsController$Operation$State r5 = r5.getFinalState()
                        if (r5 == r7) goto L11
                        goto L3d
                    L3c:
                        r2 = r3
                    L3d:
                        androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2
                        int r1 = r10.size()
                        java.util.ListIterator r1 = r10.listIterator(r1)
                    L47:
                        boolean r5 = r1.hasPrevious()
                        if (r5 == 0) goto L6e
                        java.lang.Object r5 = r1.previous()
                        r6 = r5
                        androidx.fragment.app.SpecialEffectsController$Operation r6 = (androidx.fragment.app.SpecialEffectsController.Operation) r6
                        androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
                        androidx.fragment.app.Fragment r8 = r6.getFragment()
                        android.view.View r8 = r8.mView
                        kotlin.jvm.internal.AbstractC9979u.m20293f(r8, r4)
                        androidx.fragment.app.SpecialEffectsController$Operation$State r7 = r7.asOperationState(r8)
                        androidx.fragment.app.SpecialEffectsController$Operation$State r8 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                        if (r7 == r8) goto L47
                        androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r6.getFinalState()
                        if (r6 != r8) goto L47
                        r3 = r5
                    L6e:
                        androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3
                        boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                        if (r0 == 0) goto L7c
                        java.util.Objects.toString(r2)
                        java.util.Objects.toString(r3)
                    L7c:
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        r9.syncAnimations(r10)
                        java.util.Iterator r10 = r10.iterator()
                    L8d:
                        boolean r4 = r10.hasNext()
                        if (r4 == 0) goto Lbd
                        java.lang.Object r4 = r10.next()
                        androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4
                        androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo
                        r5.<init>(r4, r11)
                        r0.add(r5)
                        androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo
                        r6 = 0
                        r7 = 1
                        if (r11 == 0) goto Lab
                        if (r4 != r2) goto Lae
                    La9:
                        r6 = r7
                        goto Lae
                    Lab:
                        if (r4 != r3) goto Lae
                        goto La9
                    Lae:
                        r5.<init>(r4, r11, r6)
                        r1.add(r5)
                        androidx.fragment.app.a r5 = new androidx.fragment.app.a
                        r5.<init>()
                        r4.addCompletionListener(r5)
                        goto L8d
                    Lbd:
                        r9.createTransitionEffect(r1, r11, r2, r3)
                        r9.collectAnimEffects(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.collectEffects(java.util.List, boolean):void");
                }

                public static final class TransitionInfo extends SpecialEffectsInfo {
                    private final boolean isOverlapAllowed;
                    private final Object sharedElementTransition;
                    private final Object transition;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public TransitionInfo(SpecialEffectsController.Operation operation, boolean z10, boolean z11) {
                        Object returnTransition;
                        super(operation);
                        AbstractC9979u.m20294g(operation, "operation");
                        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                        SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
                        if (finalState == state) {
                            Fragment fragment = operation.getFragment();
                            returnTransition = z10 ? fragment.getReenterTransition() : fragment.getEnterTransition();
                        } else {
                            Fragment fragment2 = operation.getFragment();
                            returnTransition = z10 ? fragment2.getReturnTransition() : fragment2.getExitTransition();
                        }
                        this.transition = returnTransition;
                        this.isOverlapAllowed = operation.getFinalState() == state ? z10 ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap() : true;
                        this.sharedElementTransition = z11 ? z10 ? operation.getFragment().getSharedElementReturnTransition() : operation.getFragment().getSharedElementEnterTransition() : null;
                    }

                    public final FragmentTransitionImpl getHandlingImpl() {
                        FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
                        FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
                        if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                            return handlingImpl == null ? handlingImpl2 : handlingImpl;
                        }
                        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
                    }

                    public final Object getSharedElementTransition() {
                        return this.sharedElementTransition;
                    }

                    public final Object getTransition() {
                        return this.transition;
                    }

                    public final boolean hasSharedElementTransition() {
                        return this.sharedElementTransition != null;
                    }

                    public final boolean isOverlapAllowed() {
                        return this.isOverlapAllowed;
                    }

                    private final FragmentTransitionImpl getHandlingImpl(Object obj) {
                        if (obj == null) {
                            return null;
                        }
                        FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
                        if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                            return fragmentTransitionImpl;
                        }
                        FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
                        if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(obj)) {
                            return fragmentTransitionImpl2;
                        }
                        throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
                    }
                }
            }
