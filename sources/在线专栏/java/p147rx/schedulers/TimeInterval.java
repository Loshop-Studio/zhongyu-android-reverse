package p147rx.schedulers;

/* loaded from: classes2.dex */
public class TimeInterval<T> {
    private final long intervalInMilliseconds;
    private final T value;

    public TimeInterval(long j4, T t3) {
        this.value = t3;
        this.intervalInMilliseconds = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeInterval timeInterval = (TimeInterval) obj;
        if (this.intervalInMilliseconds != timeInterval.intervalInMilliseconds) {
            return false;
        }
        T t3 = this.value;
        if (t3 == null) {
            if (timeInterval.value != null) {
                return false;
            }
        } else if (!t3.equals(timeInterval.value)) {
            return false;
        }
        return true;
    }

    public long getIntervalInMilliseconds() {
        return this.intervalInMilliseconds;
    }

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        long j4 = this.intervalInMilliseconds;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) + 31) * 31;
        T t3 = this.value;
        return i4 + (t3 == null ? 0 : t3.hashCode());
    }

    public String toString() {
        return "TimeInterval [intervalInMilliseconds=" + this.intervalInMilliseconds + ", value=" + this.value + "]";
    }
}
