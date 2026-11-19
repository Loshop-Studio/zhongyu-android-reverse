package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyGridInterval implements LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;
    private final InterfaceC10576r item;
    private final InterfaceC10570l key;
    private final InterfaceC10574p span;
    private final InterfaceC10570l type;

    public LazyGridInterval(InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l2, InterfaceC10576r interfaceC10576r) {
        this.key = interfaceC10570l;
        this.span = interfaceC10574p;
        this.type = interfaceC10570l2;
        this.item = interfaceC10576r;
    }

    public final InterfaceC10576r getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public InterfaceC10570l getKey() {
        return this.key;
    }

    public final InterfaceC10574p getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public InterfaceC10570l getType() {
        return this.type;
    }
}
