package kotlin.experimental;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010\u0003\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\f\u001a\r\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0087\b¨\u0006\u0007"}, m7880d2 = {"and", "", "other", "or", "xor", "inv", "", "kotlin-stdlib"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class BitwiseOperationsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte and(byte b7, byte b8) {
        return (byte) (b7 & b8);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte inv(byte b7) {
        return (byte) (~b7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: or */
    private static final byte m7927or(byte b7, byte b8) {
        return (byte) (b7 | b8);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte xor(byte b7, byte b8) {
        return (byte) (b7 ^ b8);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short and(short s6, short s7) {
        return (short) (s6 & s7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short inv(short s6) {
        return (short) (~s6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: or */
    private static final short m7928or(short s6, short s7) {
        return (short) (s6 | s7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short xor(short s6, short s7) {
        return (short) (s6 ^ s7);
    }
}
