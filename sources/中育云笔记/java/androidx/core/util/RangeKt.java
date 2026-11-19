package androidx.core.util;

import android.util.Range;
import androidx.annotation.RequiresApi;
import p265nd.InterfaceC10402g;

/* loaded from: classes2.dex */
public final class RangeKt {
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        return range.intersect(range2);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t10) {
        return range.extend((Range<T>) t10);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t10, T t11) {
        return new Range<>(t10, t11);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> InterfaceC10402g toClosedRange(final Range<T> range) {
        return new InterfaceC10402g() { // from class: androidx.core.util.RangeKt.toClosedRange.1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(Comparable comparable) {
                return InterfaceC10402g.a.m21731a(this, comparable);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // p265nd.InterfaceC10402g
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // p265nd.InterfaceC10402g
            public Comparable getStart() {
                return range.getLower();
            }

            @Override // p265nd.InterfaceC10402g
            public boolean isEmpty() {
                return InterfaceC10402g.a.m21732b(this);
            }
        };
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> toRange(InterfaceC10402g interfaceC10402g) {
        return new Range<>(interfaceC10402g.getStart(), interfaceC10402g.getEndInclusive());
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        return range.extend(range2);
    }
}
