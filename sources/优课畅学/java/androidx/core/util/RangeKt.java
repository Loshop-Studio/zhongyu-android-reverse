package androidx.core.util;

import android.util.Range;
import androidx.annotation.RequiresApi;
import p077d8.InterfaceC8318c;

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
    public static final <T extends Comparable<? super T>> InterfaceC8318c toClosedRange(final Range<T> range) {
        return new InterfaceC8318c() { // from class: androidx.core.util.RangeKt.toClosedRange.1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(Comparable comparable) {
                return InterfaceC8318c.a.m13494a(this, comparable);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // p077d8.InterfaceC8318c
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // p077d8.InterfaceC8318c
            public Comparable getStart() {
                return range.getLower();
            }

            @Override // p077d8.InterfaceC8318c
            public boolean isEmpty() {
                return InterfaceC8318c.a.m13495b(this);
            }
        };
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> toRange(InterfaceC8318c interfaceC8318c) {
        return new Range<>(interfaceC8318c.getStart(), interfaceC8318c.getEndInclusive());
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        return range.extend(range2);
    }
}
