package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.util.Preconditions;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10 */
    public static /* synthetic */ class C238010 {

        /* renamed from: $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State */
        static final /* synthetic */ int[] f397xe493b431;

        static {
            int[] iArr = new int[SpecialEffectsController.Operation.State.values().length];
            f397xe493b431 = iArr;
            try {
                iArr[SpecialEffectsController.Operation.State.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f397xe493b431[SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f397xe493b431[SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f397xe493b431[SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class AnimationInfo extends SpecialEffectsInfo {

        @Nullable
        private FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        public AnimationInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal, boolean z3) {
            super(operation, cancellationSignal);
            this.mLoadedAnim = false;
            this.mIsPop = z3;
        }

        @Nullable
        public FragmentAnim.AnimationOrAnimator getAnimation(@NonNull Context context) {
            if (this.mLoadedAnim) {
                return this.mAnimation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.mIsPop);
            this.mAnimation = animationOrAnimatorLoadAnimation;
            this.mLoadedAnim = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    public static class SpecialEffectsInfo {

        @NonNull
        private final SpecialEffectsController.Operation mOperation;

        @NonNull
        private final CancellationSignal mSignal;

        public SpecialEffectsInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal) {
            this.mOperation = operation;
            this.mSignal = cancellationSignal;
        }

        public void completeSpecialEffect() {
            this.mOperation.completeSpecialEffect(this.mSignal);
        }

        @NonNull
        public SpecialEffectsController.Operation getOperation() {
            return this.mOperation;
        }

        @NonNull
        public CancellationSignal getSignal() {
            return this.mSignal;
        }

        public boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(this.mOperation.getFragment().mView);
            SpecialEffectsController.Operation.State finalState = this.mOperation.getFinalState();
            return stateFrom == finalState || !(stateFrom == (state = SpecialEffectsController.Operation.State.VISIBLE) || finalState == state);
        }
    }

    public DefaultSpecialEffectsController(@NonNull ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void startAnimations(@NonNull List<AnimationInfo> list, @NonNull List<SpecialEffectsController.Operation> list2, boolean z3, @NonNull Map<SpecialEffectsController.Operation, Boolean> map) {
        int i4;
        boolean z4;
        int i5;
        final SpecialEffectsController.Operation operation;
        final ViewGroup container = getContainer();
        Context context = container.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<AnimationInfo> it = list.iterator();
        boolean z5 = false;
        while (true) {
            i4 = 2;
            if (!it.hasNext()) {
                break;
            }
            final AnimationInfo next = it.next();
            if (next.isVisibilityUnchanged()) {
                next.completeSpecialEffect();
            } else {
                FragmentAnim.AnimationOrAnimator animation = next.getAnimation(context);
                if (animation == null) {
                    next.completeSpecialEffect();
                } else {
                    final Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        final SpecialEffectsController.Operation operation2 = next.getOperation();
                        Fragment fragment = operation2.getFragment();
                        if (Boolean.TRUE.equals(map.get(operation2))) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Ignoring Animator set on ");
                                sb.append(fragment);
                                sb.append(" as this Fragment was involved in a Transition.");
                            }
                            next.completeSpecialEffect();
                        } else {
                            boolean z6 = operation2.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                            if (z6) {
                                list2.remove(operation2);
                            }
                            final View view = fragment.mView;
                            container.startViewTransition(view);
                            final boolean z7 = z6;
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.2
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator2) {
                                    container.endViewTransition(view);
                                    if (z7) {
                                        operation2.getFinalState().applyState(view);
                                    }
                                    next.completeSpecialEffect();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Animator from operation ");
                                        sb2.append(operation2);
                                        sb2.append(" has ended.");
                                    }
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Animator from operation ");
                                operation = operation2;
                                sb2.append(operation);
                                sb2.append(" has started.");
                            } else {
                                operation = operation2;
                            }
                            next.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.3
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public void onCancel() {
                                    animator.end();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Animator from operation ");
                                        sb3.append(operation);
                                        sb3.append(" has been canceled.");
                                    }
                                }
                            });
                            z5 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            final AnimationInfo animationInfo = (AnimationInfo) it2.next();
            final SpecialEffectsController.Operation operation3 = animationInfo.getOperation();
            Fragment fragment2 = operation3.getFragment();
            if (z3) {
                if (FragmentManager.isLoggingEnabled(i4)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Ignoring Animation set on ");
                    sb3.append(fragment2);
                    sb3.append(" as Animations cannot run alongside Transitions.");
                }
                animationInfo.completeSpecialEffect();
            } else if (z5) {
                if (FragmentManager.isLoggingEnabled(i4)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Ignoring Animation set on ");
                    sb4.append(fragment2);
                    sb4.append(" as Animations cannot run alongside Animators.");
                }
                animationInfo.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                Animation animation2 = (Animation) Preconditions.checkNotNull(((FragmentAnim.AnimationOrAnimator) Preconditions.checkNotNull(animationInfo.getAnimation(context))).animation);
                if (operation3.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation2);
                    animationInfo.completeSpecialEffect();
                    z4 = z5;
                    i5 = i4;
                } else {
                    container.startViewTransition(view2);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, container, view2);
                    z4 = z5;
                    endViewTransitionAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation3) {
                            container.post(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnimationAnimationListenerC23834 animationAnimationListenerC23834 = AnimationAnimationListenerC23834.this;
                                    container.endViewTransition(view2);
                                    animationInfo.completeSpecialEffect();
                                }
                            });
                            if (FragmentManager.isLoggingEnabled(2)) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Animation from operation ");
                                sb5.append(operation3);
                                sb5.append(" has ended.");
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation3) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation3) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Animation from operation ");
                                sb5.append(operation3);
                                sb5.append(" has reached onAnimationStart.");
                            }
                        }
                    });
                    view2.startAnimation(endViewTransitionAnimation);
                    i5 = 2;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Animation from operation ");
                        sb5.append(operation3);
                        sb5.append(" has started.");
                    }
                }
                animationInfo.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.5
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public void onCancel() {
                        view2.clearAnimation();
                        container.endViewTransition(view2);
                        animationInfo.completeSpecialEffect();
                        if (FragmentManager.isLoggingEnabled(2)) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Animation from operation ");
                            sb6.append(operation3);
                            sb6.append(" has been cancelled.");
                        }
                    }
                });
                i4 = i5;
                z5 = z4;
            }
        }
    }

    @NonNull
    private Map<SpecialEffectsController.Operation, Boolean> startTransitions(@NonNull List<TransitionInfo> list, @NonNull List<SpecialEffectsController.Operation> list2, final boolean z3, @Nullable final SpecialEffectsController.Operation operation, @Nullable final SpecialEffectsController.Operation operation2) {
        Iterator<TransitionInfo> it;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        SpecialEffectsController.Operation operation3;
        SpecialEffectsController.Operation operation4;
        View view2;
        Object objMergeTransitionsTogether;
        ArrayMap arrayMap;
        ArrayList<View> arrayList3;
        DefaultSpecialEffectsController defaultSpecialEffectsController;
        SpecialEffectsController.Operation operation5;
        ArrayList<View> arrayList4;
        Rect rect;
        FragmentTransitionImpl fragmentTransitionImpl;
        SpecialEffectsController.Operation operation6;
        View view3;
        SharedElementCallback enterTransitionCallback;
        SharedElementCallback exitTransitionCallback;
        ArrayList<String> arrayList5;
        final View view4;
        String strFindKeyForValue;
        ArrayList<String> arrayList6;
        DefaultSpecialEffectsController defaultSpecialEffectsController2 = this;
        boolean z4 = z3;
        SpecialEffectsController.Operation operation7 = operation;
        SpecialEffectsController.Operation operation8 = operation2;
        HashMap map = new HashMap();
        final FragmentTransitionImpl fragmentTransitionImpl2 = null;
        for (TransitionInfo transitionInfo : list) {
            if (!transitionInfo.isVisibilityUnchanged()) {
                FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
                if (fragmentTransitionImpl2 == null) {
                    fragmentTransitionImpl2 = handlingImpl;
                } else if (handlingImpl != null && fragmentTransitionImpl2 != handlingImpl) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (fragmentTransitionImpl2 == null) {
            for (TransitionInfo transitionInfo2 : list) {
                map.put(transitionInfo2.getOperation(), Boolean.FALSE);
                transitionInfo2.completeSpecialEffect();
            }
            return map;
        }
        View view5 = new View(getContainer().getContext());
        final Rect rect2 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList<View> arrayList8 = new ArrayList<>();
        ArrayMap arrayMap2 = new ArrayMap();
        Object obj3 = null;
        View view6 = null;
        boolean z5 = false;
        for (TransitionInfo transitionInfo3 : list) {
            if (!transitionInfo3.hasSharedElementTransition() || operation7 == null || operation8 == null) {
                arrayMap = arrayMap2;
                arrayList3 = arrayList8;
                defaultSpecialEffectsController = defaultSpecialEffectsController2;
                operation5 = operation7;
                arrayList4 = arrayList7;
                rect = rect2;
                fragmentTransitionImpl = fragmentTransitionImpl2;
                operation6 = operation8;
                view3 = view5;
                view6 = view6;
            } else {
                Object objWrapTransitionInSet = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(transitionInfo3.getSharedElementTransition()));
                ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                View view7 = view6;
                int i4 = 0;
                while (i4 < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i4));
                    ArrayList<String> arrayList9 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i4));
                    }
                    i4++;
                    sharedElementTargetNames = arrayList9;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                if (z4) {
                    enterTransitionCallback = operation.getFragment().getEnterTransitionCallback();
                    exitTransitionCallback = operation2.getFragment().getExitTransitionCallback();
                } else {
                    enterTransitionCallback = operation.getFragment().getExitTransitionCallback();
                    exitTransitionCallback = operation2.getFragment().getEnterTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                HashMap map2 = map;
                int i5 = 0;
                while (i5 < size) {
                    arrayMap2.put(sharedElementSourceNames.get(i5), sharedElementTargetNames2.get(i5));
                    i5++;
                    size = size;
                    view5 = view5;
                }
                View view8 = view5;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Iterator<String> it2 = sharedElementTargetNames2.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        Iterator<String> it3 = it2;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Name: ");
                        sb.append(next);
                        it2 = it3;
                    }
                    Iterator<String> it4 = sharedElementSourceNames.iterator();
                    while (it4.hasNext()) {
                        String next2 = it4.next();
                        Iterator<String> it5 = it4;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Name: ");
                        sb2.append(next2);
                        it4 = it5;
                    }
                }
                ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
                defaultSpecialEffectsController2.findNamedViews(arrayMap3, operation.getFragment().mView);
                arrayMap3.retainAll(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Executing exit callback for operation ");
                        sb3.append(operation7);
                    }
                    enterTransitionCallback.onMapSharedElements(sharedElementSourceNames, arrayMap3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View view9 = arrayMap3.get(str);
                        if (view9 == null) {
                            arrayMap2.remove(str);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str.equals(ViewCompat.getTransitionName(view9))) {
                                arrayMap2.put(ViewCompat.getTransitionName(view9), (String) arrayMap2.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    arrayMap2.retainAll(arrayMap3.keySet());
                }
                final ArrayMap<String, View> arrayMap4 = new ArrayMap<>();
                defaultSpecialEffectsController2.findNamedViews(arrayMap4, operation2.getFragment().mView);
                arrayMap4.retainAll(sharedElementTargetNames2);
                arrayMap4.retainAll(arrayMap2.values());
                if (exitTransitionCallback != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Executing enter callback for operation ");
                        sb4.append(operation8);
                    }
                    exitTransitionCallback.onMapSharedElements(sharedElementTargetNames2, arrayMap4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view10 = arrayMap4.get(str2);
                        if (view10 == null) {
                            String strFindKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap2, str2);
                            if (strFindKeyForValue2 != null) {
                                arrayMap2.remove(strFindKeyForValue2);
                            }
                        } else if (!str2.equals(ViewCompat.getTransitionName(view10)) && (strFindKeyForValue = FragmentTransition.findKeyForValue(arrayMap2, str2)) != null) {
                            arrayMap2.put(strFindKeyForValue, ViewCompat.getTransitionName(view10));
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap2, arrayMap4);
                }
                defaultSpecialEffectsController2.retainMatchingViews(arrayMap3, arrayMap2.keySet());
                defaultSpecialEffectsController2.retainMatchingViews(arrayMap4, arrayMap2.values());
                if (arrayMap2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    arrayMap = arrayMap2;
                    arrayList3 = arrayList8;
                    defaultSpecialEffectsController = defaultSpecialEffectsController2;
                    operation5 = operation7;
                    arrayList4 = arrayList7;
                    rect = rect2;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    view6 = view7;
                    map = map2;
                    obj3 = null;
                    operation6 = operation8;
                    view3 = view8;
                } else {
                    FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z4, arrayMap3, true);
                    ArrayList<String> arrayList10 = arrayList5;
                    arrayMap = arrayMap2;
                    ArrayList<View> arrayList11 = arrayList8;
                    OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.6
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z3, arrayMap4, false);
                        }
                    });
                    arrayList7.addAll(arrayMap3.values());
                    if (arrayList10.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view11 = arrayMap3.get(arrayList10.get(0));
                        fragmentTransitionImpl2.setEpicenter(objWrapTransitionInSet, view11);
                        view6 = view11;
                    }
                    arrayList3 = arrayList11;
                    arrayList3.addAll(arrayMap4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view4 = arrayMap4.get(sharedElementTargetNames2.get(0))) == null) {
                        defaultSpecialEffectsController = this;
                    } else {
                        defaultSpecialEffectsController = this;
                        OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.7
                            @Override // java.lang.Runnable
                            public void run() {
                                fragmentTransitionImpl2.getBoundsOnScreen(view4, rect2);
                            }
                        });
                        z5 = true;
                    }
                    fragmentTransitionImpl2.setSharedElementTargets(objWrapTransitionInSet, view8, arrayList7);
                    arrayList4 = arrayList7;
                    rect = rect2;
                    view3 = view8;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    fragmentTransitionImpl2.scheduleRemoveTargets(objWrapTransitionInSet, null, null, null, null, objWrapTransitionInSet, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    operation5 = operation;
                    map = map2;
                    map.put(operation5, bool);
                    operation6 = operation2;
                    map.put(operation6, bool);
                    obj3 = objWrapTransitionInSet;
                }
            }
            z4 = z3;
            arrayList7 = arrayList4;
            defaultSpecialEffectsController2 = defaultSpecialEffectsController;
            rect2 = rect;
            view5 = view3;
            operation8 = operation6;
            arrayMap2 = arrayMap;
            arrayList8 = arrayList3;
            operation7 = operation5;
            fragmentTransitionImpl2 = fragmentTransitionImpl;
        }
        View view12 = view6;
        ArrayMap arrayMap5 = arrayMap2;
        ArrayList<View> arrayList12 = arrayList8;
        DefaultSpecialEffectsController defaultSpecialEffectsController3 = defaultSpecialEffectsController2;
        SpecialEffectsController.Operation operation9 = operation7;
        ArrayList<View> arrayList13 = arrayList7;
        Rect rect3 = rect2;
        FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
        SpecialEffectsController.Operation operation10 = operation8;
        View view13 = view5;
        ArrayList arrayList14 = new ArrayList();
        Iterator<TransitionInfo> it6 = list.iterator();
        Object obj4 = null;
        Object objMergeTransitionsTogether2 = null;
        while (it6.hasNext()) {
            TransitionInfo next3 = it6.next();
            if (next3.isVisibilityUnchanged()) {
                map.put(next3.getOperation(), Boolean.FALSE);
                next3.completeSpecialEffect();
            } else {
                Object objCloneTransition = fragmentTransitionImpl3.cloneTransition(next3.getTransition());
                SpecialEffectsController.Operation operation11 = next3.getOperation();
                boolean z6 = obj3 != null && (operation11 == operation9 || operation11 == operation10);
                if (objCloneTransition == null) {
                    if (!z6) {
                        map.put(operation11, Boolean.FALSE);
                        next3.completeSpecialEffect();
                    }
                    arrayList2 = arrayList12;
                    arrayList = arrayList13;
                    it = it6;
                    view = view13;
                    objMergeTransitionsTogether = obj4;
                    operation3 = operation10;
                    view2 = view12;
                } else {
                    it = it6;
                    final ArrayList<View> arrayList15 = new ArrayList<>();
                    Object obj5 = obj4;
                    defaultSpecialEffectsController3.captureTransitioningViews(arrayList15, operation11.getFragment().mView);
                    if (z6) {
                        if (operation11 == operation9) {
                            arrayList15.removeAll(arrayList13);
                        } else {
                            arrayList15.removeAll(arrayList12);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        fragmentTransitionImpl3.addTarget(objCloneTransition, view13);
                        arrayList2 = arrayList12;
                        arrayList = arrayList13;
                        view = view13;
                        operation4 = operation11;
                        obj2 = objMergeTransitionsTogether2;
                        operation3 = operation10;
                        obj = obj5;
                    } else {
                        fragmentTransitionImpl3.addTargets(objCloneTransition, arrayList15);
                        view = view13;
                        obj = obj5;
                        arrayList = arrayList13;
                        obj2 = objMergeTransitionsTogether2;
                        arrayList2 = arrayList12;
                        operation3 = operation10;
                        fragmentTransitionImpl3.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList15, null, null, null, null);
                        if (operation11.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation4 = operation11;
                            list2.remove(operation4);
                            ArrayList<View> arrayList16 = new ArrayList<>(arrayList15);
                            arrayList16.remove(operation4.getFragment().mView);
                            fragmentTransitionImpl3.scheduleHideFragmentView(objCloneTransition, operation4.getFragment().mView, arrayList16);
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.8
                                @Override // java.lang.Runnable
                                public void run() {
                                    FragmentTransition.setViewVisibility(arrayList15, 4);
                                }
                            });
                        } else {
                            operation4 = operation11;
                        }
                    }
                    if (operation4.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList14.addAll(arrayList15);
                        if (z5) {
                            fragmentTransitionImpl3.setEpicenter(objCloneTransition, rect3);
                        }
                        view2 = view12;
                    } else {
                        view2 = view12;
                        fragmentTransitionImpl3.setEpicenter(objCloneTransition, view2);
                    }
                    map.put(operation4, Boolean.TRUE);
                    if (next3.isOverlapAllowed()) {
                        objMergeTransitionsTogether2 = fragmentTransitionImpl3.mergeTransitionsTogether(obj2, objCloneTransition, null);
                        objMergeTransitionsTogether = obj;
                    } else {
                        objMergeTransitionsTogether = fragmentTransitionImpl3.mergeTransitionsTogether(obj, objCloneTransition, null);
                        objMergeTransitionsTogether2 = obj2;
                    }
                }
                operation10 = operation3;
                obj4 = objMergeTransitionsTogether;
                view12 = view2;
                view13 = view;
                arrayList13 = arrayList;
                arrayList12 = arrayList2;
                it6 = it;
            }
        }
        ArrayList<View> arrayList17 = arrayList12;
        ArrayList<View> arrayList18 = arrayList13;
        SpecialEffectsController.Operation operation12 = operation10;
        Object objMergeTransitionsInSequence = fragmentTransitionImpl3.mergeTransitionsInSequence(objMergeTransitionsTogether2, obj4, obj3);
        if (objMergeTransitionsInSequence == null) {
            return map;
        }
        for (final TransitionInfo transitionInfo4 : list) {
            if (!transitionInfo4.isVisibilityUnchanged()) {
                Object transition = transitionInfo4.getTransition();
                final SpecialEffectsController.Operation operation13 = transitionInfo4.getOperation();
                boolean z7 = obj3 != null && (operation13 == operation9 || operation13 == operation12);
                if (transition != null || z7) {
                    if (ViewCompat.isLaidOut(getContainer())) {
                        fragmentTransitionImpl3.setListenerForTransitionEnd(transitionInfo4.getOperation().getFragment(), objMergeTransitionsInSequence, transitionInfo4.getSignal(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.9
                            @Override // java.lang.Runnable
                            public void run() {
                                transitionInfo4.completeSpecialEffect();
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Transition for operation ");
                                    sb5.append(operation13);
                                    sb5.append("has completed");
                                }
                            }
                        });
                    } else {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("SpecialEffectsController: Container ");
                            sb5.append(getContainer());
                            sb5.append(" has not been laid out. Completing operation ");
                            sb5.append(operation13);
                        }
                        transitionInfo4.completeSpecialEffect();
                    }
                }
            }
        }
        if (!ViewCompat.isLaidOut(getContainer())) {
            return map;
        }
        FragmentTransition.setViewVisibility(arrayList14, 4);
        ArrayList<String> arrayListPrepareSetNameOverridesReordered = fragmentTransitionImpl3.prepareSetNameOverridesReordered(arrayList17);
        if (FragmentManager.isLoggingEnabled(2)) {
            Iterator<View> it7 = arrayList18.iterator();
            while (it7.hasNext()) {
                View next4 = it7.next();
                StringBuilder sb6 = new StringBuilder();
                sb6.append("View: ");
                sb6.append(next4);
                sb6.append(" Name: ");
                sb6.append(ViewCompat.getTransitionName(next4));
            }
            Iterator<View> it8 = arrayList17.iterator();
            while (it8.hasNext()) {
                View next5 = it8.next();
                StringBuilder sb7 = new StringBuilder();
                sb7.append("View: ");
                sb7.append(next5);
                sb7.append(" Name: ");
                sb7.append(ViewCompat.getTransitionName(next5));
            }
        }
        fragmentTransitionImpl3.beginDelayedTransition(getContainer(), objMergeTransitionsInSequence);
        fragmentTransitionImpl3.setNameOverridesReordered(getContainer(), arrayList18, arrayList17, arrayListPrepareSetNameOverridesReordered, arrayMap5);
        FragmentTransition.setViewVisibility(arrayList14, 0);
        fragmentTransitionImpl3.swapSharedElementTargets(obj3, arrayList18, arrayList17);
        return map;
    }

    public void applyContainerChanges(@NonNull SpecialEffectsController.Operation operation) {
        operation.getFinalState().applyState(operation.getFragment().mView);
    }

    public void captureTransitioningViews(ArrayList<View> arrayList, View view) {
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
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                captureTransitioningViews(arrayList, childAt);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeOperations(@androidx.annotation.NonNull java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.executeOperations(java.util.List, boolean):void");
    }

    public void findNamedViews(Map<String, View> map, @NonNull View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(map, childAt);
                }
            }
        }
    }

    public void retainMatchingViews(@NonNull ArrayMap<String, View> arrayMap, @NonNull Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.getTransitionName(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    public static class TransitionInfo extends SpecialEffectsInfo {
        private final boolean mOverlapAllowed;

        @Nullable
        private final Object mSharedElementTransition;

        @Nullable
        private final Object mTransition;

        public TransitionInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal, boolean z3, boolean z4) {
            super(operation, cancellationSignal);
            if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                this.mTransition = z3 ? operation.getFragment().getReenterTransition() : operation.getFragment().getEnterTransition();
                this.mOverlapAllowed = z3 ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap();
            } else {
                this.mTransition = z3 ? operation.getFragment().getReturnTransition() : operation.getFragment().getExitTransition();
                this.mOverlapAllowed = true;
            }
            if (!z4) {
                this.mSharedElementTransition = null;
            } else if (z3) {
                this.mSharedElementTransition = operation.getFragment().getSharedElementReturnTransition();
            } else {
                this.mSharedElementTransition = operation.getFragment().getSharedElementEnterTransition();
            }
        }

        @Nullable
        public FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.mTransition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.mSharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl != null ? handlingImpl : handlingImpl2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.mTransition + " which uses a different Transition  type than its shared element transition " + this.mSharedElementTransition);
        }

        @Nullable
        public Object getSharedElementTransition() {
            return this.mSharedElementTransition;
        }

        @Nullable
        public Object getTransition() {
            return this.mTransition;
        }

        public boolean hasSharedElementTransition() {
            return this.mSharedElementTransition != null;
        }

        public boolean isOverlapAllowed() {
            return this.mOverlapAllowed;
        }

        @Nullable
        private FragmentTransitionImpl getHandlingImpl(Object obj) {
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
