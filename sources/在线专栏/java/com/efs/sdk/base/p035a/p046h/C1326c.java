package com.efs.sdk.base.p035a.p046h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.efs.sdk.base.a.h.c */
/* loaded from: classes.dex */
public final class C1326c {
    /* renamed from: a */
    public static byte[] m5562a(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e4) {
            C1329d.m5573b("efs.base", "gzip error", e4);
            return null;
        }
    }
}
