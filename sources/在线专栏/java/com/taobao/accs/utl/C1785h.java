package com.taobao.accs.utl;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: com.taobao.accs.utl.h */
/* loaded from: classes.dex */
public class C1785h extends ByteArrayInputStream {
    public C1785h(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public int m6149a() {
        return read() & 255;
    }

    /* renamed from: b */
    public int m6151b() {
        return (m6149a() << 8) | m6149a();
    }

    /* renamed from: c */
    public byte[] m6152c() throws IOException {
        byte[] bArr = new byte[available()];
        read(bArr);
        return bArr;
    }

    /* renamed from: a */
    public String m6150a(int i4) throws IOException {
        byte[] bArr = new byte[i4];
        int i5 = read(bArr);
        if (i5 == i4) {
            return new String(bArr, "utf-8");
        }
        throw new IOException("read len not match. ask for " + i4 + " but read for " + i5);
    }
}
