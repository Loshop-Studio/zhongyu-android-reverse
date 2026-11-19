package p127j0;

/* renamed from: j0.g */
/* loaded from: classes3.dex */
public abstract class AbstractC7776g {

    /* renamed from: j0.g$b */
    public static class b {

        /* renamed from: a */
        public int[] f13414a;

        /* renamed from: b */
        public int f13415b;

        /* renamed from: c */
        public int f13416c;

        public b() {
            this.f13414a = new int[256];
        }
    }

    /* renamed from: a */
    public static byte[] m13125a(byte[] bArr, b bVar) {
        if (bArr == null || bVar == null) {
            return null;
        }
        int i10 = bVar.f13415b;
        int i11 = bVar.f13416c;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            i10 = (i10 + 1) % 256;
            int[] iArr = bVar.f13414a;
            int i13 = iArr[i10];
            i11 = (i11 + i13) % 256;
            iArr[i10] = iArr[i11];
            iArr[i11] = i13;
            int i14 = (iArr[i10] + i13) % 256;
            bArr[i12] = (byte) (iArr[i14] ^ bArr[i12]);
        }
        bVar.f13415b = i10;
        bVar.f13416c = i11;
        return bArr;
    }

    /* renamed from: b */
    public static b m13126b(String str) {
        if (str == null) {
            return null;
        }
        b bVar = new b();
        for (int i10 = 0; i10 < 256; i10++) {
            bVar.f13414a[i10] = i10;
        }
        bVar.f13415b = 0;
        bVar.f13416c = 0;
        int length = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            try {
                char cCharAt = str.charAt(length);
                int[] iArr = bVar.f13414a;
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

    /* renamed from: c */
    public static byte[] m13127c(byte[] bArr) {
        return m13128d(bArr, "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK");
    }

    /* renamed from: d */
    public static byte[] m13128d(byte[] bArr, String str) {
        b bVarM13126b;
        if (bArr == null || str == null || (bVarM13126b = m13126b(str)) == null) {
            return null;
        }
        return m13125a(bArr, bVarM13126b);
    }
}
