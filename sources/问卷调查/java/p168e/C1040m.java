package p168e;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p160d.C0992b;
import p160d.p162f.p164b.C1008a;
import p160d.p162f.p164b.C1010c;
import p160d.p162f.p164b.C1011d;
import p160d.p165g.C1015a;
import p160d.p165g.C1017c;
import p168e.p169q.C1045b;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* renamed from: e.m */
/* loaded from: classes.dex */
public final class C1040m implements Iterable<C0992b<? extends String, ? extends String>> {

    /* renamed from: b */
    public final String[] f5547b;

    public C1040m(String[] strArr, C1010c c1010c) {
        this.f5547b = strArr;
    }

    /* renamed from: a */
    public static final C1040m m2837a(String... strArr) {
        C1017c c1017c;
        C1011d.m2809e(strArr, "namesAndValues");
        if (!(strArr.length % 2 == 0)) {
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
        Object objClone = strArr.clone();
        Objects.requireNonNull(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        String[] strArr2 = (String[]) objClone;
        int length = strArr2.length;
        for (int i = 0; i < length; i++) {
            if (!(strArr2[i] != null)) {
                throw new IllegalArgumentException("Headers cannot be null".toString());
            }
            String str = strArr2[i];
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            C1011d.m2809e(str, "$this$trim");
            int length2 = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length2) {
                char cCharAt = str.charAt(!z ? i2 : length2);
                boolean z2 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length2--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            strArr2[i] = str.subSequence(i2, length2 + 1).toString();
        }
        int length3 = strArr2.length;
        if (length3 <= Integer.MIN_VALUE) {
            C1017c c1017c2 = C1017c.f5493f;
            c1017c = C1017c.f5492e;
        } else {
            c1017c = new C1017c(0, length3 - 1);
        }
        C1011d.m2809e(c1017c, "$this$step");
        C1011d.m2809e(2, "step");
        int i3 = c1017c.f5485b;
        C1015a c1015a = new C1015a(i3, c1017c.f5486c, c1017c.f5487d > 0 ? 2 : -2);
        int i4 = c1015a.f5486c;
        int i5 = c1015a.f5487d;
        if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
            while (true) {
                String str2 = strArr2[i3];
                String str3 = strArr2[i3 + 1];
                if (!(str2.length() > 0)) {
                    throw new IllegalArgumentException("name is empty".toString());
                }
                int length4 = str2.length();
                for (int i6 = 0; i6 < length4; i6++) {
                    char cCharAt2 = str2.charAt(i6);
                    if (!('!' <= cCharAt2 && '~' >= cCharAt2)) {
                        throw new IllegalArgumentException(C1045b.m2838a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i6), str2).toString());
                    }
                }
                int length5 = str3.length();
                for (int i7 = 0; i7 < length5; i7++) {
                    char cCharAt3 = str3.charAt(i7);
                    if (!(cCharAt3 == '\t' || (' ' <= cCharAt3 && '~' >= cCharAt3))) {
                        throw new IllegalArgumentException(C1045b.m2838a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt3), Integer.valueOf(i7), str2, str3).toString());
                    }
                }
                if (i3 == i4) {
                    break;
                }
                i3 += i5;
            }
        }
        return new C1040m(strArr2, null);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1040m) && Arrays.equals(this.f5547b, ((C1040m) obj).f5547b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5547b);
    }

    @Override // java.lang.Iterable
    public Iterator<C0992b<? extends String, ? extends String>> iterator() {
        int length = this.f5547b.length / 2;
        C0992b[] c0992bArr = new C0992b[length];
        for (int i = 0; i < length; i++) {
            String[] strArr = this.f5547b;
            int i2 = i * 2;
            c0992bArr[i] = new C0992b(strArr[i2], strArr[i2 + 1]);
        }
        C1011d.m2809e(c0992bArr, "array");
        return new C1008a(c0992bArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f5547b.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            sb.append(this.f5547b[i2]);
            sb.append(": ");
            sb.append(this.f5547b[i2 + 1]);
            sb.append("\n");
        }
        String string = sb.toString();
        C1011d.m2808d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
