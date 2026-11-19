package com.tencent.smtt.utils;

import com.tencent.smtt.utils.C6854k;
import java.io.File;

/* renamed from: com.tencent.smtt.utils.m */
/* loaded from: classes4.dex */
final class C6856m implements C6854k.a {
    @Override // com.tencent.smtt.utils.C6854k.a
    /* renamed from: a */
    public boolean mo6329a(File file, File file2) {
        return file.length() == file2.length() && file.lastModified() == file2.lastModified();
    }
}
