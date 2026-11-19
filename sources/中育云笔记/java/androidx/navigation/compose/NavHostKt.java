package androidx.navigation.compose;

import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class NavHostKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r19, final java.lang.String r20, androidx.compose.p014ui.Modifier r21, java.lang.String r22, final p181hd.InterfaceC9540l r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q NavHost$lambda$1(NavHostController navHostController, String str, Modifier modifier, String str2, InterfaceC9540l interfaceC9540l, int i10, int i11, Composer composer, int i12) {
        NavHost(navHostController, str, modifier, str2, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition NavHost$lambda$11$lambda$10(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q NavHost$lambda$13(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6, int i10, int i11, int i12, Composer composer, int i13) {
        NavHost(navHostController, str, modifier, alignment, str2, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9540l4, interfaceC9540l5, interfaceC9540l6, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11), i12);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition NavHost$lambda$15$lambda$14(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition NavHost$lambda$17$lambda$16(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q NavHost$lambda$19(NavHostController navHostController, InterfaceC10469c interfaceC10469c, Modifier modifier, Alignment alignment, InterfaceC10469c interfaceC10469c2, Map map, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6, int i10, int i11, int i12, Composer composer, int i13) {
        NavHost(navHostController, interfaceC10469c, modifier, alignment, interfaceC10469c2, (Map<InterfaceC10481o, NavType<?>>) map, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9540l4, interfaceC9540l5, interfaceC9540l6, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11), i12);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition NavHost$lambda$21$lambda$20(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition NavHost$lambda$23$lambda$22(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q NavHost$lambda$25(NavHostController navHostController, Object obj, Modifier modifier, Alignment alignment, InterfaceC10469c interfaceC10469c, Map map, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6, int i10, int i11, int i12, Composer composer, int i13) {
        NavHost(navHostController, obj, modifier, alignment, interfaceC10469c, (Map<InterfaceC10481o, NavType<?>>) map, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9540l4, interfaceC9540l5, interfaceC9540l6, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11), i12);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q NavHost$lambda$26(NavHostController navHostController, NavGraph navGraph, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        NavHost(navHostController, navGraph, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition NavHost$lambda$28$lambda$27(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition NavHost$lambda$3$lambda$2(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition NavHost$lambda$30$lambda$29(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q NavHost$lambda$31(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, int i10, int i11, Composer composer, int i12) {
        NavHost(navHostController, navGraph, modifier, alignment, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9540l4, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition NavHost$lambda$33$lambda$32(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition NavHost$lambda$35$lambda$34(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q NavHost$lambda$37(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, int i10, int i11, Composer composer, int i12) {
        NavHost(navHostController, navGraph, modifier, alignment, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9540l4, interfaceC9540l5, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$38(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NavHost$lambda$43(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavHost$lambda$44(MutableState<Boolean> mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult NavHost$lambda$48$lambda$47(NavHostController navHostController, LifecycleOwner lifecycleOwner, DisposableEffectScope disposableEffectScope) {
        navHostController.setLifecycleOwner(lifecycleOwner);
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$48$lambda$47$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    private static final List<NavBackStackEntry> NavHost$lambda$49(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition NavHost$lambda$5$lambda$4(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List NavHost$lambda$52$lambda$51(State state) {
        List<NavBackStackEntry> listNavHost$lambda$49 = NavHost$lambda$49(state);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listNavHost$lambda$49) {
            if (AbstractC9979u.m20289b(((NavBackStackEntry) obj).getDestination().getNavigatorName(), ComposeNavigator.NAME)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$53(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition NavHost$lambda$58$lambda$57(ComposeNavigator composeNavigator, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, MutableState mutableState, AnimatedContentTransitionScope animatedContentTransitionScope) {
        NavDestination destination = ((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getDestination();
        AbstractC9979u.m20292e(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
        EnterTransition enterTransition = null;
        if (composeNavigator.isPop$navigation_compose_release().getValue().booleanValue() || NavHost$lambda$43(mutableState)) {
            Iterator it = NavDestination.Companion.getHierarchy(destination2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                EnterTransition enterTransitionCreatePopEnterTransition = createPopEnterTransition((NavDestination) it.next(), animatedContentTransitionScope);
                if (enterTransitionCreatePopEnterTransition != null) {
                    enterTransition = enterTransitionCreatePopEnterTransition;
                    break;
                }
            }
            return enterTransition == null ? (EnterTransition) interfaceC9540l.invoke(animatedContentTransitionScope) : enterTransition;
        }
        Iterator it2 = NavDestination.Companion.getHierarchy(destination2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            EnterTransition enterTransitionCreateEnterTransition = createEnterTransition((NavDestination) it2.next(), animatedContentTransitionScope);
            if (enterTransitionCreateEnterTransition != null) {
                enterTransition = enterTransitionCreateEnterTransition;
                break;
            }
        }
        return enterTransition == null ? (EnterTransition) interfaceC9540l2.invoke(animatedContentTransitionScope) : enterTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition NavHost$lambda$62$lambda$61(ComposeNavigator composeNavigator, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, MutableState mutableState, AnimatedContentTransitionScope animatedContentTransitionScope) {
        NavDestination destination = ((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getDestination();
        AbstractC9979u.m20292e(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
        ExitTransition exitTransition = null;
        if (composeNavigator.isPop$navigation_compose_release().getValue().booleanValue() || NavHost$lambda$43(mutableState)) {
            Iterator it = NavDestination.Companion.getHierarchy(destination2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ExitTransition exitTransitionCreatePopExitTransition = createPopExitTransition((NavDestination) it.next(), animatedContentTransitionScope);
                if (exitTransitionCreatePopExitTransition != null) {
                    exitTransition = exitTransitionCreatePopExitTransition;
                    break;
                }
            }
            return exitTransition == null ? (ExitTransition) interfaceC9540l.invoke(animatedContentTransitionScope) : exitTransition;
        }
        Iterator it2 = NavDestination.Companion.getHierarchy(destination2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ExitTransition exitTransitionCreateExitTransition = createExitTransition((NavDestination) it2.next(), animatedContentTransitionScope);
            if (exitTransitionCreateExitTransition != null) {
                exitTransition = exitTransitionCreateExitTransition;
                break;
            }
        }
        return exitTransition == null ? (ExitTransition) interfaceC9540l2.invoke(animatedContentTransitionScope) : exitTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SizeTransform NavHost$lambda$65$lambda$64(InterfaceC9540l interfaceC9540l, AnimatedContentTransitionScope animatedContentTransitionScope) {
        SizeTransform sizeTransformCreateSizeTransform;
        NavDestination destination = ((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getDestination();
        AbstractC9979u.m20292e(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        Iterator it = NavDestination.Companion.getHierarchy((ComposeNavigator.Destination) destination).iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeTransformCreateSizeTransform = null;
                break;
            }
            sizeTransformCreateSizeTransform = createSizeTransform((NavDestination) it.next(), animatedContentTransitionScope);
            if (sizeTransformCreateSizeTransform != null) {
                break;
            }
        }
        if (sizeTransformCreateSizeTransform != null) {
            return sizeTransformCreateSizeTransform;
        }
        if (interfaceC9540l != null) {
            return (SizeTransform) interfaceC9540l.invoke(animatedContentTransitionScope);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult NavHost$lambda$69$lambda$68(final State state, final ComposeNavigator composeNavigator, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$69$lambda$68$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Iterator it = NavHostKt.NavHost$lambda$53(state).iterator();
                while (it.hasNext()) {
                    composeNavigator.onTransitionComplete((NavBackStackEntry) it.next());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q NavHost$lambda$7(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, int i10, int i11, Composer composer, int i12) {
        NavHost(navHostController, str, modifier, alignment, str2, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9540l4, interfaceC9540l5, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform NavHost$lambda$75$lambda$74(MutableObjectFloatMap mutableObjectFloatMap, ComposeNavigator composeNavigator, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, State state, MutableState mutableState, AnimatedContentTransitionScope animatedContentTransitionScope) {
        float f10;
        if (!NavHost$lambda$53(state).contains(animatedContentTransitionScope.getInitialState())) {
            return AnimatedContentKt.togetherWith(EnterTransition.Companion.getNone(), ExitTransition.Companion.getNone());
        }
        String id2 = ((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getId();
        int iFindKeyIndex = mutableObjectFloatMap.findKeyIndex(id2);
        if (iFindKeyIndex >= 0) {
            f10 = mutableObjectFloatMap.values[iFindKeyIndex];
        } else {
            mutableObjectFloatMap.set(id2, 0.0f);
            f10 = 0.0f;
        }
        if (!AbstractC9979u.m20289b(((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getId(), ((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getId())) {
            f10 = (composeNavigator.isPop$navigation_compose_release().getValue().booleanValue() || NavHost$lambda$43(mutableState)) ? f10 - 1.0f : f10 + 1.0f;
        }
        mutableObjectFloatMap.set(((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getId(), f10);
        return new ContentTransform((EnterTransition) interfaceC9540l.invoke(animatedContentTransitionScope), (ExitTransition) interfaceC9540l2.invoke(animatedContentTransitionScope), f10, (SizeTransform) interfaceC9540l3.invoke(animatedContentTransitionScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q NavHost$lambda$79(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, int i10, int i11, Composer composer, int i12) {
        NavHost(navHostController, navGraph, modifier, alignment, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9540l4, interfaceC9540l5, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q NavHost$lambda$80(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, int i10, int i11, Composer composer, int i12) {
        NavHost(navHostController, navGraph, modifier, alignment, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9540l4, interfaceC9540l5, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition NavHost$lambda$9$lambda$8(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }

    private static final EnterTransition createEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        InterfaceC9540l enterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            InterfaceC9540l enterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition$navigation_compose_release();
            if (enterTransition$navigation_compose_release2 != null) {
                return (EnterTransition) enterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return (EnterTransition) enterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    private static final ExitTransition createExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        InterfaceC9540l exitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            InterfaceC9540l exitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getExitTransition$navigation_compose_release();
            if (exitTransition$navigation_compose_release2 != null) {
                return (ExitTransition) exitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return (ExitTransition) exitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    private static final EnterTransition createPopEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        InterfaceC9540l popEnterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            InterfaceC9540l popEnterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition$navigation_compose_release();
            if (popEnterTransition$navigation_compose_release2 != null) {
                return (EnterTransition) popEnterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return (EnterTransition) popEnterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    private static final ExitTransition createPopExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        InterfaceC9540l popExitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            InterfaceC9540l popExitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition$navigation_compose_release();
            if (popExitTransition$navigation_compose_release2 != null) {
                return (ExitTransition) popExitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return (ExitTransition) popExitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    private static final SizeTransform createSizeTransform(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        InterfaceC9540l sizeTransform$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            InterfaceC9540l sizeTransform$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getSizeTransform$navigation_compose_release();
            if (sizeTransform$navigation_compose_release2 != null) {
                return (SizeTransform) sizeTransform$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (sizeTransform$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getSizeTransform$navigation_compose_release()) == null) {
            return null;
        }
        return (SizeTransform) sizeTransform$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r25, final java.lang.String r26, androidx.compose.p014ui.Modifier r27, androidx.compose.p014ui.Alignment r28, java.lang.String r29, p181hd.InterfaceC9540l r30, p181hd.InterfaceC9540l r31, p181hd.InterfaceC9540l r32, p181hd.InterfaceC9540l r33, final p181hd.InterfaceC9540l r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, hd.l, hd.l, hd.l, hd.l, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(final androidx.navigation.NavHostController r27, final java.lang.String r28, androidx.compose.p014ui.Modifier r29, androidx.compose.p014ui.Alignment r30, java.lang.String r31, p181hd.InterfaceC9540l r32, p181hd.InterfaceC9540l r33, p181hd.InterfaceC9540l r34, p181hd.InterfaceC9540l r35, p181hd.InterfaceC9540l r36, final p181hd.InterfaceC9540l r37, androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, hd.l, hd.l, hd.l, hd.l, hd.l, hd.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(final androidx.navigation.NavHostController r29, final p280od.InterfaceC10469c r30, androidx.compose.p014ui.Modifier r31, androidx.compose.p014ui.Alignment r32, p280od.InterfaceC10469c r33, java.util.Map<p280od.InterfaceC10481o, androidx.navigation.NavType<?>> r34, p181hd.InterfaceC9540l r35, p181hd.InterfaceC9540l r36, p181hd.InterfaceC9540l r37, p181hd.InterfaceC9540l r38, p181hd.InterfaceC9540l r39, final p181hd.InterfaceC9540l r40, androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, od.c, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, od.c, java.util.Map, hd.l, hd.l, hd.l, hd.l, hd.l, hd.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(final androidx.navigation.NavHostController r29, final java.lang.Object r30, androidx.compose.p014ui.Modifier r31, androidx.compose.p014ui.Alignment r32, p280od.InterfaceC10469c r33, java.util.Map<p280od.InterfaceC10481o, androidx.navigation.NavType<?>> r34, p181hd.InterfaceC9540l r35, p181hd.InterfaceC9540l r36, p181hd.InterfaceC9540l r37, p181hd.InterfaceC9540l r38, p181hd.InterfaceC9540l r39, final p181hd.InterfaceC9540l r40, androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, od.c, java.util.Map, hd.l, hd.l, hd.l, hd.l, hd.l, hd.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r17, final androidx.navigation.NavGraph r18, androidx.compose.p014ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            r4 = r21
            r0 = -957014592(0xffffffffc6f51dc0, float:-31374.875)
            r1 = r20
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L15
            r1 = r4 | 6
            r2 = r1
            r1 = r17
            goto L29
        L15:
            r1 = r4 & 6
            if (r1 != 0) goto L26
            r1 = r17
            boolean r2 = r14.changedInstance(r1)
            if (r2 == 0) goto L23
            r2 = 4
            goto L24
        L23:
            r2 = 2
        L24:
            r2 = r2 | r4
            goto L29
        L26:
            r1 = r17
            r2 = r4
        L29:
            r3 = r22 & 2
            if (r3 == 0) goto L32
            r2 = r2 | 48
            r6 = r18
            goto L44
        L32:
            r3 = r4 & 48
            r6 = r18
            if (r3 != 0) goto L44
            boolean r3 = r14.changedInstance(r6)
            if (r3 == 0) goto L41
            r3 = 32
            goto L43
        L41:
            r3 = 16
        L43:
            r2 = r2 | r3
        L44:
            r3 = r22 & 4
            if (r3 == 0) goto L4d
            r2 = r2 | 384(0x180, float:5.38E-43)
        L4a:
            r5 = r19
            goto L5f
        L4d:
            r5 = r4 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L4a
            r5 = r19
            boolean r7 = r14.changed(r5)
            if (r7 == 0) goto L5c
            r7 = 256(0x100, float:3.59E-43)
            goto L5e
        L5c:
            r7 = 128(0x80, float:1.8E-43)
        L5e:
            r2 = r2 | r7
        L5f:
            r7 = r2 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L71
            boolean r7 = r14.getSkipping()
            if (r7 != 0) goto L6c
            goto L71
        L6c:
            r14.skipToGroupEnd()
            r3 = r5
            goto L9c
        L71:
            if (r3 == 0) goto L77
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p014ui.Modifier.Companion
            r7 = r3
            goto L78
        L77:
            r7 = r5
        L78:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L84
            r3 = -1
            java.lang.String r5 = "androidx.navigation.compose.NavHost (NavHost.kt:393)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r3, r5)
        L84:
            r15 = r2 & 1022(0x3fe, float:1.432E-42)
            r16 = 504(0x1f8, float:7.06E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r5 = r1
            NavHost(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L9b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L9b:
            r3 = r7
        L9c:
            androidx.compose.runtime.ScopeUpdateScope r6 = r14.endRestartGroup()
            if (r6 == 0) goto Lb0
            androidx.navigation.compose.e0 r0 = new androidx.navigation.compose.e0
            r1 = r17
            r2 = r18
            r5 = r22
            r0.<init>()
            r6.updateScope(r0)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r23, final androidx.navigation.NavGraph r24, androidx.compose.p014ui.Modifier r25, androidx.compose.p014ui.Alignment r26, p181hd.InterfaceC9540l r27, p181hd.InterfaceC9540l r28, p181hd.InterfaceC9540l r29, p181hd.InterfaceC9540l r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, hd.l, hd.l, hd.l, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(final androidx.navigation.NavHostController r32, final androidx.navigation.NavGraph r33, androidx.compose.p014ui.Modifier r34, androidx.compose.p014ui.Alignment r35, p181hd.InterfaceC9540l r36, p181hd.InterfaceC9540l r37, p181hd.InterfaceC9540l r38, p181hd.InterfaceC9540l r39, p181hd.InterfaceC9540l r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, hd.l, hd.l, hd.l, hd.l, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
