package com.p053ta.utdid2.p058a.p059a;

import android.annotation.SuppressLint;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ta.utdid2.a.a.a */
/* loaded from: classes.dex */
public class C1689a {

    /* renamed from: d */
    static final /* synthetic */ boolean f7452d = true;

    /* renamed from: com.ta.utdid2.a.a.a$a */
    static abstract class a {

        /* renamed from: a */
        public byte[] f7453a;

        /* renamed from: b */
        public int f7454b;

        a() {
        }
    }

    /* renamed from: com.ta.utdid2.a.a.a$b */
    static class b extends a {

        /* renamed from: b */
        private static final byte[] f7455b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: c */
        private static final byte[] f7456c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: d */
        static final /* synthetic */ boolean f7457d = true;

        /* renamed from: c */
        int f7458c;
        private int count;

        /* renamed from: d */
        private final byte[] f7459d;

        /* renamed from: e */
        public final boolean f7460e;

        /* renamed from: e */
        private final byte[] f7461e;

        /* renamed from: f */
        public final boolean f7462f;

        /* renamed from: g */
        public final boolean f7463g;

        public b(int i4, byte[] bArr) {
            this.f7453a = bArr;
            this.f7460e = (i4 & 1) == 0;
            boolean z3 = (i4 & 2) == 0;
            this.f7462f = z3;
            this.f7463g = (i4 & 4) != 0;
            this.f7461e = (i4 & 8) == 0 ? f7455b : f7456c;
            this.f7459d = new byte[2];
            this.f7458c = 0;
            this.count = z3 ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x00e6 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m5776a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 513
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p053ta.utdid2.p058a.p059a.C1689a.b.m5776a(byte[], int, int, boolean):boolean");
        }
    }

    private C1689a() {
    }

    public static byte[] encode(byte[] bArr, int i4) {
        return encode(bArr, 0, bArr.length, i4);
    }

    public static String encodeToString(byte[] bArr, int i4) {
        try {
            return new String(encode(bArr, i4), "US-ASCII");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    @SuppressLint({"Assert"})
    public static byte[] encode(byte[] bArr, int i4, int i5, int i6) {
        b bVar = new b(i6, null);
        int i7 = (i5 / 3) * 4;
        if (!bVar.f7460e) {
            int i8 = i5 % 3;
            if (i8 == 1) {
                i7 += 2;
            } else if (i8 == 2) {
                i7 += 3;
            }
        } else if (i5 % 3 > 0) {
            i7 += 4;
        }
        if (bVar.f7462f && i5 > 0) {
            i7 += (((i5 - 1) / 57) + 1) * (bVar.f7463g ? 2 : 1);
        }
        bVar.f7453a = new byte[i7];
        bVar.m5776a(bArr, i4, i5, true);
        if (f7452d || bVar.f7454b == i7) {
            return bVar.f7453a;
        }
        throw new AssertionError();
    }
}
