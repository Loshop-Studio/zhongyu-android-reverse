package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import androidx.navigation.compose.DialogNavigator;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;
import p379vd.InterfaceC11612u;

@Navigator.Name(DialogNavigator.NAME)
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends Navigator<Destination> {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DialogFragmentNavigator";
    private final Context context;
    private final FragmentManager fragmentManager;
    private final DialogFragmentNavigator$observer$1 observer;
    private final Set<String> restoredTagsAwaitingAttach;
    private final Map<String, DialogFragment> transitioningFragments;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    @NavDestination.ClassType(DialogFragment.class)
    public static class Destination extends NavDestination implements FloatingWindow {
        private String _className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> fragmentNavigator) {
            super(fragmentNavigator);
            AbstractC9979u.m20294g(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof Destination) && super.equals(obj) && AbstractC9979u.m20289b(this._className, ((Destination) obj)._className);
        }

        public final String getClassName() {
            String str = this._className;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set");
            }
            AbstractC9979u.m20292e(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this._className;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(Context context, AttributeSet attrs) {
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(attrs, "attrs");
            super.onInflate(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C4125R.styleable.DialogFragmentNavigator);
            AbstractC9979u.m20293f(typedArrayObtainAttributes, "obtainAttributes(...)");
            String string = typedArrayObtainAttributes.getString(C4125R.styleable.DialogFragmentNavigator_android_name);
            if (string != null) {
                setClassName(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        public final Destination setClassName(String className) {
            AbstractC9979u.m20294g(className, "className");
            this._className = className;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(DialogFragmentNavigator.class));
            AbstractC9979u.m20294g(navigatorProvider, "navigatorProvider");
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.navigation.fragment.DialogFragmentNavigator$observer$1] */
    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$observer$1

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                int iNextIndex;
                AbstractC9979u.m20294g(source, "source");
                AbstractC9979u.m20294g(event, "event");
                int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i10 == 1) {
                    DialogFragment dialogFragment = (DialogFragment) source;
                    Iterable iterable = (Iterable) this.this$0.getState().getBackStack().getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (AbstractC9979u.m20289b(((NavBackStackEntry) it.next()).getId(), dialogFragment.getTag())) {
                                return;
                            }
                        }
                    }
                    dialogFragment.dismiss();
                    return;
                }
                Object obj = null;
                if (i10 == 2) {
                    DialogFragment dialogFragment2 = (DialogFragment) source;
                    for (Object obj2 : (Iterable) this.this$0.getState().getTransitionsInProgress().getValue()) {
                        if (AbstractC9979u.m20289b(((NavBackStackEntry) obj2).getId(), dialogFragment2.getTag())) {
                            obj = obj2;
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                    if (navBackStackEntry != null) {
                        this.this$0.getState().markTransitionComplete(navBackStackEntry);
                        return;
                    }
                    return;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                    DialogFragment dialogFragment3 = (DialogFragment) source;
                    for (Object obj3 : (Iterable) this.this$0.getState().getTransitionsInProgress().getValue()) {
                        if (AbstractC9979u.m20289b(((NavBackStackEntry) obj3).getId(), dialogFragment3.getTag())) {
                            obj = obj3;
                        }
                    }
                    NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
                    if (navBackStackEntry2 != null) {
                        this.this$0.getState().markTransitionComplete(navBackStackEntry2);
                    }
                    dialogFragment3.getLifecycle().removeObserver(this);
                    return;
                }
                DialogFragment dialogFragment4 = (DialogFragment) source;
                if (dialogFragment4.requireDialog().isShowing()) {
                    return;
                }
                List list = (List) this.this$0.getState().getBackStack().getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (AbstractC9979u.m20289b(((NavBackStackEntry) listIterator.previous()).getId(), dialogFragment4.getTag())) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) AbstractC10947g0.m23947p0(list, iNextIndex);
                if (!AbstractC9979u.m20289b(AbstractC10947g0.m23957z0(list), navBackStackEntry3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + dialogFragment4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (navBackStackEntry3 != null) {
                    this.this$0.popWithTransition(iNextIndex, navBackStackEntry3, false);
                }
            }
        };
        this.transitioningFragments = new LinkedHashMap();
    }

    private final DialogFragment createDialogFragment(NavBackStackEntry navBackStackEntry) {
        NavDestination destination = navBackStackEntry.getDestination();
        AbstractC9979u.m20292e(destination, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        Destination destination2 = (Destination) destination;
        String className = destination2.getClassName();
        if (className.charAt(0) == '.') {
            className = this.context.getPackageName() + className;
        }
        Fragment fragmentInstantiate = this.fragmentManager.getFragmentFactory().instantiate(this.context.getClassLoader(), className);
        AbstractC9979u.m20293f(fragmentInstantiate, "instantiate(...)");
        if (DialogFragment.class.isAssignableFrom(fragmentInstantiate.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) fragmentInstantiate;
            dialogFragment.setArguments(navBackStackEntry.getArguments());
            dialogFragment.getLifecycle().addObserver(this.observer);
            this.transitioningFragments.put(navBackStackEntry.getId(), dialogFragment);
            return dialogFragment;
        }
        throw new IllegalArgumentException(("Dialog destination " + destination2.getClassName() + " is not an instance of DialogFragment").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$1(DialogFragmentNavigator dialogFragmentNavigator, FragmentManager fragmentManager, Fragment childFragment) {
        AbstractC9979u.m20294g(fragmentManager, "<unused var>");
        AbstractC9979u.m20294g(childFragment, "childFragment");
        Set<String> set = dialogFragmentNavigator.restoredTagsAwaitingAttach;
        if (AbstractC9962d0.m20250a(set).remove(childFragment.getTag())) {
            childFragment.getLifecycle().addObserver(dialogFragmentNavigator.observer);
        }
        Map<String, DialogFragment> map = dialogFragmentNavigator.transitioningFragments;
        AbstractC9962d0.m20253d(map).remove(childFragment.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popWithTransition(int i10, NavBackStackEntry navBackStackEntry, boolean z10) {
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) AbstractC10947g0.m23947p0((List) getState().getBackStack().getValue(), i10 - 1);
        boolean zM23932e0 = AbstractC10947g0.m23932e0((Iterable) getState().getTransitionsInProgress().getValue(), navBackStackEntry2);
        getState().popWithTransition(navBackStackEntry, z10);
        if (navBackStackEntry2 == null || zM23932e0) {
            return;
        }
        getState().markTransitionComplete(navBackStackEntry2);
    }

    public final InterfaceC11612u getBackStack$navigation_fragment_release() {
        return getState().getBackStack();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC9979u.m20294g(entries, "entries");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            navigate(it.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public void onAttach(NavigatorState state) {
        Lifecycle lifecycle;
        AbstractC9979u.m20294g(state, "state");
        super.onAttach(state);
        for (NavBackStackEntry navBackStackEntry : (List) state.getBackStack().getValue()) {
            DialogFragment dialogFragment = (DialogFragment) this.fragmentManager.findFragmentByTag(navBackStackEntry.getId());
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.restoredTagsAwaitingAttach.add(navBackStackEntry.getId());
            } else {
                lifecycle.addObserver(this.observer);
            }
        }
        this.fragmentManager.addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.a
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                DialogFragmentNavigator.onAttach$lambda$1(this.f1802c, fragmentManager, fragment);
            }
        });
    }

    @Override // androidx.navigation.Navigator
    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        AbstractC9979u.m20294g(backStackEntry, "backStackEntry");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        DialogFragment dialogFragment = this.transitioningFragments.get(backStackEntry.getId());
        if (dialogFragment == null) {
            Fragment fragmentFindFragmentByTag = this.fragmentManager.findFragmentByTag(backStackEntry.getId());
            dialogFragment = fragmentFindFragmentByTag instanceof DialogFragment ? (DialogFragment) fragmentFindFragmentByTag : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().removeObserver(this.observer);
            dialogFragment.dismiss();
        }
        createDialogFragment(backStackEntry).show(this.fragmentManager, backStackEntry.getId());
        getState().onLaunchSingleTopWithTransition(backStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry popUpTo, boolean z10) {
        AbstractC9979u.m20294g(popUpTo, "popUpTo");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) getState().getBackStack().getValue();
        int iIndexOf = list.indexOf(popUpTo);
        Iterator it = AbstractC10947g0.m23908J0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentFindFragmentByTag = this.fragmentManager.findFragmentByTag(((NavBackStackEntry) it.next()).getId());
            if (fragmentFindFragmentByTag != null) {
                ((DialogFragment) fragmentFindFragmentByTag).dismiss();
            }
        }
        popWithTransition(iIndexOf, popUpTo, z10);
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this);
    }

    private final void navigate(NavBackStackEntry navBackStackEntry) {
        createDialogFragment(navBackStackEntry).show(this.fragmentManager, navBackStackEntry.getId());
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) AbstractC10947g0.m23957z0((List) getState().getBackStack().getValue());
        boolean zM23932e0 = AbstractC10947g0.m23932e0((Iterable) getState().getTransitionsInProgress().getValue(), navBackStackEntry2);
        getState().pushWithTransition(navBackStackEntry);
        if (navBackStackEntry2 == null || zM23932e0) {
            return;
        }
        getState().markTransitionComplete(navBackStackEntry2);
    }
}
