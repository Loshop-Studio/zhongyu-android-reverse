package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.g0 */
/* loaded from: classes3.dex */
public final class C4108g0 extends AbstractC4095c {
    @Override // com.tencent.bugly.proguard.AbstractC4095c
    /* renamed from: a */
    public final String mo2881a() {
        String strM3060a = C4059ap.m3060a("ro.meizu.product.model");
        if (C4059ap.m3084b(strM3060a) || strM3060a.equals("fail")) {
            return null;
        }
        return "Meizu/FLYME/" + C4059ap.m3060a("ro.build.display.id");
    }
}
