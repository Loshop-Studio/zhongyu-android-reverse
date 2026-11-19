package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9546r;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyListInterval implements LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;
    private final InterfaceC9546r item;
    private final InterfaceC9540l key;
    private final InterfaceC9540l type;

    public LazyListInterval(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r) {
        this.key = interfaceC9540l;
        this.type = interfaceC9540l2;
        this.item = interfaceC9546r;
    }

    public final InterfaceC9546r getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public InterfaceC9540l getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public InterfaceC9540l getType() {
        return this.type;
    }
}
