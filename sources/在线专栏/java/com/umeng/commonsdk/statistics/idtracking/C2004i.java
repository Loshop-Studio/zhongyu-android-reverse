package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C2026b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.i */
/* loaded from: classes.dex */
public class C2004i extends AbstractC1996a {

    /* renamed from: a */
    public static final String f9415a = "umeng_sp_oaid";

    /* renamed from: b */
    public static final String f9416b = "key_umeng_sp_oaid";

    /* renamed from: c */
    public static final String f9417c = "key_umeng_sp_oaid_required_time";

    /* renamed from: d */
    private static final String f9418d = "oaid";

    /* renamed from: e */
    private Context f9419e;

    public C2004i(Context context) {
        super(f9418d);
        this.f9419e = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC1996a
    /* renamed from: f */
    public String mo7689f() {
        if (!FieldManager.allow(C2026b.f9564G)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = this.f9419e.getSharedPreferences(f9415a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(f9416b, "");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
