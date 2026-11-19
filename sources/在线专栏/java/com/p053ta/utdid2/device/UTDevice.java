package com.p053ta.utdid2.device;

import android.content.Context;
import com.p053ta.p054a.C1672a;

/* loaded from: classes.dex */
public class UTDevice {
    @Deprecated
    public static String getUtdid(Context context) {
        if (context == null) {
            return "ffffffffffffffffffffffff";
        }
        C1672a.m5731a().m5735a(context);
        return C1695a.m5788a().getUtdid(context);
    }
}
