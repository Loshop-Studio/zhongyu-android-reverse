package com.tencent.bugly.proguard;

import android.support.v4.media.AbstractC0037f;

/* renamed from: com.tencent.bugly.proguard.l0 */
/* loaded from: classes3.dex */
public final class C4122l0 extends AbstractC4095c {
    @Override // com.tencent.bugly.proguard.AbstractC4095c
    /* renamed from: a */
    public final String mo2881a() {
        String strM3060a = C4059ap.m3060a("ro.build.nubia.rom.name");
        if (C4059ap.m3084b(strM3060a) || strM3060a.equals("fail")) {
            return null;
        }
        StringBuilder sbM100y = AbstractC0037f.m100y("Zte/NUBIA/", strM3060a, "_");
        sbM100y.append(C4059ap.m3060a("ro.build.nubia.rom.code"));
        return sbM100y.toString();
    }
}
