package kotlin.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(m7879d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a \u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0001\u001a \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0001¨\u0006\u000b"}, m7880d2 = {"mod", "", "a", "b", "", "differenceModulo", "c", "getProgressionLastElement", "start", "end", "step", "kotlin-stdlib"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class ProgressionUtilKt {
    private static final int differenceModulo(int i6, int i7, int i8) {
        return mod(mod(i6, i8) - mod(i7, i8), i8);
    }

    @PublishedApi
    public static final int getProgressionLastElement(int i6, int i7, int i8) {
        if (i8 > 0) {
            if (i6 < i7) {
                return i7 - differenceModulo(i7, i6, i8);
            }
        } else {
            if (i8 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i6 > i7) {
                return i7 + differenceModulo(i6, i7, -i8);
            }
        }
        return i7;
    }

    private static final int mod(int i6, int i7) {
        int i8 = i6 % i7;
        return i8 >= 0 ? i8 : i8 + i7;
    }

    private static final long differenceModulo(long j6, long j7, long j8) {
        return mod(mod(j6, j8) - mod(j7, j8), j8);
    }

    private static final long mod(long j6, long j7) {
        long j8 = j6 % j7;
        return j8 >= 0 ? j8 : j8 + j7;
    }

    @PublishedApi
    public static final long getProgressionLastElement(long j6, long j7, long j8) {
        if (j8 > 0) {
            return j6 >= j7 ? j7 : j7 - differenceModulo(j7, j6, j8);
        }
        if (j8 < 0) {
            return j6 <= j7 ? j7 : j7 + differenceModulo(j6, j7, -j8);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
