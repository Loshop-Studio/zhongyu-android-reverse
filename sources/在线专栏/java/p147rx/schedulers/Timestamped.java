package p147rx.schedulers;

/* loaded from: classes2.dex */
public final class Timestamped<T> {
    private final long timestampMillis;
    private final T value;

    public Timestamped(long j4, T t3) {
        this.value = t3;
        this.timestampMillis = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Timestamped)) {
            return false;
        }
        Timestamped timestamped = (Timestamped) obj;
        if (this.timestampMillis == timestamped.timestampMillis) {
            T t3 = this.value;
            T t4 = timestamped.value;
            if (t3 == t4) {
                return true;
            }
            if (t3 != null && t3.equals(t4)) {
                return true;
            }
        }
        return false;
    }

    public long getTimestampMillis() {
        return this.timestampMillis;
    }

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        long j4 = this.timestampMillis;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) + 31) * 31;
        T t3 = this.value;
        return i4 + (t3 == null ? 0 : t3.hashCode());
    }

    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", Long.valueOf(this.timestampMillis), this.value.toString());
    }
}
