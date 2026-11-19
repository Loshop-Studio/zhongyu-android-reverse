package com.taobao.accs.utl;

import java.io.ByteArrayOutputStream;

/* renamed from: com.taobao.accs.utl.g */
/* loaded from: classes.dex */
public class C1784g extends ByteArrayOutputStream {
    public C1784g(int i4) {
        super(i4);
    }

    /* renamed from: a */
    public C1784g m6147a(byte b4) {
        write(b4);
        return this;
    }

    public C1784g() {
    }

    /* renamed from: a */
    public C1784g m6148a(short s3) {
        write(s3 >> 8);
        write(s3);
        return this;
    }
}
