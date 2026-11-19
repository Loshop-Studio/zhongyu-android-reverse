package p178u7;

import java.io.IOException;
import java.util.Arrays;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;
import okio.ByteString;
import p139p7.AbstractC6396c;

/* renamed from: u7.d */
/* loaded from: classes4.dex */
public final class C6630d {

    /* renamed from: a */
    public final Buffer f11109a;

    /* renamed from: c */
    public boolean f11111c;

    /* renamed from: g */
    public int f11115g;

    /* renamed from: h */
    public int f11116h;

    /* renamed from: b */
    public int f11110b = Integer.MAX_VALUE;

    /* renamed from: d */
    public int f11112d = 4096;

    /* renamed from: e */
    public C6627b[] f11113e = new C6627b[8];

    /* renamed from: f */
    public int f11114f = 7;

    public C6630d(Buffer buffer) {
        this.f11109a = buffer;
    }

    /* renamed from: a */
    public final void m6270a(int i) {
        int i8;
        if (i > 0) {
            int length = this.f11113e.length - 1;
            int i9 = 0;
            while (true) {
                i8 = this.f11114f;
                if (length < i8 || i <= 0) {
                    break;
                }
                C6627b c6627b = this.f11113e[length];
                AbstractC5830k.m5327d(c6627b);
                i -= c6627b.f11099c;
                int i10 = this.f11116h;
                C6627b c6627b2 = this.f11113e[length];
                AbstractC5830k.m5327d(c6627b2);
                this.f11116h = i10 - c6627b2.f11099c;
                this.f11115g--;
                i9++;
                length--;
            }
            C6627b[] c6627bArr = this.f11113e;
            int i11 = i8 + 1;
            System.arraycopy(c6627bArr, i11, c6627bArr, i11 + i9, this.f11115g);
            C6627b[] c6627bArr2 = this.f11113e;
            int i12 = this.f11114f + 1;
            Arrays.fill(c6627bArr2, i12, i12 + i9, (Object) null);
            this.f11114f += i9;
        }
    }

    /* renamed from: b */
    public final void m6271b(C6627b c6627b) {
        int i = c6627b.f11099c;
        int i8 = this.f11112d;
        if (i > i8) {
            C6627b[] c6627bArr = this.f11113e;
            AbstractC5802q.m5186M(null, c6627bArr, 0, c6627bArr.length);
            this.f11114f = this.f11113e.length - 1;
            this.f11115g = 0;
            this.f11116h = 0;
            return;
        }
        m6270a((this.f11116h + i) - i8);
        int i9 = this.f11115g + 1;
        C6627b[] c6627bArr2 = this.f11113e;
        if (i9 > c6627bArr2.length) {
            C6627b[] c6627bArr3 = new C6627b[c6627bArr2.length * 2];
            System.arraycopy(c6627bArr2, 0, c6627bArr3, c6627bArr2.length, c6627bArr2.length);
            this.f11114f = this.f11113e.length - 1;
            this.f11113e = c6627bArr3;
        }
        int i10 = this.f11114f;
        this.f11114f = i10 - 1;
        this.f11113e[i10] = c6627b;
        this.f11115g++;
        this.f11116h += i;
    }

    /* renamed from: c */
    public final void m6272c(ByteString data) throws IOException {
        AbstractC5830k.m5330g(data, "data");
        int[] iArr = AbstractC6652z.f11221a;
        int size = data.size();
        long j7 = 0;
        long j8 = 0;
        for (int i = 0; i < size; i++) {
            byte b6 = data.getByte(i);
            byte[] bArr = AbstractC6396c.f10486a;
            j8 += AbstractC6652z.f11222b[b6 & 255];
        }
        int i8 = (int) ((j8 + 7) >> 3);
        int size2 = data.size();
        Buffer buffer = this.f11109a;
        if (i8 >= size2) {
            m6274e(data.size(), 127, 0);
            buffer.write(data);
            return;
        }
        Buffer buffer2 = new Buffer();
        int[] iArr2 = AbstractC6652z.f11221a;
        int size3 = data.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size3; i10++) {
            byte b9 = data.getByte(i10);
            byte[] bArr2 = AbstractC6396c.f10486a;
            int i11 = b9 & 255;
            int i12 = AbstractC6652z.f11221a[i11];
            byte b10 = AbstractC6652z.f11222b[i11];
            j7 = (j7 << b10) | i12;
            i9 += b10;
            while (i9 >= 8) {
                i9 -= 8;
                buffer2.writeByte((int) (j7 >> i9));
            }
        }
        if (i9 > 0) {
            buffer2.writeByte((int) ((j7 << (8 - i9)) | (255 >>> i9)));
        }
        ByteString byteString = buffer2.readByteString();
        m6274e(byteString.size(), 127, 128);
        buffer.write(byteString);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6273d(java.util.ArrayList r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p178u7.C6630d.m6273d(java.util.ArrayList):void");
    }

    /* renamed from: e */
    public final void m6274e(int i, int i8, int i9) {
        Buffer buffer = this.f11109a;
        if (i < i8) {
            buffer.writeByte(i | i9);
            return;
        }
        buffer.writeByte(i9 | i8);
        int i10 = i - i8;
        while (i10 >= 128) {
            buffer.writeByte(128 | (i10 & 127));
            i10 >>>= 7;
        }
        buffer.writeByte(i10);
    }
}
