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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5111k = 3, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,137:1\n1225#2,6:138\n64#3,5:144\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$1$2\n*L\n56#1:138,6\n58#1:144,5\n*E\n"})
/* loaded from: classes2.dex */
public final class DialogHostKt$DialogHost$1$2 implements InterfaceC6473e {
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

    @Override // p152r6.InterfaceC6473e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C5443s.f8405a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1129586364, i, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
        }
        NavBackStackEntry navBackStackEntry = this.$backStackEntry;
        boolean zChangedInstance = composer.changedInstance(navBackStackEntry) | composer.changedInstance(this.$dialogNavigator);
        final SnapshotStateList<NavBackStackEntry> snapshotStateList = this.$dialogsToDispose;
        final NavBackStackEntry navBackStackEntry2 = this.$backStackEntry;
        final DialogNavigator dialogNavigator = this.$dialogNavigator;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new InterfaceC6471c() { // from class: androidx.navigation.compose.e
                @Override // p152r6.InterfaceC6471c
                public final Object invoke(Object obj) {
                    return DialogHostKt$DialogHost$1$2.invoke$lambda$2$lambda$1(snapshotStateList, navBackStackEntry2, dialogNavigator, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        EffectsKt.DisposableEffect(navBackStackEntry, (InterfaceC6471c) objRememberedValue, composer, 0);
        final NavBackStackEntry navBackStackEntry3 = this.$backStackEntry;
        SaveableStateHolder saveableStateHolder = this.$saveableStateHolder;
        final DialogNavigator.Destination destination = this.$destination;
        NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry3, saveableStateHolder, ComposableLambdaKt.rememberComposableLambda(-497631156, true, new InterfaceC6473e() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2.2
            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C5443s.f8405a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer2, int i8) {
                if ((i8 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-497631156, i8, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                }
                destination.getContent().invoke(navBackStackEntry3, composer2, 0);
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
