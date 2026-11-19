package androidx.navigation.compose;

import androidx.compose.p014ui.platform.InspectionModeKt;
import androidx.compose.p014ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.DialogNavigator;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class DialogHostKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DialogHost(final DialogNavigator dialogNavigator, Composer composer, final int i10) {
        final DialogNavigator dialogNavigator2;
        Composer composerStartRestartGroup = composer.startRestartGroup(294589392);
        int i11 = (i10 & 6) == 0 ? (composerStartRestartGroup.changedInstance(dialogNavigator) ? 4 : 2) | i10 : i10;
        if ((i11 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            dialogNavigator2 = dialogNavigator;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(294589392, i11, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            SaveableStateHolder saveableStateHolderRememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(composerStartRestartGroup, 0);
            State stateCollectAsState = SnapshotStateKt.collectAsState(dialogNavigator.getBackStack$navigation_compose_release(), null, composerStartRestartGroup, 0, 1);
            SnapshotStateList<NavBackStackEntry> snapshotStateListRememberVisibleList = rememberVisibleList(DialogHost$lambda$0(stateCollectAsState), composerStartRestartGroup, 0);
            PopulateVisibleList(snapshotStateListRememberVisibleList, DialogHost$lambda$0(stateCollectAsState), composerStartRestartGroup, 0);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(dialogNavigator.getTransitionInProgress$navigation_compose_release(), null, composerStartRestartGroup, 0, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(-367418626);
            for (final NavBackStackEntry navBackStackEntry : snapshotStateListRememberVisibleList) {
                NavDestination destination = navBackStackEntry.getDestination();
                AbstractC9979u.m20292e(destination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                DialogNavigator.Destination destination2 = (DialogNavigator.Destination) destination;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(dialogNavigator) | composerStartRestartGroup.changedInstance(navBackStackEntry);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new InterfaceC9529a() { // from class: androidx.navigation.compose.d
                        @Override // p181hd.InterfaceC9529a
                        public final Object invoke() {
                            return DialogHostKt.DialogHost$lambda$5$lambda$4$lambda$3(dialogNavigator, navBackStackEntry);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                DialogNavigator dialogNavigator3 = dialogNavigator;
                AndroidDialog_androidKt.Dialog((InterfaceC9529a) objRememberedValue2, destination2.getDialogProperties$navigation_compose_release(), ComposableLambdaKt.rememberComposableLambda(1129586364, true, new DialogHostKt$DialogHost$1$2(navBackStackEntry, dialogNavigator3, saveableStateHolderRememberSaveableStateHolder, snapshotStateList, destination2), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
                dialogNavigator = dialogNavigator3;
            }
            dialogNavigator2 = dialogNavigator;
            composerStartRestartGroup.endReplaceGroup();
            Set<NavBackStackEntry> setDialogHost$lambda$1 = DialogHost$lambda$1(stateCollectAsState2);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState2) | composerStartRestartGroup.changedInstance(dialogNavigator2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new DialogHostKt$DialogHost$2$1(stateCollectAsState2, dialogNavigator2, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(setDialogHost$lambda$1, snapshotStateList, (InterfaceC9544p) objRememberedValue3, composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.navigation.compose.e
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return DialogHostKt.DialogHost$lambda$7(dialogNavigator2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final List<NavBackStackEntry> DialogHost$lambda$0(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<NavBackStackEntry> DialogHost$lambda$1(State<? extends Set<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q DialogHost$lambda$5$lambda$4$lambda$3(DialogNavigator dialogNavigator, NavBackStackEntry navBackStackEntry) {
        dialogNavigator.dismiss$navigation_compose_release(navBackStackEntry);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q DialogHost$lambda$7(DialogNavigator dialogNavigator, int i10, Composer composer, int i11) {
        DialogHost(dialogNavigator, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }

    @Composable
    public static final void PopulateVisibleList(final List<NavBackStackEntry> list, final Collection<NavBackStackEntry> collection, Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1537894851);
        int i11 = (i10 & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(collection) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1537894851, i11, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            final boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            for (final NavBackStackEntry navBackStackEntry : collection) {
                Lifecycle lifecycle = navBackStackEntry.getLifecycle();
                boolean zChanged = composerStartRestartGroup.changed(zBooleanValue) | composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changedInstance(navBackStackEntry);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InterfaceC9540l() { // from class: androidx.navigation.compose.a
                        @Override // p181hd.InterfaceC9540l
                        public final Object invoke(Object obj) {
                            return DialogHostKt.PopulateVisibleList$lambda$12$lambda$11$lambda$10(navBackStackEntry, zBooleanValue, list, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                EffectsKt.DisposableEffect(lifecycle, (InterfaceC9540l) objRememberedValue, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.navigation.compose.b
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return DialogHostKt.PopulateVisibleList$lambda$13(list, collection, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult PopulateVisibleList$lambda$12$lambda$11$lambda$10(final NavBackStackEntry navBackStackEntry, final boolean z10, final List list, DisposableEffectScope disposableEffectScope) {
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.navigation.compose.c
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                DialogHostKt.PopulateVisibleList$lambda$12$lambda$11$lambda$10$lambda$8(z10, list, navBackStackEntry, lifecycleOwner, event);
            }
        };
        navBackStackEntry.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$lambda$12$lambda$11$lambda$10$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                navBackStackEntry.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PopulateVisibleList$lambda$12$lambda$11$lambda$10$lambda$8(boolean z10, List list, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (z10 && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_START && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_STOP) {
            list.remove(navBackStackEntry);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q PopulateVisibleList$lambda$13(List list, Collection collection, int i10, Composer composer, int i11) {
        PopulateVisibleList(list, collection, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.navigation.NavBackStackEntry> rememberVisibleList(java.util.Collection<androidx.navigation.NavBackStackEntry> r5, androidx.compose.runtime.Composer r6, int r7) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)"
            r2 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r7, r0, r1)
        Lf:
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p014ui.platform.InspectionModeKt.getLocalInspectionMode()
            java.lang.Object r7 = r6.consume(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            boolean r0 = r6.changed(r5)
            java.lang.Object r1 = r6.rememberedValue()
            if (r0 != 0) goto L2f
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L69
        L2f:
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L3e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r5.next()
            r3 = r2
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            if (r7 == 0) goto L4f
            r3 = 1
            goto L5d
        L4f:
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r3 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r3 = r3.isAtLeast(r4)
        L5d:
            if (r3 == 0) goto L3e
            r0.add(r2)
            goto L3e
        L63:
            r1.addAll(r0)
            r6.updateRememberedValue(r1)
        L69:
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = (androidx.compose.runtime.snapshots.SnapshotStateList) r1
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L74
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.DialogHostKt.rememberVisibleList(java.util.Collection, androidx.compose.runtime.Composer, int):androidx.compose.runtime.snapshots.SnapshotStateList");
    }
}
