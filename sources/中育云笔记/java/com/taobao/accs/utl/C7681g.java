package com.taobao.accs.utl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.taobao.accs.utl.g */
/* loaded from: classes5.dex */
public class C7681g extends ByteArrayOutputStream {
    public C7681g(int i10) {
        super(i10);
    }

    /* renamed from: a */
    public C7681g m10173a(byte b10) throws IOException {
        write(b10);
        return this;
    }

    public C7681g() {
    }

    /* renamed from: a */
    public C7681g m10174a(short s10) throws IOException {
        write(s10 >> 8);
        write(s10);
        return this;
    }
}
