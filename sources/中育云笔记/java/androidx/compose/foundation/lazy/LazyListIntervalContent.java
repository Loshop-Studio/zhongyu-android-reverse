package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.ExperimentalFoundationApi;
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
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {
    public static final int $stable = 8;
    private MutableIntList _headerIndexes;
    private final MutableIntervalList<LazyListInterval> intervals = new MutableIntervalList<>();

    public LazyListIntervalContent(InterfaceC9540l interfaceC9540l) {
        interfaceC9540l.invoke(this);
    }

    public final IntList getHeaderIndexes() {
        MutableIntList mutableIntList = this._headerIndexes;
        return mutableIntList != null ? mutableIntList : IntListKt.emptyIntList();
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(final Object obj, final Object obj2, final InterfaceC9545q interfaceC9545q) {
        getIntervals().addInterval(1, new LazyListInterval(obj != null ? new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent.item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke(((Number) obj3).intValue());
            }

            public final Object invoke(int i10) {
                return obj;
            }
        } : null, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent.item.2
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
        }, ComposableLambdaKt.composableLambdaInstance(-1010194746, true, new InterfaceC9546r() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent.item.3
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                invoke((LazyItemScope) obj3, ((Number) obj4).intValue(), (Composer) obj5, ((Number) obj6).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, int i10, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & PatchStatus.CODE_LOAD_LIB_UNDEFINED) != 130, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1010194746, i11, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:59)");
                }
                interfaceC9545q.invoke(lazyItemScope, composer, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int i10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r) {
        getIntervals().addInterval(i10, new LazyListInterval(interfaceC9540l, interfaceC9540l2, interfaceC9546r));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void stickyHeader(Object obj, Object obj2, final InterfaceC9546r interfaceC9546r) {
        MutableIntList mutableIntList = this._headerIndexes;
        if (mutableIntList == null) {
            mutableIntList = new MutableIntList(0, 1, null);
            this._headerIndexes = mutableIntList;
        }
        mutableIntList.add(getIntervals().getSize());
        final int size = getIntervals().getSize();
        item(obj, obj2, ComposableLambdaKt.composableLambdaInstance(1491981087, true, new InterfaceC9545q() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent.stickyHeader.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                invoke((LazyItemScope) obj3, (Composer) obj4, ((Number) obj5).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1491981087, i10, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.stickyHeader.<anonymous> (LazyListIntervalContent.kt:73)");
                }
                interfaceC9546r.invoke(lazyItemScope, Integer.valueOf(size), composer, Integer.valueOf(i10 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public MutableIntervalList<LazyListInterval> getIntervals() {
        return this.intervals;
    }
}
