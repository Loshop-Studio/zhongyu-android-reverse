package com.p041ta.utdid2.device;

import android.content.Context;
import p074e2.C7329a;

/* loaded from: classes4.dex */
public class UTDevice {
    @Deprecated
    public static String getUtdid(Context context) {
        if (context == null) {
            return "ffffffffffffffffffffffff";
        }
        C7329a.m11708b().m11712e(context);
        return C6340a.m4496a().getUtdid(context);
    }
}
