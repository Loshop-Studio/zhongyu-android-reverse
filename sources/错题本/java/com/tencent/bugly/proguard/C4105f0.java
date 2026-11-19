package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.f0 */
/* loaded from: classes3.dex */
public final class C4105f0 extends AbstractC4095c {
    @Override // com.tencent.bugly.proguard.AbstractC4095c
    /* renamed from: a */
    public final String mo2881a() {
        String strM3060a = C4059ap.m3060a("ro.lenovo.series");
        if (C4059ap.m3084b(strM3060a) || strM3060a.equals("fail")) {
            return null;
        }
        return "Lenovo/VIBE/".concat(String.valueOf(C4059ap.m3060a("ro.build.version.incremental")));
    }
}
