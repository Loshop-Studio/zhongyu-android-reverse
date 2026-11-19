package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogNavigator;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class DialogHostKt$DialogHost$1$2 implements InterfaceC9544p {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ DialogNavigator.Destination $destination;
    final /* synthetic */ DialogNavigator $dialogNavigator;
    final /* synthetic */ SnapshotStateList<NavBackStackEntry> $dialogsToDispose;
    final /* synthetic */ SaveableStateHolder $saveableStateHolder;

    public DialogHostKt$DialogHost$1$2(NavBackStackEntry navBackStackEntry, DialogNavigator dialogNavigator, SaveableStateHolder saveableStateHolder, SnapshotStateList<NavBackStackEntry> snapshotStateList, DialogNavigator.Destination destination) {
        this.$backStackEntry = navBackStackEntry;
        this.$dialogNavigator = dialogNavigator;
        this.$saveableStateHolder = saveableStateHolder;
        this.$dialogsToDispose = snapshotStateList;
        this.$destination = destination;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult invoke$lambda$2$lambda$1(final SnapshotStateList snapshotStateList, final NavBackStackEntry navBackStackEntry, final DialogNavigator dialogNavigator, DisposableEffectScope disposableEffectScope) {
        snapshotStateList.add(navBackStackEntry);
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$invoke$lambda$2$lambda$1$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                dialogNavigator.onTransitionComplete$navigation_compose_release(navBackStackEntry);
                snapshotStateList.remove(navBackStackEntry);
            }
        };
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C10786q.f26013a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i10) {
        if ((i10 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1129586364, i10, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
        }
        NavBackStackEntry navBackStackEntry = this.$backStackEntry;
        boolean zChangedInstance = composer.changedInstance(navBackStackEntry) | composer.changedInstance(this.$dialogNavigator);
        final SnapshotStateList<NavBackStackEntry> snapshotStateList = this.$dialogsToDispose;
        final NavBackStackEntry navBackStackEntry2 = this.$backStackEntry;
        final DialogNavigator dialogNavigator = this.$dialogNavigator;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9540l() { // from class: androidx.navigation.compose.f
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return DialogHostKt$DialogHost$1$2.invoke$lambda$2$lambda$1(snapshotStateList, navBackStackEntry2, dialogNavigator, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        EffectsKt.DisposableEffect(navBackStackEntry, (InterfaceC9540l) objRememberedValue, composer, 0);
        final NavBackStackEntry navBackStackEntry3 = this.$backStackEntry;
        SaveableStateHolder saveableStateHolder = this.$saveableStateHolder;
        final DialogNavigator.Destination destination = this.$destination;
        NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry3, saveableStateHolder, ComposableLambdaKt.rememberComposableLambda(-497631156, true, new InterfaceC9544p() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2.2
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C10786q.f26013a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer2, int i11) {
                if ((i11 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-497631156, i11, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                }
                destination.getContent$navigation_compose_release().invoke(navBackStackEntry3, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
