package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.k */
/* loaded from: classes.dex */
public class C2006k extends AbstractC1996a {

    /* renamed from: a */
    private static final String f9424a = "serial";

    public C2006k() {
        super(f9424a);
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC1996a
    /* renamed from: f */
    public String mo7689f() {
        return DeviceConfig.getSerial();
    }
}
