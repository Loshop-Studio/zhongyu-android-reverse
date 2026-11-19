package androidx.room.util;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {
    private final String from;

    /* renamed from: id */
    private final int f2063id;
    private final int sequence;

    /* renamed from: to */
    private final String f2064to;

    public ForeignKeyWithSequence(int i10, int i11, String from, String to) {
        AbstractC9979u.m20294g(from, "from");
        AbstractC9979u.m20294g(to, "to");
        this.f2063id = i10;
        this.sequence = i11;
        this.from = from;
        this.f2064to = to;
    }

    public final String getFrom() {
        return this.from;
    }

    public final int getId() {
        return this.f2063id;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final String getTo() {
        return this.f2064to;
    }

    @Override // java.lang.Comparable
    public int compareTo(ForeignKeyWithSequence other) {
        AbstractC9979u.m20294g(other, "other");
        int i10 = this.f2063id - other.f2063id;
        return i10 == 0 ? this.sequence - other.sequence : i10;
    }
}
