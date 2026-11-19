package com.tencent.smtt.sdk;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.tencent.smtt.sdk.aq */
/* loaded from: classes4.dex */
class C6791aq implements FileFilter {

    /* renamed from: a */
    final /* synthetic */ C6785ak f6831a;

    public C6791aq(C6785ak c6785ak) {
        this.f6831a = c6785ak;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return !file.getName().endsWith(".dex");
    }
}
