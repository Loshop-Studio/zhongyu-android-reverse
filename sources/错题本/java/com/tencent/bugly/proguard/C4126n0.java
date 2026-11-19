package com.tencent.bugly.proguard;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.tencent.bugly.proguard.n0 */
/* loaded from: classes3.dex */
public final class C4126n0 implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f3855a;

    /* renamed from: b */
    public final /* synthetic */ String f3856b;

    public C4126n0(String str, String str2) {
        this.f3855a = str;
        this.f3856b = str2;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str != null && str.startsWith(this.f3855a) && str.endsWith(this.f3856b);
    }
}
