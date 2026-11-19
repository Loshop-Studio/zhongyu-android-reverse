package com.efs.sdk.base.p020a.p031h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.efs.sdk.base.a.h.c */
/* loaded from: classes2.dex */
public final class C2954c {
    /* renamed from: a */
    public static byte[] m2203a(byte[] bArr) throws IOException {
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
            C2957d.m2214b("efs.base", "gzip error", e4);
            return null;
        }
    }
}
