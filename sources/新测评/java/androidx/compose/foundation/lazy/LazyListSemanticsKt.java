package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m13558d2 = {"rememberLazyListSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "isVertical", "", "(Landroidx/compose/foundation/lazy/LazyListState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLazyListSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,32:1\n1247#2,6:33\n*S KotlinDebug\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n*L\n28#1:33,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListSemanticsKt {
    @Composable
    public static final LazyLayoutSemanticState rememberLazyListSemanticState(LazyListState lazyListState, boolean z9, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(596174919, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(z9)) || (i10 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = LazyLayoutSemanticStateKt.LazyLayoutSemanticState(lazyListState, z9);
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyLayoutSemanticState lazyLayoutSemanticState = (LazyLayoutSemanticState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyLayoutSemanticState;
    }
}
