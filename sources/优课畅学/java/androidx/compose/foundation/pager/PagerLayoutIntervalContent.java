package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10576r;

/* loaded from: classes.dex */
final class PagerLayoutIntervalContent extends LazyLayoutIntervalContent<PagerIntervalContent> {
    private final IntervalList<PagerIntervalContent> intervals;
    private final InterfaceC10570l key;
    private final InterfaceC10576r pageContent;
    private final int pageCount;

    public PagerLayoutIntervalContent(InterfaceC10576r interfaceC10576r, InterfaceC10570l interfaceC10570l, int i10) {
        this.pageContent = interfaceC10576r;
        this.key = interfaceC10570l;
        this.pageCount = i10;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.addInterval(i10, new PagerIntervalContent(interfaceC10570l, interfaceC10576r));
        this.intervals = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<PagerIntervalContent> getIntervals() {
        return this.intervals;
    }

    public final InterfaceC10570l getKey() {
        return this.key;
    }

    public final InterfaceC10576r getPageContent() {
        return this.pageContent;
    }

    public final int getPageCount() {
        return this.pageCount;
    }
}
