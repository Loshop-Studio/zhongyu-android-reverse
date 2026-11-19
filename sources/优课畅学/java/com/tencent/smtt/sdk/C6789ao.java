package com.tencent.smtt.sdk;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.tencent.smtt.sdk.ao */
/* loaded from: classes4.dex */
class C6789ao implements FileFilter {

    /* renamed from: a */
    final /* synthetic */ C6788an f6829a;

    public C6789ao(C6788an c6788an) {
        this.f6829a = c6788an;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.getName().endsWith(".dex");
    }
}
