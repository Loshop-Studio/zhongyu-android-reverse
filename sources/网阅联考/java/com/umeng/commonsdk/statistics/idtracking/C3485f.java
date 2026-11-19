package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.f */
/* loaded from: classes2.dex */
public class C3485f extends AbstractC3480a {

    /* renamed from: a */
    private static final String f2817a = "imei";

    /* renamed from: b */
    private Context f2818b;

    public C3485f(Context context) {
        super(f2817a);
        this.f2818b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3480a
    /* renamed from: f */
    public String mo3766f() {
        return DeviceConfig.getImeiNew(this.f2818b);
    }
}
