package com.tencent.bugly.proguard;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.tencent.bugly.proguard.bj */
/* loaded from: classes5.dex */
public final class C7804bj implements InterfaceC7803bi {
    @Override // com.tencent.bugly.proguard.InterfaceC7803bi
    /* renamed from: a */
    public final byte[] mo10823a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.finish();
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC7803bi
    /* renamed from: b */
    public final byte[] mo10824b(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = gZIPInputStream.read(bArr2, 0, 1024);
            if (i10 == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                gZIPInputStream.close();
                byteArrayInputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(bArr2, 0, i10);
        }
    }
}
