package com.tencent.smtt.sdk;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.tencent.smtt.sdk.ap */
/* loaded from: classes4.dex */
class C6790ap implements FileFilter {

    /* renamed from: a */
    final /* synthetic */ C6788an f6830a;

    public C6790ap(C6788an c6788an) {
        this.f6830a = c6788an;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.getName().endsWith("tbs.conf");
    }
}
