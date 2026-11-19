package kotlin.experimental;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010\u0003\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\f\u001a\r\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0087\b¨\u0006\u0007"}, m13413d2 = {"and", "", "other", "or", "xor", "inv", "", "kotlin-stdlib"}, m13414k = 2, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class BitwiseOperationsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte and(byte b10, byte b11) {
        return (byte) (b10 & b11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte inv(byte b10) {
        return (byte) (~b10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: or */
    private static final byte m13460or(byte b10, byte b11) {
        return (byte) (b10 | b11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte xor(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short and(short s9, short s10) {
        return (short) (s9 & s10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short inv(short s9) {
        return (short) (~s9);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: or */
    private static final short m13461or(short s9, short s10) {
        return (short) (s9 | s10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short xor(short s9, short s10) {
        return (short) (s9 ^ s10);
    }
}
