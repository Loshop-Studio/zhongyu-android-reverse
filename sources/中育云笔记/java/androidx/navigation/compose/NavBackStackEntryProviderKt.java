package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.internal.WeakReference;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p280od.InterfaceC10469c;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class NavBackStackEntryProviderKt {
    @Composable
    public static final void LocalOwnersProvider(final NavBackStackEntry navBackStackEntry, final SaveableStateHolder saveableStateHolder, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(233973821);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(navBackStackEntry) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(saveableStateHolder) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(233973821, i11, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:49)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalViewModelStoreOwner.INSTANCE.provides(navBackStackEntry), LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(navBackStackEntry), LocalSavedStateRegistryOwnerKt.getLocalSavedStateRegistryOwner().provides(navBackStackEntry)}, ComposableLambdaKt.rememberComposableLambda(1808964477, true, new InterfaceC9544p() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt.LocalOwnersProvider.1
                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                @Composable
                public final void invoke(Composer composer2, int i12) {
                    if ((i12 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1808964477, i12, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:55)");
                    }
                    NavBackStackEntryProviderKt.SaveableStateProvider(saveableStateHolder, interfaceC9544p, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.navigation.compose.i
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return NavBackStackEntryProviderKt.LocalOwnersProvider$lambda$0(navBackStackEntry, saveableStateHolder, interfaceC9544p, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LocalOwnersProvider$lambda$0(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, InterfaceC9544p interfaceC9544p, int i10, Composer composer, int i11) {
        LocalOwnersProvider(navBackStackEntry, saveableStateHolder, interfaceC9544p, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void SaveableStateProvider(final SaveableStateHolder saveableStateHolder, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(832919318);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(saveableStateHolder) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(832919318, i11, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:60)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: androidx.navigation.compose.g
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return NavBackStackEntryProviderKt.SaveableStateProvider$lambda$2$lambda$1((CreationExtras) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            InterfaceC9540l interfaceC9540l = (InterfaceC9540l) objRememberedValue;
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(BackStackEntryIdViewModel.class);
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(AbstractC9983y.m20315b(BackStackEntryIdViewModel.class), interfaceC9540l);
            BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) ViewModelKt.viewModel(interfaceC10469cM20315b, current, (String) null, initializerViewModelFactoryBuilder.build(), current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
            backStackEntryIdViewModel.setSaveableStateHolderRef(new WeakReference<>(saveableStateHolder));
            saveableStateHolder.SaveableStateProvider(backStackEntryIdViewModel.getId(), interfaceC9544p, composerStartRestartGroup, ((i11 << 6) & 896) | (i11 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.navigation.compose.h
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return NavBackStackEntryProviderKt.SaveableStateProvider$lambda$3(saveableStateHolder, interfaceC9544p, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackStackEntryIdViewModel SaveableStateProvider$lambda$2$lambda$1(CreationExtras creationExtras) {
        return new BackStackEntryIdViewModel(SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q SaveableStateProvider$lambda$3(SaveableStateHolder saveableStateHolder, InterfaceC9544p interfaceC9544p, int i10, Composer composer, int i11) {
        SaveableStateProvider(saveableStateHolder, interfaceC9544p, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }
}
