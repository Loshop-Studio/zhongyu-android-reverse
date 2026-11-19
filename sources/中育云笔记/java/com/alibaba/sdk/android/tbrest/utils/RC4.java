package com.alibaba.sdk.android.tbrest.utils;

/* loaded from: classes3.dex */
public class RC4 {
    private static final String RC4_PK = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK";

    public static class RC4Key {
        int[] state;

        /* renamed from: x */
        int f4531x;

        /* renamed from: y */
        int f4532y;

        private RC4Key() {
            this.state = new int[256];
        }
    }

    private static byte[] doRc4(byte[] bArr, RC4Key rC4Key) {
        if (bArr == null || rC4Key == null) {
            return null;
        }
        int i10 = rC4Key.f4531x;
        int i11 = rC4Key.f4532y;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            i10 = (i10 + 1) % 256;
            int[] iArr = rC4Key.state;
            int i13 = iArr[i10];
            i11 = (i11 + i13) % 256;
            iArr[i10] = iArr[i11];
            iArr[i11] = i13;
            int i14 = (iArr[i10] + i13) % 256;
            bArr[i12] = (byte) (iArr[i14] ^ bArr[i12]);
        }
        rC4Key.f4531x = i10;
        rC4Key.f4532y = i11;
        return bArr;
    }

    private static RC4Key prepareKey(String str) {
        if (str == null) {
            return null;
        }
        RC4Key rC4Key = new RC4Key();
        for (int i10 = 0; i10 < 256; i10++) {
            rC4Key.state[i10] = i10;
        }
        rC4Key.f4531x = 0;
        rC4Key.f4532y = 0;
        int length = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            try {
                char cCharAt = str.charAt(length);
                int[] iArr = rC4Key.state;
                int i13 = iArr[i12];
                i11 = ((cCharAt + i13) + i11) % 256;
                iArr[i12] = iArr[i11];
                iArr[i11] = i13;
                length = (length + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return rC4Key;
    }

    public static byte[] rc4(byte[] bArr) {
        return rc4(bArr, RC4_PK);
    }

    private static byte[] rc4(byte[] bArr, String str) {
        RC4Key rC4KeyPrepareKey;
        if (bArr == null || str == null || (rC4KeyPrepareKey = prepareKey(str)) == null) {
            return null;
        }
        return doRc4(bArr, rC4KeyPrepareKey);
    }
}
