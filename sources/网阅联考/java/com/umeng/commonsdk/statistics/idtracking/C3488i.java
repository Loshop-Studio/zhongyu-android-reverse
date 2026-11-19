package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C3510b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.i */
/* loaded from: classes2.dex */
public class C3488i extends AbstractC3480a {

    /* renamed from: a */
    public static final String f2823a = "umeng_sp_oaid";

    /* renamed from: b */
    public static final String f2824b = "key_umeng_sp_oaid";

    /* renamed from: c */
    public static final String f2825c = "key_umeng_sp_oaid_required_time";

    /* renamed from: d */
    private static final String f2826d = "oaid";

    /* renamed from: e */
    private Context f2827e;

    public C3488i(Context context) {
        super(f2826d);
        this.f2827e = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3480a
    /* renamed from: f */
    public String mo3766f() {
        if (!FieldManager.allow(C3510b.f2972G)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = this.f2827e.getSharedPreferences(f2823a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(f2824b, "");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
