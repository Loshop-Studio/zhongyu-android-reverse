package com.tencent.smtt.sdk;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.tencent.smtt.sdk.au */
/* loaded from: classes4.dex */
class C6795au implements FileFilter {

    /* renamed from: a */
    final /* synthetic */ C6785ak f6835a;

    public C6795au(C6785ak c6785ak) {
        this.f6835a = c6785ak;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.getName().endsWith(".jar");
    }
}
