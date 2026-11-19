package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.annotation.CallSuper;
import androidx.fragment.C3799R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;

/* loaded from: classes2.dex */
public abstract class SpecialEffectsController {
    public static final Companion Companion = new Companion(null);
    private final ViewGroup container;
    private boolean isContainerPostponed;
    private boolean operationDirectionIsPop;
    private final List<Operation> pendingOperations;
    private boolean runningNonSeekableTransition;
    private final List<Operation> runningOperations;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final SpecialEffectsController getOrCreateController(ViewGroup container, FragmentManager fragmentManager) {
            AbstractC9979u.m20294g(container, "container");
            AbstractC9979u.m20294g(fragmentManager, "fragmentManager");
            SpecialEffectsControllerFactory specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
            AbstractC9979u.m20293f(specialEffectsControllerFactory, "fragmentManager.specialEffectsControllerFactory");
            return getOrCreateController(container, specialEffectsControllerFactory);
        }

        private Companion() {
        }

        public final SpecialEffectsController getOrCreateController(ViewGroup container, SpecialEffectsControllerFactory factory) {
            AbstractC9979u.m20294g(container, "container");
            AbstractC9979u.m20294g(factory, "factory");
            Object tag = container.getTag(C3799R.id.special_effects_controller_view_tag);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController specialEffectsControllerCreateController = factory.createController(container);
            AbstractC9979u.m20293f(specialEffectsControllerCreateController, "factory.createController(container)");
            container.setTag(C3799R.id.special_effects_controller_view_tag, specialEffectsControllerCreateController);
            return specialEffectsControllerCreateController;
        }
    }

    public static class Effect {
        private boolean isCancelled;
        private final boolean isSeekingSupported;
        private boolean isStarted;

        public final void cancel(ViewGroup container) {
            AbstractC9979u.m20294g(container, "container");
            if (!this.isCancelled) {
                onCancel(container);
            }
            this.isCancelled = true;
        }

        public boolean isSeekingSupported() {
            return this.isSeekingSupported;
        }

        public void onCancel(ViewGroup container) {
            AbstractC9979u.m20294g(container, "container");
        }

        public void onCommit(ViewGroup container) {
            AbstractC9979u.m20294g(container, "container");
        }

        public void onProgress(BackEventCompat backEvent, ViewGroup container) {
            AbstractC9979u.m20294g(backEvent, "backEvent");
            AbstractC9979u.m20294g(container, "container");
        }

        public void onStart(ViewGroup container) {
            AbstractC9979u.m20294g(container, "container");
        }

        public final void performStart(ViewGroup container) {
            AbstractC9979u.m20294g(container, "container");
            if (!this.isStarted) {
                onStart(container);
            }
            this.isStarted = true;
        }
    }

    public static final class FragmentStateManagerOperation extends Operation {
        private final FragmentStateManager fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        public FragmentStateManagerOperation(Operation.State finalState, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
            AbstractC9979u.m20294g(finalState, "finalState");
            AbstractC9979u.m20294g(lifecycleImpact, "lifecycleImpact");
            AbstractC9979u.m20294g(fragmentStateManager, "fragmentStateManager");
            Fragment fragment = fragmentStateManager.getFragment();
            AbstractC9979u.m20293f(fragment, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragment);
            this.fragmentStateManager = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete$fragment_release() {
            super.complete$fragment_release();
            getFragment().mTransitioning = false;
            this.fragmentStateManager.moveToExpectedState();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void onStart() {
            if (isStarted()) {
                return;
            }
            super.onStart();
            if (getLifecycleImpact() != Operation.LifecycleImpact.ADDING) {
                if (getLifecycleImpact() == Operation.LifecycleImpact.REMOVING) {
                    Fragment fragment = this.fragmentStateManager.getFragment();
                    AbstractC9979u.m20293f(fragment, "fragmentStateManager.fragment");
                    View viewRequireView = fragment.requireView();
                    AbstractC9979u.m20293f(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(viewRequireView.findFocus());
                        viewRequireView.toString();
                        fragment.toString();
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = this.fragmentStateManager.getFragment();
            AbstractC9979u.m20293f(fragment2, "fragmentStateManager.fragment");
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (FragmentManager.isLoggingEnabled(2)) {
                    viewFindFocus.toString();
                    fragment2.toString();
                }
            }
            View viewRequireView2 = getFragment().requireView();
            AbstractC9979u.m20293f(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    fragment2.toString();
                    viewRequireView2.toString();
                }
                this.fragmentStateManager.addViewToContainer();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    viewRequireView2.toString();
                }
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
            if (FragmentManager.isLoggingEnabled(2)) {
                fragment2.getPostOnViewCreatedAlpha();
            }
        }
    }

    public static class Operation {
        private final List<Effect> _effects;
        private final List<Runnable> completionListeners;
        private final List<Effect> effects;
        private State finalState;
        private final Fragment fragment;
        private boolean isAwaitingContainerChanges;
        private boolean isCanceled;
        private boolean isComplete;
        private boolean isSeeking;
        private boolean isStarted;
        private LifecycleImpact lifecycleImpact;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final Companion Companion = new Companion(null);

            public static final class Companion {
                public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                    this();
                }

                public final State asOperationState(View view) {
                    AbstractC9979u.m20294g(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? State.INVISIBLE : from(view.getVisibility());
                }

                public final State from(int i10) {
                    if (i10 == 0) {
                        return State.VISIBLE;
                    }
                    if (i10 == 4) {
                        return State.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return State.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                private Companion() {
                }
            }

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public static final State from(int i10) {
                return Companion.from(i10);
            }

            public final void applyState(View view, ViewGroup container) {
                AbstractC9979u.m20294g(view, "view");
                AbstractC9979u.m20294g(container, "container");
                FragmentManager.isLoggingEnabled(2);
                int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(view);
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            view.toString();
                            Objects.toString(container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }
        }

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Operation(State finalState, LifecycleImpact lifecycleImpact, Fragment fragment) {
            AbstractC9979u.m20294g(finalState, "finalState");
            AbstractC9979u.m20294g(lifecycleImpact, "lifecycleImpact");
            AbstractC9979u.m20294g(fragment, "fragment");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.isAwaitingContainerChanges = true;
            ArrayList arrayList = new ArrayList();
            this._effects = arrayList;
            this.effects = arrayList;
        }

        public final void addCompletionListener(Runnable listener) {
            AbstractC9979u.m20294g(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void addEffect(Effect effect) {
            AbstractC9979u.m20294g(effect, "effect");
            this._effects.add(effect);
        }

        public final void cancel(ViewGroup container) {
            AbstractC9979u.m20294g(container, "container");
            this.isStarted = false;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this._effects.isEmpty()) {
                complete$fragment_release();
                return;
            }
            Iterator it = AbstractC10947g0.m23922X0(this.effects).iterator();
            while (it.hasNext()) {
                ((Effect) it.next()).cancel(container);
            }
        }

        @CallSuper
        public void complete$fragment_release() {
            this.isStarted = false;
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                toString();
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void completeEffect(Effect effect) {
            AbstractC9979u.m20294g(effect, "effect");
            if (this._effects.remove(effect) && this._effects.isEmpty()) {
                complete$fragment_release();
            }
        }

        public final List<Effect> getEffects$fragment_release() {
            return this.effects;
        }

        public final State getFinalState() {
            return this.finalState;
        }

        public final Fragment getFragment() {
            return this.fragment;
        }

        public final LifecycleImpact getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        public final boolean isAwaitingContainerChanges() {
            return this.isAwaitingContainerChanges;
        }

        public final boolean isCanceled() {
            return this.isCanceled;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        public final boolean isSeeking() {
            return this.isSeeking;
        }

        public final boolean isStarted() {
            return this.isStarted;
        }

        public final void mergeWith(State finalState, LifecycleImpact lifecycleImpact) {
            AbstractC9979u.m20294g(finalState, "finalState");
            AbstractC9979u.m20294g(lifecycleImpact, "lifecycleImpact");
            int i10 = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.finalState == State.REMOVED) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(this.fragment);
                        Objects.toString(this.lifecycleImpact);
                    }
                    this.finalState = State.VISIBLE;
                    this.lifecycleImpact = LifecycleImpact.ADDING;
                    this.isAwaitingContainerChanges = true;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Objects.toString(this.fragment);
                    Objects.toString(this.finalState);
                    Objects.toString(this.lifecycleImpact);
                }
                this.finalState = State.REMOVED;
                this.lifecycleImpact = LifecycleImpact.REMOVING;
                this.isAwaitingContainerChanges = true;
                return;
            }
            if (i10 == 3 && this.finalState != State.REMOVED) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Objects.toString(this.fragment);
                    Objects.toString(this.finalState);
                    Objects.toString(finalState);
                }
                this.finalState = finalState;
            }
        }

        @CallSuper
        public void onStart() {
            this.isStarted = true;
        }

        public final void setAwaitingContainerChanges(boolean z10) {
            this.isAwaitingContainerChanges = z10;
        }

        public final void setFinalState(State state) {
            AbstractC9979u.m20294g(state, "<set-?>");
            this.finalState = state;
        }

        public final void setLifecycleImpact(LifecycleImpact lifecycleImpact) {
            AbstractC9979u.m20294g(lifecycleImpact, "<set-?>");
            this.lifecycleImpact = lifecycleImpact;
        }

        public final void setSeeking$fragment_release(boolean z10) {
            this.isSeeking = z10;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + '}';
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SpecialEffectsController(ViewGroup container) {
        AbstractC9979u.m20294g(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    private final void enqueue(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.pendingOperations) {
            try {
                Fragment fragment = fragmentStateManager.getFragment();
                AbstractC9979u.m20293f(fragment, "fragmentStateManager.fragment");
                Operation operationFindPendingOperation = findPendingOperation(fragment);
                if (operationFindPendingOperation == null) {
                    if (fragmentStateManager.getFragment().mTransitioning || fragmentStateManager.getFragment().mRemoving) {
                        Fragment fragment2 = fragmentStateManager.getFragment();
                        AbstractC9979u.m20293f(fragment2, "fragmentStateManager.fragment");
                        operationFindPendingOperation = findRunningOperation(fragment2);
                    } else {
                        operationFindPendingOperation = null;
                    }
                }
                if (operationFindPendingOperation != null) {
                    operationFindPendingOperation.mergeWith(state, lifecycleImpact);
                    return;
                }
                final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager);
                this.pendingOperations.add(fragmentStateManagerOperation);
                fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecialEffectsController.enqueue$lambda$4$lambda$2(this.f1508c, fragmentStateManagerOperation);
                    }
                });
                fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecialEffectsController.enqueue$lambda$4$lambda$3(this.f1510c, fragmentStateManagerOperation);
                    }
                });
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$2(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            Operation.State finalState = operation.getFinalState();
            View view = operation.getFragment().mView;
            AbstractC9979u.m20293f(view, "operation.fragment.mView");
            finalState.applyState(view, this$0.container);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$3(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    private final Operation findPendingOperation(Fragment fragment) {
        Object next;
        Iterator<T> it = this.pendingOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Operation operation = (Operation) next;
            if (AbstractC9979u.m20289b(operation.getFragment(), fragment) && !operation.isCanceled()) {
                break;
            }
        }
        return (Operation) next;
    }

    private final Operation findRunningOperation(Fragment fragment) {
        Object next;
        Iterator<T> it = this.runningOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Operation operation = (Operation) next;
            if (AbstractC9979u.m20289b(operation.getFragment(), fragment) && !operation.isCanceled()) {
                break;
            }
        }
        return (Operation) next;
    }

    public static final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return Companion.getOrCreateController(viewGroup, fragmentManager);
    }

    private final boolean isOperationSeekable(List<Operation> list) {
        boolean z10;
        List<Operation> list2 = list;
        loop0: while (true) {
            z10 = true;
            for (Operation operation : list2) {
                if (!operation.getEffects$fragment_release().isEmpty()) {
                    List<Effect> effects$fragment_release = operation.getEffects$fragment_release();
                    if (!(effects$fragment_release instanceof Collection) || !effects$fragment_release.isEmpty()) {
                        Iterator<T> it = effects$fragment_release.iterator();
                        while (it.hasNext()) {
                            if (!((Effect) it.next()).isSeekingSupported()) {
                                break;
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                AbstractC10937b0.m23857B(arrayList, ((Operation) it2.next()).getEffects$fragment_release());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean isOperationTransitioning(List<Operation> list) {
        Iterator<T> it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!((Operation) it.next()).getFragment().mTransitioning) {
                z10 = false;
            }
        }
        return z10;
    }

    private final void processStart(List<Operation> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).onStart();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC10937b0.m23857B(arrayList, ((Operation) it.next()).getEffects$fragment_release());
        }
        List listM23922X0 = AbstractC10947g0.m23922X0(AbstractC10947g0.m23929c1(arrayList));
        int size2 = listM23922X0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((Effect) listM23922X0.get(i11)).performStart(this.container);
        }
    }

    private final void updateFinalState() {
        for (Operation operation : this.pendingOperations) {
            if (operation.getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                View viewRequireView = operation.getFragment().requireView();
                AbstractC9979u.m20293f(viewRequireView, "fragment.requireView()");
                operation.mergeWith(Operation.State.Companion.from(viewRequireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public final void applyContainerChangesToOperation$fragment_release(Operation operation) {
        AbstractC9979u.m20294g(operation, "operation");
        if (operation.isAwaitingContainerChanges()) {
            Operation.State finalState = operation.getFinalState();
            View viewRequireView = operation.getFragment().requireView();
            AbstractC9979u.m20293f(viewRequireView, "operation.fragment.requireView()");
            finalState.applyState(viewRequireView, this.container);
            operation.setAwaitingContainerChanges(false);
        }
    }

    public abstract void collectEffects(List<Operation> list, boolean z10);

    public void commitEffects$fragment_release(List<Operation> operations) {
        AbstractC9979u.m20294g(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            AbstractC10937b0.m23857B(arrayList, ((Operation) it.next()).getEffects$fragment_release());
        }
        List listM23922X0 = AbstractC10947g0.m23922X0(AbstractC10947g0.m23929c1(arrayList));
        int size = listM23922X0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Effect) listM23922X0.get(i10)).onCommit(this.container);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            applyContainerChangesToOperation$fragment_release(operations.get(i11));
        }
        List listM23922X02 = AbstractC10947g0.m23922X0(operations);
        int size3 = listM23922X02.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Operation operation = (Operation) listM23922X02.get(i12);
            if (operation.getEffects$fragment_release().isEmpty()) {
                operation.complete$fragment_release();
            }
        }
    }

    public final void completeBack() {
        FragmentManager.isLoggingEnabled(3);
        processStart(this.runningOperations);
        commitEffects$fragment_release(this.runningOperations);
    }

    public final void enqueueAdd(Operation.State finalState, FragmentStateManager fragmentStateManager) {
        AbstractC9979u.m20294g(finalState, "finalState");
        AbstractC9979u.m20294g(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(fragmentStateManager.getFragment());
        }
        enqueue(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void enqueueHide(FragmentStateManager fragmentStateManager) {
        AbstractC9979u.m20294g(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueRemove(FragmentStateManager fragmentStateManager) {
        AbstractC9979u.m20294g(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public final void enqueueShow(FragmentStateManager fragmentStateManager) {
        AbstractC9979u.m20294g(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void executePendingOperations() {
        boolean z10;
        if (this.isContainerPostponed) {
            return;
        }
        if (!this.container.isAttachedToWindow()) {
            forceCompleteAllOperations();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                List<Operation> listM23925a1 = AbstractC10947g0.m23925a1(this.runningOperations);
                this.runningOperations.clear();
                Iterator it = listM23925a1.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Operation operation = (Operation) it.next();
                    if (this.pendingOperations.isEmpty() || !operation.getFragment().mTransitioning) {
                        z10 = false;
                    }
                    operation.setSeeking$fragment_release(z10);
                }
                for (Operation operation2 : listM23925a1) {
                    if (this.runningNonSeekableTransition) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Objects.toString(operation2);
                        }
                        operation2.complete$fragment_release();
                    } else {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Objects.toString(operation2);
                        }
                        operation2.cancel(this.container);
                    }
                    this.runningNonSeekableTransition = false;
                    if (!operation2.isComplete()) {
                        this.runningOperations.add(operation2);
                    }
                }
                if (!this.pendingOperations.isEmpty()) {
                    updateFinalState();
                    List<Operation> listM23925a12 = AbstractC10947g0.m23925a1(this.pendingOperations);
                    if (listM23925a12.isEmpty()) {
                        return;
                    }
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(listM23925a12);
                    FragmentManager.isLoggingEnabled(2);
                    collectEffects(listM23925a12, this.operationDirectionIsPop);
                    boolean zIsOperationSeekable = isOperationSeekable(listM23925a12);
                    boolean zIsOperationTransitioning = isOperationTransitioning(listM23925a12);
                    if (!zIsOperationTransitioning || zIsOperationSeekable) {
                        z10 = false;
                    }
                    this.runningNonSeekableTransition = z10;
                    FragmentManager.isLoggingEnabled(2);
                    if (!zIsOperationTransitioning) {
                        processStart(listM23925a12);
                        commitEffects$fragment_release(listM23925a12);
                    } else if (zIsOperationSeekable) {
                        processStart(listM23925a12);
                        int size = listM23925a12.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            applyContainerChangesToOperation$fragment_release(listM23925a12.get(i10));
                        }
                    }
                    this.operationDirectionIsPop = false;
                    FragmentManager.isLoggingEnabled(2);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void forceCompleteAllOperations() {
        FragmentManager.isLoggingEnabled(2);
        boolean zIsAttachedToWindow = this.container.isAttachedToWindow();
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                processStart(this.pendingOperations);
                List<Operation> listM23925a1 = AbstractC10947g0.m23925a1(this.runningOperations);
                Iterator it = listM23925a1.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).setSeeking$fragment_release(false);
                }
                for (Operation operation : listM23925a1) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.container);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(operation);
                    }
                    operation.cancel(this.container);
                }
                List<Operation> listM23925a12 = AbstractC10947g0.m23925a1(this.pendingOperations);
                Iterator it2 = listM23925a12.iterator();
                while (it2.hasNext()) {
                    ((Operation) it2.next()).setSeeking$fragment_release(false);
                }
                for (Operation operation2 : listM23925a12) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Container ");
                            sb3.append(this.container);
                            sb3.append(" is not attached to window. ");
                        }
                        Objects.toString(operation2);
                    }
                    operation2.cancel(this.container);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void forcePostponedExecutePendingOperations() {
        if (this.isContainerPostponed) {
            FragmentManager.isLoggingEnabled(2);
            this.isContainerPostponed = false;
            executePendingOperations();
        }
    }

    public final Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(FragmentStateManager fragmentStateManager) {
        AbstractC9979u.m20294g(fragmentStateManager, "fragmentStateManager");
        Fragment fragment = fragmentStateManager.getFragment();
        AbstractC9979u.m20293f(fragment, "fragmentStateManager.fragment");
        Operation operationFindPendingOperation = findPendingOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact = operationFindPendingOperation != null ? operationFindPendingOperation.getLifecycleImpact() : null;
        Operation operationFindRunningOperation = findRunningOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact2 = operationFindRunningOperation != null ? operationFindRunningOperation.getLifecycleImpact() : null;
        int i10 = lifecycleImpact == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        return (i10 == -1 || i10 == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    public final ViewGroup getContainer() {
        return this.container;
    }

    public final boolean isPendingExecute() {
        return !this.pendingOperations.isEmpty();
    }

    public final void markPostponedState() {
        Operation operationPrevious;
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                List<Operation> list = this.pendingOperations;
                ListIterator<Operation> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        operationPrevious = null;
                        break;
                    }
                    operationPrevious = listIterator.previous();
                    Operation operation = operationPrevious;
                    Operation.State.Companion companion = Operation.State.Companion;
                    View view = operation.getFragment().mView;
                    AbstractC9979u.m20293f(view, "operation.fragment.mView");
                    Operation.State stateAsOperationState = companion.asOperationState(view);
                    Operation.State finalState = operation.getFinalState();
                    Operation.State state = Operation.State.VISIBLE;
                    if (finalState == state && stateAsOperationState != state) {
                        break;
                    }
                }
                Operation operation2 = operationPrevious;
                Fragment fragment = operation2 != null ? operation2.getFragment() : null;
                this.isContainerPostponed = fragment != null ? fragment.isPostponed() : false;
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void processProgress(BackEventCompat backEvent) {
        AbstractC9979u.m20294g(backEvent, "backEvent");
        if (FragmentManager.isLoggingEnabled(2)) {
            backEvent.getProgress();
        }
        List<Operation> list = this.runningOperations;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC10937b0.m23857B(arrayList, ((Operation) it.next()).getEffects$fragment_release());
        }
        List listM23922X0 = AbstractC10947g0.m23922X0(AbstractC10947g0.m23929c1(arrayList));
        int size = listM23922X0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Effect) listM23922X0.get(i10)).onProgress(backEvent, this.container);
        }
    }

    public final void updateOperationDirection(boolean z10) {
        this.operationDirectionIsPop = z10;
    }

    public static final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        return Companion.getOrCreateController(viewGroup, specialEffectsControllerFactory);
    }
}
