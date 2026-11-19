package com.p074ta.p075a.p078c;

/* renamed from: com.ta.a.c.e */
/* loaded from: classes5.dex */
public class C7584e {

    /* renamed from: com.ta.a.c.e$a */
    public static class a {

        /* renamed from: a */
        public int[] f12845a;

        /* renamed from: x */
        public int f12846x;

        /* renamed from: y */
        public int f12847y;

        private a() {
            this.f12845a = new int[256];
        }
    }

    /* renamed from: a */
    private static a m9789a(String str) {
        if (str == null) {
            return null;
        }
        a aVar = new a();
        for (int i10 = 0; i10 < 256; i10++) {
            aVar.f12845a[i10] = i10;
        }
        aVar.f12846x = 0;
        aVar.f12847y = 0;
        int length = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            try {
                char cCharAt = str.charAt(length);
                int[] iArr = aVar.f12845a;
                int i13 = iArr[i12];
                i11 = ((cCharAt + i13) + i11) % 256;
                iArr[i12] = iArr[i11];
                iArr[i11] = i13;
                length = (length + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return aVar;
    }

    /* renamed from: b */
    public static byte[] m9791b(byte[] bArr) {
        a aVarM9789a;
        if (bArr == null || (aVarM9789a = m9789a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) == null) {
            return null;
        }
        return m9790a(bArr, aVarM9789a);
    }

    /* renamed from: a */
    private static byte[] m9790a(byte[] bArr, a aVar) {
        if (bArr == null || aVar == null) {
            return null;
        }
        int i10 = aVar.f12846x;
        int i11 = aVar.f12847y;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            i10 = (i10 + 1) % 256;
            int[] iArr = aVar.f12845a;
            int i13 = iArr[i10];
            i11 = (i11 + i13) % 256;
            iArr[i10] = iArr[i11];
            iArr[i11] = i13;
            int i14 = (iArr[i10] + i13) % 256;
            bArr[i12] = (byte) (iArr[i14] ^ bArr[i12]);
        }
        aVar.f12846x = i10;
        aVar.f12847y = i11;
        return bArr;
    }
}
