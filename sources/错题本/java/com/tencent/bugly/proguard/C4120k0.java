package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.k0 */
/* loaded from: classes3.dex */
public final class C4120k0 extends AbstractC4095c {
    @Override // com.tencent.bugly.proguard.AbstractC4095c
    /* renamed from: a */
    public final String mo2881a() {
        String strM3060a = C4059ap.m3060a("ro.miui.ui.version.name");
        if (C4059ap.m3084b(strM3060a) || strM3060a.equals("fail")) {
            return null;
        }
        return "XiaoMi/MIUI/".concat(strM3060a);
    }
}
