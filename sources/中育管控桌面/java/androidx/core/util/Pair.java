package androidx.core.util;

/* loaded from: classes2.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f6, S s6) {
        this.first = f6;
        this.second = s6;
    }

    public static <A, B> Pair<A, B> create(A a7, B b7) {
        return new Pair<>(a7, b7);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ObjectsCompat.equals(pair.first, this.first) && ObjectsCompat.equals(pair.second, this.second);
    }

    public int hashCode() {
        F f6 = this.first;
        int iHashCode = f6 == null ? 0 : f6.hashCode();
        S s6 = this.second;
        return iHashCode ^ (s6 != null ? s6.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.first + " " + this.second + "}";
    }
}
