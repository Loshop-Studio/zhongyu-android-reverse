package com.taobao.accs.utl;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: com.taobao.accs.utl.h */
/* loaded from: classes5.dex */
public class C7682h extends ByteArrayInputStream {
    public C7682h(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public int m10175a() {
        return read() & 255;
    }

    /* renamed from: b */
    public int m10177b() {
        return (m10175a() << 8) | m10175a();
    }

    /* renamed from: c */
    public byte[] m10178c() throws IOException {
        byte[] bArr = new byte[available()];
        read(bArr);
        return bArr;
    }

    /* renamed from: a */
    public String m10176a(int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = read(bArr);
        if (i11 == i10) {
            return new String(bArr, "utf-8");
        }
        throw new IOException("read len not match. ask for " + i10 + " but read for " + i11);
    }
}
