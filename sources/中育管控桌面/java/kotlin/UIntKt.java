package kotlin;

import kotlin.internal.InlineOnly;

@Metadata(m7879d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0002\u0010\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0006H\u0087\b¢\u0006\u0002\u0010\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\bH\u0087\b¢\u0006\u0002\u0010\t\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\nH\u0087\b¢\u0006\u0002\u0010\u000b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\fH\u0087\b¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m7880d2 = {"toUInt", "Lkotlin/UInt;", "", "(B)I", "", "(S)I", "", "(I)I", "", "(J)I", "", "(F)I", "", "(D)I", "kotlin-stdlib"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class UIntKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(byte b7) {
        return UInt.m17278constructorimpl(b7);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(short s6) {
        return UInt.m17278constructorimpl(s6);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(int i6) {
        return UInt.m17278constructorimpl(i6);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(long j6) {
        return UInt.m17278constructorimpl((int) j6);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(float f6) {
        return UnsignedKt.doubleToUInt(f6);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(double d6) {
        return UnsignedKt.doubleToUInt(d6);
    }
}
