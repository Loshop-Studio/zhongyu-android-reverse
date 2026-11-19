package androidx.navigation.compose;

import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import androidx.compose.p011ui.platform.InspectionModeKt;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.C2857e;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.DialogNavigator;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\nX\u008a\u0084\u0002"}, m5110d2 = {"Landroidx/navigation/compose/DialogNavigator;", "dialogNavigator", "Ld6/s;", "DialogHost", "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/runtime/Composer;I)V", "", "Landroidx/navigation/NavBackStackEntry;", "", "backStack", "PopulateVisibleList", "(Ljava/util/List;Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "rememberVisibleList", "(Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "dialogBackStack", "", "transitionInProgress", "navigation-compose_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,137:1\n1225#2,6:138\n1225#2,6:145\n1225#2,6:152\n1225#2,6:160\n1225#2,3:168\n1228#2,3:174\n1863#3:144\n1864#3:151\n1863#3:159\n1864#3:166\n774#3:171\n865#3,2:172\n77#4:158\n77#4:167\n81#5:177\n81#5:178\n64#6,5:179\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n*L\n48#1:138,6\n53#1:145,6\n74#1:152,6\n92#1:160,6\n123#1:168,3\n123#1:174,3\n50#1:144\n50#1:151\n91#1:159\n91#1:166\n126#1:171\n126#1:172,2\n90#1:158\n122#1:167\n43#1:177\n47#1:178\n112#1:179,5\n*E\n"})
/* loaded from: classes2.dex */
public final class DialogHostKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DialogHost(@NotNull DialogNavigator dialogNavigator, @Nullable Composer composer, int i) {
        DialogNavigator dialogNavigator2;
        Composer composerStartRestartGroup = composer.startRestartGroup(294589392);
        int i8 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(dialogNavigator) ? 4 : 2) | i : i;
        if ((i8 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            dialogNavigator2 = dialogNavigator;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(294589392, i8, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            SaveableStateHolder saveableStateHolderRememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(composerStartRestartGroup, 0);
            State stateCollectAsState = SnapshotStateKt.collectAsState(dialogNavigator.getBackStack$navigation_compose_release(), null, composerStartRestartGroup, 0, 1);
            SnapshotStateList<NavBackStackEntry> snapshotStateListRememberVisibleList = rememberVisibleList(DialogHost$lambda$0(stateCollectAsState), composerStartRestartGroup, 0);
            PopulateVisibleList(snapshotStateListRememberVisibleList, DialogHost$lambda$0(stateCollectAsState), composerStartRestartGroup, 0);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(dialogNavigator.getTransitionInProgress$navigation_compose_release(), null, composerStartRestartGroup, 0, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(-367418626);
            for (NavBackStackEntry navBackStackEntry : snapshotStateListRememberVisibleList) {
                NavDestination destination = navBackStackEntry.getDestination();
                AbstractC5830k.m5328e(destination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                DialogNavigator.Destination destination2 = (DialogNavigator.Destination) destination;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(dialogNavigator) | composerStartRestartGroup.changedInstance(navBackStackEntry);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new C2857e(1, dialogNavigator, navBackStackEntry);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                DialogNavigator dialogNavigator3 = dialogNavigator;
                AndroidDialog_androidKt.Dialog((InterfaceC6469a) objRememberedValue2, destination2.getDialogProperties(), ComposableLambdaKt.rememberComposableLambda(1129586364, true, new DialogHostKt$DialogHost$1$2(navBackStackEntry, dialogNavigator3, saveableStateHolderRememberSaveableStateHolder, snapshotStateList, destination2), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
                dialogNavigator = dialogNavigator3;
            }
            dialogNavigator2 = dialogNavigator;
            composerStartRestartGroup.endReplaceGroup();
            Set<NavBackStackEntry> setDialogHost$lambda$1 = DialogHost$lambda$1(stateCollectAsState2);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState2) | composerStartRestartGroup.changedInstance(dialogNavigator2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new DialogHostKt$DialogHost$2$1(stateCollectAsState2, dialogNavigator2, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(setDialogHost$lambda$1, snapshotStateList, (InterfaceC6473e) objRememberedValue3, composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2842d(dialogNavigator2, i, 0));
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
    public static final C5443s DialogHost$lambda$5$lambda$4$lambda$3(DialogNavigator dialogNavigator, NavBackStackEntry navBackStackEntry) {
        dialogNavigator.dismiss$navigation_compose_release(navBackStackEntry);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s DialogHost$lambda$7(DialogNavigator dialogNavigator, int i, Composer composer, int i8) {
        DialogHost(dialogNavigator, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return C5443s.f8405a;
    }

    @Composable
    public static final void PopulateVisibleList(@NotNull List<NavBackStackEntry> list, @NotNull Collection<NavBackStackEntry> collection, @Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1537894851);
        int i8 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(collection) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1537894851, i8, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            for (NavBackStackEntry navBackStackEntry : collection) {
                Lifecycle lifecycle = navBackStackEntry.getLifecycle();
                boolean zChanged = composerStartRestartGroup.changed(zBooleanValue) | composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changedInstance(navBackStackEntry);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C2839a(navBackStackEntry, list, zBooleanValue);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                EffectsKt.DisposableEffect(lifecycle, (InterfaceC6471c) objRememberedValue, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 0, list, collection));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult PopulateVisibleList$lambda$12$lambda$11$lambda$10(final NavBackStackEntry navBackStackEntry, final boolean z8, final List list, DisposableEffectScope disposableEffectScope) {
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.navigation.compose.c
            @Override // android.view.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                DialogHostKt.PopulateVisibleList$lambda$12$lambda$11$lambda$10$lambda$8(z8, list, navBackStackEntry, lifecycleOwner, event);
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
    public static final void PopulateVisibleList$lambda$12$lambda$11$lambda$10$lambda$8(boolean z8, List list, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (z8 && !list.contains(navBackStackEntry)) {
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
    public static final C5443s PopulateVisibleList$lambda$13(List list, Collection collection, int i, Composer composer, int i8) {
        PopulateVisibleList(list, collection, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return C5443s.f8405a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.navigation.NavBackStackEntry> rememberVisibleList(@org.jetbrains.annotations.NotNull java.util.Collection<androidx.navigation.NavBackStackEntry> r5, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r6, int r7) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)"
            r2 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r7, r0, r1)
        Lf:
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p011ui.platform.InspectionModeKt.getLocalInspectionMode()
            java.lang.Object r7 = r6.consume(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            boolean r0 = r6.changed(r5)
            java.lang.Object r1 = r6.rememberedValue()
            if (r0 != 0) goto L2f
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
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
            androidx.lifecycle.Lifecycle$State r3 = r3.getState()
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
