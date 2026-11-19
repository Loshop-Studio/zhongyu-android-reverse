package com.p053ta.p054a.p057c;

/* renamed from: com.ta.a.c.e */
/* loaded from: classes.dex */
public class C1687e {

    /* renamed from: com.ta.a.c.e$a */
    private static class a {

        /* renamed from: a */
        public int[] f7447a;

        /* renamed from: x */
        public int f7448x;

        /* renamed from: y */
        public int f7449y;

        private a() {
            this.f7447a = new int[256];
        }
    }

    /* renamed from: a */
    private static a m5763a(String str) {
        if (str == null) {
            return null;
        }
        a aVar = new a();
        for (int i4 = 0; i4 < 256; i4++) {
            aVar.f7447a[i4] = i4;
        }
        aVar.f7448x = 0;
        aVar.f7449y = 0;
        int length = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 256; i6++) {
            try {
                char cCharAt = str.charAt(length);
                int[] iArr = aVar.f7447a;
                i5 = ((cCharAt + iArr[i6]) + i5) % 256;
                int i7 = iArr[i6];
                iArr[i6] = iArr[i5];
                iArr[i5] = i7;
                length = (length + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return aVar;
    }

    /* renamed from: b */
    public static byte[] m5765b(byte[] bArr) {
        a aVarM5763a;
        if (bArr == null || (aVarM5763a = m5763a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) == null) {
            return null;
        }
        return m5764a(bArr, aVarM5763a);
    }

    /* renamed from: a */
    private static byte[] m5764a(byte[] bArr, a aVar) {
        if (bArr == null || aVar == null) {
            return null;
        }
        int i4 = aVar.f7448x;
        int i5 = aVar.f7449y;
        for (int i6 = 0; i6 < bArr.length; i6++) {
            i4 = (i4 + 1) % 256;
            int[] iArr = aVar.f7447a;
            i5 = (iArr[i4] + i5) % 256;
            int i7 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i7;
            int i8 = (iArr[i4] + iArr[i5]) % 256;
            bArr[i6] = (byte) (iArr[i8] ^ bArr[i6]);
        }
        aVar.f7448x = i4;
        aVar.f7449y = i5;
        return bArr;
    }
}
