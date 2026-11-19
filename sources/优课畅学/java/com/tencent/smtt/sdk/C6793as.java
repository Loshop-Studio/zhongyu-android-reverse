package com.tencent.smtt.sdk;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.tencent.smtt.sdk.as */
/* loaded from: classes4.dex */
class C6793as implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ C6785ak f6833a;

    public C6793as(C6785ak c6785ak) {
        this.f6833a = c6785ak;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return Pattern.compile("libtbs\\.(.*)\\.so").matcher(str).find();
    }
}
