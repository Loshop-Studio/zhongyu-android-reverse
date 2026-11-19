package com.tencent.smtt.utils;

import com.tencent.smtt.utils.C6854k;
import java.io.InputStream;
import java.util.zip.ZipEntry;

/* renamed from: com.tencent.smtt.utils.l */
/* loaded from: classes4.dex */
final class C6855l implements C6854k.b {

    /* renamed from: a */
    final /* synthetic */ String f6986a;

    public C6855l(String str) {
        this.f6986a = str;
    }

    @Override // com.tencent.smtt.utils.C6854k.b
    /* renamed from: a */
    public boolean mo6330a(InputStream inputStream, ZipEntry zipEntry, String str) throws Exception {
        try {
            return C6854k.m6322b(inputStream, zipEntry, this.f6986a, str);
        } catch (Exception e10) {
            throw new Exception("copyFileIfChanged Exception", e10);
        }
    }
}
