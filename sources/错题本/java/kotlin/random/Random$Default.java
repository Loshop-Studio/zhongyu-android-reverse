package kotlin.random;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p184v6.AbstractC6671c;

@Metadata(m5109d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u00013B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010#J\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010*\u001a\u00020(2\u0006\u0010,\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010-J'\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u00100R\u0014\u00101\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, m5110d2 = {"kotlin/random/Random$Default", "Lv6/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Ld6/s;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "bitCount", "nextBits", "(I)I", "nextInt", "()I", "until", TypedValues.TransitionType.S_FROM, "(II)I", "", "nextLong", "()J", "(J)J", "(JJ)J", "", "nextBoolean", "()Z", "", "nextDouble", "()D", "(D)D", "(DD)D", "", "nextFloat", "()F", "", "array", "nextBytes", "([B)[B", "size", "(I)[B", "fromIndex", "toIndex", "([BII)[B", "defaultRandom", "Lv6/c;", "Serialized", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Random$Default extends AbstractC6671c implements Serializable {

    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m5110d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Serialized implements Serializable {

        @NotNull
        public static final Serialized INSTANCE = new Serialized();
        private static final long serialVersionUID = 0;

        private Serialized() {
        }

        private final Object readResolve() {
            return AbstractC6671c.Default;
        }
    }

    public /* synthetic */ Random$Default(AbstractC5824e abstractC5824e) {
        this();
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return Serialized.INSTANCE;
    }

    @Override // p184v6.AbstractC6671c
    public int nextBits(int bitCount) {
        return AbstractC6671c.f11252a.nextBits(bitCount);
    }

    @Override // p184v6.AbstractC6671c
    public boolean nextBoolean() {
        return AbstractC6671c.f11252a.nextBoolean();
    }

    @Override // p184v6.AbstractC6671c
    @NotNull
    public byte[] nextBytes(@NotNull byte[] array) {
        AbstractC5830k.m5330g(array, "array");
        return AbstractC6671c.f11252a.nextBytes(array);
    }

    @Override // p184v6.AbstractC6671c
    public double nextDouble() {
        return AbstractC6671c.f11252a.nextDouble();
    }

    @Override // p184v6.AbstractC6671c
    public float nextFloat() {
        return AbstractC6671c.f11252a.nextFloat();
    }

    @Override // p184v6.AbstractC6671c
    public int nextInt() {
        return AbstractC6671c.f11252a.nextInt();
    }

    @Override // p184v6.AbstractC6671c
    public long nextLong() {
        return AbstractC6671c.f11252a.nextLong();
    }

    private Random$Default() {
    }

    @Override // p184v6.AbstractC6671c
    @NotNull
    public byte[] nextBytes(int size) {
        return AbstractC6671c.f11252a.nextBytes(size);
    }

    @Override // p184v6.AbstractC6671c
    public double nextDouble(double until) {
        return AbstractC6671c.f11252a.nextDouble(until);
    }

    @Override // p184v6.AbstractC6671c
    public int nextInt(int until) {
        return AbstractC6671c.f11252a.nextInt(until);
    }

    @Override // p184v6.AbstractC6671c
    public long nextLong(long until) {
        return AbstractC6671c.f11252a.nextLong(until);
    }

    @Override // p184v6.AbstractC6671c
    @NotNull
    public byte[] nextBytes(@NotNull byte[] array, int fromIndex, int toIndex) {
        AbstractC5830k.m5330g(array, "array");
        return AbstractC6671c.f11252a.nextBytes(array, fromIndex, toIndex);
    }

    @Override // p184v6.AbstractC6671c
    public double nextDouble(double from, double until) {
        return AbstractC6671c.f11252a.nextDouble(from, until);
    }

    @Override // p184v6.AbstractC6671c
    public int nextInt(int from, int until) {
        return AbstractC6671c.f11252a.nextInt(from, until);
    }

    @Override // p184v6.AbstractC6671c
    public long nextLong(long from, long until) {
        return AbstractC6671c.f11252a.nextLong(from, until);
    }
}
