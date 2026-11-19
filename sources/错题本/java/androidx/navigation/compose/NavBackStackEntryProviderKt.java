package androidx.navigation.compose;

import android.view.HasDefaultViewModelProviderFactory;
import android.view.SavedStateHandleSupport;
import android.view.ViewModelStoreOwner;
import android.view.compose.C2756g;
import android.view.compose.LocalLifecycleOwnerKt;
import android.view.compose.LocalSavedStateRegistryOwnerKt;
import android.view.viewmodel.CreationExtras;
import android.view.viewmodel.InitializerViewModelFactoryBuilder;
import android.view.viewmodel.compose.LocalViewModelStoreOwner;
import android.view.viewmodel.compose.ViewModelKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.internal.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.C5823d;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\t\u001a\u00020\u0004*\u00020\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "LocalOwnersProvider", "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "SaveableStateProvider", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "navigation-compose_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "NavBackStackEntryProviderKt")
@SourceDebugExtension({"SMAP\nNavBackStackEntryProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/NavBackStackEntryProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 4 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,91:1\n1225#2,6:92\n134#3:98\n128#3,11:99\n139#3,4:113\n32#4:110\n69#4,2:111\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/NavBackStackEntryProviderKt\n*L\n62#1:92,6\n62#1:98\n62#1:99,11\n62#1:113,4\n62#1:110\n62#1:111,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavBackStackEntryProviderKt {
    @Composable
    public static final void LocalOwnersProvider(@NotNull NavBackStackEntry navBackStackEntry, @NotNull final SaveableStateHolder saveableStateHolder, @NotNull final InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(233973821);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(navBackStackEntry) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(saveableStateHolder) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(233973821, i8, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:49)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalViewModelStoreOwner.INSTANCE.provides(navBackStackEntry), LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(navBackStackEntry), LocalSavedStateRegistryOwnerKt.getLocalSavedStateRegistryOwner().provides(navBackStackEntry)}, ComposableLambdaKt.rememberComposableLambda(1808964477, true, new InterfaceC6473e() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt.LocalOwnersProvider.1
                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @Composable
                public final void invoke(Composer composer2, int i9) {
                    if ((i9 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1808964477, i9, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:55)");
                    }
                    NavBackStackEntryProviderKt.SaveableStateProvider(saveableStateHolder, interfaceC6473e, composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 2, navBackStackEntry, saveableStateHolder, interfaceC6473e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LocalOwnersProvider$lambda$0(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, InterfaceC6473e interfaceC6473e, int i, Composer composer, int i8) {
        LocalOwnersProvider(navBackStackEntry, saveableStateHolder, interfaceC6473e, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void SaveableStateProvider(SaveableStateHolder saveableStateHolder, InterfaceC6473e interfaceC6473e, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(832919318);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(saveableStateHolder) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(832919318, i8, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:60)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C2844f(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            InterfaceC6471c interfaceC6471c = (InterfaceC6471c) objRememberedValue;
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C5823d c5823dM5340a = AbstractC5832m.m5340a(BackStackEntryIdViewModel.class);
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(AbstractC5832m.m5340a(BackStackEntryIdViewModel.class), interfaceC6471c);
            BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) ViewModelKt.viewModel(c5823dM5340a, current, (String) null, initializerViewModelFactoryBuilder.build(), current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
            backStackEntryIdViewModel.setSaveableStateHolderRef(new WeakReference<>(saveableStateHolder));
            saveableStateHolder.SaveableStateProvider(backStackEntryIdViewModel.getId(), interfaceC6473e, composerStartRestartGroup, ((i8 << 6) & 896) | (i8 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 1, saveableStateHolder, interfaceC6473e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackStackEntryIdViewModel SaveableStateProvider$lambda$2$lambda$1(CreationExtras creationExtras) {
        return new BackStackEntryIdViewModel(SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s SaveableStateProvider$lambda$3(SaveableStateHolder saveableStateHolder, InterfaceC6473e interfaceC6473e, int i, Composer composer, int i8) {
        SaveableStateProvider(saveableStateHolder, interfaceC6473e, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return C5443s.f8405a;
    }
}
