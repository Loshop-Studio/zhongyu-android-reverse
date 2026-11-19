package androidx.room.util;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {
    private final String from;

    /* renamed from: id */
    private final int f1949id;
    private final int sequence;

    /* renamed from: to */
    private final String f1950to;

    public ForeignKeyWithSequence(int i10, int i11, String from, String to) {
        AbstractC9133u.m16133g(from, "from");
        AbstractC9133u.m16133g(to, "to");
        this.f1949id = i10;
        this.sequence = i11;
        this.from = from;
        this.f1950to = to;
    }

    public final String getFrom() {
        return this.from;
    }

    public final int getId() {
        return this.f1949id;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final String getTo() {
        return this.f1950to;
    }

    @Override // java.lang.Comparable
    public int compareTo(ForeignKeyWithSequence other) {
        AbstractC9133u.m16133g(other, "other");
        int i10 = this.f1949id - other.f1949id;
        return i10 == 0 ? this.sequence - other.sequence : i10;
    }
}
