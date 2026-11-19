package kotlin.experimental;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

@Metadata(m5174d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0000\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f¨\u0006\u0007"}, m5175d2 = {"and", "", "other", "", "inv", "or", "xor", "kotlin-stdlib"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class BitwiseOperationsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte and(byte b4, byte b5) {
        return (byte) (b4 & b5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte inv(byte b4) {
        return (byte) (~b4);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: or */
    private static final byte m5201or(byte b4, byte b5) {
        return (byte) (b4 | b5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte xor(byte b4, byte b5) {
        return (byte) (b4 ^ b5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short and(short s3, short s4) {
        return (short) (s3 & s4);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short inv(short s3) {
        return (short) (~s3);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: or */
    private static final short m5202or(short s3, short s4) {
        return (short) (s3 | s4);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short xor(short s3, short s4) {
        return (short) (s3 ^ s4);
    }
}
