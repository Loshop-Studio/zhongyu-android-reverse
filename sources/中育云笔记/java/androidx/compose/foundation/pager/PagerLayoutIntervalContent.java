package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9546r;

/* loaded from: classes.dex */
final class PagerLayoutIntervalContent extends LazyLayoutIntervalContent<PagerIntervalContent> {
    private final IntervalList<PagerIntervalContent> intervals;
    private final InterfaceC9540l key;
    private final InterfaceC9546r pageContent;
    private final int pageCount;

    public PagerLayoutIntervalContent(InterfaceC9546r interfaceC9546r, InterfaceC9540l interfaceC9540l, int i10) {
        this.pageContent = interfaceC9546r;
        this.key = interfaceC9540l;
        this.pageCount = i10;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.addInterval(i10, new PagerIntervalContent(interfaceC9540l, interfaceC9546r));
        this.intervals = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<PagerIntervalContent> getIntervals() {
        return this.intervals;
    }

    public final InterfaceC9540l getKey() {
        return this.key;
    }

    public final InterfaceC9546r getPageContent() {
        return this.pageContent;
    }

    public final int getPageCount() {
        return this.pageCount;
    }
}
