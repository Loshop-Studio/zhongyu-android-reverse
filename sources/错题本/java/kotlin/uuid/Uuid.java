package kotlin.uuid;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5840a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022b7.C3199a;
import p185v7.AbstractC6683l;

@SinceKotlin(version = "2.0")
@Metadata(m5109d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001,J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R \u0010\"\u001a\u00020!8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010(\u001a\u00020!8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b(\u0010#\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010%¨\u0006-"}, m5110d2 = {"Lkotlin/uuid/Uuid;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Ld6/s;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "toString", "()Ljava/lang/String;", "toHexDashString", "toHexString", "", "toByteArray", "()[B", "Ld6/k;", "toUByteArray-TcUX1vc", "toUByteArray", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "compareTo", "(Lkotlin/uuid/Uuid;)I", "hashCode", "()I", "", "mostSignificantBits", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "leastSignificantBits", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "Companion", "b7/a", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@ExperimentalUuidApi
/* loaded from: classes4.dex */
public final class Uuid implements Comparable<Uuid>, Serializable {
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    @NotNull
    public static final C3199a Companion = new C3199a();

    /* renamed from: a */
    public static final Uuid f9269a = new Uuid(0, 0);

    public /* synthetic */ Uuid(long j7, long j8, AbstractC5824e abstractC5824e) {
        this(j7, j8);
    }

    @PublishedApi
    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new UuidSerialized(getMostSignificantBits(), getLeastSignificantBits());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) other;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    @NotNull
    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        long j7 = this.mostSignificantBits;
        int i = 0;
        int i8 = 7;
        int i9 = 7;
        while (-1 < i9) {
            bArr[i] = (byte) (j7 >> (i9 << 3));
            i9--;
            i++;
        }
        long j8 = this.leastSignificantBits;
        int i10 = 8;
        while (-1 < i8) {
            bArr[i10] = (byte) (j8 >> (i8 << 3));
            i8--;
            i10++;
        }
        return bArr;
    }

    @SinceKotlin(version = "2.1")
    @NotNull
    public final String toHexDashString() {
        byte[] bArr = new byte[36];
        AbstractC6683l.m6371k(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC6683l.m6371k(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC6683l.m6371k(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC6683l.m6371k(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC6683l.m6371k(this.leastSignificantBits, bArr, 24, 2, 8);
        return new String(bArr, AbstractC5840a.f9235a);
    }

    @NotNull
    public final String toHexString() {
        byte[] bArr = new byte[32];
        AbstractC6683l.m6371k(this.mostSignificantBits, bArr, 0, 0, 8);
        AbstractC6683l.m6371k(this.leastSignificantBits, bArr, 16, 0, 8);
        return new String(bArr, AbstractC5840a.f9235a);
    }

    @NotNull
    public String toString() {
        return toHexDashString();
    }

    @SinceKotlin(version = "2.1")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m13966toUByteArrayTcUX1vc() {
        byte[] storage = toByteArray();
        AbstractC5830k.m5330g(storage, "storage");
        return storage;
    }

    public Uuid(long j7, long j8) {
        this.mostSignificantBits = j7;
        this.leastSignificantBits = j8;
    }

    @Override // java.lang.Comparable
    @SinceKotlin(version = "2.1")
    public int compareTo(@NotNull Uuid other) {
        AbstractC5830k.m5330g(other, "other");
        long j7 = this.mostSignificantBits;
        long j8 = other.mostSignificantBits;
        if (j7 != j8) {
            return Long.compare(j7 ^ Long.MIN_VALUE, j8 ^ Long.MIN_VALUE);
        }
        return Long.compare(this.leastSignificantBits ^ Long.MIN_VALUE, other.leastSignificantBits ^ Long.MIN_VALUE);
    }
}
