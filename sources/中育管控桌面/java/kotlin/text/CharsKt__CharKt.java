package kotlin.text;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m7879d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0007\u001a\u0015\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0087\n\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r\u001a\n\u0010\u000f\u001a\u00020\r*\u00020\u0002¨\u0006\u0010"}, m7880d2 = {"digitToInt", "", "", "radix", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "digitToChar", "titlecase", "", "plus", "other", "equals", "", "ignoreCase", "isSurrogate", "kotlin-stdlib"}, m7881k = 5, m7882mv = {2, 2, 0}, m7884xi = 49, m7885xs = "kotlin/text/CharsKt")
@SourceDebugExtension({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
/* loaded from: classes4.dex */
public class CharsKt__CharKt extends CharsKt__CharJVMKt {
    @SinceKotlin(version = "1.5")
    public static final char digitToChar(int i6) {
        if (i6 >= 0 && i6 < 10) {
            return (char) (i6 + 48);
        }
        throw new IllegalArgumentException("Int " + i6 + " is not a decimal digit");
    }

    @SinceKotlin(version = "1.5")
    public static int digitToInt(char c7) {
        int iDigitOf = CharsKt__CharJVMKt.digitOf(c7, 10);
        if (iDigitOf >= 0) {
            return iDigitOf;
        }
        throw new IllegalArgumentException("Char " + c7 + " is not a decimal digit");
    }

    @SinceKotlin(version = "1.5")
    public static final Integer digitToIntOrNull(char c7) {
        Integer numValueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c7, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean equals(char c7, char c8, boolean z6) {
        if (c7 == c8) {
            return true;
        }
        if (!z6) {
            return false;
        }
        char upperCase = Character.toUpperCase(c7);
        char upperCase2 = Character.toUpperCase(c8);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean equals$default(char c7, char c8, boolean z6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return equals(c7, c8, z6);
    }

    public static boolean isSurrogate(char c7) {
        return 55296 <= c7 && c7 < 57344;
    }

    @InlineOnly
    private static final String plus(char c7, String other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return c7 + other;
    }

    @SinceKotlin(version = "1.5")
    public static String titlecase(char c7) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c7);
    }

    @SinceKotlin(version = "1.5")
    public static final char digitToChar(int i6, int i7) {
        if (2 > i7 || i7 >= 37) {
            throw new IllegalArgumentException("Invalid radix: " + i7 + ". Valid radix values are in range 2..36");
        }
        if (i6 >= 0 && i6 < i7) {
            return (char) (i6 < 10 ? i6 + 48 : ((char) (i6 + 65)) - '\n');
        }
        throw new IllegalArgumentException("Digit " + i6 + " does not represent a valid digit in radix " + i7);
    }

    @SinceKotlin(version = "1.5")
    public static final Integer digitToIntOrNull(char c7, int i6) {
        CharsKt__CharJVMKt.checkRadix(i6);
        Integer numValueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c7, i6));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    @SinceKotlin(version = "1.5")
    public static final int digitToInt(char c7, int i6) {
        Integer numDigitToIntOrNull = digitToIntOrNull(c7, i6);
        if (numDigitToIntOrNull != null) {
            return numDigitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c7 + " is not a digit in the given radix=" + i6);
    }
}
