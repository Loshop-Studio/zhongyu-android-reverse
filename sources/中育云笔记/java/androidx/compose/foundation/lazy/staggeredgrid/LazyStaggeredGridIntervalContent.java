package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.taobao.sophix.PatchStatus;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyStaggeredGridIntervalContent extends LazyLayoutIntervalContent<LazyStaggeredGridInterval> implements LazyStaggeredGridScope {
    public static final int $stable = 8;
    private final MutableIntervalList<LazyStaggeredGridInterval> intervals = new MutableIntervalList<>();
    private final LazyStaggeredGridSpanProvider spanProvider = new LazyStaggeredGridSpanProvider(getIntervals());

    public LazyStaggeredGridIntervalContent(InterfaceC9540l interfaceC9540l) {
        interfaceC9540l.invoke(this);
    }

    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void item(final Object obj, final Object obj2, final StaggeredGridItemSpan staggeredGridItemSpan, final InterfaceC9545q interfaceC9545q) {
        items(1, obj != null ? new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$item$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object invoke(int i10) {
                return obj;
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke(((Number) obj3).intValue());
            }
        } : null, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke(((Number) obj3).intValue());
            }

            public final Object invoke(int i10) {
                return obj2;
            }
        }, staggeredGridItemSpan != null ? new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$item$3$1
            {
                super(1);
            }

            public final StaggeredGridItemSpan invoke(int i10) {
                return staggeredGridItemSpan;
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke(((Number) obj3).intValue());
            }
        } : null, ComposableLambdaKt.composableLambdaInstance(657818596, true, new InterfaceC9546r() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.4
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                invoke((LazyStaggeredGridItemScope) obj3, ((Number) obj4).intValue(), (Composer) obj5, ((Number) obj6).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i10, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= composer.changed(lazyStaggeredGridItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & PatchStatus.CODE_LOAD_LIB_UNDEFINED) != 130, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(657818596, i11, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.<anonymous> (LazyStaggeredGridIntervalContent.kt:44)");
                }
                interfaceC9545q.invoke(lazyStaggeredGridItemScope, composer, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void items(int i10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9546r interfaceC9546r) {
        getIntervals().addInterval(i10, new LazyStaggeredGridInterval(interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9546r));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public MutableIntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }
}
