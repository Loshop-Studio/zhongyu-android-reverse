package androidx.compose.p014ui.graphics;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class Interval<T> {
    private final T data;
    private final float end;
    private final float start;

    public Interval(float f10, float f11, T t10) {
        this.start = f10;
        this.end = f11;
        this.data = t10;
    }

    public final boolean contains(float f10) {
        return f10 <= this.end && this.start <= f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end && AbstractC9979u.m20289b(this.data, interval.data);
        }
        return false;
    }

    public final T getData() {
        return this.data;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.start) * 31) + Float.hashCode(this.end)) * 31;
        T t10 = this.data;
        return iHashCode + (t10 != null ? t10.hashCode() : 0);
    }

    public final boolean overlaps(Interval<T> interval) {
        return this.start <= interval.end && this.end >= interval.start;
    }

    public String toString() {
        return "Interval(start=" + this.start + ", end=" + this.end + ", data=" + this.data + ')';
    }

    public final boolean overlaps(float f10, float f11) {
        return this.start <= f11 && this.end >= f10;
    }

    public /* synthetic */ Interval(float f10, float f11, Object obj, int i10, AbstractC9972n abstractC9972n) {
        this(f10, f11, (i10 & 4) != 0 ? null : obj);
    }
}
