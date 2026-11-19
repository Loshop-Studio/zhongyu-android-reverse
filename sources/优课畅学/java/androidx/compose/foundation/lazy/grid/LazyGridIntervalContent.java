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
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {
    private MutableIntList _headerIndexes;
    private boolean hasCustomSpans;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC10574p DefaultSpan = new InterfaceC10574p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$Companion$DefaultSpan$1
        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m20977boximpl(m20992invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m20992invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            return LazyGridSpanKt.GridItemSpan(1);
        }
    };
    private final LazyGridSpanLayoutProvider spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
    private final MutableIntervalList<LazyGridInterval> intervals = new MutableIntervalList<>();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final InterfaceC10574p getDefaultSpan() {
            return LazyGridIntervalContent.DefaultSpan;
        }

        private Companion() {
        }
    }

    public LazyGridIntervalContent(InterfaceC10570l interfaceC10570l) {
        interfaceC10570l.invoke(this);
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
    public void item(final Object obj, final InterfaceC10570l interfaceC10570l, final Object obj2, final InterfaceC10575q interfaceC10575q) {
        getIntervals().addInterval(1, new LazyGridInterval(obj != null ? new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object invoke(int i10) {
                return obj;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke(((Number) obj3).intValue());
            }
        } : null, interfaceC10570l != null ? new InterfaceC10574p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$2$1
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                return GridItemSpan.m20977boximpl(m20993invoke_orMbw((LazyGridItemSpanScope) obj3, ((Number) obj4).intValue()));
            }

            /* renamed from: invoke-_-orMbw, reason: not valid java name */
            public final long m20993invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
                return ((GridItemSpan) interfaceC10570l.invoke(lazyGridItemSpanScope)).m20984unboximpl();
            }
        } : DefaultSpan, new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke(((Number) obj3).intValue());
            }

            public final Object invoke(int i10) {
                return obj2;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-34608120, true, new InterfaceC10576r() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.4
            {
                super(4);
            }

            @Override // p300x7.InterfaceC10576r
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                invoke((LazyGridItemScope) obj3, ((Number) obj4).intValue(), (Composer) obj5, ((Number) obj6).intValue());
                return C8736p.f16368a;
            }

            @Composable
            public final void invoke(LazyGridItemScope lazyGridItemScope, int i10, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= composer.changed(lazyGridItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 131) != 130, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-34608120, i11, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:55)");
                }
                interfaceC10575q.invoke(lazyGridItemScope, composer, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
        if (interfaceC10570l != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int i10, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l2, InterfaceC10576r interfaceC10576r) {
        getIntervals().addInterval(i10, new LazyGridInterval(interfaceC10570l, interfaceC10574p == null ? DefaultSpan : interfaceC10574p, interfaceC10570l2, interfaceC10576r));
        if (interfaceC10574p != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z10) {
        this.hasCustomSpans = z10;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void stickyHeader(Object obj, Object obj2, final InterfaceC10576r interfaceC10576r) {
        MutableIntList mutableIntList = this._headerIndexes;
        if (mutableIntList == null) {
            mutableIntList = new MutableIntList(0, 1, null);
            this._headerIndexes = mutableIntList;
        }
        final int size = getIntervals().getSize();
        mutableIntList.add(size);
        item(obj, new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.stickyHeader.1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return GridItemSpan.m20977boximpl(m20994invokeBHJflc((LazyGridItemSpanScope) obj3));
            }

            /* renamed from: invoke-BHJ-flc, reason: not valid java name */
            public final long m20994invokeBHJflc(LazyGridItemSpanScope lazyGridItemSpanScope) {
                return LazyGridSpanKt.GridItemSpan(lazyGridItemSpanScope.getMaxLineSpan());
            }
        }, obj2, ComposableLambdaKt.composableLambdaInstance(2045010142, true, new InterfaceC10575q() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.stickyHeader.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p300x7.InterfaceC10575q
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                invoke((LazyGridItemScope) obj3, (Composer) obj4, ((Number) obj5).intValue());
                return C8736p.f16368a;
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
                interfaceC10576r.invoke(lazyGridItemScope, Integer.valueOf(size), composer, Integer.valueOf(i10 & 14));
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
