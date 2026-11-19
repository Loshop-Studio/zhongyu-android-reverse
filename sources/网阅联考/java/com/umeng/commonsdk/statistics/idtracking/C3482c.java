package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.common.C3475a;
import com.umeng.commonsdk.utils.C3510b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.c */
/* loaded from: classes2.dex */
public class C3482c extends AbstractC3480a {

    /* renamed from: a */
    private static final String f2801a = "idfa";

    /* renamed from: b */
    private Context f2802b;

    public C3482c(Context context) {
        super(f2801a);
        this.f2802b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3480a
    /* renamed from: f */
    public String mo3766f() {
        String strM3701a = FieldManager.allow(C3510b.f3027w) ? C3475a.m3701a(this.f2802b) : null;
        return strM3701a == null ? "" : strM3701a;
    }
}
