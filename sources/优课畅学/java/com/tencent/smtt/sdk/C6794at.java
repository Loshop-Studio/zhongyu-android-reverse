package com.tencent.smtt.sdk;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.tencent.smtt.sdk.at */
/* loaded from: classes4.dex */
class C6794at implements FileFilter {

    /* renamed from: a */
    final /* synthetic */ C6785ak f6834a;

    public C6794at(C6785ak c6785ak) {
        this.f6834a = c6785ak;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.getName().endsWith(".jar");
    }
}
