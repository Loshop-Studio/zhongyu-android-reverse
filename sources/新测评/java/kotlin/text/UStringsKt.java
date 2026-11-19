package kotlin.text;

import kotlin.AbstractC7918a;
import kotlin.AbstractC7983d;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u0007*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0019\u0010\u0013\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\n*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0019\u0010\u0016\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0018\u001a\u0011\u0010\u0019\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u0019\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001b\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007\u001a\u0016\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006 "}, m13558d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toUByteOrNull", "toUShortOrNull", "toUIntOrNull", "toULongOrNull", "kotlin-stdlib"}, m13559k = 2, m13560mv = {2, 2, 0}, m13562xi = 48)
@JvmName(name = "UStringsKt")
/* loaded from: classes5.dex */
public final class UStringsKt {
    @SinceKotlin(version = "1.5")
    /* renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m25609toStringJSWoG40(long j10, int i10) {
        return UnsignedKt.ulongToString(j10, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final String m25610toStringLxnNnR4(byte b10, int i10) {
        String string = Integer.toString(b10 & UByte.MAX_VALUE, CharsKt__CharJVMKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final String m25611toStringV7xB4Y4(int i10, int i11) {
        return UnsignedKt.ulongToString(i10 & 4294967295L, CharsKt__CharJVMKt.checkRadix(i11));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: toString-olVBNx4, reason: not valid java name */
    public static final String m25612toStringolVBNx4(short s10, int i10) {
        String string = Integer.toString(s10 & UShort.MAX_VALUE, CharsKt__CharJVMKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.5")
    public static final byte toUByte(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UByte toUByteOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final int toUInt(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UInt toUIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final long toULong(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final ULong toULongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final short toUShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UShort toUShortOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final byte toUByte(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str, i10);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UByte toUByteOrNull(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i10);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (Integer.compare(data ^ Integer.MIN_VALUE, UInt.m24394constructorimpl(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return UByte.m24311boximpl(UByte.m24317constructorimpl((byte) data));
    }

    @SinceKotlin(version = "1.5")
    public static final int toUInt(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i10);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UInt toUIntOrNull(String str, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iM24394constructorimpl = UInt.m24394constructorimpl(i10);
        int iM13566a = 119304647;
        while (i11 < length) {
            int iDigitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i11), i10);
            if (iDigitOf < 0) {
                return null;
            }
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, iM13566a ^ Integer.MIN_VALUE) > 0) {
                if (iM13566a == 119304647) {
                    iM13566a = AbstractC7918a.m13566a(-1, iM24394constructorimpl);
                    if (Integer.compare(i12 ^ Integer.MIN_VALUE, iM13566a ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iM24394constructorimpl2 = UInt.m24394constructorimpl(i12 * iM24394constructorimpl);
            int iM24394constructorimpl3 = UInt.m24394constructorimpl(UInt.m24394constructorimpl(iDigitOf) + iM24394constructorimpl2);
            if (Integer.compare(iM24394constructorimpl3 ^ Integer.MIN_VALUE, iM24394constructorimpl2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            i12 = iM24394constructorimpl3;
        }
        return UInt.m24388boximpl(i12);
    }

    @SinceKotlin(version = "1.5")
    public static final long toULong(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str, i10);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final ULong toULongOrNull(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jM24473constructorimpl = ULong.m24473constructorimpl(i10);
        long j10 = 0;
        long jM13603a = 512409557603043100L;
        while (i11 < length) {
            if (CharsKt__CharJVMKt.digitOf(str.charAt(i11), i10) < 0) {
                return null;
            }
            if (Long.compare(j10 ^ Long.MIN_VALUE, jM13603a ^ Long.MIN_VALUE) > 0) {
                if (jM13603a == 512409557603043100L) {
                    jM13603a = AbstractC7983d.m13603a(-1L, jM24473constructorimpl);
                    if (Long.compare(j10 ^ Long.MIN_VALUE, jM13603a ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jM24473constructorimpl2 = ULong.m24473constructorimpl(j10 * jM24473constructorimpl);
            long jM24473constructorimpl3 = ULong.m24473constructorimpl(ULong.m24473constructorimpl(UInt.m24394constructorimpl(r13) & 4294967295L) + jM24473constructorimpl2);
            if (Long.compare(jM24473constructorimpl3 ^ Long.MIN_VALUE, jM24473constructorimpl2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            j10 = jM24473constructorimpl3;
        }
        return ULong.m24467boximpl(j10);
    }

    @SinceKotlin(version = "1.5")
    public static final short toUShort(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str, i10);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UShort toUShortOrNull(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i10);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (Integer.compare(data ^ Integer.MIN_VALUE, UInt.m24394constructorimpl(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return UShort.m24574boximpl(UShort.m24580constructorimpl((short) data));
    }
}
