package com.efs.sdk.base.p039a.p050h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.efs.sdk.base.a.h.c */
/* loaded from: classes3.dex */
public final class C5694c {
    /* renamed from: a */
    public static byte[] m4172a(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e10) {
            C5697d.m4183b("efs.base", "gzip error", e10);
            return null;
        }
    }
}
