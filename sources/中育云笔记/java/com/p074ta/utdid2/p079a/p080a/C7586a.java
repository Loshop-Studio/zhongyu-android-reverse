package com.p074ta.utdid2.p079a.p080a;

import android.annotation.SuppressLint;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ta.utdid2.a.a.a */
/* loaded from: classes5.dex */
public class C7586a {

    /* renamed from: d */
    static final /* synthetic */ boolean f12850d = true;

    /* renamed from: com.ta.utdid2.a.a.a$a */
    public static abstract class a {

        /* renamed from: a */
        public byte[] f12851a;

        /* renamed from: b */
        public int f12852b;
    }

    /* renamed from: com.ta.utdid2.a.a.a$b */
    public static class b extends a {

        /* renamed from: b */
        private static final byte[] f12853b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: c */
        private static final byte[] f12854c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: d */
        static final /* synthetic */ boolean f12855d = true;

        /* renamed from: c */
        int f12856c;
        private int count;

        /* renamed from: d */
        private final byte[] f12857d;

        /* renamed from: e */
        public final boolean f12858e;

        /* renamed from: e */
        private final byte[] f12859e;

        /* renamed from: f */
        public final boolean f12860f;

        /* renamed from: g */
        public final boolean f12861g;

        public b(int i10, byte[] bArr) {
            this.f12851a = bArr;
            this.f12858e = (i10 & 1) == 0;
            boolean z10 = (i10 & 2) == 0;
            this.f12860f = z10;
            this.f12861g = (i10 & 4) != 0;
            this.f12859e = (i10 & 8) == 0 ? f12853b : f12854c;
            this.f12857d = new byte[2];
            this.f12856c = 0;
            this.count = z10 ? 19 : -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01d3 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m9802a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 523
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p074ta.utdid2.p079a.p080a.C7586a.b.m9802a(byte[], int, int, boolean):boolean");
        }
    }

    private C7586a() {
    }

    public static byte[] encode(byte[] bArr, int i10) {
        return encode(bArr, 0, bArr.length, i10);
    }

    public static String encodeToString(byte[] bArr, int i10) {
        try {
            return new String(encode(bArr, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @SuppressLint({"Assert"})
    public static byte[] encode(byte[] bArr, int i10, int i11, int i12) {
        b bVar = new b(i12, null);
        int i13 = (i11 / 3) * 4;
        if (!bVar.f12858e) {
            int i14 = i11 % 3;
            if (i14 == 1) {
                i13 += 2;
            } else if (i14 == 2) {
                i13 += 3;
            }
        } else if (i11 % 3 > 0) {
            i13 += 4;
        }
        if (bVar.f12860f && i11 > 0) {
            i13 += (((i11 - 1) / 57) + 1) * (bVar.f12861g ? 2 : 1);
        }
        bVar.f12851a = new byte[i13];
        bVar.m9802a(bArr, i10, i11, true);
        if (f12850d || bVar.f12852b == i13) {
            return bVar.f12851a;
        }
        throw new AssertionError();
    }
}
