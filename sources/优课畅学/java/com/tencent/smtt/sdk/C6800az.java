package com.tencent.smtt.sdk;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.tencent.smtt.sdk.az */
/* loaded from: classes4.dex */
final class C6800az implements FileFilter {
    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return !file.getName().endsWith(".dex");
    }
}
