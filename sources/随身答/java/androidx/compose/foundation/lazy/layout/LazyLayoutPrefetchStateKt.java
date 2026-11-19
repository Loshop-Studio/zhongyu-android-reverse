package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\t"}, m13413d2 = {"TraversablePrefetchStateNodeKey", "", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "J", "traversablePrefetchState", "Landroidx/compose/ui/Modifier;", "lazyLayoutPrefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n1#2:542\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchStateKt {
    private static final String TraversablePrefetchStateNodeKey = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";
    private static final long ZeroConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 5, null);

    @ExperimentalFoundationApi
    public static final Modifier traversablePrefetchState(Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        Modifier modifierThen;
        return (lazyLayoutPrefetchState == null || (modifierThen = modifier.then(new TraversablePrefetchStateModifierElement(lazyLayoutPrefetchState))) == null) ? modifier : modifierThen;
    }
}
