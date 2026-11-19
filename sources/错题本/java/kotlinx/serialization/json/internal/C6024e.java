package kotlinx.serialization.json.internal;

/* renamed from: kotlinx.serialization.json.internal.e */
/* loaded from: classes4.dex */
public final class C6024e {

    /* renamed from: a */
    public static final char[] f9548a = new char[117];

    /* renamed from: b */
    public static final byte[] f9549b = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        m5679a('b', 8);
        m5679a('t', 9);
        m5679a('n', 10);
        m5679a('f', 12);
        m5679a('r', 13);
        m5679a('/', 47);
        m5679a('\"', 34);
        m5679a('\\', 92);
        byte[] bArr = f9549b;
        for (int i8 = 0; i8 < 33; i8++) {
            bArr[i8] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    /* renamed from: a */
    public static void m5679a(char c, int i) {
        if (c != 'u') {
            f9548a[c] = (char) i;
        }
    }
}
