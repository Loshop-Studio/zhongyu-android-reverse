package com.tencent.smtt.sdk;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.tencent.smtt.sdk.ar */
/* loaded from: classes4.dex */
class C6792ar implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ C6785ak f6832a;

    public C6792ar(C6785ak c6785ak) {
        this.f6832a = c6785ak;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return Pattern.compile("libtbs\\.(.*)\\.so").matcher(str).find();
    }
}
