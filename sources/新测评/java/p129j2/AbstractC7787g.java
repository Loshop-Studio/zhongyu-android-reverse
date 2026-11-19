package p129j2;

/* renamed from: j2.g */
/* loaded from: classes4.dex */
public abstract class AbstractC7787g {

    /* renamed from: j2.g$b */
    public static class b {

        /* renamed from: a */
        public int[] f13429a;

        /* renamed from: b */
        public int f13430b;

        /* renamed from: c */
        public int f13431c;

        public b() {
            this.f13429a = new int[256];
        }
    }

    /* renamed from: a */
    public static b m13172a(String str) {
        if (str == null) {
            return null;
        }
        b bVar = new b();
        for (int i10 = 0; i10 < 256; i10++) {
            bVar.f13429a[i10] = i10;
        }
        bVar.f13430b = 0;
        bVar.f13431c = 0;
        int length = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            try {
                char cCharAt = str.charAt(length);
                int[] iArr = bVar.f13429a;
                int i13 = iArr[i12];
                i11 = ((cCharAt + i13) + i11) % 256;
                iArr[i12] = iArr[i11];
                iArr[i11] = i13;
                length = (length + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public static byte[] m13173b(byte[] bArr, b bVar) {
        if (bArr == null || bVar == null) {
            return null;
        }
        int i10 = bVar.f13430b;
        int i11 = bVar.f13431c;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            i10 = (i10 + 1) % 256;
            int[] iArr = bVar.f13429a;
            int i13 = iArr[i10];
            i11 = (i11 + i13) % 256;
            iArr[i10] = iArr[i11];
            iArr[i11] = i13;
            int i14 = (iArr[i10] + i13) % 256;
            bArr[i12] = (byte) (iArr[i14] ^ bArr[i12]);
        }
        bVar.f13430b = i10;
        bVar.f13431c = i11;
        return bArr;
    }

    /* renamed from: c */
    public static byte[] m13174c(byte[] bArr) {
        b bVarM13172a;
        if (bArr == null || (bVarM13172a = m13172a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) == null) {
            return null;
        }
        return m13173b(bArr, bVarM13172a);
    }
}
