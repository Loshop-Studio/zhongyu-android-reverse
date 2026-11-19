package com.p074ta.utdid2.device;

import android.content.Context;
import com.p074ta.p075a.C7569a;

/* loaded from: classes5.dex */
public class UTDevice {
    @Deprecated
    public static String getUtdid(Context context) {
        if (context == null) {
            return "ffffffffffffffffffffffff";
        }
        C7569a.m9757a().m9761a(context);
        return C7592a.m9814a().getUtdid(context);
    }
}
