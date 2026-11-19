package androidx.paging.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.LoadState;
import androidx.paging.LoadStates;
import androidx.paging.PagingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

@Metadata(m7879d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m7880d2 = {"IncompleteLoadState", "Landroidx/paging/LoadState$NotLoading;", "InitialLoadStates", "Landroidx/paging/LoadStates;", "collectAsLazyPagingItems", "Landroidx/paging/compose/LazyPagingItems;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/paging/compose/LazyPagingItems;", "paging-compose_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nLazyPagingItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItemsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,230:1\n1097#2,6:231\n1097#2,6:237\n1097#2,6:243\n*S KotlinDebug\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItemsKt\n*L\n206#1:231,6\n208#1:237,6\n218#1:243,6\n*E\n"})
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
    public static final <T> LazyPagingItems<T> collectAsLazyPagingItems(Flow<PagingData<T>> flow, CoroutineContext coroutineContext, Composer composer, int i6, int i7) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        composer.startReplaceableGroup(388053246);
        if ((i7 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(388053246, i6, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:203)");
        }
        composer.startReplaceableGroup(1046463091);
        boolean zChanged = composer.changed(flow);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyPagingItems(flow);
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyPagingItems<T> lazyPagingItems = (LazyPagingItems) objRememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1046463169);
        boolean zChangedInstance = composer.changedInstance(coroutineContext) | composer.changedInstance(lazyPagingItems);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(coroutineContext, lazyPagingItems, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(lazyPagingItems, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
        composer.startReplaceableGroup(1046463438);
        boolean zChangedInstance2 = composer.changedInstance(coroutineContext) | composer.changedInstance(lazyPagingItems);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new LazyPagingItemsKt$collectAsLazyPagingItems$2$1(coroutineContext, lazyPagingItems, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(lazyPagingItems, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyPagingItems;
    }
}
