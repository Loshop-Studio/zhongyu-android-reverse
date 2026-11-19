package androidx.paging.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.paging.LoadState;
import androidx.paging.LoadStates;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.InterfaceC9266c;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class LazyPagingItemsKt {
    private static final LoadState.NotLoading IncompleteLoadState;
    private static final LoadStates InitialLoadStates;

    static {
        LoadState.NotLoading notLoading = new LoadState.NotLoading(false);
        IncompleteLoadState = notLoading;
        InitialLoadStates = new LoadStates(LoadState.Loading.INSTANCE, notLoading, notLoading);
    }

    @Composable
    public static final <T> LazyPagingItems<T> collectAsLazyPagingItems(InterfaceC9266c interfaceC9266c, InterfaceC9100d interfaceC9100d, Composer composer, int i10, int i11) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        composer.startReplaceableGroup(388053246);
        if ((i11 & 1) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(388053246, i10, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:203)");
        }
        composer.startReplaceableGroup(1046463091);
        boolean zChanged = composer.changed(interfaceC9266c);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LazyPagingItems(interfaceC9266c);
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyPagingItems<T> lazyPagingItems = (LazyPagingItems) objRememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1046463169);
        boolean zChangedInstance = composer.changedInstance(interfaceC9100d) | composer.changedInstance(lazyPagingItems);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(interfaceC9100d, lazyPagingItems, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(lazyPagingItems, (InterfaceC10574p) objRememberedValue2, composer, 0);
        composer.startReplaceableGroup(1046463438);
        boolean zChangedInstance2 = composer.changedInstance(interfaceC9100d) | composer.changedInstance(lazyPagingItems);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new LazyPagingItemsKt$collectAsLazyPagingItems$2$1(interfaceC9100d, lazyPagingItems, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(lazyPagingItems, (InterfaceC10574p) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyPagingItems;
    }
}
