package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.taobao.sophix.PatchStatus;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {
    private MutableIntList _headerIndexes;
    private boolean hasCustomSpans;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC9544p DefaultSpan = new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$Companion$DefaultSpan$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m27579boximpl(m27594invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m27594invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            return LazyGridSpanKt.GridItemSpan(1);
        }
    };
    private final LazyGridSpanLayoutProvider spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
    private final MutableIntervalList<LazyGridInterval> intervals = new MutableIntervalList<>();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final InterfaceC9544p getDefaultSpan() {
            return LazyGridIntervalContent.DefaultSpan;
        }

        private Companion() {
        }
    }

    public LazyGridIntervalContent(InterfaceC9540l interfaceC9540l) {
        interfaceC9540l.invoke(this);
    }

    public final boolean getHasCustomSpans$foundation_release() {
        return this.hasCustomSpans;
    }

    public final IntList getHeaderIndexes() {
        MutableIntList mutableIntList = this._headerIndexes;
        return mutableIntList != null ? mutableIntList : IntListKt.emptyIntList();
    }

    public final LazyGridSpanLayoutProvider getSpanLayoutProvider$foundation_release() {
        return this.spanLayoutProvider;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(final Object obj, final InterfaceC9540l interfaceC9540l, final Object obj2, final InterfaceC9545q interfaceC9545q) {
        getIntervals().addInterval(1, new LazyGridInterval(obj != null ? new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$1$1
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
        } : null, interfaceC9540l != null ? new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$2$1
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                return GridItemSpan.m27579boximpl(m27595invoke_orMbw((LazyGridItemSpanScope) obj3, ((Number) obj4).intValue()));
            }

            /* renamed from: invoke-_-orMbw, reason: not valid java name */
            public final long m27595invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
                return ((GridItemSpan) interfaceC9540l.invoke(lazyGridItemSpanScope)).m27586unboximpl();
            }
        } : DefaultSpan, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.3
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
        }, ComposableLambdaKt.composableLambdaInstance(-34608120, true, new InterfaceC9546r() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.4
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                invoke((LazyGridItemScope) obj3, ((Number) obj4).intValue(), (Composer) obj5, ((Number) obj6).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(LazyGridItemScope lazyGridItemScope, int i10, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= composer.changed(lazyGridItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & PatchStatus.CODE_LOAD_LIB_UNDEFINED) != 130, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-34608120, i11, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:55)");
                }
                interfaceC9545q.invoke(lazyGridItemScope, composer, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
        if (interfaceC9540l != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int i10, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r) {
        getIntervals().addInterval(i10, new LazyGridInterval(interfaceC9540l, interfaceC9544p == null ? DefaultSpan : interfaceC9544p, interfaceC9540l2, interfaceC9546r));
        if (interfaceC9544p != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z10) {
        this.hasCustomSpans = z10;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void stickyHeader(Object obj, Object obj2, final InterfaceC9546r interfaceC9546r) {
        MutableIntList mutableIntList = this._headerIndexes;
        if (mutableIntList == null) {
            mutableIntList = new MutableIntList(0, 1, null);
            this._headerIndexes = mutableIntList;
        }
        final int size = getIntervals().getSize();
        mutableIntList.add(size);
        item(obj, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.stickyHeader.1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return GridItemSpan.m27579boximpl(m27596invokeBHJflc((LazyGridItemSpanScope) obj3));
            }

            /* renamed from: invoke-BHJ-flc, reason: not valid java name */
            public final long m27596invokeBHJflc(LazyGridItemSpanScope lazyGridItemSpanScope) {
                return LazyGridSpanKt.GridItemSpan(lazyGridItemSpanScope.getMaxLineSpan());
            }
        }, obj2, ComposableLambdaKt.composableLambdaInstance(2045010142, true, new InterfaceC9545q() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.stickyHeader.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                invoke((LazyGridItemScope) obj3, (Composer) obj4, ((Number) obj5).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(LazyGridItemScope lazyGridItemScope, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= composer.changed(lazyGridItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2045010142, i10, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.stickyHeader.<anonymous> (LazyGridIntervalContent.kt:88)");
                }
                interfaceC9546r.invoke(lazyGridItemScope, Integer.valueOf(size), composer, Integer.valueOf(i10 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public MutableIntervalList<LazyGridInterval> getIntervals() {
        return this.intervals;
    }
}
