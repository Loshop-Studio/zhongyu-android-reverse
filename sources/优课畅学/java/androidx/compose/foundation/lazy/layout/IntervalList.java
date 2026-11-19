package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public interface IntervalList<T> {

    @StabilityInferred(parameters = 1)
    public static final class Interval<T> {
        public static final int $stable = 0;
        private final int size;
        private final int startIndex;
        private final T value;

        public Interval(int i10, int i11, T t10) {
            this.startIndex = i10;
            this.size = i11;
            this.value = t10;
            if (!(i10 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("startIndex should be >= 0");
            }
            if (i11 > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("size should be > 0");
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final T getValue() {
            return this.value;
        }
    }

    static /* synthetic */ void forEach$default(IntervalList intervalList, int i10, int i11, InterfaceC10570l interfaceC10570l, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = intervalList.getSize() - 1;
        }
        intervalList.forEach(i10, i11, interfaceC10570l);
    }

    void forEach(int i10, int i11, InterfaceC10570l interfaceC10570l);

    Interval<T> get(int i10);

    int getSize();
}
