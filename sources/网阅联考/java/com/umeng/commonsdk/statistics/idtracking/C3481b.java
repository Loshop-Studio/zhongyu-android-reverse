package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.b */
/* loaded from: classes2.dex */
public class C3481b extends AbstractC3480a {

    /* renamed from: a */
    private static final String f2799a = "android_id";

    /* renamed from: b */
    private Context f2800b;

    public C3481b(Context context) {
        super(f2799a);
        this.f2800b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3480a
    /* renamed from: f */
    public String mo3766f() {
        return DeviceConfig.getAndroidId(this.f2800b);
    }
}
